// Generated from Cobra.g4 by ANTLR 4.7

package riki.cobra.language;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CobraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CobraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CobraParser#cobra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobra(CobraParser.CobraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobraParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CobraParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useStat}
	 * labeled alternative in {@link CobraParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStat(CobraParser.UseStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code folders}
	 * labeled alternative in {@link CobraParser#folder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolders(CobraParser.FoldersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subFolder}
	 * labeled alternative in {@link CobraParser#folder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubFolder(CobraParser.SubFolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobraParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CobraParser.FileContext ctx);
}