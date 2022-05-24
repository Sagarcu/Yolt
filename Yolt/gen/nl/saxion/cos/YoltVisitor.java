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
	 * Visit a parse tree produced by {@link YoltParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(YoltParser.Class_declarationContext ctx);
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
	 * Visit a parse tree produced by {@link YoltParser#int_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_declaration(YoltParser.Int_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#boolean_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_declaration(YoltParser.Boolean_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#string_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_declaration(YoltParser.String_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#gold_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGold_declaration(YoltParser.Gold_declarationContext ctx);
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
	 * Visit a parse tree produced by {@link YoltParser#var_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assignment(YoltParser.Var_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#bool_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_assignment(YoltParser.Bool_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#var_addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_addition(YoltParser.Var_additionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#int_addition_short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_addition_short(YoltParser.Int_addition_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#int_addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_addition(YoltParser.Int_additionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#compare_multiple_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_multiple_values(YoltParser.Compare_multiple_valuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicAnd}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAnd(YoltParser.LogicAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicOr}
	 * labeled alternative in {@link YoltParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOr(YoltParser.LogicOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#compare_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_values(YoltParser.Compare_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(YoltParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(YoltParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YoltParser.StatementContext ctx);
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
	 * Visit a parse tree produced by the {@code PowModExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowModExpression(YoltParser.PowModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(YoltParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegativeExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExpression(YoltParser.NegativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link YoltParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(YoltParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YoltParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(YoltParser.NumberContext ctx);
}