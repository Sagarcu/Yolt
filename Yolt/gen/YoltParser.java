// Generated from C:/Users/mathi/Desktop/Yolt/Yolt/src\Yolt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YoltParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ADD=2, SUB=3, MUL=4, DIV=5, POW=6, LOGIC_EQUAL=7, LOGIC_UNEQUAL=8, 
		LOGIC_BIGGER=9, LOGIC_LOWER=10, LOGIC_OR=11, LOGIC_AND=12, CLASS=13, GOLD=14, 
		STRING=15, INT=16, PRINT=17, IDENTIFIER=18, EQUALS=19, INT_VALUE=20, GOLD_VALUE=21, 
		SEMICOLON=22, PAREN_OPEN=23, PAREN_CLOSE=24, HAAKIE_OPEN=25, HAAKIE_CLOSE=26, 
		THING=27, COMMENT=28, WS=29;
	public static final int
		RULE_program = 0, RULE_int_declaration = 1, RULE_int_addition = 2, RULE_class_decleration = 3, 
		RULE_string_declaration = 4, RULE_gold_decleration = 5, RULE_print_stmt = 6, 
		RULE_statement = 7, RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "int_declaration", "int_addition", "class_decleration", "string_declaration", 
			"gold_decleration", "print_stmt", "statement", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ADD'", "'+'", "'-'", "'*'", "'/'", "'^'", "'=='", "'=!='", "'>'", 
			"'<'", "'||'", "'&&'", "'Class'", "'gold'", "'string'", "'int'", "'print'", 
			null, "'='", null, null, "';'", "'('", "')'", "'{'", "'}'", "'\"'", "'//*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ADD", "SUB", "MUL", "DIV", "POW", "LOGIC_EQUAL", "LOGIC_UNEQUAL", 
			"LOGIC_BIGGER", "LOGIC_LOWER", "LOGIC_OR", "LOGIC_AND", "CLASS", "GOLD", 
			"STRING", "INT", "PRINT", "IDENTIFIER", "EQUALS", "INT_VALUE", "GOLD_VALUE", 
			"SEMICOLON", "PAREN_OPEN", "PAREN_CLOSE", "HAAKIE_OPEN", "HAAKIE_CLOSE", 
			"THING", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Yolt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YoltParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YoltParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CLASS) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	public static class Int_declarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Int_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterInt_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitInt_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitInt_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_declarationContext int_declaration() throws RecognitionException {
		Int_declarationContext _localctx = new Int_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_int_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(INT);
			setState(27);
			match(IDENTIFIER);
			setState(28);
			match(EQUALS);
			setState(29);
			match(INT_VALUE);
			setState(30);
			match(SEMICOLON);
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

	public static class Int_additionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Int_additionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterInt_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitInt_addition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitInt_addition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_additionContext int_addition() throws RecognitionException {
		Int_additionContext _localctx = new Int_additionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_int_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(IDENTIFIER);
			setState(33);
			match(ADD);
			setState(34);
			match(EQUALS);
			setState(35);
			match(INT_VALUE);
			setState(36);
			match(SEMICOLON);
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

	public static class Class_declerationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(YoltParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode HAAKIE_OPEN() { return getToken(YoltParser.HAAKIE_OPEN, 0); }
		public TerminalNode HAAKIE_CLOSE() { return getToken(YoltParser.HAAKIE_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Class_declerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterClass_decleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitClass_decleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitClass_decleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declerationContext class_decleration() throws RecognitionException {
		Class_declerationContext _localctx = new Class_declerationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_decleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(CLASS);
			setState(39);
			match(IDENTIFIER);
			setState(40);
			match(HAAKIE_OPEN);
			setState(41);
			match(HAAKIE_CLOSE);
			setState(42);
			match(SEMICOLON);
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

	public static class String_declarationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YoltParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(YoltParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(YoltParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public List<TerminalNode> THING() { return getTokens(YoltParser.THING); }
		public TerminalNode THING(int i) {
			return getToken(YoltParser.THING, i);
		}
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterString_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitString_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitString_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(STRING);
			setState(45);
			match(IDENTIFIER);
			setState(46);
			match(EQUALS);
			setState(47);
			match(THING);
			setState(48);
			match(IDENTIFIER);
			setState(49);
			match(THING);
			setState(50);
			match(SEMICOLON);
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

	public static class Gold_declerationContext extends ParserRuleContext {
		public TerminalNode GOLD() { return getToken(YoltParser.GOLD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode GOLD_VALUE() { return getToken(YoltParser.GOLD_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Gold_declerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gold_decleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterGold_decleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitGold_decleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitGold_decleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gold_declerationContext gold_decleration() throws RecognitionException {
		Gold_declerationContext _localctx = new Gold_declerationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gold_decleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(GOLD);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(EQUALS);
			setState(55);
			match(GOLD_VALUE);
			setState(56);
			match(SEMICOLON);
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(YoltParser.PRINT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public List<TerminalNode> THING() { return getTokens(YoltParser.THING); }
		public TerminalNode THING(int i) {
			return getToken(YoltParser.THING, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINT);
			setState(59);
			match(PAREN_OPEN);
			setState(60);
			match(THING);
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(THING);
			setState(63);
			match(PAREN_CLOSE);
			setState(64);
			match(SEMICOLON);
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

	public static class StatementContext extends ParserRuleContext {
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Gold_declerationContext gold_decleration() {
			return getRuleContext(Gold_declerationContext.class,0);
		}
		public Int_additionContext int_addition() {
			return getRuleContext(Int_additionContext.class,0);
		}
		public Class_declerationContext class_decleration() {
			return getRuleContext(Class_declerationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				int_declaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				print_stmt();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				string_declaration();
				}
				break;
			case GOLD:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				gold_decleration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				int_addition();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				class_decleration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				match(T__0);
				setState(73);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(YoltParser.POW, 0); }
		public TerminalNode MUL() { return getToken(YoltParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YoltParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(77);
			match(INT_VALUE);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(80);
						match(POW);
						}
						setState(81);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(83);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(86);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d^\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007K\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\bY\b\b\n\b\f\b\\\t\b\u0001\b\u0000\u0001\u0010\t\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0000\u0002\u0001\u0000\u0004\u0005\u0001"+
		"\u0000\u0002\u0003^\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006&\u0001\u0000\u0000"+
		"\u0000\b,\u0001\u0000\u0000\u0000\n4\u0001\u0000\u0000\u0000\f:\u0001"+
		"\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010L\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0003\u000e\u0007\u0000\u0013\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000"+
		"\u0001\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0010\u0000"+
		"\u0000\u001b\u001c\u0005\u0012\u0000\u0000\u001c\u001d\u0005\u0013\u0000"+
		"\u0000\u001d\u001e\u0005\u0014\u0000\u0000\u001e\u001f\u0005\u0016\u0000"+
		"\u0000\u001f\u0003\u0001\u0000\u0000\u0000 !\u0005\u0012\u0000\u0000!"+
		"\"\u0005\u0002\u0000\u0000\"#\u0005\u0013\u0000\u0000#$\u0005\u0014\u0000"+
		"\u0000$%\u0005\u0016\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&\'\u0005"+
		"\r\u0000\u0000\'(\u0005\u0012\u0000\u0000()\u0005\u0019\u0000\u0000)*"+
		"\u0005\u001a\u0000\u0000*+\u0005\u0016\u0000\u0000+\u0007\u0001\u0000"+
		"\u0000\u0000,-\u0005\u000f\u0000\u0000-.\u0005\u0012\u0000\u0000./\u0005"+
		"\u0013\u0000\u0000/0\u0005\u001b\u0000\u000001\u0005\u0012\u0000\u0000"+
		"12\u0005\u001b\u0000\u000023\u0005\u0016\u0000\u00003\t\u0001\u0000\u0000"+
		"\u000045\u0005\u000e\u0000\u000056\u0005\u0012\u0000\u000067\u0005\u0013"+
		"\u0000\u000078\u0005\u0015\u0000\u000089\u0005\u0016\u0000\u00009\u000b"+
		"\u0001\u0000\u0000\u0000:;\u0005\u0011\u0000\u0000;<\u0005\u0017\u0000"+
		"\u0000<=\u0005\u001b\u0000\u0000=>\u0005\u0012\u0000\u0000>?\u0005\u001b"+
		"\u0000\u0000?@\u0005\u0018\u0000\u0000@A\u0005\u0016\u0000\u0000A\r\u0001"+
		"\u0000\u0000\u0000BK\u0003\u0002\u0001\u0000CK\u0003\f\u0006\u0000DK\u0003"+
		"\b\u0004\u0000EK\u0003\n\u0005\u0000FK\u0003\u0004\u0002\u0000GK\u0003"+
		"\u0006\u0003\u0000HI\u0005\u0001\u0000\u0000IK\u0003\u0010\b\u0000JB\u0001"+
		"\u0000\u0000\u0000JC\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000\u0000"+
		"JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000K\u000f\u0001\u0000\u0000\u0000LM\u0006"+
		"\b\uffff\uffff\u0000MN\u0005\u0014\u0000\u0000NZ\u0001\u0000\u0000\u0000"+
		"OP\n\u0004\u0000\u0000PQ\u0005\u0006\u0000\u0000QY\u0003\u0010\b\u0005"+
		"RS\n\u0003\u0000\u0000ST\u0007\u0000\u0000\u0000TY\u0003\u0010\b\u0004"+
		"UV\n\u0002\u0000\u0000VW\u0007\u0001\u0000\u0000WY\u0003\u0010\b\u0003"+
		"XO\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\u0004\u0015JXZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}