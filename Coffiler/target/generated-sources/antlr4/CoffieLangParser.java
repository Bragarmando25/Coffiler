// Generated from CoffieLang.g4 by ANTLR 4.13.2

package coffie;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CoffieLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WHILE=3, RETURN=4, IMPORT=5, TYPEOF=6, IF=7, ELSE=8, EOL=9, 
		PRINT=10, READ=11, INTEGER=12, DOUBLE=13, BOOLEAN=14, STRING=15, VOID=16, 
		SUM=17, SUB=18, DIV=19, MULT=20, MOD=21, ASSIGN=22, SEP=23, LP=24, RP=25, 
		LB=26, RB=27, LE=28, LT=29, GT=30, GE=31, EQ=32, NE=33, NUMD=34, NUM=35, 
		BOOL=36, STR=37, VAR=38, COMMENT=39, WS=40;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_atrib = 2, RULE_input = 3, RULE_output = 4, 
		RULE_expr = 5, RULE_term = 6, RULE_factor = 7, RULE_bexpr = 8, RULE_controlflow = 9, 
		RULE_loop = 10, RULE_block = 11, RULE_rblock = 12, RULE_rbody = 13, RULE_function = 14, 
		RULE_type = 15, RULE_params = 16, RULE_paramsCall = 17, RULE_callFunction = 18, 
		RULE_lib = 19, RULE_typecast = 20, RULE_typeof = 21, RULE_ternary = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "atrib", "input", "output", "expr", "term", "factor", 
			"bexpr", "controlflow", "loop", "block", "rblock", "rbody", "function", 
			"type", "params", "paramsCall", "callFunction", "lib", "typecast", "typeof", 
			"ternary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "':'", "'while'", "'return'", "'#import'", "'typeof'", "'if'", 
			"'else'", "';'", "'print'", "'read'", "'int'", "'double'", "'bool'", 
			"'str'", "'void'", "'+'", "'-'", "'/'", "'*'", "'%'", "'='", "','", "'('", 
			"')'", "'{'", "'}'", "'<='", "'<'", "'>'", "'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WHILE", "RETURN", "IMPORT", "TYPEOF", "IF", "ELSE", 
			"EOL", "PRINT", "READ", "INTEGER", "DOUBLE", "BOOLEAN", "STRING", "VOID", 
			"SUM", "SUB", "DIV", "MULT", "MOD", "ASSIGN", "SEP", "LP", "RP", "LB", 
			"RB", "LE", "LT", "GT", "GE", "EQ", "NE", "NUMD", "NUM", "BOOL", "STR", 
			"VAR", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CoffieLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoffieLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				line();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 532592852200L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CoffieLangParser.EOL, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ControlflowContext controlflow() {
			return getRuleContext(ControlflowContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public LibContext lib() {
			return getRuleContext(LibContext.class,0);
		}
		public TypecastContext typecast() {
			return getRuleContext(TypecastContext.class,0);
		}
		public TypeofContext typeof() {
			return getRuleContext(TypeofContext.class,0);
		}
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				atrib();
				setState(52);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				input();
				setState(55);
				match(EOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				output();
				setState(58);
				match(EOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				controlflow();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				callFunction();
				setState(64);
				match(EOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				lib();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				typecast();
				setState(68);
				match(EOL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				typeof();
				setState(71);
				match(EOL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
				ternary();
				setState(74);
				match(EOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariavelExistenteBooleanContext extends AtribContext {
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(CoffieLangParser.ASSIGN, 0); }
		public TerminalNode BOOL() { return getToken(CoffieLangParser.BOOL, 0); }
		public VariavelExistenteBooleanContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterVariavelExistenteBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitVariavelExistenteBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitVariavelExistenteBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariavelNovaContext extends AtribContext {
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(CoffieLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(CoffieLangParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(CoffieLangParser.DOUBLE, 0); }
		public VariavelNovaContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterVariavelNova(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitVariavelNova(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitVariavelNova(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariavelExistenteStringContext extends AtribContext {
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(CoffieLangParser.ASSIGN, 0); }
		public TerminalNode STR() { return getToken(CoffieLangParser.STR, 0); }
		public VariavelExistenteStringContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterVariavelExistenteString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitVariavelExistenteString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitVariavelExistenteString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariavelNovaStringContext extends AtribContext {
		public TerminalNode STRING() { return getToken(CoffieLangParser.STRING, 0); }
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(CoffieLangParser.ASSIGN, 0); }
		public TerminalNode STR() { return getToken(CoffieLangParser.STR, 0); }
		public VariavelNovaStringContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterVariavelNovaString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitVariavelNovaString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitVariavelNovaString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariavelNovaBooleanContext extends AtribContext {
		public TerminalNode BOOLEAN() { return getToken(CoffieLangParser.BOOLEAN, 0); }
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(CoffieLangParser.ASSIGN, 0); }
		public TerminalNode BOOL() { return getToken(CoffieLangParser.BOOL, 0); }
		public VariavelNovaBooleanContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterVariavelNovaBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitVariavelNovaBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitVariavelNovaBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariavelExistenteContext extends AtribContext {
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(CoffieLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariavelExistenteContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterVariavelExistente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitVariavelExistente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitVariavelExistente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atrib);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariavelExistenteStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(VAR);
				setState(79);
				match(ASSIGN);
				setState(80);
				match(STR);
				}
				break;
			case 2:
				_localctx = new VariavelNovaStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(STRING);
				setState(82);
				match(VAR);
				setState(83);
				match(ASSIGN);
				setState(84);
				match(STR);
				}
				break;
			case 3:
				_localctx = new VariavelNovaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				match(VAR);
				setState(87);
				match(ASSIGN);
				setState(88);
				expr();
				}
				break;
			case 4:
				_localctx = new VariavelNovaBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(BOOLEAN);
				setState(90);
				match(VAR);
				setState(91);
				match(ASSIGN);
				setState(92);
				match(BOOL);
				}
				break;
			case 5:
				_localctx = new VariavelExistenteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(VAR);
				setState(94);
				match(ASSIGN);
				setState(95);
				expr();
				}
				break;
			case 6:
				_localctx = new VariavelExistenteBooleanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(VAR);
				setState(97);
				match(ASSIGN);
				setState(98);
				match(BOOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputVarContext extends InputContext {
		public TerminalNode READ() { return getToken(CoffieLangParser.READ, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public InputVarContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterInputVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitInputVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitInputVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		try {
			_localctx = new InputVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(READ);
			setState(102);
			match(LP);
			setState(103);
			match(VAR);
			setState(104);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputStrContext extends OutputContext {
		public TerminalNode PRINT() { return getToken(CoffieLangParser.PRINT, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode STR() { return getToken(CoffieLangParser.STR, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public OutputStrContext(OutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterOutputStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitOutputStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitOutputStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputVarContext extends OutputContext {
		public TerminalNode PRINT() { return getToken(CoffieLangParser.PRINT, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public OutputVarContext(OutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterOutputVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitOutputVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitOutputVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputExprContext extends OutputContext {
		public TerminalNode PRINT() { return getToken(CoffieLangParser.PRINT, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public OutputExprContext(OutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterOutputExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitOutputExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitOutputExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new OutputStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(PRINT);
				setState(107);
				match(LP);
				setState(108);
				match(STR);
				setState(109);
				match(RP);
				}
				break;
			case 2:
				_localctx = new OutputVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(PRINT);
				setState(111);
				match(LP);
				setState(112);
				match(VAR);
				setState(113);
				match(RP);
				}
				break;
			case 3:
				_localctx = new OutputExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(PRINT);
				setState(115);
				match(LP);
				setState(116);
				expr();
				setState(117);
				match(RP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSumContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SUM() { return getToken(CoffieLangParser.SUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprSum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSubContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CoffieLangParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ExprSumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				term();
				setState(122);
				match(SUM);
				setState(123);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprSubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				term();
				setState(126);
				match(SUB);
				setState(127);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermFactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterTermFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitTermFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitTermFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermDivContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CoffieLangParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterTermDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitTermDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitTermDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermModContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MOD() { return getToken(CoffieLangParser.MOD, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermModContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterTermMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitTermMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitTermMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermMultContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CoffieLangParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterTermMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitTermMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitTermMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new TermMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				factor();
				setState(133);
				match(MULT);
				setState(134);
				term();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				factor();
				setState(137);
				match(DIV);
				setState(138);
				term();
				}
				break;
			case 3:
				_localctx = new TermModContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				factor();
				setState(141);
				match(MOD);
				setState(142);
				term();
				}
				break;
			case 4:
				_localctx = new TermFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNumDContext extends FactorContext {
		public TerminalNode NUMD() { return getToken(CoffieLangParser.NUMD, 0); }
		public FactorNumDContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFactorNumD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFactorNumD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFactorNumD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(CoffieLangParser.NUM, 0); }
		public FactorNumContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFactorNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFactorNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFactorNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorBoolContext extends FactorContext {
		public TerminalNode BOOL() { return getToken(CoffieLangParser.BOOL, 0); }
		public FactorBoolContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFactorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFactorBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFactorBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorStrContext extends FactorContext {
		public TerminalNode STR() { return getToken(CoffieLangParser.STR, 0); }
		public FactorStrContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFactorStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFactorStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFactorStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorVarContext extends FactorContext {
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public FactorVarContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFactorVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFactorVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFactorVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorExprContext extends FactorContext {
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public FactorExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFactorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFactorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(NUM);
				}
				break;
			case NUMD:
				_localctx = new FactorNumDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(NUMD);
				}
				break;
			case VAR:
				_localctx = new FactorVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(VAR);
				}
				break;
			case STR:
				_localctx = new FactorStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(STR);
				}
				break;
			case BOOL:
				_localctx = new FactorBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(BOOL);
				}
				break;
			case LP:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(LP);
				setState(153);
				expr();
				setState(154);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(CoffieLangParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoffieLangParser.LE, 0); }
		public TerminalNode GT() { return getToken(CoffieLangParser.GT, 0); }
		public TerminalNode GE() { return getToken(CoffieLangParser.GE, 0); }
		public TerminalNode EQ() { return getToken(CoffieLangParser.EQ, 0); }
		public TerminalNode NE() { return getToken(CoffieLangParser.NE, 0); }
		public TerminalNode BOOL() { return getToken(CoffieLangParser.BOOL, 0); }
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitBexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitBexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bexpr);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				expr();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) {
					{
					setState(159);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(160);
					expr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(VAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ControlflowContext extends ParserRuleContext {
		public ControlflowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlflow; }
	 
		public ControlflowContext() { }
		public void copyFrom(ControlflowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseBlockContext extends ControlflowContext {
		public TerminalNode IF() { return getToken(CoffieLangParser.IF, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CoffieLangParser.ELSE, 0); }
		public IfElseBlockContext(ControlflowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterIfElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitIfElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitIfElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ControlflowContext {
		public TerminalNode IF() { return getToken(CoffieLangParser.IF, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockContext(ControlflowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlflowContext controlflow() throws RecognitionException {
		ControlflowContext _localctx = new ControlflowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_controlflow);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(IF);
				setState(168);
				match(LP);
				setState(169);
				bexpr();
				setState(170);
				match(RP);
				setState(171);
				block();
				}
				break;
			case 2:
				_localctx = new IfElseBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(IF);
				setState(174);
				match(LP);
				setState(175);
				bexpr();
				setState(176);
				match(RP);
				setState(177);
				block();
				setState(178);
				match(ELSE);
				setState(179);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopBlockContext extends LoopContext {
		public TerminalNode WHILE() { return getToken(CoffieLangParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopBlockContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loop);
		try {
			_localctx = new LoopBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(WHILE);
			setState(184);
			match(LP);
			setState(185);
			bexpr();
			setState(186);
			match(RP);
			setState(187);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockLineContext extends BlockContext {
		public TerminalNode LB() { return getToken(CoffieLangParser.LB, 0); }
		public TerminalNode RB() { return getToken(CoffieLangParser.RB, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockLineContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterBlockLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitBlockLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitBlockLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			_localctx = new BlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LB);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 532592852200L) != 0)) {
				{
				{
				setState(190);
				line();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RblockContext extends ParserRuleContext {
		public RblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rblock; }
	 
		public RblockContext() { }
		public void copyFrom(RblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBlockLineContext extends RblockContext {
		public TerminalNode LB() { return getToken(CoffieLangParser.LB, 0); }
		public RbodyContext rbody() {
			return getRuleContext(RbodyContext.class,0);
		}
		public TerminalNode RB() { return getToken(CoffieLangParser.RB, 0); }
		public FnBlockLineContext(RblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFnBlockLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFnBlockLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFnBlockLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RblockContext rblock() throws RecognitionException {
		RblockContext _localctx = new RblockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rblock);
		try {
			_localctx = new FnBlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(LB);
			setState(199);
			rbody();
			setState(200);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RbodyContext extends ParserRuleContext {
		public RbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbody; }
	 
		public RbodyContext() { }
		public void copyFrom(RbodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineContext extends RbodyContext {
		public TerminalNode RETURN() { return getToken(CoffieLangParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(CoffieLangParser.EOL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FnBodyLineContext(RbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFnBodyLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFnBodyLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFnBodyLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RbodyContext rbody() throws RecognitionException {
		RbodyContext _localctx = new RbodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rbody);
		int _la;
		try {
			_localctx = new FnBodyLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 532592852200L) != 0)) {
				{
				{
				setState(202);
				line();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(RETURN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 532592721920L) != 0)) {
				{
				setState(209);
				expr();
				}
			}

			setState(212);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnDeclContext extends FunctionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public RblockContext rblock() {
			return getRuleContext(RblockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FnDeclContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFnDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFnDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFnDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			_localctx = new FnDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			type();
			setState(215);
			match(VAR);
			setState(216);
			match(LP);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) {
				{
				setState(217);
				params();
				}
			}

			setState(220);
			match(RP);
			setState(221);
			rblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CoffieLangParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(CoffieLangParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(CoffieLangParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(CoffieLangParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(CoffieLangParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParamsContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(CoffieLangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(CoffieLangParser.VAR, i);
		}
		public List<TerminalNode> SEP() { return getTokens(CoffieLangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(CoffieLangParser.SEP, i);
		}
		public ParamListContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			type();
			setState(226);
			match(VAR);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(227);
				match(SEP);
				setState(228);
				type();
				setState(229);
				match(VAR);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsCallContext extends ParserRuleContext {
		public ParamsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsCall; }
	 
		public ParamsCallContext() { }
		public void copyFrom(ParamsCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamCallListContext extends ParamsCallContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(CoffieLangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(CoffieLangParser.SEP, i);
		}
		public ParamCallListContext(ParamsCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterParamCallList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitParamCallList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitParamCallList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsCallContext paramsCall() throws RecognitionException {
		ParamsCallContext _localctx = new ParamsCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_paramsCall);
		int _la;
		try {
			_localctx = new ParamCallListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			expr();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(237);
				match(SEP);
				setState(238);
				expr();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ParserRuleContext {
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	 
		public CallFunctionContext() { }
		public void copyFrom(CallFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvocContext extends CallFunctionContext {
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public ParamsCallContext paramsCall() {
			return getRuleContext(ParamsCallContext.class,0);
		}
		public FuncInvocContext(CallFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFuncInvoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFuncInvoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFuncInvoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_callFunction);
		int _la;
		try {
			_localctx = new FuncInvocContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(VAR);
			setState(245);
			match(LP);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 532592721920L) != 0)) {
				{
				setState(246);
				paramsCall();
				}
			}

			setState(249);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LibContext extends ParserRuleContext {
		public LibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib; }
	 
		public LibContext() { }
		public void copyFrom(LibContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LibStmtContext extends LibContext {
		public TerminalNode IMPORT() { return getToken(CoffieLangParser.IMPORT, 0); }
		public TerminalNode STR() { return getToken(CoffieLangParser.STR, 0); }
		public TerminalNode EOL() { return getToken(CoffieLangParser.EOL, 0); }
		public LibStmtContext(LibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterLibStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitLibStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitLibStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibContext lib() throws RecognitionException {
		LibContext _localctx = new LibContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lib);
		try {
			_localctx = new LibStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IMPORT);
			setState(252);
			match(STR);
			setState(253);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypecastContext extends ParserRuleContext {
		public TypecastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecast; }
	 
		public TypecastContext() { }
		public void copyFrom(TypecastContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastContext extends TypecastContext {
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeCastContext(TypecastContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypecastContext typecast() throws RecognitionException {
		TypecastContext _localctx = new TypecastContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typecast);
		try {
			_localctx = new TypeCastContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LP);
			setState(256);
			type();
			setState(257);
			match(RP);
			setState(258);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeofContext extends ParserRuleContext {
		public TypeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeof; }
	 
		public TypeofContext() { }
		public void copyFrom(TypeofContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeOfVarContext extends TypeofContext {
		public TerminalNode TYPEOF() { return getToken(CoffieLangParser.TYPEOF, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode VAR() { return getToken(CoffieLangParser.VAR, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public TypeOfVarContext(TypeofContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterTypeOfVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitTypeOfVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitTypeOfVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeofContext typeof() throws RecognitionException {
		TypeofContext _localctx = new TypeofContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeof);
		try {
			_localctx = new TypeOfVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(TYPEOF);
			setState(261);
			match(LP);
			setState(262);
			match(VAR);
			setState(263);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryContext extends ParserRuleContext {
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
	 
		public TernaryContext() { }
		public void copyFrom(TernaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryCondContext extends TernaryContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryCondContext(TernaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterTernaryCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitTernaryCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitTernaryCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ternary);
		try {
			_localctx = new TernaryCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			bexpr();
			setState(266);
			match(T__0);
			setState(267);
			expr();
			setState(268);
			match(T__1);
			setState(269);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u0110\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000"+
		"\f\u00001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002d\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0092\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009d\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00a2\b\b\u0001\b\u0001\b\u0003\b\u00a6"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b6\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00c0\b\u000b\n\u000b\f\u000b\u00c3\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0005\r\u00cc\b\r\n\r\f\r\u00cf\t\r"+
		"\u0001\r\u0001\r\u0003\r\u00d3\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00db\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e8\b\u0010\n\u0010"+
		"\f\u0010\u00eb\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00f0\b\u0011\n\u0011\f\u0011\u00f3\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00f8\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0003\u0001"+
		"\u0000\f\r\u0001\u0000\u001c!\u0001\u0000\f\u0010\u011f\u0000/\u0001\u0000"+
		"\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0004c\u0001\u0000\u0000\u0000"+
		"\u0006e\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\n\u0082\u0001"+
		"\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e\u009c\u0001\u0000"+
		"\u0000\u0000\u0010\u00a5\u0001\u0000\u0000\u0000\u0012\u00b5\u0001\u0000"+
		"\u0000\u0000\u0014\u00b7\u0001\u0000\u0000\u0000\u0016\u00bd\u0001\u0000"+
		"\u0000\u0000\u0018\u00c6\u0001\u0000\u0000\u0000\u001a\u00cd\u0001\u0000"+
		"\u0000\u0000\u001c\u00d6\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000"+
		"\u0000\u0000 \u00e1\u0001\u0000\u0000\u0000\"\u00ec\u0001\u0000\u0000"+
		"\u0000$\u00f4\u0001\u0000\u0000\u0000&\u00fb\u0001\u0000\u0000\u0000("+
		"\u00ff\u0001\u0000\u0000\u0000*\u0104\u0001\u0000\u0000\u0000,\u0109\u0001"+
		"\u0000\u0000\u0000.0\u0003\u0002\u0001\u0000/.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002\u0001\u0001\u0000\u0000\u000034\u0003\u0004\u0002\u000045\u0005"+
		"\t\u0000\u00005M\u0001\u0000\u0000\u000067\u0003\u0006\u0003\u000078\u0005"+
		"\t\u0000\u00008M\u0001\u0000\u0000\u00009:\u0003\b\u0004\u0000:;\u0005"+
		"\t\u0000\u0000;M\u0001\u0000\u0000\u0000<M\u0003\u0012\t\u0000=M\u0003"+
		"\u0014\n\u0000>M\u0003\u001c\u000e\u0000?@\u0003$\u0012\u0000@A\u0005"+
		"\t\u0000\u0000AM\u0001\u0000\u0000\u0000BM\u0003&\u0013\u0000CD\u0003"+
		"(\u0014\u0000DE\u0005\t\u0000\u0000EM\u0001\u0000\u0000\u0000FG\u0003"+
		"*\u0015\u0000GH\u0005\t\u0000\u0000HM\u0001\u0000\u0000\u0000IJ\u0003"+
		",\u0016\u0000JK\u0005\t\u0000\u0000KM\u0001\u0000\u0000\u0000L3\u0001"+
		"\u0000\u0000\u0000L6\u0001\u0000\u0000\u0000L9\u0001\u0000\u0000\u0000"+
		"L<\u0001\u0000\u0000\u0000L=\u0001\u0000\u0000\u0000L>\u0001\u0000\u0000"+
		"\u0000L?\u0001\u0000\u0000\u0000LB\u0001\u0000\u0000\u0000LC\u0001\u0000"+
		"\u0000\u0000LF\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000M\u0003"+
		"\u0001\u0000\u0000\u0000NO\u0005&\u0000\u0000OP\u0005\u0016\u0000\u0000"+
		"Pd\u0005%\u0000\u0000QR\u0005\u000f\u0000\u0000RS\u0005&\u0000\u0000S"+
		"T\u0005\u0016\u0000\u0000Td\u0005%\u0000\u0000UV\u0007\u0000\u0000\u0000"+
		"VW\u0005&\u0000\u0000WX\u0005\u0016\u0000\u0000Xd\u0003\n\u0005\u0000"+
		"YZ\u0005\u000e\u0000\u0000Z[\u0005&\u0000\u0000[\\\u0005\u0016\u0000\u0000"+
		"\\d\u0005$\u0000\u0000]^\u0005&\u0000\u0000^_\u0005\u0016\u0000\u0000"+
		"_d\u0003\n\u0005\u0000`a\u0005&\u0000\u0000ab\u0005\u0016\u0000\u0000"+
		"bd\u0005$\u0000\u0000cN\u0001\u0000\u0000\u0000cQ\u0001\u0000\u0000\u0000"+
		"cU\u0001\u0000\u0000\u0000cY\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000"+
		"\u0000c`\u0001\u0000\u0000\u0000d\u0005\u0001\u0000\u0000\u0000ef\u0005"+
		"\u000b\u0000\u0000fg\u0005\u0018\u0000\u0000gh\u0005&\u0000\u0000hi\u0005"+
		"\u0019\u0000\u0000i\u0007\u0001\u0000\u0000\u0000jk\u0005\n\u0000\u0000"+
		"kl\u0005\u0018\u0000\u0000lm\u0005%\u0000\u0000mx\u0005\u0019\u0000\u0000"+
		"no\u0005\n\u0000\u0000op\u0005\u0018\u0000\u0000pq\u0005&\u0000\u0000"+
		"qx\u0005\u0019\u0000\u0000rs\u0005\n\u0000\u0000st\u0005\u0018\u0000\u0000"+
		"tu\u0003\n\u0005\u0000uv\u0005\u0019\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wj\u0001\u0000\u0000\u0000wn\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000"+
		"\u0000x\t\u0001\u0000\u0000\u0000yz\u0003\f\u0006\u0000z{\u0005\u0011"+
		"\u0000\u0000{|\u0003\n\u0005\u0000|\u0083\u0001\u0000\u0000\u0000}~\u0003"+
		"\f\u0006\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0080\u0003\n\u0005"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083\u0003\f\u0006\u0000"+
		"\u0082y\u0001\u0000\u0000\u0000\u0082}\u0001\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u000b\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0003\u000e\u0007\u0000\u0085\u0086\u0005\u0014\u0000\u0000\u0086\u0087"+
		"\u0003\f\u0006\u0000\u0087\u0092\u0001\u0000\u0000\u0000\u0088\u0089\u0003"+
		"\u000e\u0007\u0000\u0089\u008a\u0005\u0013\u0000\u0000\u008a\u008b\u0003"+
		"\f\u0006\u0000\u008b\u0092\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u000e"+
		"\u0007\u0000\u008d\u008e\u0005\u0015\u0000\u0000\u008e\u008f\u0003\f\u0006"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u000e\u0007"+
		"\u0000\u0091\u0084\u0001\u0000\u0000\u0000\u0091\u0088\u0001\u0000\u0000"+
		"\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093\u009d\u0005#\u0000\u0000"+
		"\u0094\u009d\u0005\"\u0000\u0000\u0095\u009d\u0005&\u0000\u0000\u0096"+
		"\u009d\u0005%\u0000\u0000\u0097\u009d\u0005$\u0000\u0000\u0098\u0099\u0005"+
		"\u0018\u0000\u0000\u0099\u009a\u0003\n\u0005\u0000\u009a\u009b\u0005\u0019"+
		"\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000"+
		"\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u0095\u0001\u0000"+
		"\u0000\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u0097\u0001\u0000"+
		"\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009d\u000f\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0003\n\u0005\u0000\u009f\u00a0\u0007\u0001\u0000"+
		"\u0000\u00a0\u00a2\u0003\n\u0005\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a6\u0005$\u0000\u0000\u00a4\u00a6\u0005&\u0000\u0000\u00a5\u009e"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0007\u0000\u0000\u00a8\u00a9\u0005\u0018\u0000\u0000\u00a9\u00aa"+
		"\u0003\u0010\b\u0000\u00aa\u00ab\u0005\u0019\u0000\u0000\u00ab\u00ac\u0003"+
		"\u0016\u000b\u0000\u00ac\u00b6\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0007\u0000\u0000\u00ae\u00af\u0005\u0018\u0000\u0000\u00af\u00b0\u0003"+
		"\u0010\b\u0000\u00b0\u00b1\u0005\u0019\u0000\u0000\u00b1\u00b2\u0003\u0016"+
		"\u000b\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00b4\u0003\u0016\u000b"+
		"\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00a7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b6\u0013\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000\u00b8\u00b9\u0005\u0018\u0000"+
		"\u0000\u00b9\u00ba\u0003\u0010\b\u0000\u00ba\u00bb\u0005\u0019\u0000\u0000"+
		"\u00bb\u00bc\u0003\u0016\u000b\u0000\u00bc\u0015\u0001\u0000\u0000\u0000"+
		"\u00bd\u00c1\u0005\u001a\u0000\u0000\u00be\u00c0\u0003\u0002\u0001\u0000"+
		"\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005\u001b\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005\u001a\u0000\u0000\u00c7\u00c8\u0003\u001a\r\u0000\u00c8"+
		"\u00c9\u0005\u001b\u0000\u0000\u00c9\u0019\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cc\u0003\u0002\u0001\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\u0004\u0000\u0000\u00d1"+
		"\u00d3\u0003\n\u0005\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0005\t\u0000\u0000\u00d5\u001b\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003"+
		"\u001e\u000f\u0000\u00d7\u00d8\u0005&\u0000\u0000\u00d8\u00da\u0005\u0018"+
		"\u0000\u0000\u00d9\u00db\u0003 \u0010\u0000\u00da\u00d9\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0019\u0000\u0000\u00dd\u00de\u0003\u0018\f\u0000"+
		"\u00de\u001d\u0001\u0000\u0000\u0000\u00df\u00e0\u0007\u0002\u0000\u0000"+
		"\u00e0\u001f\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u001e\u000f\u0000"+
		"\u00e2\u00e9\u0005&\u0000\u0000\u00e3\u00e4\u0005\u0017\u0000\u0000\u00e4"+
		"\u00e5\u0003\u001e\u000f\u0000\u00e5\u00e6\u0005&\u0000\u0000\u00e6\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e8\u00eb"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f1\u0003\n\u0005\u0000\u00ed\u00ee\u0005\u0017"+
		"\u0000\u0000\u00ee\u00f0\u0003\n\u0005\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2#\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005&\u0000\u0000\u00f5"+
		"\u00f7\u0005\u0018\u0000\u0000\u00f6\u00f8\u0003\"\u0011\u0000\u00f7\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0019\u0000\u0000\u00fa%\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005\u0005\u0000\u0000\u00fc\u00fd\u0005"+
		"%\u0000\u0000\u00fd\u00fe\u0005\t\u0000\u0000\u00fe\'\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\u0018\u0000\u0000\u0100\u0101\u0003\u001e\u000f"+
		"\u0000\u0101\u0102\u0005\u0019\u0000\u0000\u0102\u0103\u0003\n\u0005\u0000"+
		"\u0103)\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0006\u0000\u0000\u0105"+
		"\u0106\u0005\u0018\u0000\u0000\u0106\u0107\u0005&\u0000\u0000\u0107\u0108"+
		"\u0005\u0019\u0000\u0000\u0108+\u0001\u0000\u0000\u0000\u0109\u010a\u0003"+
		"\u0010\b\u0000\u010a\u010b\u0005\u0001\u0000\u0000\u010b\u010c\u0003\n"+
		"\u0005\u0000\u010c\u010d\u0005\u0002\u0000\u0000\u010d\u010e\u0003\n\u0005"+
		"\u0000\u010e-\u0001\u0000\u0000\u0000\u00111Lcw\u0082\u0091\u009c\u00a1"+
		"\u00a5\u00b5\u00c1\u00cd\u00d2\u00da\u00e9\u00f1\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}