// Generated from coffie/CoffieLang.g4 by ANTLR 4.13.2
package coffie;
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
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, MAIN=5, NEW=6, IF=7, ELSE=8, WHILE=9, 
		FOR=10, RETURN=11, SYSTEM_OUT_PRINTLN=12, TYPE_INT=13, TYPE_DOUBLE=14, 
		TYPE_BOOLEAN=15, TYPE_STRING=16, TYPE_VOID=17, PLUS=18, MINUS=19, MULT=20, 
		DIV=21, MOD=22, ASSIGN=23, EQ=24, NEQ=25, LT=26, GT=27, LE=28, GE=29, 
		DOT=30, COMMA=31, SEMI=32, LP=33, RP=34, LB=35, RB=36, LB_ARR=37, RB_ARR=38, 
		BOOL_LITERAL=39, INT_LITERAL=40, FLOAT_LITERAL=41, STRING_LITERAL=42, 
		ID=43, COMMENT=44, WS=45, STRING=46;
	public static final int
		RULE_prog = 0, RULE_classDef = 1, RULE_classBody = 2, RULE_fieldDecl = 3, 
		RULE_methodDef = 4, RULE_mainMethod = 5, RULE_params = 6, RULE_param = 7, 
		RULE_block = 8, RULE_statement = 9, RULE_varDecl = 10, RULE_assignment = 11, 
		RULE_printStmt = 12, RULE_ifStmt = 13, RULE_whileStmt = 14, RULE_forStmt = 15, 
		RULE_returnStmt = 16, RULE_callStmt = 17, RULE_expr = 18, RULE_atom = 19, 
		RULE_args = 20, RULE_type = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "classDef", "classBody", "fieldDecl", "methodDef", "mainMethod", 
			"params", "param", "block", "statement", "varDecl", "assignment", "printStmt", 
			"ifStmt", "whileStmt", "forStmt", "returnStmt", "callStmt", "expr", "atom", 
			"args", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", null, "'main'", "'new'", "'if'", 
			"'else'", "'while'", "'for'", "'return'", "'System.out.println'", "'int'", 
			"'double'", "'boolean'", "'String'", null, "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'.'", "','", 
			"';'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "NEW", "IF", "ELSE", 
			"WHILE", "FOR", "RETURN", "SYSTEM_OUT_PRINTLN", "TYPE_INT", "TYPE_DOUBLE", 
			"TYPE_BOOLEAN", "TYPE_STRING", "TYPE_VOID", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "ASSIGN", "EQ", "NEQ", "LT", "GT", "LE", "GE", "DOT", "COMMA", 
			"SEMI", "LP", "RP", "LB", "RB", "LB_ARR", "RB_ARR", "BOOL_LITERAL", "INT_LITERAL", 
			"FLOAT_LITERAL", "STRING_LITERAL", "ID", "COMMENT", "WS", "STRING"
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
		public TerminalNode EOF() { return getToken(CoffieLangParser.EOF, 0); }
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				classDef();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PUBLIC );
			setState(49);
			match(EOF);
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
	public static class ClassDefContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PUBLIC() { return getToken(CoffieLangParser.PUBLIC, 0); }
		public TerminalNode CLASS() { return getToken(CoffieLangParser.CLASS, 0); }
		public TerminalNode LB() { return getToken(CoffieLangParser.LB, 0); }
		public TerminalNode RB() { return getToken(CoffieLangParser.RB, 0); }
		public TerminalNode ID() { return getToken(CoffieLangParser.ID, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PUBLIC);
			setState(52);
			match(CLASS);
			setState(53);
			((ClassDefContext)_localctx).name = match(ID);
			setState(54);
			match(LB);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093276162L) != 0)) {
				{
				{
				setState(55);
				classBody();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
		}
		public MethodDefContext methodDef() {
			return getRuleContext(MethodDefContext.class,0);
		}
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				fieldDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				methodDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				mainMethod();
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
	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoffieLangParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CoffieLangParser.SEMI, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			type();
			setState(69);
			match(ID);
			setState(70);
			match(SEMI);
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
	public static class MethodDefContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(CoffieLangParser.PUBLIC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoffieLangParser.ID, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitMethodDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitMethodDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PUBLIC);
			setState(73);
			type();
			setState(74);
			match(ID);
			setState(75);
			match(LP);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093276160L) != 0)) {
				{
				setState(76);
				params();
				}
			}

			setState(79);
			match(RP);
			setState(80);
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
	public static class MainMethodContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(CoffieLangParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(CoffieLangParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(CoffieLangParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(CoffieLangParser.MAIN, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode STRING() { return getToken(CoffieLangParser.STRING, 0); }
		public TerminalNode LB_ARR() { return getToken(CoffieLangParser.LB_ARR, 0); }
		public TerminalNode RB_ARR() { return getToken(CoffieLangParser.RB_ARR, 0); }
		public TerminalNode ID() { return getToken(CoffieLangParser.ID, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterMainMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitMainMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PUBLIC);
			setState(83);
			match(STATIC);
			setState(84);
			match(VOID);
			setState(85);
			match(MAIN);
			setState(86);
			match(LP);
			setState(87);
			match(STRING);
			setState(88);
			match(LB_ARR);
			setState(89);
			match(RB_ARR);
			setState(90);
			match(ID);
			setState(91);
			match(RP);
			setState(92);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoffieLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoffieLangParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			param();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				param();
				}
				}
				setState(101);
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
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoffieLangParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			match(ID);
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
		public TerminalNode LB() { return getToken(CoffieLangParser.LB, 0); }
		public TerminalNode RB() { return getToken(CoffieLangParser.RB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LB);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093283968L) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtReturnContext extends StatementContext {
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoffieLangParser.SEMI, 0); }
		public StmtReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterStmtReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitStmtReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitStmtReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtCallContext extends StatementContext {
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoffieLangParser.SEMI, 0); }
		public StmtCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterStmtCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitStmtCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitStmtCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtVarDeclContext extends StatementContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoffieLangParser.SEMI, 0); }
		public StmtVarDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterStmtVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitStmtVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitStmtVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtWhileContext extends StatementContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public StmtWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitStmtWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtPrintContext extends StatementContext {
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoffieLangParser.SEMI, 0); }
		public StmtPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterStmtPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitStmtPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitStmtPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtForContext extends StatementContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StmtForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitStmtFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAssignContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoffieLangParser.SEMI, 0); }
		public StmtAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterStmtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitStmtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitStmtAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfContext extends StatementContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StmtVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				varDecl();
				setState(115);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				assignment();
				setState(118);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new StmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				printStmt();
				setState(121);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				ifStmt();
				}
				break;
			case 5:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				whileStmt();
				}
				break;
			case 6:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				forStmt();
				}
				break;
			case 7:
				_localctx = new StmtReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				returnStmt();
				setState(127);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new StmtCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				callStmt();
				setState(130);
				match(SEMI);
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
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoffieLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoffieLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			match(ID);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(136);
				match(ASSIGN);
				setState(137);
				expr(0);
				}
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
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoffieLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoffieLangParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(CoffieLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CoffieLangParser.DOT, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(141);
				match(DOT);
				setState(142);
				match(ID);
				}
			}

			setState(145);
			match(ASSIGN);
			setState(146);
			expr(0);
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
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode SYSTEM_OUT_PRINTLN() { return getToken(CoffieLangParser.SYSTEM_OUT_PRINTLN, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(SYSTEM_OUT_PRINTLN);
			setState(149);
			match(LP);
			setState(150);
			expr(0);
			setState(151);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CoffieLangParser.IF, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CoffieLangParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			match(LP);
			setState(155);
			expr(0);
			setState(156);
			match(RP);
			setState(157);
			block();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(158);
				match(ELSE);
				setState(159);
				block();
				}
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
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CoffieLangParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WHILE);
			setState(163);
			match(LP);
			setState(164);
			expr(0);
			setState(165);
			match(RP);
			setState(166);
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
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CoffieLangParser.FOR, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoffieLangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoffieLangParser.SEMI, i);
		}
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(FOR);
			setState(169);
			match(LP);
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(170);
				varDecl();
				}
				break;
			case 2:
				{
				setState(171);
				assignment();
				}
				break;
			}
			setState(174);
			match(SEMI);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17051020165184L) != 0)) {
				{
				setState(175);
				expr(0);
				}
			}

			setState(178);
			match(SEMI);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(179);
				assignment();
				}
			}

			setState(182);
			match(RP);
			setState(183);
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CoffieLangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(RETURN);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17051020165184L) != 0)) {
				{
				setState(186);
				expr(0);
				}
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
	public static class CallStmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoffieLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoffieLangParser.ID, i);
		}
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public TerminalNode DOT() { return getToken(CoffieLangParser.DOT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_callStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(190);
				match(DOT);
				setState(191);
				match(ID);
				}
			}

			setState(194);
			match(LP);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17051020165184L) != 0)) {
				{
				setState(195);
				args();
				}
			}

			setState(198);
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
	public static class ExprAddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CoffieLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoffieLangParser.MINUS, 0); }
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAtomContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprAtomContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CoffieLangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CoffieLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CoffieLangParser.MOD, 0); }
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelationalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(CoffieLangParser.LT, 0); }
		public TerminalNode GT() { return getToken(CoffieLangParser.GT, 0); }
		public TerminalNode LE() { return getToken(CoffieLangParser.LE, 0); }
		public TerminalNode GE() { return getToken(CoffieLangParser.GE, 0); }
		public ExprRelationalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprEqualityContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(CoffieLangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CoffieLangParser.NEQ, 0); }
		public ExprEqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNewObjectContext extends ExprContext {
		public TerminalNode NEW() { return getToken(CoffieLangParser.NEW, 0); }
		public TerminalNode ID() { return getToken(CoffieLangParser.ID, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public ExprNewObjectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterExprNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitExprNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitExprNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				{
				_localctx = new ExprNewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(201);
				match(NEW);
				setState(202);
				match(ID);
				setState(203);
				match(LP);
				setState(204);
				match(RP);
				}
				break;
			case LP:
			case BOOL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case ID:
				{
				_localctx = new ExprAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(209);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(212);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(215);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(218);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(CoffieLangParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CoffieLangParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CoffieLangParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CoffieLangParser.BOOL_LITERAL, 0); }
		public List<TerminalNode> ID() { return getTokens(CoffieLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoffieLangParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(CoffieLangParser.DOT, 0); }
		public TerminalNode LP() { return getToken(CoffieLangParser.LP, 0); }
		public TerminalNode RP() { return getToken(CoffieLangParser.RP, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atom);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(FLOAT_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(BOOL_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(ID);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(230);
					match(DOT);
					setState(231);
					match(ID);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				match(ID);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(235);
					match(DOT);
					setState(236);
					match(ID);
					}
				}

				setState(239);
				match(LP);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17051020165184L) != 0)) {
					{
					setState(240);
					args();
					}
				}

				setState(243);
				match(RP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(LP);
				setState(245);
				expr(0);
				setState(246);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoffieLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoffieLangParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffieLangListener ) ((CoffieLangListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoffieLangVisitor ) return ((CoffieLangVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expr(0);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				expr(0);
				}
				}
				setState(257);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(CoffieLangParser.TYPE_INT, 0); }
		public TerminalNode TYPE_DOUBLE() { return getToken(CoffieLangParser.TYPE_DOUBLE, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(CoffieLangParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_STRING() { return getToken(CoffieLangParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_VOID() { return getToken(CoffieLangParser.TYPE_VOID, 0); }
		public TerminalNode ID() { return getToken(CoffieLangParser.ID, 0); }
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
		enterRule(_localctx, 42, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093276160L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0004\u0000.\b\u0000\u000b\u0000\f\u0000/\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u00019\b\u0001\n\u0001\f\u0001<\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006b\b\u0006\n\u0006"+
		"\f\u0006e\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0005\bl\b\b\n\b\f\bo\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0085\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u008b\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0090\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00a1\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00ad\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00b1\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b5\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00bc"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c1\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00c5\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00cf\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00dd\b\u0012\n\u0012\f\u0012\u00e0"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00e9\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00ee\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00f2"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f9\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00fe"+
		"\b\u0014\n\u0014\f\u0014\u0101\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0000\u0001$\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0005\u0001\u0000\u0014\u0016"+
		"\u0001\u0000\u0012\u0013\u0001\u0000\u001a\u001d\u0001\u0000\u0018\u0019"+
		"\u0002\u0000\r\u0011++\u0115\u0000-\u0001\u0000\u0000\u0000\u00023\u0001"+
		"\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000"+
		"\u0000\bH\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\f^\u0001"+
		"\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000"+
		"\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000"+
		"\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000"+
		"\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u00a2\u0001\u0000\u0000"+
		"\u0000\u001e\u00a8\u0001\u0000\u0000\u0000 \u00b9\u0001\u0000\u0000\u0000"+
		"\"\u00bd\u0001\u0000\u0000\u0000$\u00ce\u0001\u0000\u0000\u0000&\u00f8"+
		"\u0001\u0000\u0000\u0000(\u00fa\u0001\u0000\u0000\u0000*\u0102\u0001\u0000"+
		"\u0000\u0000,.\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000"+
		"\u0000\u000034\u0005\u0001\u0000\u000045\u0005\u0002\u0000\u000056\u0005"+
		"+\u0000\u00006:\u0005#\u0000\u000079\u0003\u0004\u0002\u000087\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=>\u0005$\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?C\u0003\u0006\u0003"+
		"\u0000@C\u0003\b\u0004\u0000AC\u0003\n\u0005\u0000B?\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0005\u0001"+
		"\u0000\u0000\u0000DE\u0003*\u0015\u0000EF\u0005+\u0000\u0000FG\u0005 "+
		"\u0000\u0000G\u0007\u0001\u0000\u0000\u0000HI\u0005\u0001\u0000\u0000"+
		"IJ\u0003*\u0015\u0000JK\u0005+\u0000\u0000KM\u0005!\u0000\u0000LN\u0003"+
		"\f\u0006\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0005\"\u0000\u0000PQ\u0003\u0010\b\u0000Q\t\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0001\u0000\u0000ST\u0005\u0003\u0000\u0000"+
		"TU\u0005\u0004\u0000\u0000UV\u0005\u0005\u0000\u0000VW\u0005!\u0000\u0000"+
		"WX\u0005.\u0000\u0000XY\u0005%\u0000\u0000YZ\u0005&\u0000\u0000Z[\u0005"+
		"+\u0000\u0000[\\\u0005\"\u0000\u0000\\]\u0003\u0010\b\u0000]\u000b\u0001"+
		"\u0000\u0000\u0000^c\u0003\u000e\u0007\u0000_`\u0005\u001f\u0000\u0000"+
		"`b\u0003\u000e\u0007\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\r\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0003*\u0015\u0000gh\u0005+\u0000"+
		"\u0000h\u000f\u0001\u0000\u0000\u0000im\u0005#\u0000\u0000jl\u0003\u0012"+
		"\t\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u0005$\u0000\u0000q\u0011\u0001\u0000\u0000\u0000"+
		"rs\u0003\u0014\n\u0000st\u0005 \u0000\u0000t\u0085\u0001\u0000\u0000\u0000"+
		"uv\u0003\u0016\u000b\u0000vw\u0005 \u0000\u0000w\u0085\u0001\u0000\u0000"+
		"\u0000xy\u0003\u0018\f\u0000yz\u0005 \u0000\u0000z\u0085\u0001\u0000\u0000"+
		"\u0000{\u0085\u0003\u001a\r\u0000|\u0085\u0003\u001c\u000e\u0000}\u0085"+
		"\u0003\u001e\u000f\u0000~\u007f\u0003 \u0010\u0000\u007f\u0080\u0005 "+
		"\u0000\u0000\u0080\u0085\u0001\u0000\u0000\u0000\u0081\u0082\u0003\"\u0011"+
		"\u0000\u0082\u0083\u0005 \u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000"+
		"\u0084r\u0001\u0000\u0000\u0000\u0084u\u0001\u0000\u0000\u0000\u0084x"+
		"\u0001\u0000\u0000\u0000\u0084{\u0001\u0000\u0000\u0000\u0084|\u0001\u0000"+
		"\u0000\u0000\u0084}\u0001\u0000\u0000\u0000\u0084~\u0001\u0000\u0000\u0000"+
		"\u0084\u0081\u0001\u0000\u0000\u0000\u0085\u0013\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0003*\u0015\u0000\u0087\u008a\u0005+\u0000\u0000\u0088\u0089"+
		"\u0005\u0017\u0000\u0000\u0089\u008b\u0003$\u0012\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0015\u0001"+
		"\u0000\u0000\u0000\u008c\u008f\u0005+\u0000\u0000\u008d\u008e\u0005\u001e"+
		"\u0000\u0000\u008e\u0090\u0005+\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0017\u0000\u0000\u0092\u0093\u0003$\u0012\u0000"+
		"\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095"+
		"\u0096\u0005!\u0000\u0000\u0096\u0097\u0003$\u0012\u0000\u0097\u0098\u0005"+
		"\"\u0000\u0000\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0007"+
		"\u0000\u0000\u009a\u009b\u0005!\u0000\u0000\u009b\u009c\u0003$\u0012\u0000"+
		"\u009c\u009d\u0005\"\u0000\u0000\u009d\u00a0\u0003\u0010\b\u0000\u009e"+
		"\u009f\u0005\b\u0000\u0000\u009f\u00a1\u0003\u0010\b\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u001b"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\t\u0000\u0000\u00a3\u00a4\u0005"+
		"!\u0000\u0000\u00a4\u00a5\u0003$\u0012\u0000\u00a5\u00a6\u0005\"\u0000"+
		"\u0000\u00a6\u00a7\u0003\u0010\b\u0000\u00a7\u001d\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00ac\u0005!\u0000\u0000\u00aa"+
		"\u00ad\u0003\u0014\n\u0000\u00ab\u00ad\u0003\u0016\u000b\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0005 \u0000\u0000\u00af\u00b1\u0003$\u0012\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0005 \u0000\u0000\u00b3\u00b5\u0003\u0016\u000b"+
		"\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\"\u0000\u0000"+
		"\u00b7\u00b8\u0003\u0010\b\u0000\u00b8\u001f\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u0005\u000b\u0000\u0000\u00ba\u00bc\u0003$\u0012\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc!\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0005+\u0000\u0000\u00be\u00bf\u0005\u001e"+
		"\u0000\u0000\u00bf\u00c1\u0005+\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0005!\u0000\u0000\u00c3\u00c5\u0003(\u0014\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\"\u0000\u0000\u00c7#"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006\u0012\uffff\uffff\u0000\u00c9"+
		"\u00ca\u0005\u0006\u0000\u0000\u00ca\u00cb\u0005+\u0000\u0000\u00cb\u00cc"+
		"\u0005!\u0000\u0000\u00cc\u00cf\u0005\"\u0000\u0000\u00cd\u00cf\u0003"+
		"&\u0013\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00de\u0001\u0000\u0000\u0000\u00d0\u00d1\n\u0006\u0000"+
		"\u0000\u00d1\u00d2\u0007\u0000\u0000\u0000\u00d2\u00dd\u0003$\u0012\u0007"+
		"\u00d3\u00d4\n\u0005\u0000\u0000\u00d4\u00d5\u0007\u0001\u0000\u0000\u00d5"+
		"\u00dd\u0003$\u0012\u0006\u00d6\u00d7\n\u0004\u0000\u0000\u00d7\u00d8"+
		"\u0007\u0002\u0000\u0000\u00d8\u00dd\u0003$\u0012\u0005\u00d9\u00da\n"+
		"\u0003\u0000\u0000\u00da\u00db\u0007\u0003\u0000\u0000\u00db\u00dd\u0003"+
		"$\u0012\u0004\u00dc\u00d0\u0001\u0000\u0000\u0000\u00dc\u00d3\u0001\u0000"+
		"\u0000\u0000\u00dc\u00d6\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df%\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00f9\u0005(\u0000\u0000"+
		"\u00e2\u00f9\u0005)\u0000\u0000\u00e3\u00f9\u0005*\u0000\u0000\u00e4\u00f9"+
		"\u0005\'\u0000\u0000\u00e5\u00e8\u0005+\u0000\u0000\u00e6\u00e7\u0005"+
		"\u001e\u0000\u0000\u00e7\u00e9\u0005+\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00f9\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ed\u0005+\u0000\u0000\u00eb\u00ec\u0005\u001e\u0000"+
		"\u0000\u00ec\u00ee\u0005+\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0005!\u0000\u0000\u00f0\u00f2\u0003(\u0014\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f9\u0005\"\u0000\u0000\u00f4\u00f5\u0005"+
		"!\u0000\u0000\u00f5\u00f6\u0003$\u0012\u0000\u00f6\u00f7\u0005\"\u0000"+
		"\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00e1\u0001\u0000\u0000"+
		"\u0000\u00f8\u00e2\u0001\u0000\u0000\u0000\u00f8\u00e3\u0001\u0000\u0000"+
		"\u0000\u00f8\u00e4\u0001\u0000\u0000\u0000\u00f8\u00e5\u0001\u0000\u0000"+
		"\u0000\u00f8\u00ea\u0001\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f9\'\u0001\u0000\u0000\u0000\u00fa\u00ff\u0003$\u0012\u0000"+
		"\u00fb\u00fc\u0005\u001f\u0000\u0000\u00fc\u00fe\u0003$\u0012\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		")\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0007\u0004\u0000\u0000\u0103+\u0001\u0000\u0000\u0000\u0018/:BMcm\u0084"+
		"\u008a\u008f\u00a0\u00ac\u00b0\u00b4\u00bb\u00c0\u00c4\u00ce\u00dc\u00de"+
		"\u00e8\u00ed\u00f1\u00f8\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}