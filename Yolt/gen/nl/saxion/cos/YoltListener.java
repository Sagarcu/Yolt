package nl.saxion.cos;// Generated from C:/Users/mathi/Desktop/Yolt/Yolt/src\Yolt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YoltParser}.
 */
public interface YoltListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YoltParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(YoltParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(YoltParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(YoltParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(YoltParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(YoltParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(YoltParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(YoltParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(YoltParser.Function_callContext ctx);
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
	 * Enter a parse tree produced by {@link YoltParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_declaration(YoltParser.Boolean_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_declaration(YoltParser.Boolean_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link YoltParser#gold_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGold_declaration(YoltParser.Gold_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#gold_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGold_declaration(YoltParser.Gold_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#prompt_input}.
	 * @param ctx the parse tree
	 */
	void enterPrompt_input(YoltParser.Prompt_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#prompt_input}.
	 * @param ctx the parse tree
	 */
	void exitPrompt_input(YoltParser.Prompt_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#random_input}.
	 * @param ctx the parse tree
	 */
	void enterRandom_input(YoltParser.Random_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#random_input}.
	 * @param ctx the parse tree
	 */
	void exitRandom_input(YoltParser.Random_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(YoltParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(YoltParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(YoltParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(YoltParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(YoltParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(YoltParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(YoltParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(YoltParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(YoltParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(YoltParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(YoltParser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(YoltParser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#var_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVar_assignment(YoltParser.Var_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#var_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVar_assignment(YoltParser.Var_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#bool_assignment}.
	 * @param ctx the parse tree
	 */
	void enterBool_assignment(YoltParser.Bool_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#bool_assignment}.
	 * @param ctx the parse tree
	 */
	void exitBool_assignment(YoltParser.Bool_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#var_addition}.
	 * @param ctx the parse tree
	 */
	void enterVar_addition(YoltParser.Var_additionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#var_addition}.
	 * @param ctx the parse tree
	 */
	void exitVar_addition(YoltParser.Var_additionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#int_addition_short}.
	 * @param ctx the parse tree
	 */
	void enterInt_addition_short(YoltParser.Int_addition_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#int_addition_short}.
	 * @param ctx the parse tree
	 */
	void exitInt_addition_short(YoltParser.Int_addition_shortContext ctx);
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
	 * Enter a parse tree produced by {@link YoltParser#compare_multiple_values}.
	 * @param ctx the parse tree
	 */
	void enterCompare_multiple_values(YoltParser.Compare_multiple_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#compare_multiple_values}.
	 * @param ctx the parse tree
	 */
	void exitCompare_multiple_values(YoltParser.Compare_multiple_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#compare_values}.
	 * @param ctx the parse tree
	 */
	void enterCompare_values(YoltParser.Compare_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#compare_values}.
	 * @param ctx the parse tree
	 */
	void exitCompare_values(YoltParser.Compare_valuesContext ctx);
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
	 * Enter a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(YoltParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(YoltParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParanExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanExpression(YoltParser.ParanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParanExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanExpression(YoltParser.ParanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowModExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowModExpression(YoltParser.PowModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowModExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowModExpression(YoltParser.PowModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(YoltParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(YoltParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegativeExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegativeExpression(YoltParser.NegativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegativeExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegativeExpression(YoltParser.NegativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(YoltParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(YoltParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(YoltParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(YoltParser.NumberContext ctx);
}