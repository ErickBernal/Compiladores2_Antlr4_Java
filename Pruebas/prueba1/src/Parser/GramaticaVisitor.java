// Generated from /home/pilloubool/IdeaProjects/prueba/Gramatica.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(GramaticaParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#segundo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegundo(GramaticaParser.SegundoContext ctx);
}