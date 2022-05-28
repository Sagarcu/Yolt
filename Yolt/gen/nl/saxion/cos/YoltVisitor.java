package nl.saxion.cos;// Generated from C:/Users/mathi/Desktop/Yolt/Yolt/src\Yolt.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link YoltParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(YoltParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(YoltParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(YoltParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#global_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_var_declaration(YoltParser.Global_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(YoltParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#var_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assignment(YoltParser.Var_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#var_assignment_short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assignment_short(YoltParser.Var_assignment_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#prompt_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrompt_input(YoltParser.Prompt_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#random_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom_input(YoltParser.Random_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(YoltParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#else_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_statement(YoltParser.Else_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(YoltParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(YoltParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(YoltParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(YoltParser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(YoltParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(YoltParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(YoltParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(YoltParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParanExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanExpression(YoltParser.ParanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(YoltParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RandomIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomIdentifier(YoltParser.RandomIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdentifier(YoltParser.VarIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntIdentifier(YoltParser.IntIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringIdentifier(YoltParser.StringIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowModExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowModExpression(YoltParser.PowModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolIdentifier(YoltParser.BoolIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CoinIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoinIdentifier(YoltParser.CoinIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextIdentifier}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextIdentifier(YoltParser.TextIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(YoltParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicOr}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOr(YoltParser.LogicOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(YoltParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicAnd}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAnd(YoltParser.LogicAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#compare_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_values(YoltParser.Compare_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YoltParser.StatementContext ctx);
}