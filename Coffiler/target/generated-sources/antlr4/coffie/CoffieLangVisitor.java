// Generated from coffie/CoffieLang.g4 by ANTLR 4.13.2
package coffie;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoffieLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoffieLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CoffieLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(CoffieLangParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CoffieLangParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(CoffieLangParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(CoffieLangParser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(CoffieLangParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CoffieLangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CoffieLangParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CoffieLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtVarDecl}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtVarDecl(CoffieLangParser.StmtVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(CoffieLangParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtPrint}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrint(CoffieLangParser.StmtPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(CoffieLangParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhile(CoffieLangParser.StmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFor(CoffieLangParser.StmtForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReturn(CoffieLangParser.StmtReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtCall}
	 * labeled alternative in {@link CoffieLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCall(CoffieLangParser.StmtCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CoffieLangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CoffieLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(CoffieLangParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CoffieLangParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CoffieLangParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(CoffieLangParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(CoffieLangParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(CoffieLangParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(CoffieLangParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAtom}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(CoffieLangParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(CoffieLangParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRelational}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(CoffieLangParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEquality(CoffieLangParser.ExprEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNewObject}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNewObject(CoffieLangParser.ExprNewObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CoffieLangParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CoffieLangParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CoffieLangParser.TypeContext ctx);
}