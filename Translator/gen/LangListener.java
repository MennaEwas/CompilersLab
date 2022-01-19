// Generated from D:/curri/Seventh/Translator\Lang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(LangParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(LangParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(LangParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(LangParser.TypenameContext ctx);
}