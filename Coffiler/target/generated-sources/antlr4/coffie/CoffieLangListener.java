// Generated from coffie/CoffieLang.g4 by ANTLR 4.13.2
package coffie;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoffieLangParser}.
 */
public interface CoffieLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CoffieLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CoffieLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(CoffieLangParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(CoffieLangParser.ClassDefContext ctx);
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
	 * Enter a parse tree produced by {@link CoffieLangParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(CoffieLangParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(CoffieLangParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(CoffieLangParser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(CoffieLangParser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(CoffieLangParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(CoffieLangParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CoffieLangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CoffieLangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CoffieLangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CoffieLangParser.ParamContext ctx);
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
	 * Enter a parse tree produced by the {@code StmtVarDecl}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtVarDecl(CoffieLangParser.StmtVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtVarDecl}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtVarDecl(CoffieLangParser.StmtVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(CoffieLangParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(CoffieLangParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtPrint}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtPrint(CoffieLangParser.StmtPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtPrint}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtPrint(CoffieLangParser.StmtPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(CoffieLangParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(CoffieLangParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhile(CoffieLangParser.StmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhile(CoffieLangParser.StmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFor(CoffieLangParser.StmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFor(CoffieLangParser.StmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturn(CoffieLangParser.StmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturn(CoffieLangParser.StmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtCall}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtCall(CoffieLangParser.StmtCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtCall}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtCall(CoffieLangParser.StmtCallContext ctx);
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
	 * Enter a parse tree produced by {@link CoffieLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CoffieLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CoffieLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(CoffieLangParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(CoffieLangParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CoffieLangParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CoffieLangParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CoffieLangParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CoffieLangParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(CoffieLangParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(CoffieLangParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(CoffieLangParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(CoffieLangParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(CoffieLangParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(CoffieLangParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CoffieLangParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CoffieLangParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAtom}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(CoffieLangParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAtom}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(CoffieLangParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(CoffieLangParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(CoffieLangParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRelational}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(CoffieLangParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRelational}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(CoffieLangParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEquality(CoffieLangParser.ExprEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEquality(CoffieLangParser.ExprEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNewObject}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNewObject(CoffieLangParser.ExprNewObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNewObject}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNewObject(CoffieLangParser.ExprNewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CoffieLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CoffieLangParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CoffieLangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CoffieLangParser.ArgsContext ctx);
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
}