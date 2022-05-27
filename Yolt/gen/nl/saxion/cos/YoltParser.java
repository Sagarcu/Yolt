package nl.saxion.cos;// Generated from C:/Users/mathi/Desktop/Yolt/Yolt/src\Yolt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YoltParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, GLOBAL=2, STATIC=3, FUNCTION=4, RETURN=5, IF=6, ELSE_IF=7, ELSE=8, 
		LOOP=9, WHILE=10, BREAK=11, INT=12, BOOLEAN=13, STRING=14, COINS=15, PRINT=16, 
		PROMPT=17, RANDOM=18, INT_VALUE=19, STRING_VALUE=20, BOOLEAN_VALUE=21, 
		COINS_VALUE=22, GOLD=23, SILVER=24, BRONZE=25, IDENTIFIER=26, ADD=27, 
		SUB=28, MUL=29, MOD=30, DIV=31, POW=32, LOGIC_EQUAL=33, LOGIC_UNEQUAL=34, 
		LOGIC_BIGGER=35, LOGIC_LOWER=36, LOGIC_BIGGER_EQUAL=37, LOGIC_LOWER_EQUAL=38, 
		LOGIC_OR=39, LOGIC_AND=40, EQUALS=41, COMMA=42, SEMICOLON=43, COLON=44, 
		PAREN_OPEN=45, PAREN_CLOSE=46, BRACKET_OPEN=47, BRACKET_CLOSE=48, APOSTROPHE=49, 
		COMMENT=50, WS=51;
	public static final int
		RULE_application = 0, RULE_class_declaration = 1, RULE_function_declaration = 2, 
		RULE_class_call = 3, RULE_function_call = 4, RULE_global_var_declaration = 5, 
		RULE_var_declaration = 6, RULE_var_assignment = 7, RULE_var_assignment_short = 8, 
		RULE_prompt_input = 9, RULE_random_input = 10, RULE_if_statement = 11, 
		RULE_else_if_statement = 12, RULE_else_statement = 13, RULE_return_statement = 14, 
		RULE_while_loop = 15, RULE_do_while_loop = 16, RULE_variables = 17, RULE_break_statement = 18, 
		RULE_print_stmt = 19, RULE_expr = 20, RULE_logic_expr = 21, RULE_compare_values = 22, 
		RULE_statement = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"application", "class_declaration", "function_declaration", "class_call", 
			"function_call", "global_var_declaration", "var_declaration", "var_assignment", 
			"var_assignment_short", "prompt_input", "random_input", "if_statement", 
			"else_if_statement", "else_statement", "return_statement", "while_loop", 
			"do_while_loop", "variables", "break_statement", "print_stmt", "expr", 
			"logic_expr", "compare_values", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CLASS'", "'GLOBAL'", "'STATIC'", "'FUNCTION'", "'RETURN'", "'IF'", 
			"'ELSE IF'", "'ELSE'", "'REPEAT'", "'WHILE'", "'STOP'", "'NUMBER'", "'BOOL'", 
			"'WORDS'", "'COINS'", "'SPEAK'", "'TELL'", "'RANDOM'", null, null, null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'%'", "'/'", "'^'", 
			"'=='", "'=!='", "'>'", "'<'", "'>='", "'<='", "'||'", "'&&'", "'='", 
			"','", "';'", "':'", "'('", "')'", "'{'", "'}'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "GLOBAL", "STATIC", "FUNCTION", "RETURN", "IF", "ELSE_IF", 
			"ELSE", "LOOP", "WHILE", "BREAK", "INT", "BOOLEAN", "STRING", "COINS", 
			"PRINT", "PROMPT", "RANDOM", "INT_VALUE", "STRING_VALUE", "BOOLEAN_VALUE", 
			"COINS_VALUE", "GOLD", "SILVER", "BRONZE", "IDENTIFIER", "ADD", "SUB", 
			"MUL", "MOD", "DIV", "POW", "LOGIC_EQUAL", "LOGIC_UNEQUAL", "LOGIC_BIGGER", 
			"LOGIC_LOWER", "LOGIC_BIGGER_EQUAL", "LOGIC_LOWER_EQUAL", "LOGIC_OR", 
			"LOGIC_AND", "EQUALS", "COMMA", "SEMICOLON", "COLON", "PAREN_OPEN", "PAREN_CLOSE", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "APOSTROPHE", "COMMENT", "WS"
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

	public static class ApplicationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YoltParser.EOF, 0); }
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_application);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(48);
				class_declaration();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(51);
				function_declaration();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(YoltParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<Global_var_declarationContext> global_var_declaration() {
			return getRuleContexts(Global_var_declarationContext.class);
		}
		public Global_var_declarationContext global_var_declaration(int i) {
			return getRuleContext(Global_var_declarationContext.class,i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(CLASS);
			setState(60);
			match(IDENTIFIER);
			setState(61);
			match(BRACKET_OPEN);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(62);
					function_declaration();
					}
					break;
				case GLOBAL:
					{
					setState(63);
					global_var_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GLOBAL || _la==FUNCTION );
			setState(68);
			match(BRACKET_CLOSE);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(YoltParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode STRING() { return getToken(YoltParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(YoltParser.BOOLEAN, 0); }
		public TerminalNode COINS() { return getToken(YoltParser.COINS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(YoltParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YoltParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(FUNCTION);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS))) != 0)) {
				{
				setState(71);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(PAREN_OPEN);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS))) != 0)) {
				{
				setState(76);
				variables();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					variables();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(86);
			match(PAREN_CLOSE);
			setState(87);
			match(BRACKET_OPEN);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << LOOP) | (1L << BREAK) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(93);
			match(BRACKET_CLOSE);
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

	public static class Class_callContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(YoltParser.CLASS, 0); }
		public Class_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterClass_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitClass_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitClass_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_callContext class_call() throws RecognitionException {
		Class_callContext _localctx = new Class_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(CLASS);
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

	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(YoltParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(YoltParser.IDENTIFIER, i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(YoltParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YoltParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(PAREN_OPEN);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(99);
				match(IDENTIFIER);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					match(IDENTIFIER);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(109);
			match(PAREN_CLOSE);
			setState(110);
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

	public static class Global_var_declarationContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(YoltParser.GLOBAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode STRING() { return getToken(YoltParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(YoltParser.BOOLEAN, 0); }
		public TerminalNode COINS() { return getToken(YoltParser.COINS, 0); }
		public TerminalNode STATIC() { return getToken(YoltParser.STATIC, 0); }
		public Global_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterGlobal_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitGlobal_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitGlobal_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_var_declarationContext global_var_declaration() throws RecognitionException {
		Global_var_declarationContext _localctx = new Global_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_global_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(GLOBAL);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(113);
				match(STATIC);
				}
			}

			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(EQUALS);
			setState(119);
			expr(0);
			setState(120);
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

	public static class Var_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode STRING() { return getToken(YoltParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(YoltParser.BOOLEAN, 0); }
		public TerminalNode COINS() { return getToken(YoltParser.COINS, 0); }
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			match(IDENTIFIER);
			setState(124);
			match(EQUALS);
			setState(125);
			expr(0);
			setState(126);
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

	public static class Var_assignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Var_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVar_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVar_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVar_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignmentContext var_assignment() throws RecognitionException {
		Var_assignmentContext _localctx = new Var_assignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IDENTIFIER);
			setState(129);
			match(EQUALS);
			setState(130);
			expr(0);
			setState(131);
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

	public static class Var_assignment_shortContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode POW() { return getToken(YoltParser.POW, 0); }
		public TerminalNode MOD() { return getToken(YoltParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(YoltParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YoltParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public Var_assignment_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVar_assignment_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVar_assignment_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVar_assignment_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignment_shortContext var_assignment_short() throws RecognitionException {
		Var_assignment_shortContext _localctx = new Var_assignment_shortContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_assignment_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENTIFIER);
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << MOD) | (1L << DIV) | (1L << POW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(EQUALS);
			setState(136);
			expr(0);
			setState(137);
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

	public static class Prompt_inputContext extends ParserRuleContext {
		public TerminalNode PROMPT() { return getToken(YoltParser.PROMPT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode STRING() { return getToken(YoltParser.STRING, 0); }
		public Prompt_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prompt_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterPrompt_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitPrompt_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitPrompt_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prompt_inputContext prompt_input() throws RecognitionException {
		Prompt_inputContext _localctx = new Prompt_inputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prompt_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PROMPT);
			setState(140);
			match(PAREN_OPEN);
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			match(PAREN_CLOSE);
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

	public static class Random_inputContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(YoltParser.RANDOM, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Random_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterRandom_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitRandom_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitRandom_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Random_inputContext random_input() throws RecognitionException {
		Random_inputContext _localctx = new Random_inputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_random_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(RANDOM);
			setState(145);
			match(PAREN_OPEN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROMPT) | (1L << RANDOM) | (1L << INT_VALUE) | (1L << STRING_VALUE) | (1L << BOOLEAN_VALUE) | (1L << COINS_VALUE) | (1L << IDENTIFIER) | (1L << PAREN_OPEN))) != 0)) {
				{
				setState(146);
				expr(0);
				}
			}

			setState(149);
			match(PAREN_CLOSE);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(YoltParser.IF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IF);
			setState(152);
			match(PAREN_OPEN);
			setState(153);
			logic_expr(0);
			setState(154);
			match(PAREN_CLOSE);
			setState(155);
			match(COLON);
			setState(156);
			match(BRACKET_OPEN);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				statement();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << LOOP) | (1L << BREAK) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(162);
			match(BRACKET_CLOSE);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(163);
				else_if_statement();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(169);
				else_statement();
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

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(YoltParser.ELSE_IF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitElse_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitElse_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ELSE_IF);
			setState(173);
			match(PAREN_OPEN);
			setState(174);
			logic_expr(0);
			setState(175);
			match(PAREN_CLOSE);
			setState(176);
			match(COLON);
			setState(177);
			match(BRACKET_OPEN);
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				statement();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << LOOP) | (1L << BREAK) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(183);
			match(BRACKET_CLOSE);
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(YoltParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ELSE);
			setState(186);
			match(COLON);
			setState(187);
			match(BRACKET_OPEN);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				statement();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << LOOP) | (1L << BREAK) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(193);
			match(BRACKET_CLOSE);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(YoltParser.RETURN, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(RETURN);
			setState(196);
			match(PAREN_OPEN);
			setState(197);
			match(IDENTIFIER);
			setState(198);
			match(PAREN_CLOSE);
			setState(199);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(YoltParser.LOOP, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LOOP);
			setState(202);
			match(PAREN_OPEN);
			setState(203);
			logic_expr(0);
			setState(204);
			match(PAREN_CLOSE);
			setState(205);
			match(COLON);
			setState(206);
			match(BRACKET_OPEN);
			setState(208); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(207);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(212);
				break_statement();
				}
			}

			setState(215);
			match(BRACKET_CLOSE);
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(YoltParser.LOOP, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public TerminalNode WHILE() { return getToken(YoltParser.WHILE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitDo_while_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_do_while_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LOOP);
			setState(218);
			match(COLON);
			setState(219);
			match(BRACKET_OPEN);
			setState(221); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(220);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(225);
				break_statement();
				}
			}

			setState(228);
			match(BRACKET_CLOSE);
			setState(229);
			match(WHILE);
			setState(230);
			match(PAREN_OPEN);
			setState(231);
			logic_expr(0);
			setState(232);
			match(PAREN_CLOSE);
			setState(233);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode COINS() { return getToken(YoltParser.COINS, 0); }
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(YoltParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(YoltParser.STRING, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << COINS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(236);
			match(IDENTIFIER);
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

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(YoltParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(BREAK);
			setState(239);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PRINT);
			setState(242);
			match(PAREN_OPEN);
			setState(243);
			expr(0);
			setState(244);
			match(PAREN_CLOSE);
			setState(245);
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
	public static class AddSubExpressionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public AddSubExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanExpressionContext extends ExprContext {
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public ParanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterParanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitParanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitParanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomIdentifierContext extends ExprContext {
		public Random_inputContext random_input() {
			return getRuleContext(Random_inputContext.class,0);
		}
		public RandomIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterRandomIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitRandomIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitRandomIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIdentifierContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public VarIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVarIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVarIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVarIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntIdentifierContext extends ExprContext {
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public IntIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterIntIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitIntIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitIntIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringIdentifierContext extends ExprContext {
		public TerminalNode STRING_VALUE() { return getToken(YoltParser.STRING_VALUE, 0); }
		public StringIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterStringIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitStringIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitStringIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowModExpressionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(YoltParser.POW, 0); }
		public TerminalNode MOD() { return getToken(YoltParser.MOD, 0); }
		public PowModExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterPowModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitPowModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitPowModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolIdentifierContext extends ExprContext {
		public TerminalNode BOOLEAN_VALUE() { return getToken(YoltParser.BOOLEAN_VALUE, 0); }
		public BoolIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterBoolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitBoolIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitBoolIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoinIdentifierContext extends ExprContext {
		public TerminalNode COINS_VALUE() { return getToken(YoltParser.COINS_VALUE, 0); }
		public CoinIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterCoinIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitCoinIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitCoinIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextIdentifierContext extends ExprContext {
		public Prompt_inputContext prompt_input() {
			return getRuleContext(Prompt_inputContext.class,0);
		}
		public TextIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterTextIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitTextIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitTextIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExpressionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(YoltParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YoltParser.DIV, 0); }
		public MulDivExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitMulDivExpression(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_OPEN:
				{
				_localctx = new ParanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(248);
				match(PAREN_OPEN);
				setState(249);
				expr(0);
				setState(250);
				match(PAREN_CLOSE);
				}
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VarIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(IDENTIFIER);
				}
				break;
			case RANDOM:
				{
				_localctx = new RandomIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				random_input();
				}
				break;
			case PROMPT:
				{
				_localctx = new TextIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				prompt_input();
				}
				break;
			case INT_VALUE:
				{
				_localctx = new IntIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(INT_VALUE);
				}
				break;
			case BOOLEAN_VALUE:
				{
				_localctx = new BoolIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(BOOLEAN_VALUE);
				}
				break;
			case COINS_VALUE:
				{
				_localctx = new CoinIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(COINS_VALUE);
				}
				break;
			case STRING_VALUE:
				{
				_localctx = new StringIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(STRING_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PowModExpressionContext(new ExprContext(_parentctx, _parentState));
						((PowModExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(262);
						_la = _input.LA(1);
						if ( !(_la==MOD || _la==POW) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						((PowModExpressionContext)_localctx).right = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExpressionContext(new ExprContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(265);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						((MulDivExpressionContext)_localctx).right = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(new ExprContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(268);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						((AddSubExpressionContext)_localctx).right = expr(9);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Logic_exprContext extends ParserRuleContext {
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
	 
		public Logic_exprContext() { }
		public void copyFrom(Logic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicOrContext extends Logic_exprContext {
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public TerminalNode LOGIC_OR() { return getToken(YoltParser.LOGIC_OR, 0); }
		public LogicOrContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitLogicOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitLogicOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExpressionContext extends Logic_exprContext {
		public Compare_valuesContext compare_values() {
			return getRuleContext(Compare_valuesContext.class,0);
		}
		public ValueExpressionContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicAndContext extends Logic_exprContext {
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public TerminalNode LOGIC_AND() { return getToken(YoltParser.LOGIC_AND, 0); }
		public LogicAndContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterLogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitLogicAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitLogicAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		return logic_expr(0);
	}

	private Logic_exprContext logic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, _parentState);
		Logic_exprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(276);
			compare_values();
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new LogicAndContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(278);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(279);
						match(LOGIC_AND);
						setState(280);
						logic_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicOrContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						match(LOGIC_OR);
						setState(283);
						logic_expr(3);
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Compare_valuesContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOGIC_BIGGER() { return getToken(YoltParser.LOGIC_BIGGER, 0); }
		public TerminalNode LOGIC_EQUAL() { return getToken(YoltParser.LOGIC_EQUAL, 0); }
		public TerminalNode LOGIC_LOWER() { return getToken(YoltParser.LOGIC_LOWER, 0); }
		public TerminalNode LOGIC_UNEQUAL() { return getToken(YoltParser.LOGIC_UNEQUAL, 0); }
		public TerminalNode LOGIC_BIGGER_EQUAL() { return getToken(YoltParser.LOGIC_BIGGER_EQUAL, 0); }
		public TerminalNode LOGIC_LOWER_EQUAL() { return getToken(YoltParser.LOGIC_LOWER_EQUAL, 0); }
		public Compare_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterCompare_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitCompare_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitCompare_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_valuesContext compare_values() throws RecognitionException {
		Compare_valuesContext _localctx = new Compare_valuesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compare_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr(0);
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGIC_EQUAL) | (1L << LOGIC_UNEQUAL) | (1L << LOGIC_BIGGER) | (1L << LOGIC_LOWER) | (1L << LOGIC_BIGGER_EQUAL) | (1L << LOGIC_LOWER_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
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

	public static class StatementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Var_assignment_shortContext var_assignment_short() {
			return getRuleContext(Var_assignment_shortContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Var_assignmentContext var_assignment() {
			return getRuleContext(Var_assignmentContext.class,0);
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				var_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				do_while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				print_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(300);
				var_assignment_short();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(301);
				break_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(302);
				var_assignment();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 21:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u0132\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0003\u0000"+
		"2\b\u0000\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001A\b\u0001\u000b\u0001\f\u0001B\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002P\b\u0002\n\u0002\f\u0002"+
		"S\t\u0002\u0003\u0002U\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002Z\b\u0002\u000b\u0002\f\u0002[\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004g\b\u0004\n\u0004\f\u0004j\t\u0004\u0003\u0004l\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005s\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u0094\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u009f\b\u000b\u000b\u000b\f\u000b\u00a0\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00a5\b\u000b\n\u000b\f\u000b\u00a8\t\u000b\u0001"+
		"\u000b\u0003\u000b\u00ab\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u00b4\b\f\u000b\f\f\f\u00b5\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00be\b\r\u000b\r\f\r\u00bf\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u00d1\b\u000f\u000b\u000f\f\u000f"+
		"\u00d2\u0001\u000f\u0003\u000f\u00d6\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00de\b\u0010\u000b"+
		"\u0010\f\u0010\u00df\u0001\u0010\u0003\u0010\u00e3\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0104\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u010f\b\u0014\n\u0014\f\u0014\u0112\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u011d\b\u0015\n\u0015\f\u0015\u0120\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0130\b\u0017\u0001\u0017\u0000\u0002(*\u0018"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.\u0000\u0007\u0001\u0000\f\u000f\u0001\u0000\u001b"+
		" \u0002\u0000\f\f\u000e\u000e\u0002\u0000\u001e\u001e  \u0002\u0000\u001d"+
		"\u001d\u001f\u001f\u0001\u0000\u001b\u001c\u0001\u0000!&\u0143\u00001"+
		"\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0004F\u0001\u0000"+
		"\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000"+
		"\np\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000\u0000\u000e\u0080\u0001"+
		"\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u008b\u0001"+
		"\u0000\u0000\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016\u0097\u0001"+
		"\u0000\u0000\u0000\u0018\u00ac\u0001\u0000\u0000\u0000\u001a\u00b9\u0001"+
		"\u0000\u0000\u0000\u001c\u00c3\u0001\u0000\u0000\u0000\u001e\u00c9\u0001"+
		"\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000"+
		"\u0000\u0000$\u00ee\u0001\u0000\u0000\u0000&\u00f1\u0001\u0000\u0000\u0000"+
		"(\u0103\u0001\u0000\u0000\u0000*\u0113\u0001\u0000\u0000\u0000,\u0121"+
		"\u0001\u0000\u0000\u0000.\u012f\u0001\u0000\u0000\u000002\u0003\u0002"+
		"\u0001\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000026\u0001"+
		"\u0000\u0000\u000035\u0003\u0004\u0002\u000043\u0001\u0000\u0000\u0000"+
		"58\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0000"+
		"\u0000\u0001:\u0001\u0001\u0000\u0000\u0000;<\u0005\u0001\u0000\u0000"+
		"<=\u0005\u001a\u0000\u0000=@\u0005/\u0000\u0000>A\u0003\u0004\u0002\u0000"+
		"?A\u0003\n\u0005\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DE\u00050\u0000\u0000E\u0003\u0001\u0000"+
		"\u0000\u0000FH\u0005\u0004\u0000\u0000GI\u0007\u0000\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0005\u001a\u0000\u0000KT\u0005-\u0000\u0000LQ\u0003\"\u0011\u0000"+
		"MN\u0005*\u0000\u0000NP\u0003\"\u0011\u0000OM\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TL\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005"+
		".\u0000\u0000WY\u0005/\u0000\u0000XZ\u0003.\u0017\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u00050\u0000\u0000^\u0005"+
		"\u0001\u0000\u0000\u0000_`\u0005\u0001\u0000\u0000`\u0007\u0001\u0000"+
		"\u0000\u0000ab\u0005\u001a\u0000\u0000bk\u0005-\u0000\u0000ch\u0005\u001a"+
		"\u0000\u0000de\u0005*\u0000\u0000eg\u0005\u001a\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"kc\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0005.\u0000\u0000no\u0005+\u0000\u0000o\t\u0001\u0000\u0000"+
		"\u0000pr\u0005\u0002\u0000\u0000qs\u0005\u0003\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0007"+
		"\u0000\u0000\u0000uv\u0005\u001a\u0000\u0000vw\u0005)\u0000\u0000wx\u0003"+
		"(\u0014\u0000xy\u0005+\u0000\u0000y\u000b\u0001\u0000\u0000\u0000z{\u0007"+
		"\u0000\u0000\u0000{|\u0005\u001a\u0000\u0000|}\u0005)\u0000\u0000}~\u0003"+
		"(\u0014\u0000~\u007f\u0005+\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u001a\u0000\u0000\u0081\u0082\u0005)\u0000\u0000\u0082"+
		"\u0083\u0003(\u0014\u0000\u0083\u0084\u0005+\u0000\u0000\u0084\u000f\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u001a\u0000\u0000\u0086\u0087\u0007"+
		"\u0001\u0000\u0000\u0087\u0088\u0005)\u0000\u0000\u0088\u0089\u0003(\u0014"+
		"\u0000\u0089\u008a\u0005+\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005\u0011\u0000\u0000\u008c\u008d\u0005-\u0000\u0000\u008d"+
		"\u008e\u0007\u0002\u0000\u0000\u008e\u008f\u0005.\u0000\u0000\u008f\u0013"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0012\u0000\u0000\u0091\u0093"+
		"\u0005-\u0000\u0000\u0092\u0094\u0003(\u0014\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005.\u0000\u0000\u0096\u0015\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u0006\u0000\u0000\u0098\u0099\u0005-\u0000\u0000"+
		"\u0099\u009a\u0003*\u0015\u0000\u009a\u009b\u0005.\u0000\u0000\u009b\u009c"+
		"\u0005,\u0000\u0000\u009c\u009e\u0005/\u0000\u0000\u009d\u009f\u0003."+
		"\u0017\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a6\u00050\u0000"+
		"\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u001a\r\u0000\u00aa"+
		"\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u0017\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad"+
		"\u00ae\u0005-\u0000\u0000\u00ae\u00af\u0003*\u0015\u0000\u00af\u00b0\u0005"+
		".\u0000\u0000\u00b0\u00b1\u0005,\u0000\u0000\u00b1\u00b3\u0005/\u0000"+
		"\u0000\u00b2\u00b4\u0003.\u0017\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u00050\u0000\u0000\u00b8\u0019\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\b\u0000\u0000\u00ba\u00bb\u0005,\u0000\u0000\u00bb\u00bd"+
		"\u0005/\u0000\u0000\u00bc\u00be\u0003.\u0017\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u00050\u0000\u0000\u00c2\u001b\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0005\u0000\u0000\u00c4\u00c5\u0005-\u0000\u0000"+
		"\u00c5\u00c6\u0005\u001a\u0000\u0000\u00c6\u00c7\u0005.\u0000\u0000\u00c7"+
		"\u00c8\u0005+\u0000\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\t\u0000\u0000\u00ca\u00cb\u0005-\u0000\u0000\u00cb\u00cc\u0003"+
		"*\u0015\u0000\u00cc\u00cd\u0005.\u0000\u0000\u00cd\u00ce\u0005,\u0000"+
		"\u0000\u00ce\u00d0\u0005/\u0000\u0000\u00cf\u00d1\u0003.\u0017\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d6\u0003$\u0012\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u00050\u0000\u0000\u00d8\u001f\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\t\u0000\u0000\u00da\u00db\u0005,"+
		"\u0000\u0000\u00db\u00dd\u0005/\u0000\u0000\u00dc\u00de\u0003.\u0017\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003$\u0012\u0000\u00e2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u00050\u0000\u0000\u00e5\u00e6"+
		"\u0005\n\u0000\u0000\u00e6\u00e7\u0005-\u0000\u0000\u00e7\u00e8\u0003"+
		"*\u0015\u0000\u00e8\u00e9\u0005.\u0000\u0000\u00e9\u00ea\u0005+\u0000"+
		"\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00ec\u0007\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0005\u001a\u0000\u0000\u00ed#\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u000b\u0000\u0000\u00ef\u00f0\u0005+\u0000\u0000\u00f0%\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u0010\u0000\u0000\u00f2\u00f3\u0005"+
		"-\u0000\u0000\u00f3\u00f4\u0003(\u0014\u0000\u00f4\u00f5\u0005.\u0000"+
		"\u0000\u00f5\u00f6\u0005+\u0000\u0000\u00f6\'\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0006\u0014\uffff\uffff\u0000\u00f8\u00f9\u0005-\u0000\u0000"+
		"\u00f9\u00fa\u0003(\u0014\u0000\u00fa\u00fb\u0005.\u0000\u0000\u00fb\u0104"+
		"\u0001\u0000\u0000\u0000\u00fc\u0104\u0005\u001a\u0000\u0000\u00fd\u0104"+
		"\u0003\u0014\n\u0000\u00fe\u0104\u0003\u0012\t\u0000\u00ff\u0104\u0005"+
		"\u0013\u0000\u0000\u0100\u0104\u0005\u0015\u0000\u0000\u0101\u0104\u0005"+
		"\u0016\u0000\u0000\u0102\u0104\u0005\u0014\u0000\u0000\u0103\u00f7\u0001"+
		"\u0000\u0000\u0000\u0103\u00fc\u0001\u0000\u0000\u0000\u0103\u00fd\u0001"+
		"\u0000\u0000\u0000\u0103\u00fe\u0001\u0000\u0000\u0000\u0103\u00ff\u0001"+
		"\u0000\u0000\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0110\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\n\n\u0000\u0000\u0106\u0107\u0007\u0003"+
		"\u0000\u0000\u0107\u010f\u0003(\u0014\u000b\u0108\u0109\n\t\u0000\u0000"+
		"\u0109\u010a\u0007\u0004\u0000\u0000\u010a\u010f\u0003(\u0014\n\u010b"+
		"\u010c\n\b\u0000\u0000\u010c\u010d\u0007\u0005\u0000\u0000\u010d\u010f"+
		"\u0003(\u0014\t\u010e\u0105\u0001\u0000\u0000\u0000\u010e\u0108\u0001"+
		"\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010f\u0112\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111)\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0006\u0015\uffff\uffff\u0000\u0114\u0115\u0003"+
		",\u0016\u0000\u0115\u011e\u0001\u0000\u0000\u0000\u0116\u0117\n\u0003"+
		"\u0000\u0000\u0117\u0118\u0005(\u0000\u0000\u0118\u011d\u0003*\u0015\u0004"+
		"\u0119\u011a\n\u0002\u0000\u0000\u011a\u011b\u0005\'\u0000\u0000\u011b"+
		"\u011d\u0003*\u0015\u0003\u011c\u0116\u0001\u0000\u0000\u0000\u011c\u0119"+
		"\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f+\u0001"+
		"\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0003"+
		"(\u0014\u0000\u0122\u0123\u0007\u0006\u0000\u0000\u0123\u0124\u0003(\u0014"+
		"\u0000\u0124-\u0001\u0000\u0000\u0000\u0125\u0130\u0003\b\u0004\u0000"+
		"\u0126\u0130\u0003\u001c\u000e\u0000\u0127\u0130\u0003\u0016\u000b\u0000"+
		"\u0128\u0130\u0003\f\u0006\u0000\u0129\u0130\u0003 \u0010\u0000\u012a"+
		"\u0130\u0003\u001e\u000f\u0000\u012b\u0130\u0003&\u0013\u0000\u012c\u0130"+
		"\u0003\u0010\b\u0000\u012d\u0130\u0003$\u0012\u0000\u012e\u0130\u0003"+
		"\u000e\u0007\u0000\u012f\u0125\u0001\u0000\u0000\u0000\u012f\u0126\u0001"+
		"\u0000\u0000\u0000\u012f\u0127\u0001\u0000\u0000\u0000\u012f\u0128\u0001"+
		"\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012a\u0001"+
		"\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000\u012f\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001"+
		"\u0000\u0000\u0000\u0130/\u0001\u0000\u0000\u0000\u001b16@BHQT[hkr\u0093"+
		"\u00a0\u00a6\u00aa\u00b5\u00bf\u00d2\u00d5\u00df\u00e2\u0103\u010e\u0110"+
		"\u011c\u011e\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}