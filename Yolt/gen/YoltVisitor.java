// Generated from C:/Users/mathi/Desktop/Yolt/Yolt/src\Yolt.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link YoltParser#int_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_declaration(YoltParser.Int_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#int_addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_addition(YoltParser.Int_additionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#class_decleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decleration(YoltParser.Class_declerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#string_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_declaration(YoltParser.String_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#gold_decleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGold_decleration(YoltParser.Gold_declerationContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(YoltParser.ExprContext ctx);
}