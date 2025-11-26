// Generated from CoffieLang.g4 by ANTLR 4.13.2

package coffie;
import java.util.*;

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
	 * Visit a parse tree produced by {@link CoffieLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CoffieLangParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelExistenteString}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelExistenteString(CoffieLangParser.VariavelExistenteStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelNovaString}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelNovaString(CoffieLangParser.VariavelNovaStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelNova}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelNova(CoffieLangParser.VariavelNovaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelNovaBoolean}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelNovaBoolean(CoffieLangParser.VariavelNovaBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelExistente}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelExistente(CoffieLangParser.VariavelExistenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelExistenteBoolean}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelExistenteBoolean(CoffieLangParser.VariavelExistenteBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputVar}
	 * labeled alternative in {@link CoffieLangParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputVar(CoffieLangParser.InputVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutputStr}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStr(CoffieLangParser.OutputStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutputVar}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputVar(CoffieLangParser.OutputVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutputExpr}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputExpr(CoffieLangParser.OutputExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSum}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSum(CoffieLangParser.ExprSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(CoffieLangParser.ExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTerm}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTerm(CoffieLangParser.ExprTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermMult}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMult(CoffieLangParser.TermMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermDiv}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDiv(CoffieLangParser.TermDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermMod}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMod(CoffieLangParser.TermModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermFactor}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermFactor(CoffieLangParser.TermFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorNum}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNum(CoffieLangParser.FactorNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorNumD}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNumD(CoffieLangParser.FactorNumDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorVar}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorVar(CoffieLangParser.FactorVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorStr}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorStr(CoffieLangParser.FactorStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorBool}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorBool(CoffieLangParser.FactorBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorExpr}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(CoffieLangParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(CoffieLangParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link CoffieLangParser#controlflow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(CoffieLangParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseBlock}
	 * labeled alternative in {@link CoffieLangParser#controlflow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseBlock(CoffieLangParser.IfElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopBlock}
	 * labeled alternative in {@link CoffieLangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(CoffieLangParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockLine}
	 * labeled alternative in {@link CoffieLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockLine(CoffieLangParser.BlockLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FnBlockLine}
	 * labeled alternative in {@link CoffieLangParser#rblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnBlockLine(CoffieLangParser.FnBlockLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FnBodyLine}
	 * labeled alternative in {@link CoffieLangParser#rbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnBodyLine(CoffieLangParser.FnBodyLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FnDecl}
	 * labeled alternative in {@link CoffieLangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnDecl(CoffieLangParser.FnDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoffieLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CoffieLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link CoffieLangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(CoffieLangParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamCallList}
	 * labeled alternative in {@link CoffieLangParser#paramsCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallList(CoffieLangParser.ParamCallListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncInvoc}
	 * labeled alternative in {@link CoffieLangParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInvoc(CoffieLangParser.FuncInvocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LibStmt}
	 * labeled alternative in {@link CoffieLangParser#lib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibStmt(CoffieLangParser.LibStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCast}
	 * labeled alternative in {@link CoffieLangParser#typecast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(CoffieLangParser.TypeCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeOfVar}
	 * labeled alternative in {@link CoffieLangParser#typeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfVar(CoffieLangParser.TypeOfVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryCond}
	 * labeled alternative in {@link CoffieLangParser#ternary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryCond(CoffieLangParser.TernaryCondContext ctx);
}