package riki.cobra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.tree.TerminalNode;

import riki.cobra.language.CobraBaseVisitor;
import riki.cobra.language.CobraParser;
import riki.cobra.language.CobraParser.ExcludesContext;
import riki.cobra.language.CobraParser.FoldersContext;
import riki.cobra.language.CobraParser.SubFolderContext;

public class CustomCobraVisitor extends CobraBaseVisitor<Object> {
	private Cobra cobra;
	
	public void elaborate() {
		cobra.printFileAndFolders();
	}
	
	@Override
	public Object visitUseStat(CobraParser.UseStatContext ctx) {
		this.cobra = new Cobra();
		return visitChildren(ctx);
	}
	
	@Override
	public Object visitFolders(CobraParser.FoldersContext ctx) {
		Set<String> result = new HashSet<>();
		if(ctx.STRING() != null) {
			ctx.STRING().forEach(s -> {
				result.addAll(cobra.addFolder(s.getText()));				
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
		if(ctx.STRING() != null) {
			Set<String> excludes = (Set<String>)visitExcludes(ctx.excludes());	
			cobra.addFilesRuleToExclude(excludes);
			ctx.STRING().stream().map(TerminalNode::getText).forEach(cobra::addFile);
		}
		return null;
	}
	
	@Override
	public Object visitExcludes(ExcludesContext ctx) {
		Set<String> result = null;
		if(ctx != null)
		{
			result = new HashSet<>(ctx.STRING().size());
			List<String> tmp = new ArrayList<>(ctx.STRING().size());
			ctx.STRING().forEach(e -> tmp.add(e.getText()));
			result.addAll(tmp);
		}
		return result;
	}
}
