package nl.saxion.cos;// Generated from C:/Users/mathi/Desktop/Compilers en Operating Systems/01-master/src\Yolt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YoltParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YoltVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YoltParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(YoltParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(YoltParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(YoltParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YoltParser.StatementContext ctx);
}