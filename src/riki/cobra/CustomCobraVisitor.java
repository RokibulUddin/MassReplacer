package riki.cobra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import riki.cobra.language.CobraBaseVisitor;
import riki.cobra.language.CobraParser;
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
	
	@Override
	public Object visitSubFolder(SubFolderContext ctx) {
		CobraParser.FoldersContext ftx = (FoldersContext) ctx.folder();		
		@SuppressWarnings("unchecked")
		Set<String> folders = (Set<String>)visitFolders(ftx);
		List<String> excludes = null;
		if(ctx.excludes() != null) {
			List<String> tmp = new ArrayList<>(ctx.excludes().STRING().size());
			ctx.excludes().STRING().forEach(e -> tmp.add(e.getText()));
			excludes = tmp;
		}	
		for(String folder : folders) {
			cobra.addSubFolders(folder, excludes);
		}
		return null;
	}
	
	@Override
	public Object visitFile(CobraParser.FileContext ctx) {
		if(ctx.STRING() != null) {
			ctx.STRING().forEach(s -> cobra.addFile(s.getText()));
		}
		return null;
	}
}
