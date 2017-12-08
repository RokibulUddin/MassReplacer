package riki.cobra;

import java.util.HashSet;
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
		Set<String> folders = (Set<String>)visitFolders(ftx);
		folders.forEach(f -> cobra.addSubFolders(f));
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
