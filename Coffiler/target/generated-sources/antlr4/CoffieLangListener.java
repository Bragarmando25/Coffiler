// Generated from CoffieLang.g4 by ANTLR 4.13.2

package coffie;
import java.util.*;

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
	 * Enter a parse tree produced by {@link CoffieLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CoffieLangParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CoffieLangParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariavelExistenteString}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterVariavelExistenteString(CoffieLangParser.VariavelExistenteStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariavelExistenteString}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitVariavelExistenteString(CoffieLangParser.VariavelExistenteStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariavelNovaString}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterVariavelNovaString(CoffieLangParser.VariavelNovaStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariavelNovaString}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitVariavelNovaString(CoffieLangParser.VariavelNovaStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariavelNova}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterVariavelNova(CoffieLangParser.VariavelNovaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariavelNova}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitVariavelNova(CoffieLangParser.VariavelNovaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariavelNovaBoolean}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterVariavelNovaBoolean(CoffieLangParser.VariavelNovaBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariavelNovaBoolean}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitVariavelNovaBoolean(CoffieLangParser.VariavelNovaBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariavelExistente}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterVariavelExistente(CoffieLangParser.VariavelExistenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariavelExistente}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitVariavelExistente(CoffieLangParser.VariavelExistenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariavelExistenteBoolean}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterVariavelExistenteBoolean(CoffieLangParser.VariavelExistenteBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariavelExistenteBoolean}
	 * labeled alternative in {@link CoffieLangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitVariavelExistenteBoolean(CoffieLangParser.VariavelExistenteBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputVar}
	 * labeled alternative in {@link CoffieLangParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputVar(CoffieLangParser.InputVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputVar}
	 * labeled alternative in {@link CoffieLangParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputVar(CoffieLangParser.InputVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutputStr}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputStr(CoffieLangParser.OutputStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutputStr}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputStr(CoffieLangParser.OutputStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutputVar}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputVar(CoffieLangParser.OutputVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutputVar}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputVar(CoffieLangParser.OutputVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutputExpr}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputExpr(CoffieLangParser.OutputExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutputExpr}
	 * labeled alternative in {@link CoffieLangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputExpr(CoffieLangParser.OutputExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSum}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSum(CoffieLangParser.ExprSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSum}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSum(CoffieLangParser.ExprSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSub(CoffieLangParser.ExprSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSub(CoffieLangParser.ExprSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTerm}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(CoffieLangParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTerm}
	 * labeled alternative in {@link CoffieLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(CoffieLangParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermMult}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMult(CoffieLangParser.TermMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermMult}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMult(CoffieLangParser.TermMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermDiv}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermDiv(CoffieLangParser.TermDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermDiv}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermDiv(CoffieLangParser.TermDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermMod}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMod(CoffieLangParser.TermModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermMod}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMod(CoffieLangParser.TermModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermFactor}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermFactor(CoffieLangParser.TermFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermFactor}
	 * labeled alternative in {@link CoffieLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermFactor(CoffieLangParser.TermFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorNum}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNum(CoffieLangParser.FactorNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorNum}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNum(CoffieLangParser.FactorNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorNumD}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNumD(CoffieLangParser.FactorNumDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorNumD}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNumD(CoffieLangParser.FactorNumDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorVar}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorVar(CoffieLangParser.FactorVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorVar}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorVar(CoffieLangParser.FactorVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorStr}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorStr(CoffieLangParser.FactorStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorStr}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorStr(CoffieLangParser.FactorStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorBool}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorBool(CoffieLangParser.FactorBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorBool}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorBool(CoffieLangParser.FactorBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorExpr}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpr(CoffieLangParser.FactorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorExpr}
	 * labeled alternative in {@link CoffieLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpr(CoffieLangParser.FactorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffieLangParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(CoffieLangParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffieLangParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(CoffieLangParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link CoffieLangParser#controlflow}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(CoffieLangParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link CoffieLangParser#controlflow}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(CoffieLangParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseBlock}
	 * labeled alternative in {@link CoffieLangParser#controlflow}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBlock(CoffieLangParser.IfElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseBlock}
	 * labeled alternative in {@link CoffieLangParser#controlflow}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBlock(CoffieLangParser.IfElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopBlock}
	 * labeled alternative in {@link CoffieLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(CoffieLangParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopBlock}
	 * labeled alternative in {@link CoffieLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(CoffieLangParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockLine}
	 * labeled alternative in {@link CoffieLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockLine(CoffieLangParser.BlockLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockLine}
	 * labeled alternative in {@link CoffieLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockLine(CoffieLangParser.BlockLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FnBlockLine}
	 * labeled alternative in {@link CoffieLangParser#rblock}.
	 * @param ctx the parse tree
	 */
	void enterFnBlockLine(CoffieLangParser.FnBlockLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FnBlockLine}
	 * labeled alternative in {@link CoffieLangParser#rblock}.
	 * @param ctx the parse tree
	 */
	void exitFnBlockLine(CoffieLangParser.FnBlockLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FnBodyLine}
	 * labeled alternative in {@link CoffieLangParser#rbody}.
	 * @param ctx the parse tree
	 */
	void enterFnBodyLine(CoffieLangParser.FnBodyLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FnBodyLine}
	 * labeled alternative in {@link CoffieLangParser#rbody}.
	 * @param ctx the parse tree
	 */
	void exitFnBodyLine(CoffieLangParser.FnBodyLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FnDecl}
	 * labeled alternative in {@link CoffieLangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFnDecl(CoffieLangParser.FnDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FnDecl}
	 * labeled alternative in {@link CoffieLangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFnDecl(CoffieLangParser.FnDeclContext ctx);
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
	 * Enter a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link CoffieLangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamList(CoffieLangParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link CoffieLangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamList(CoffieLangParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamCallList}
	 * labeled alternative in {@link CoffieLangParser#paramsCall}.
	 * @param ctx the parse tree
	 */
	void enterParamCallList(CoffieLangParser.ParamCallListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamCallList}
	 * labeled alternative in {@link CoffieLangParser#paramsCall}.
	 * @param ctx the parse tree
	 */
	void exitParamCallList(CoffieLangParser.ParamCallListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncInvoc}
	 * labeled alternative in {@link CoffieLangParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvoc(CoffieLangParser.FuncInvocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncInvoc}
	 * labeled alternative in {@link CoffieLangParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvoc(CoffieLangParser.FuncInvocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LibStmt}
	 * labeled alternative in {@link CoffieLangParser#lib}.
	 * @param ctx the parse tree
	 */
	void enterLibStmt(CoffieLangParser.LibStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LibStmt}
	 * labeled alternative in {@link CoffieLangParser#lib}.
	 * @param ctx the parse tree
	 */
	void exitLibStmt(CoffieLangParser.LibStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCast}
	 * labeled alternative in {@link CoffieLangParser#typecast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(CoffieLangParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCast}
	 * labeled alternative in {@link CoffieLangParser#typecast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(CoffieLangParser.TypeCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeOfVar}
	 * labeled alternative in {@link CoffieLangParser#typeof}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfVar(CoffieLangParser.TypeOfVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeOfVar}
	 * labeled alternative in {@link CoffieLangParser#typeof}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfVar(CoffieLangParser.TypeOfVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryCond}
	 * labeled alternative in {@link CoffieLangParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernaryCond(CoffieLangParser.TernaryCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryCond}
	 * labeled alternative in {@link CoffieLangParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernaryCond(CoffieLangParser.TernaryCondContext ctx);
}