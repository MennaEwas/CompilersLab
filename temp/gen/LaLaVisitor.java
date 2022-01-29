// Generated from D:/curri/Seventh/temp\LaLa.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LaLaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LaLaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LaLaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LaLaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaLaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LaLaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaLaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LaLaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaLaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LaLaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaLaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LaLaParser.ExprContext ctx);
}