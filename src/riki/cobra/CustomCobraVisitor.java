package riki.cobra;

import riki.cobra.language.CobraBaseVisitor;
import riki.cobra.language.CobraParser;

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
	public Object visitFolder(CobraParser.FolderContext ctx) {
		if(ctx.STRING() != null) {
			ctx.STRING().forEach(s -> cobra.addFolder(s.getText()));
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
