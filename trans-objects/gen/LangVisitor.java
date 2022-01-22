// Generated from D:/curri/Seventh/Compilers/Labs/trans-objects/grammars\Lang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(LangParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(LangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(LangParser.TypenameContext ctx);
}