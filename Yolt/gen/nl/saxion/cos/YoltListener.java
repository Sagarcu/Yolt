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
	 * Enter a parse tree produced by {@link YoltParser#class_call}.
	 * @param ctx the parse tree
	 */
	void enterClass_call(YoltParser.Class_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#class_call}.
	 * @param ctx the parse tree
	 */
	void exitClass_call(YoltParser.Class_callContext ctx);
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
	 * Enter a parse tree produced by {@link YoltParser#global_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_var_declaration(YoltParser.Global_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#global_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_var_declaration(YoltParser.Global_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(YoltParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(YoltParser.Var_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link YoltParser#var_assignment_short}.
	 * @param ctx the parse tree
	 */
	void enterVar_assignment_short(YoltParser.Var_assignment_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#var_assignment_short}.
	 * @param ctx the parse tree
	 */
	void exitVar_assignment_short(YoltParser.Var_assignment_shortContext ctx);
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
	 * Enter a parse tree produced by {@link YoltParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(YoltParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(YoltParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YoltParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(YoltParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(YoltParser.Break_statementContext ctx);
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
	 * Enter a parse tree produced by the {@code RandomIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRandomIdentifier(YoltParser.RandomIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RandomIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRandomIdentifier(YoltParser.RandomIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarIdentifier(YoltParser.VarIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarIdentifier(YoltParser.VarIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntIdentifier(YoltParser.IntIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntIdentifier(YoltParser.IntIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringIdentifier(YoltParser.StringIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringIdentifier(YoltParser.StringIdentifierContext ctx);
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
	 * Enter a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolIdentifier(YoltParser.BoolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolIdentifier(YoltParser.BoolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoinIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCoinIdentifier(YoltParser.CoinIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoinIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCoinIdentifier(YoltParser.CoinIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTextIdentifier(YoltParser.TextIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTextIdentifier(YoltParser.TextIdentifierContext ctx);
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
	 * Enter a parse tree produced by the {@code LogicOr}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOr(YoltParser.LogicOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicOr}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOr(YoltParser.LogicOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(YoltParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(YoltParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicAnd}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAnd(YoltParser.LogicAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicAnd}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAnd(YoltParser.LogicAndContext ctx);
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
	 * Enter a parse tree produced by {@link YoltParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YoltParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YoltParser.StatementContext ctx);
}