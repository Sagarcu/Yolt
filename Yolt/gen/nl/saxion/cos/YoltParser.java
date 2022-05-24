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
		T__0=1, ADD=2, SUB=3, MUL=4, MOD=5, DIV=6, POW=7, LOGIC_EQUAL=8, LOGIC_UNEQUAL=9, 
		LOGIC_BIGGER=10, LOGIC_LOWER=11, LOGIC_BIGGER_EQUAL=12, LOGIC_LOWER_EQUAL=13, 
		LOGIC_OR=14, LOGIC_AND=15, IF=16, ELSE_IF=17, ELSE=18, BREAK=19, CLASS=20, 
		LOOP=21, WHILE=22, FUNCTION=23, RETURN=24, GOLD=25, STRING=26, INT=27, 
		BOOLEAN=28, PRINT=29, PROMPT=30, RANDOM=31, EQUALS=32, INT_VALUE=33, GOLD_VALUE=34, 
		COINS_VALUE=35, BOOLEAN_VALUE=36, STRING_VALUE=37, IDENTIFIER=38, COMMA=39, 
		SEMICOLON=40, COLON=41, PAREN_OPEN=42, PAREN_CLOSE=43, BRACKET_OPEN=44, 
		BRACKET_CLOSE=45, APOSTROPHE=46, COMMENT=47, WS=48;
	public static final int
		RULE_application = 0, RULE_class_declaration = 1, RULE_function_declaration = 2, 
		RULE_function_call = 3, RULE_int_declaration = 4, RULE_boolean_declaration = 5, 
		RULE_string_declaration = 6, RULE_gold_declaration = 7, RULE_prompt_input = 8, 
		RULE_random_input = 9, RULE_if_statement = 10, RULE_else_if_statement = 11, 
		RULE_else_statement = 12, RULE_return_statement = 13, RULE_while_loop = 14, 
		RULE_do_while_loop = 15, RULE_var_assignment = 16, RULE_bool_assignment = 17, 
		RULE_var_addition = 18, RULE_int_addition_short = 19, RULE_int_addition = 20, 
		RULE_compare_multiple_values = 21, RULE_logic_expr = 22, RULE_compare_values = 23, 
		RULE_print_stmt = 24, RULE_declarations = 25, RULE_statement = 26, RULE_expr = 27, 
		RULE_number = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"application", "class_declaration", "function_declaration", "function_call", 
			"int_declaration", "boolean_declaration", "string_declaration", "gold_declaration", 
			"prompt_input", "random_input", "if_statement", "else_if_statement", 
			"else_statement", "return_statement", "while_loop", "do_while_loop", 
			"var_assignment", "bool_assignment", "var_addition", "int_addition_short", 
			"int_addition", "compare_multiple_values", "logic_expr", "compare_values", 
			"print_stmt", "declarations", "statement", "expr", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ADD'", "'+'", "'-'", "'*'", "'%'", "'/'", "'^'", "'=='", "'=!='", 
			"'>'", "'<'", "'>='", "'<='", "'||'", "'&&'", "'IF'", "'ELSE IF'", "'ELSE'", 
			"'STOP'", "'CLASS'", "'REPEAT'", "'WHILE'", "'FUNCTION'", "'RETURN'", 
			"'COINS'", "'WORDS'", "'NUMBER'", "'BOOL'", "'SPEAK'", "'TELL'", "'RANDOM'", 
			"'='", null, null, null, null, null, null, "','", "';'", "':'", "'('", 
			"')'", "'{'", "'}'", "'\"'", "'//*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ADD", "SUB", "MUL", "MOD", "DIV", "POW", "LOGIC_EQUAL", 
			"LOGIC_UNEQUAL", "LOGIC_BIGGER", "LOGIC_LOWER", "LOGIC_BIGGER_EQUAL", 
			"LOGIC_LOWER_EQUAL", "LOGIC_OR", "LOGIC_AND", "IF", "ELSE_IF", "ELSE", 
			"BREAK", "CLASS", "LOOP", "WHILE", "FUNCTION", "RETURN", "GOLD", "STRING", 
			"INT", "BOOLEAN", "PRINT", "PROMPT", "RANDOM", "EQUALS", "INT_VALUE", 
			"GOLD_VALUE", "COINS_VALUE", "BOOLEAN_VALUE", "STRING_VALUE", "IDENTIFIER", 
			"COMMA", "SEMICOLON", "COLON", "PAREN_OPEN", "PAREN_CLOSE", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "APOSTROPHE", "COMMENT", "WS"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(58);
				class_declaration();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(61);
				function_declaration();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(YoltParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(YoltParser.IDENTIFIER, i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<TerminalNode> GOLD() { return getTokens(YoltParser.GOLD); }
		public TerminalNode GOLD(int i) {
			return getToken(YoltParser.GOLD, i);
		}
		public List<TerminalNode> INT() { return getTokens(YoltParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(YoltParser.INT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(YoltParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(YoltParser.BOOLEAN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(YoltParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(YoltParser.STRING, i);
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
			setState(69);
			match(CLASS);
			setState(70);
			match(IDENTIFIER);
			setState(71);
			match(PAREN_OPEN);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(72);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				match(IDENTIFIER);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(PAREN_CLOSE);
			setState(80);
			match(BRACKET_OPEN);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				function_declaration();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			setState(86);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(YoltParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(YoltParser.IDENTIFIER, i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> GOLD() { return getTokens(YoltParser.GOLD); }
		public TerminalNode GOLD(int i) {
			return getToken(YoltParser.GOLD, i);
		}
		public List<TerminalNode> INT() { return getTokens(YoltParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(YoltParser.INT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(YoltParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(YoltParser.BOOLEAN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(YoltParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(YoltParser.STRING, i);
		}
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
			setState(88);
			match(FUNCTION);
			setState(89);
			match(IDENTIFIER);
			setState(90);
			match(PAREN_OPEN);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(91);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				match(IDENTIFIER);
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(94);
					match(COMMA);
					{
					setState(95);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(96);
					match(IDENTIFIER);
					}
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104);
			match(PAREN_CLOSE);
			setState(105);
			match(BRACKET_OPEN);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(111);
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
		enterRule(_localctx, 6, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(PAREN_OPEN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(115);
				match(IDENTIFIER);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(116);
					match(COMMA);
					setState(117);
					match(IDENTIFIER);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(125);
			match(PAREN_CLOSE);
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

	public static class Int_declarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public Prompt_inputContext prompt_input() {
			return getRuleContext(Prompt_inputContext.class,0);
		}
		public Random_inputContext random_input() {
			return getRuleContext(Random_inputContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_int_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(INT);
			setState(129);
			match(IDENTIFIER);
			setState(130);
			match(EQUALS);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(131);
				match(INT_VALUE);
				}
				break;
			case 2:
				{
				setState(132);
				prompt_input();
				}
				break;
			case 3:
				{
				setState(133);
				random_input();
				}
				break;
			case 4:
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << PAREN_OPEN))) != 0)) {
					{
					setState(134);
					expr(0);
					}
				}

				}
				break;
			}
			setState(139);
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

	public static class Boolean_declarationContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(YoltParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(YoltParser.BOOLEAN_VALUE, 0); }
		public Prompt_inputContext prompt_input() {
			return getRuleContext(Prompt_inputContext.class,0);
		}
		public Boolean_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterBoolean_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitBoolean_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitBoolean_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_declarationContext boolean_declaration() throws RecognitionException {
		Boolean_declarationContext _localctx = new Boolean_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_boolean_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(BOOLEAN);
			setState(142);
			match(IDENTIFIER);
			setState(143);
			match(EQUALS);
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_VALUE:
				{
				setState(144);
				match(BOOLEAN_VALUE);
				}
				break;
			case PROMPT:
				{
				setState(145);
				prompt_input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
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
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Prompt_inputContext prompt_input() {
			return getRuleContext(Prompt_inputContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(YoltParser.STRING_VALUE, 0); }
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
		enterRule(_localctx, 12, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(STRING);
			setState(151);
			match(IDENTIFIER);
			setState(152);
			match(EQUALS);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_VALUE:
				{
				{
				setState(153);
				match(STRING_VALUE);
				}
				}
				break;
			case PROMPT:
				{
				setState(154);
				prompt_input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
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

	public static class Gold_declarationContext extends ParserRuleContext {
		public TerminalNode GOLD() { return getToken(YoltParser.GOLD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode GOLD_VALUE() { return getToken(YoltParser.GOLD_VALUE, 0); }
		public Prompt_inputContext prompt_input() {
			return getRuleContext(Prompt_inputContext.class,0);
		}
		public Gold_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gold_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterGold_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitGold_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitGold_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gold_declarationContext gold_declaration() throws RecognitionException {
		Gold_declarationContext _localctx = new Gold_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_gold_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(GOLD);
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(EQUALS);
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOLD_VALUE:
				{
				setState(162);
				match(GOLD_VALUE);
				}
				break;
			case PROMPT:
				{
				setState(163);
				prompt_input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(166);
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
		enterRule(_localctx, 16, RULE_prompt_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PROMPT);
			setState(169);
			match(PAREN_OPEN);
			setState(170);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
		enterRule(_localctx, 18, RULE_random_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(RANDOM);
			setState(173);
			match(PAREN_OPEN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_VALUE || _la==IDENTIFIER) {
				{
				setState(174);
				number();
				}
			}

			setState(177);
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
		public Compare_multiple_valuesContext compare_multiple_values() {
			return getRuleContext(Compare_multiple_valuesContext.class,0);
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
		enterRule(_localctx, 20, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IF);
			setState(180);
			match(PAREN_OPEN);
			setState(181);
			compare_multiple_values();
			setState(182);
			match(PAREN_CLOSE);
			setState(183);
			match(COLON);
			setState(184);
			match(BRACKET_OPEN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(185);
				statement();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(BRACKET_CLOSE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(192);
				else_if_statement();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(198);
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
		public Compare_multiple_valuesContext compare_multiple_values() {
			return getRuleContext(Compare_multiple_valuesContext.class,0);
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
		enterRule(_localctx, 22, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ELSE_IF);
			setState(202);
			match(PAREN_OPEN);
			setState(203);
			compare_multiple_values();
			setState(204);
			match(PAREN_CLOSE);
			setState(205);
			match(COLON);
			setState(206);
			match(BRACKET_OPEN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(207);
				statement();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
		enterRule(_localctx, 24, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ELSE);
			setState(216);
			match(COLON);
			setState(217);
			match(BRACKET_OPEN);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(218);
				statement();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
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
		enterRule(_localctx, 26, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(RETURN);
			setState(227);
			match(PAREN_OPEN);
			setState(228);
			match(IDENTIFIER);
			setState(229);
			match(PAREN_CLOSE);
			setState(230);
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
		public Compare_multiple_valuesContext compare_multiple_values() {
			return getRuleContext(Compare_multiple_valuesContext.class,0);
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
		public TerminalNode BREAK() { return getToken(YoltParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 28, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LOOP);
			setState(233);
			match(PAREN_OPEN);
			setState(234);
			compare_multiple_values();
			setState(235);
			match(PAREN_CLOSE);
			setState(236);
			match(COLON);
			setState(237);
			match(BRACKET_OPEN);
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				statement();
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(243);
				match(BREAK);
				setState(244);
				match(SEMICOLON);
				}
			}

			setState(247);
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
		public Compare_multiple_valuesContext compare_multiple_values() {
			return getRuleContext(Compare_multiple_valuesContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(YoltParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YoltParser.SEMICOLON, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(YoltParser.BREAK, 0); }
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
		enterRule(_localctx, 30, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LOOP);
			setState(250);
			match(COLON);
			setState(251);
			match(BRACKET_OPEN);
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				statement();
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(257);
				match(BREAK);
				setState(258);
				match(SEMICOLON);
				}
			}

			setState(261);
			match(BRACKET_CLOSE);
			setState(262);
			match(WHILE);
			setState(263);
			match(PAREN_OPEN);
			setState(264);
			compare_multiple_values();
			setState(265);
			match(PAREN_CLOSE);
			setState(266);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(YoltParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(YoltParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
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
		enterRule(_localctx, 32, RULE_var_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IDENTIFIER);
			setState(269);
			match(EQUALS);
			setState(270);
			match(IDENTIFIER);
			setState(271);
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

	public static class Bool_assignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(YoltParser.BOOLEAN_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Bool_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterBool_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitBool_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitBool_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_assignmentContext bool_assignment() throws RecognitionException {
		Bool_assignmentContext _localctx = new Bool_assignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IDENTIFIER);
			setState(274);
			match(EQUALS);
			setState(275);
			match(BOOLEAN_VALUE);
			setState(276);
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

	public static class Var_additionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(YoltParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(YoltParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode POW() { return getToken(YoltParser.POW, 0); }
		public TerminalNode MOD() { return getToken(YoltParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(YoltParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YoltParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public Var_additionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVar_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVar_addition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVar_addition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_additionContext var_addition() throws RecognitionException {
		Var_additionContext _localctx = new Var_additionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(IDENTIFIER);
			setState(279);
			match(EQUALS);
			setState(280);
			match(IDENTIFIER);
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << MOD) | (1L << DIV) | (1L << POW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			match(IDENTIFIER);
			setState(283);
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

	public static class Int_addition_shortContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode POW() { return getToken(YoltParser.POW, 0); }
		public TerminalNode MOD() { return getToken(YoltParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(YoltParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YoltParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public TerminalNode GOLD_VALUE() { return getToken(YoltParser.GOLD_VALUE, 0); }
		public Int_addition_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_addition_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterInt_addition_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitInt_addition_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitInt_addition_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_addition_shortContext int_addition_short() throws RecognitionException {
		Int_addition_shortContext _localctx = new Int_addition_shortContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_int_addition_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IDENTIFIER);
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << MOD) | (1L << DIV) | (1L << POW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(287);
			match(EQUALS);
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==GOLD_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(289);
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
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 40, RULE_int_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IDENTIFIER);
			setState(292);
			match(EQUALS);
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				expr(0);
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << PAREN_OPEN))) != 0) );
			setState(298);
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

	public static class Compare_multiple_valuesContext extends ParserRuleContext {
		public Compare_valuesContext compare_values() {
			return getRuleContext(Compare_valuesContext.class,0);
		}
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public Compare_multiple_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_multiple_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterCompare_multiple_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitCompare_multiple_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitCompare_multiple_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_multiple_valuesContext compare_multiple_values() throws RecognitionException {
		Compare_multiple_valuesContext _localctx = new Compare_multiple_valuesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compare_multiple_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			compare_values();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_OR || _la==LOGIC_AND) {
				{
				{
				setState(301);
				logic_expr();
				}
				}
				setState(306);
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
		public TerminalNode LOGIC_OR() { return getToken(YoltParser.LOGIC_OR, 0); }
		public Compare_valuesContext compare_values() {
			return getRuleContext(Compare_valuesContext.class,0);
		}
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
	public static class LogicAndContext extends Logic_exprContext {
		public TerminalNode LOGIC_AND() { return getToken(YoltParser.LOGIC_AND, 0); }
		public Compare_valuesContext compare_values() {
			return getRuleContext(Compare_valuesContext.class,0);
		}
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
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logic_expr);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGIC_AND:
				_localctx = new LogicAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(LOGIC_AND);
				setState(308);
				compare_values();
				}
				break;
			case LOGIC_OR:
				_localctx = new LogicOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(LOGIC_OR);
				setState(310);
				compare_values();
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
		enterRule(_localctx, 46, RULE_compare_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			expr(0);
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGIC_EQUAL) | (1L << LOGIC_UNEQUAL) | (1L << LOGIC_BIGGER) | (1L << LOGIC_LOWER) | (1L << LOGIC_BIGGER_EQUAL) | (1L << LOGIC_LOWER_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(315);
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(YoltParser.PRINT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode STRING_VALUE() { return getToken(YoltParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(YoltParser.BOOLEAN_VALUE, 0); }
		public TerminalNode GOLD_VALUE() { return getToken(YoltParser.GOLD_VALUE, 0); }
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
		enterRule(_localctx, 48, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(PRINT);
			setState(318);
			match(PAREN_OPEN);
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_VALUE) | (1L << GOLD_VALUE) | (1L << BOOLEAN_VALUE) | (1L << STRING_VALUE) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(320);
			match(PAREN_CLOSE);
			setState(321);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public Boolean_declarationContext boolean_declaration() {
			return getRuleContext(Boolean_declarationContext.class,0);
		}
		public Gold_declarationContext gold_declaration() {
			return getRuleContext(Gold_declarationContext.class,0);
		}
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declarations);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				int_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				boolean_declaration();
				}
				break;
			case GOLD:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				gold_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				string_declaration();
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

	public static class StatementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Bool_assignmentContext bool_assignment() {
			return getRuleContext(Bool_assignmentContext.class,0);
		}
		public Int_additionContext int_addition() {
			return getRuleContext(Int_additionContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Boolean_declarationContext boolean_declaration() {
			return getRuleContext(Boolean_declarationContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Gold_declarationContext gold_declaration() {
			return getRuleContext(Gold_declarationContext.class,0);
		}
		public Int_addition_shortContext int_addition_short() {
			return getRuleContext(Int_addition_shortContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assignmentContext var_assignment() {
			return getRuleContext(Var_assignmentContext.class,0);
		}
		public Var_additionContext var_addition() {
			return getRuleContext(Var_additionContext.class,0);
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
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				bool_assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				int_addition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(334);
				boolean_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(335);
				do_while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(336);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(337);
				int_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(338);
				print_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(339);
				string_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(340);
				gold_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(341);
				int_addition_short();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(342);
				match(T__0);
				setState(343);
				expr(0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(344);
				var_assignment();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(345);
				var_addition();
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
	public static class NumberExpressionContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeExpressionContext extends ExprContext {
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegativeExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterNegativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitNegativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitNegativeExpression(this);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_OPEN:
				{
				_localctx = new ParanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(349);
				match(PAREN_OPEN);
				setState(350);
				expr(0);
				setState(351);
				match(PAREN_CLOSE);
				}
				}
				break;
			case SUB:
				{
				_localctx = new NegativeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				match(SUB);
				setState(354);
				expr(5);
				}
				break;
			case INT_VALUE:
			case IDENTIFIER:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new PowModExpressionContext(new ExprContext(_parentctx, _parentState));
						((PowModExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(358);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(359);
						_la = _input.LA(1);
						if ( !(_la==MOD || _la==POW) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(360);
						((PowModExpressionContext)_localctx).right = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExpressionContext(new ExprContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(361);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(362);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(363);
						((MulDivExpressionContext)_localctx).right = expr(4);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(new ExprContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(364);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(365);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(366);
						((AddSubExpressionContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==IDENTIFIER) ) {
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
		case 27:
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
		"\u0004\u00010\u0177\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0003\u0000<\b\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"K\b\u0001\n\u0001\f\u0001N\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001S\b\u0001\u000b\u0001\f\u0001T\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002b\b\u0002\n\u0002\f\u0002e\t"+
		"\u0002\u0003\u0002g\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002l\b\u0002\u000b\u0002\f\u0002m\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003w\b\u0003"+
		"\n\u0003\f\u0003z\t\u0003\u0003\u0003|\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0088\b\u0004\u0003\u0004\u008a\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0093\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009c"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00b0\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00bb\b\n\n\n\f\n\u00be\t\n\u0001\n\u0001\n\u0005\n\u00c2\b\n\n\n\f"+
		"\n\u00c5\t\n\u0001\n\u0003\n\u00c8\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d1\b\u000b"+
		"\n\u000b\f\u000b\u00d4\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00dc\b\f\n\f\f\f\u00df\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00f0"+
		"\b\u000e\u000b\u000e\f\u000e\u00f1\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00f6\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0004\u000f\u00fe\b\u000f\u000b\u000f\f\u000f\u00ff\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0104\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u0127\b\u0014\u000b\u0014\f\u0014\u0128\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u012f\b\u0015\n\u0015"+
		"\f\u0015\u0132\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0138\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0148\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u015b\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0165\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0170\b\u001b\n\u001b\f\u001b\u0173"+
		"\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u00016\u001d\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468\u0000\t\u0001\u0000\u0019\u001c\u0001\u0000\u0002"+
		"\u0007\u0001\u0000!\"\u0001\u0000\b\r\u0002\u0000!\"$&\u0002\u0000\u0005"+
		"\u0005\u0007\u0007\u0002\u0000\u0004\u0004\u0006\u0006\u0001\u0000\u0002"+
		"\u0003\u0002\u0000!!&&\u018d\u0000;\u0001\u0000\u0000\u0000\u0002E\u0001"+
		"\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000"+
		"\u0000\b\u0080\u0001\u0000\u0000\u0000\n\u008d\u0001\u0000\u0000\u0000"+
		"\f\u0096\u0001\u0000\u0000\u0000\u000e\u009f\u0001\u0000\u0000\u0000\u0010"+
		"\u00a8\u0001\u0000\u0000\u0000\u0012\u00ac\u0001\u0000\u0000\u0000\u0014"+
		"\u00b3\u0001\u0000\u0000\u0000\u0016\u00c9\u0001\u0000\u0000\u0000\u0018"+
		"\u00d7\u0001\u0000\u0000\u0000\u001a\u00e2\u0001\u0000\u0000\u0000\u001c"+
		"\u00e8\u0001\u0000\u0000\u0000\u001e\u00f9\u0001\u0000\u0000\u0000 \u010c"+
		"\u0001\u0000\u0000\u0000\"\u0111\u0001\u0000\u0000\u0000$\u0116\u0001"+
		"\u0000\u0000\u0000&\u011d\u0001\u0000\u0000\u0000(\u0123\u0001\u0000\u0000"+
		"\u0000*\u012c\u0001\u0000\u0000\u0000,\u0137\u0001\u0000\u0000\u0000."+
		"\u0139\u0001\u0000\u0000\u00000\u013d\u0001\u0000\u0000\u00002\u0147\u0001"+
		"\u0000\u0000\u00004\u015a\u0001\u0000\u0000\u00006\u0164\u0001\u0000\u0000"+
		"\u00008\u0174\u0001\u0000\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<@\u0001\u0000\u0000\u0000"+
		"=?\u0003\u0004\u0002\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0000\u0000\u0001D\u0001"+
		"\u0001\u0000\u0000\u0000EF\u0005\u0014\u0000\u0000FG\u0005&\u0000\u0000"+
		"GL\u0005*\u0000\u0000HI\u0007\u0000\u0000\u0000IK\u0005&\u0000\u0000J"+
		"H\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OP\u0005+\u0000\u0000PR\u0005,\u0000\u0000QS\u0003\u0004\u0002"+
		"\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005"+
		"-\u0000\u0000W\u0003\u0001\u0000\u0000\u0000XY\u0005\u0017\u0000\u0000"+
		"YZ\u0005&\u0000\u0000Zf\u0005*\u0000\u0000[\\\u0007\u0000\u0000\u0000"+
		"\\]\u0005&\u0000\u0000]c\u0001\u0000\u0000\u0000^_\u0005\'\u0000\u0000"+
		"_`\u0007\u0000\u0000\u0000`b\u0005&\u0000\u0000a^\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000f[\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005"+
		"+\u0000\u0000ik\u0005,\u0000\u0000jl\u00034\u001a\u0000kj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005-\u0000\u0000p\u0005"+
		"\u0001\u0000\u0000\u0000qr\u0005&\u0000\u0000r{\u0005*\u0000\u0000sx\u0005"+
		"&\u0000\u0000tu\u0005\'\u0000\u0000uw\u0005&\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"{s\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0005+\u0000\u0000~\u007f\u0005(\u0000\u0000\u007f\u0007\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u001b\u0000\u0000\u0081\u0082\u0005"+
		"&\u0000\u0000\u0082\u0089\u0005 \u0000\u0000\u0083\u008a\u0005!\u0000"+
		"\u0000\u0084\u008a\u0003\u0010\b\u0000\u0085\u008a\u0003\u0012\t\u0000"+
		"\u0086\u0088\u00036\u001b\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0083\u0001\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089"+
		"\u0085\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005(\u0000\u0000\u008c\t"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u001c\u0000\u0000\u008e\u008f"+
		"\u0005&\u0000\u0000\u008f\u0092\u0005 \u0000\u0000\u0090\u0093\u0005$"+
		"\u0000\u0000\u0091\u0093\u0003\u0010\b\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005(\u0000\u0000\u0095\u000b\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\u001a\u0000\u0000\u0097\u0098\u0005&\u0000\u0000\u0098"+
		"\u009b\u0005 \u0000\u0000\u0099\u009c\u0005%\u0000\u0000\u009a\u009c\u0003"+
		"\u0010\b\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005(\u0000"+
		"\u0000\u009e\r\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0019\u0000\u0000"+
		"\u00a0\u00a1\u0005&\u0000\u0000\u00a1\u00a4\u0005 \u0000\u0000\u00a2\u00a5"+
		"\u0005\"\u0000\u0000\u00a3\u00a5\u0003\u0010\b\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005(\u0000\u0000\u00a7\u000f\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0005\u001e\u0000\u0000\u00a9\u00aa\u0005*\u0000"+
		"\u0000\u00aa\u00ab\u0005+\u0000\u0000\u00ab\u0011\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u001f\u0000\u0000\u00ad\u00af\u0005*\u0000\u0000\u00ae"+
		"\u00b0\u00038\u001c\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005+\u0000\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0010\u0000\u0000\u00b4\u00b5\u0005*\u0000\u0000\u00b5\u00b6\u0003*\u0015"+
		"\u0000\u00b6\u00b7\u0005+\u0000\u0000\u00b7\u00b8\u0005)\u0000\u0000\u00b8"+
		"\u00bc\u0005,\u0000\u0000\u00b9\u00bb\u00034\u001a\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c3\u0005"+
		"-\u0000\u0000\u00c0\u00c2\u0003\u0016\u000b\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003\u0018"+
		"\f\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u0015\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0011\u0000"+
		"\u0000\u00ca\u00cb\u0005*\u0000\u0000\u00cb\u00cc\u0003*\u0015\u0000\u00cc"+
		"\u00cd\u0005+\u0000\u0000\u00cd\u00ce\u0005)\u0000\u0000\u00ce\u00d2\u0005"+
		",\u0000\u0000\u00cf\u00d1\u00034\u001a\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005-\u0000\u0000"+
		"\u00d6\u0017\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0012\u0000\u0000"+
		"\u00d8\u00d9\u0005)\u0000\u0000\u00d9\u00dd\u0005,\u0000\u0000\u00da\u00dc"+
		"\u00034\u001a\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0005-\u0000\u0000\u00e1\u0019\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0018\u0000\u0000\u00e3\u00e4\u0005*\u0000"+
		"\u0000\u00e4\u00e5\u0005&\u0000\u0000\u00e5\u00e6\u0005+\u0000\u0000\u00e6"+
		"\u00e7\u0005(\u0000\u0000\u00e7\u001b\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0015\u0000\u0000\u00e9\u00ea\u0005*\u0000\u0000\u00ea\u00eb\u0003"+
		"*\u0015\u0000\u00eb\u00ec\u0005+\u0000\u0000\u00ec\u00ed\u0005)\u0000"+
		"\u0000\u00ed\u00ef\u0005,\u0000\u0000\u00ee\u00f0\u00034\u001a\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0013\u0000\u0000\u00f4"+
		"\u00f6\u0005(\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005-\u0000\u0000\u00f8\u001d\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"\u0015\u0000\u0000\u00fa\u00fb\u0005)\u0000\u0000\u00fb\u00fd\u0005,\u0000"+
		"\u0000\u00fc\u00fe\u00034\u001a\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005\u0013\u0000\u0000\u0102\u0104\u0005(\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0005-\u0000\u0000\u0106\u0107"+
		"\u0005\u0016\u0000\u0000\u0107\u0108\u0005*\u0000\u0000\u0108\u0109\u0003"+
		"*\u0015\u0000\u0109\u010a\u0005+\u0000\u0000\u010a\u010b\u0005(\u0000"+
		"\u0000\u010b\u001f\u0001\u0000\u0000\u0000\u010c\u010d\u0005&\u0000\u0000"+
		"\u010d\u010e\u0005 \u0000\u0000\u010e\u010f\u0005&\u0000\u0000\u010f\u0110"+
		"\u0005(\u0000\u0000\u0110!\u0001\u0000\u0000\u0000\u0111\u0112\u0005&"+
		"\u0000\u0000\u0112\u0113\u0005 \u0000\u0000\u0113\u0114\u0005$\u0000\u0000"+
		"\u0114\u0115\u0005(\u0000\u0000\u0115#\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005&\u0000\u0000\u0117\u0118\u0005 \u0000\u0000\u0118\u0119\u0005&"+
		"\u0000\u0000\u0119\u011a\u0007\u0001\u0000\u0000\u011a\u011b\u0005&\u0000"+
		"\u0000\u011b\u011c\u0005(\u0000\u0000\u011c%\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0005&\u0000\u0000\u011e\u011f\u0007\u0001\u0000\u0000\u011f\u0120"+
		"\u0005 \u0000\u0000\u0120\u0121\u0007\u0002\u0000\u0000\u0121\u0122\u0005"+
		"(\u0000\u0000\u0122\'\u0001\u0000\u0000\u0000\u0123\u0124\u0005&\u0000"+
		"\u0000\u0124\u0126\u0005 \u0000\u0000\u0125\u0127\u00036\u001b\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0005(\u0000\u0000\u012b)\u0001"+
		"\u0000\u0000\u0000\u012c\u0130\u0003.\u0017\u0000\u012d\u012f\u0003,\u0016"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131+\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0005\u000f\u0000\u0000\u0134\u0138\u0003.\u0017\u0000\u0135"+
		"\u0136\u0005\u000e\u0000\u0000\u0136\u0138\u0003.\u0017\u0000\u0137\u0133"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138-\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u00036\u001b\u0000\u013a\u013b\u0007\u0003"+
		"\u0000\u0000\u013b\u013c\u00036\u001b\u0000\u013c/\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0005\u001d\u0000\u0000\u013e\u013f\u0005*\u0000\u0000\u013f"+
		"\u0140\u0007\u0004\u0000\u0000\u0140\u0141\u0005+\u0000\u0000\u0141\u0142"+
		"\u0005(\u0000\u0000\u01421\u0001\u0000\u0000\u0000\u0143\u0148\u0003\b"+
		"\u0004\u0000\u0144\u0148\u0003\n\u0005\u0000\u0145\u0148\u0003\u000e\u0007"+
		"\u0000\u0146\u0148\u0003\f\u0006\u0000\u0147\u0143\u0001\u0000\u0000\u0000"+
		"\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0147\u0146\u0001\u0000\u0000\u0000\u01483\u0001\u0000\u0000\u0000\u0149"+
		"\u015b\u0003\u0006\u0003\u0000\u014a\u015b\u0003\u001a\r\u0000\u014b\u015b"+
		"\u0003\"\u0011\u0000\u014c\u015b\u0003(\u0014\u0000\u014d\u015b\u0003"+
		"\u0014\n\u0000\u014e\u015b\u0003\n\u0005\u0000\u014f\u015b\u0003\u001e"+
		"\u000f\u0000\u0150\u015b\u0003\u001c\u000e\u0000\u0151\u015b\u0003\b\u0004"+
		"\u0000\u0152\u015b\u00030\u0018\u0000\u0153\u015b\u0003\f\u0006\u0000"+
		"\u0154\u015b\u0003\u000e\u0007\u0000\u0155\u015b\u0003&\u0013\u0000\u0156"+
		"\u0157\u0005\u0001\u0000\u0000\u0157\u015b\u00036\u001b\u0000\u0158\u015b"+
		"\u0003 \u0010\u0000\u0159\u015b\u0003$\u0012\u0000\u015a\u0149\u0001\u0000"+
		"\u0000\u0000\u015a\u014a\u0001\u0000\u0000\u0000\u015a\u014b\u0001\u0000"+
		"\u0000\u0000\u015a\u014c\u0001\u0000\u0000\u0000\u015a\u014d\u0001\u0000"+
		"\u0000\u0000\u015a\u014e\u0001\u0000\u0000\u0000\u015a\u014f\u0001\u0000"+
		"\u0000\u0000\u015a\u0150\u0001\u0000\u0000\u0000\u015a\u0151\u0001\u0000"+
		"\u0000\u0000\u015a\u0152\u0001\u0000\u0000\u0000\u015a\u0153\u0001\u0000"+
		"\u0000\u0000\u015a\u0154\u0001\u0000\u0000\u0000\u015a\u0155\u0001\u0000"+
		"\u0000\u0000\u015a\u0156\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b5\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0006\u001b\uffff\uffff\u0000\u015d\u015e\u0005*\u0000"+
		"\u0000\u015e\u015f\u00036\u001b\u0000\u015f\u0160\u0005+\u0000\u0000\u0160"+
		"\u0165\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0003\u0000\u0000\u0162"+
		"\u0165\u00036\u001b\u0005\u0163\u0165\u00038\u001c\u0000\u0164\u015c\u0001"+
		"\u0000\u0000\u0000\u0164\u0161\u0001\u0000\u0000\u0000\u0164\u0163\u0001"+
		"\u0000\u0000\u0000\u0165\u0171\u0001\u0000\u0000\u0000\u0166\u0167\n\u0004"+
		"\u0000\u0000\u0167\u0168\u0007\u0005\u0000\u0000\u0168\u0170\u00036\u001b"+
		"\u0005\u0169\u016a\n\u0003\u0000\u0000\u016a\u016b\u0007\u0006\u0000\u0000"+
		"\u016b\u0170\u00036\u001b\u0004\u016c\u016d\n\u0002\u0000\u0000\u016d"+
		"\u016e\u0007\u0007\u0000\u0000\u016e\u0170\u00036\u001b\u0003\u016f\u0166"+
		"\u0001\u0000\u0000\u0000\u016f\u0169\u0001\u0000\u0000\u0000\u016f\u016c"+
		"\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u01727\u0001"+
		"\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0007"+
		"\b\u0000\u0000\u01759\u0001\u0000\u0000\u0000 ;@LTcfmx{\u0087\u0089\u0092"+
		"\u009b\u00a4\u00af\u00bc\u00c3\u00c7\u00d2\u00dd\u00f1\u00f5\u00ff\u0103"+
		"\u0128\u0130\u0137\u0147\u015a\u0164\u016f\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}