package riki.cobra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.tree.TerminalNode;

import riki.cobra.cmd.ExitCmd;
import riki.cobra.cmd.ReplaceCmd;
import riki.cobra.executor.replace.ReplaceInfo;
import riki.cobra.language.CobraBaseVisitor;
import riki.cobra.language.CobraParser;
import riki.cobra.language.CobraParser.ArrayContext;
import riki.cobra.language.CobraParser.AssignmentContext;
import riki.cobra.language.CobraParser.AtomicContext;
import riki.cobra.language.CobraParser.ExcludesContext;
import riki.cobra.language.CobraParser.ExitContext;
import riki.cobra.language.CobraParser.FoldersContext;
import riki.cobra.language.CobraParser.ReplaceContext;
import riki.cobra.language.CobraParser.StringContext;
import riki.cobra.language.CobraParser.SubFolderContext;

public class CustomCobraVisitor extends CobraBaseVisitor<Object> {
	private Cobra cobra;
	public static String INNER_VAR_DELIM_START = "<$";
	public static String INNER_VAR_DELIM_END = ">";
	private Map<String, Variable<?>> memory = new HashMap<String, Variable<?>>();

	public void elaborate() {
		cobra.process();
	}

	@Override
	public Object visitUseStat(CobraParser.UseStatContext ctx) {
		this.cobra = Cobra.getInstance();
		return visitChildren(ctx);
	}

	@Override
	public Object visitFolders(CobraParser.FoldersContext ctx) {
		Set<String> result = new HashSet<>();
		if(ctx.atomic() != null) {
			ctx.atomic().forEach(s -> {
				result.addAll(cobra.addFolder(visitAtomic(s)));				
			});
		}		
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object visitSubFolder(SubFolderContext ctx) {
		CobraParser.FoldersContext ftx = (FoldersContext) ctx.folder();		
		Set<String> folders = (Set<String>)visitFolders(ftx);
		Set<String> excludes = (Set<String>)visitExcludes(ctx.excludes());
		for(String folder : folders) {
			cobra.addSubFolders(folder, excludes);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object visitFile(CobraParser.FileContext ctx) {
		if(ctx.atomic() != null) {
			Set<String> excludes = (Set<String>)visitExcludes(ctx.excludes());	
			cobra.addFilesRuleToExclude(excludes);
			ctx.atomic().forEach(s -> {
				cobra.addFile(visitAtomic(s));
			});			
		}
		return null;
	}

	@Override
	public Object visitExcludes(ExcludesContext ctx) {
		Set<String> result = null;
		if(ctx != null)
		{
			result = new HashSet<>(ctx.atomic().size());
			List<String> tmp = new ArrayList<>(ctx.atomic().size());
			ctx.atomic().forEach(e -> tmp.addAll(Arrays.asList(visitAtomic(e).split(","))));
			result.addAll(tmp);
		}
		return result;
	}

	@Override
	public Object visitAssignment(AssignmentContext ctx) {
		String id = ctx.ID().getText();
		Object result = null;
		if(ctx.atomic() != null) {
			result = visitAtomic(ctx.atomic());
			memory.put(id, new Variable<String>((String)result));
		}
		return result;
	}

	public String visitString(StringContext ctx) {
		String result = null;	
		result = ctx.STRING().getText();		
		if(result.contains(INNER_VAR_DELIM_START))
		{
			int start = result.indexOf(INNER_VAR_DELIM_START);
			int end = 0;
			do {
				end = result.indexOf(INNER_VAR_DELIM_END);
				if(end < 3) {
					exitError("Cannot find end of " + INNER_VAR_DELIM_START, ctx.STRING().getSymbol().getLine(), ctx.STRING().getSymbol().getCharPositionInLine());
				}
				String name = result.substring(start+2, end);
				String toReplace = INNER_VAR_DELIM_START + name + INNER_VAR_DELIM_END;
				String value = getVariable(name, ctx.STRING());
				result = result.replace(toReplace, value);	
			}while((start = result.indexOf(INNER_VAR_DELIM_START, end)) >= 0);
		}		
		return result.replaceAll("\\\\n", "\n");
	}

	public String visitAtomic(AtomicContext ctx) {
		if(ctx.string() != null)
			return visitString(ctx.string());
		if(ctx.ID() != null) {
			return getVariable(ctx.ID());
		}
		if(ctx.array() != null) {
			return visitArray(ctx.array());
		}
		return null;
	}
	
	public String visitArray(ArrayContext ctx) {
		StringBuilder sb = new StringBuilder();
		Iterator<AtomicContext> i = ctx.atomic().iterator();
		while(i.hasNext()) {
			AtomicContext atomic = i.next();
			sb.append(visitAtomic(atomic));
			if(i.hasNext())
				sb.append(",");
		}
		return sb.toString();
	}

	@Override
	public Object visitReplace(ReplaceContext ctx) {
		ReplaceInfo info = new ReplaceInfo();
		List<String> toReplace = new ArrayList<>(ctx.tofind().atomic().size());
		String replaceWith = null;
		for(AtomicContext atc : ctx.tofind().atomic()) {
			String replace = visitAtomic(atc);
			toReplace.add(replace);
		}
		replaceWith = visitAtomic(ctx.replacewith().atomic());
		info.setReplaceWith(replaceWith);
		info.setToReplace(toReplace);
		cobra.getStack().addCmd(new ReplaceCmd(info));
		return info;
	}
	
	private String getVariable(TerminalNode ID) {
		Variable<?> var = memory.get(ID.getText());
		if(var == null) {
			exitVarNotFount(ID.getText(), ID);			
		}
		return var.getValue().toString();
	}

	private String getVariable(String id, TerminalNode ID) {
		Variable<?> var = memory.get(id);
		if(var == null) {
			exitVarNotFount(id, ID);
		}
		return var.getValue().toString();
	}

	private void exitVarNotFount(String name, TerminalNode ID) {
		exitError("Variable " + name + " is not defined.", ID.getSymbol().getLine(), ID.getText().indexOf(name));		
	}

	private void exitError(String msg, int line, int position) {
		System.err.println(msg + " (Line: " + line + ", Position: " + position + ")");
		System.exit(1);
	}
	
	@Override
	public Object visitExit(ExitContext ctx) {
		cobra.getStack().addCmd(new ExitCmd());
		return null;
	}
	
}
