// Generated from CoffieLang.g4 by ANTLR 4.13.2
package coffie;

package coffie;

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
	 * Enter a parse tree produced by {@link CoffieLangParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CoffieLangParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CoffieLangParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(CoffieLangParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(CoffieLangParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CoffieLangParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CoffieLangParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CoffieLangParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CoffieLangParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CoffieLangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CoffieLangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CoffieLangParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CoffieLangParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(CoffieLangParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(CoffieLangParser.ArrayTypeContext ctx);
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
	 * Enter a parse tree produced by {@link CoffieLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoffieLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoffieLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CoffieLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CoffieLangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CoffieLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CoffieLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CoffieLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CoffieLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CoffieLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CoffieLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CoffieLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CoffieLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(CoffieLangParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(CoffieLangParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CoffieLangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CoffieLangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CoffieLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CoffieLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CoffieLangParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CoffieLangParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CoffieLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CoffieLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CoffieLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CoffieLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CoffieLangParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CoffieLangParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CoffieLangParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CoffieLangParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CoffieLangParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CoffieLangParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CoffieLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CoffieLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CoffieLangParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CoffieLangParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CoffieLangParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CoffieLangParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CoffieLangParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CoffieLangParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CoffieLangParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CoffieLangParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CoffieLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CoffieLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CoffieLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CoffieLangParser.LiteralContext ctx);
}