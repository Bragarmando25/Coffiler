// Generated from CoffieLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoffieLangParser}.
 */
public interface CoffieLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoffieLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoffieLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CoffieLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CoffieLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CoffieLangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CoffieLangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(CoffieLangParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(CoffieLangParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(CoffieLangParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(CoffieLangParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoffieLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoffieLangParser.ExprContext ctx);
}