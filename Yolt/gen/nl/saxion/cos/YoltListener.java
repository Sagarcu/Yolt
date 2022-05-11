package nl.saxion.cos;// Generated from C:/Users/mathi/Desktop/Compilers en Operating Systems/01-master/src\Yolt.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link YoltParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(YoltParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YoltParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(YoltParser.DeclarationContext ctx);
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
}