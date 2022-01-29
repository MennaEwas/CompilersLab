// Generated from D:/curri/Seventh/temp\LaLa.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaLaParser}.
 */
public interface LaLaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaLaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LaLaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaLaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LaLaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaLaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LaLaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaLaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LaLaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaLaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LaLaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaLaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LaLaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaLaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LaLaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaLaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LaLaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaLaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LaLaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaLaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LaLaParser.ExprContext ctx);
}