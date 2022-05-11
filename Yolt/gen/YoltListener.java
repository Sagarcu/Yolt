// Generated from C:/Users/mathi/Desktop/Yolt/Yolt/src\Yolt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YoltParser}.
 */
public interface YoltListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YoltParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YoltParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YoltParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_declaration(YoltParser.Int_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_declaration(YoltParser.Int_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#int_addition}.
	 * @param ctx the parse tree
	 */
	void enterInt_addition(YoltParser.Int_additionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#int_addition}.
	 * @param ctx the parse tree
	 */
	void exitInt_addition(YoltParser.Int_additionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#class_decleration}.
	 * @param ctx the parse tree
	 */
	void enterClass_decleration(YoltParser.Class_declerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#class_decleration}.
	 * @param ctx the parse tree
	 */
	void exitClass_decleration(YoltParser.Class_declerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_declaration(YoltParser.String_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_declaration(YoltParser.String_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#gold_decleration}.
	 * @param ctx the parse tree
	 */
	void enterGold_decleration(YoltParser.Gold_declerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#gold_decleration}.
	 * @param ctx the parse tree
	 */
	void exitGold_decleration(YoltParser.Gold_declerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(YoltParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(YoltParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YoltParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YoltParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(YoltParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(YoltParser.ExprContext ctx);
}