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
		RULE_logic_expr = 21, RULE_compare_values = 22, RULE_print_stmt = 23, 
		RULE_declarations = 24, RULE_statement = 25, RULE_expr = 26, RULE_number = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"application", "class_declaration", "function_declaration", "function_call", 
			"int_declaration", "boolean_declaration", "string_declaration", "gold_declaration", 
			"prompt_input", "random_input", "if_statement", "else_if_statement", 
			"else_statement", "return_statement", "while_loop", "do_while_loop", 
			"var_assignment", "bool_assignment", "var_addition", "int_addition_short", 
			"int_addition", "logic_expr", "compare_values", "print_stmt", "declarations", 
			"statement", "expr", "number"
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(56);
				class_declaration();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(59);
				function_declaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(67);
			match(CLASS);
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(PAREN_OPEN);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(70);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				match(IDENTIFIER);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(PAREN_CLOSE);
			setState(78);
			match(BRACKET_OPEN);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				function_declaration();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			setState(84);
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
			setState(86);
			match(FUNCTION);
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(PAREN_OPEN);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(89);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				match(IDENTIFIER);
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(92);
					match(COMMA);
					{
					setState(93);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(94);
					match(IDENTIFIER);
					}
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(102);
			match(PAREN_CLOSE);
			setState(103);
			match(BRACKET_OPEN);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				statement();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(109);
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
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(PAREN_OPEN);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(113);
				match(IDENTIFIER);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					match(IDENTIFIER);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(123);
			match(PAREN_CLOSE);
			setState(124);
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
			setState(126);
			match(INT);
			setState(127);
			match(IDENTIFIER);
			setState(128);
			match(EQUALS);
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(129);
				match(INT_VALUE);
				}
				break;
			case 2:
				{
				setState(130);
				prompt_input();
				}
				break;
			case 3:
				{
				setState(131);
				random_input();
				}
				break;
			case 4:
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << PAREN_OPEN))) != 0)) {
					{
					setState(132);
					expr(0);
					}
				}

				}
				break;
			}
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
			setState(139);
			match(BOOLEAN);
			setState(140);
			match(IDENTIFIER);
			setState(141);
			match(EQUALS);
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_VALUE:
				{
				setState(142);
				match(BOOLEAN_VALUE);
				}
				break;
			case PROMPT:
				{
				setState(143);
				prompt_input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(146);
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
			setState(148);
			match(STRING);
			setState(149);
			match(IDENTIFIER);
			setState(150);
			match(EQUALS);
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_VALUE:
				{
				{
				setState(151);
				match(STRING_VALUE);
				}
				}
				break;
			case PROMPT:
				{
				setState(152);
				prompt_input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155);
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
			setState(157);
			match(GOLD);
			setState(158);
			match(IDENTIFIER);
			setState(159);
			match(EQUALS);
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOLD_VALUE:
				{
				setState(160);
				match(GOLD_VALUE);
				}
				break;
			case PROMPT:
				{
				setState(161);
				prompt_input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164);
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
			setState(166);
			match(PROMPT);
			setState(167);
			match(PAREN_OPEN);
			setState(168);
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
			setState(170);
			match(RANDOM);
			setState(171);
			match(PAREN_OPEN);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_VALUE || _la==IDENTIFIER) {
				{
				setState(172);
				number();
				}
			}

			setState(175);
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
		enterRule(_localctx, 20, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IF);
			setState(178);
			match(PAREN_OPEN);
			setState(179);
			logic_expr(0);
			setState(180);
			match(PAREN_CLOSE);
			setState(181);
			match(COLON);
			setState(182);
			match(BRACKET_OPEN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(183);
				statement();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(BRACKET_CLOSE);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(190);
				else_if_statement();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(196);
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
		enterRule(_localctx, 22, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ELSE_IF);
			setState(200);
			match(PAREN_OPEN);
			setState(201);
			logic_expr(0);
			setState(202);
			match(PAREN_CLOSE);
			setState(203);
			match(COLON);
			setState(204);
			match(BRACKET_OPEN);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(205);
				statement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
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
			setState(213);
			match(ELSE);
			setState(214);
			match(COLON);
			setState(215);
			match(BRACKET_OPEN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(216);
				statement();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
			setState(224);
			match(RETURN);
			setState(225);
			match(PAREN_OPEN);
			setState(226);
			match(IDENTIFIER);
			setState(227);
			match(PAREN_CLOSE);
			setState(228);
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
			setState(230);
			match(LOOP);
			setState(231);
			match(PAREN_OPEN);
			setState(232);
			logic_expr(0);
			setState(233);
			match(PAREN_CLOSE);
			setState(234);
			match(COLON);
			setState(235);
			match(BRACKET_OPEN);
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				statement();
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(241);
				match(BREAK);
				setState(242);
				match(SEMICOLON);
				}
			}

			setState(245);
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
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
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
		enterRule(_localctx, 30, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(LOOP);
			setState(248);
			match(COLON);
			setState(249);
			match(BRACKET_OPEN);
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				statement();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(255);
				match(BREAK);
				setState(256);
				match(SEMICOLON);
				}
			}

			setState(259);
			match(BRACKET_CLOSE);
			setState(260);
			match(WHILE);
			setState(261);
			match(PAREN_OPEN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << PAREN_OPEN))) != 0)) {
				{
				{
				setState(262);
				logic_expr(0);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(PAREN_CLOSE);
			setState(269);
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
			setState(271);
			match(IDENTIFIER);
			setState(272);
			match(EQUALS);
			setState(273);
			match(IDENTIFIER);
			setState(274);
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
			setState(276);
			match(IDENTIFIER);
			setState(277);
			match(EQUALS);
			setState(278);
			match(BOOLEAN_VALUE);
			setState(279);
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
			setState(281);
			match(IDENTIFIER);
			setState(282);
			match(EQUALS);
			setState(283);
			match(IDENTIFIER);
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << MOD) | (1L << DIV) | (1L << POW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(285);
			match(IDENTIFIER);
			setState(286);
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
			setState(288);
			match(IDENTIFIER);
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << MOD) | (1L << DIV) | (1L << POW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
			match(EQUALS);
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==GOLD_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
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
			setState(294);
			match(IDENTIFIER);
			setState(295);
			match(EQUALS);
			setState(297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296);
				expr(0);
				}
				}
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << PAREN_OPEN))) != 0) );
			setState(301);
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

			setState(304);
			compare_values();
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new LogicAndContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(306);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(307);
						match(LOGIC_AND);
						setState(308);
						logic_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicOrContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(309);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(310);
						match(LOGIC_OR);
						setState(311);
						logic_expr(3);
						}
						break;
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(317);
			expr(0);
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGIC_EQUAL) | (1L << LOGIC_UNEQUAL) | (1L << LOGIC_BIGGER) | (1L << LOGIC_LOWER) | (1L << LOGIC_BIGGER_EQUAL) | (1L << LOGIC_LOWER_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(319);
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
		enterRule(_localctx, 46, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(PRINT);
			setState(322);
			match(PAREN_OPEN);
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_VALUE) | (1L << GOLD_VALUE) | (1L << BOOLEAN_VALUE) | (1L << STRING_VALUE) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(324);
			match(PAREN_CLOSE);
			setState(325);
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
		enterRule(_localctx, 48, RULE_declarations);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				int_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				boolean_declaration();
				}
				break;
			case GOLD:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				gold_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
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
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				bool_assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				int_addition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				boolean_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				do_while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(340);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(341);
				int_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(342);
				print_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(343);
				string_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(344);
				gold_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(345);
				int_addition_short();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(346);
				match(T__0);
				setState(347);
				expr(0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(348);
				var_assignment();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(349);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_OPEN:
				{
				_localctx = new ParanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(353);
				match(PAREN_OPEN);
				setState(354);
				expr(0);
				setState(355);
				match(PAREN_CLOSE);
				}
				}
				break;
			case SUB:
				{
				_localctx = new NegativeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				match(SUB);
				setState(358);
				expr(5);
				}
				break;
			case INT_VALUE:
			case IDENTIFIER:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new PowModExpressionContext(new ExprContext(_parentctx, _parentState));
						((PowModExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(363);
						_la = _input.LA(1);
						if ( !(_la==MOD || _la==POW) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						((PowModExpressionContext)_localctx).right = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExpressionContext(new ExprContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(366);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(367);
						((MulDivExpressionContext)_localctx).right = expr(4);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(new ExprContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(368);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(369);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(370);
						((AddSubExpressionContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 54, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		case 21:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		case 26:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u017b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0003\u0000:\b\u0000\u0001\u0000\u0005\u0000=\b\u0000\n\u0000"+
		"\f\u0000@\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001I\b\u0001\n\u0001\f\u0001L\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001Q\b\u0001\u000b"+
		"\u0001\f\u0001R\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002`\b\u0002\n\u0002\f\u0002c\t\u0002\u0003\u0002e\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002j\b\u0002\u000b\u0002"+
		"\f\u0002k\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003u\b\u0003\n\u0003\f\u0003x\t\u0003"+
		"\u0003\u0003z\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0086\b\u0004\u0003\u0004\u0088\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0091\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009a\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a3\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0003\t\u00ae\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b9\b\n\n\n\f\n\u00bc"+
		"\t\n\u0001\n\u0001\n\u0005\n\u00c0\b\n\n\n\f\n\u00c3\t\n\u0001\n\u0003"+
		"\n\u00c6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00cf\b\u000b\n\u000b\f\u000b\u00d2"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00da\b\f\n\f\f\f\u00dd\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00ee\b\u000e\u000b\u000e"+
		"\f\u000e\u00ef\u0001\u000e\u0001\u000e\u0003\u000e\u00f4\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u00fc\b\u000f\u000b\u000f\f\u000f\u00fd\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0102\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0108\b\u000f\n\u000f\f\u000f\u010b\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u012a\b\u0014\u000b"+
		"\u0014\f\u0014\u012b\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u0139\b\u0015\n\u0015\f\u0015\u013c\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u014c\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u015f\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0169\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0174\b\u001a\n\u001a\f\u001a\u0177\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0000\u0002*4\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\t\u0001\u0000"+
		"\u0019\u001c\u0001\u0000\u0002\u0007\u0001\u0000!\"\u0001\u0000\b\r\u0002"+
		"\u0000!\"$&\u0002\u0000\u0005\u0005\u0007\u0007\u0002\u0000\u0004\u0004"+
		"\u0006\u0006\u0001\u0000\u0002\u0003\u0002\u0000!!&&\u0193\u00009\u0001"+
		"\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000"+
		"\u0000\u0006o\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000\n\u008b"+
		"\u0001\u0000\u0000\u0000\f\u0094\u0001\u0000\u0000\u0000\u000e\u009d\u0001"+
		"\u0000\u0000\u0000\u0010\u00a6\u0001\u0000\u0000\u0000\u0012\u00aa\u0001"+
		"\u0000\u0000\u0000\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u00c7\u0001"+
		"\u0000\u0000\u0000\u0018\u00d5\u0001\u0000\u0000\u0000\u001a\u00e0\u0001"+
		"\u0000\u0000\u0000\u001c\u00e6\u0001\u0000\u0000\u0000\u001e\u00f7\u0001"+
		"\u0000\u0000\u0000 \u010f\u0001\u0000\u0000\u0000\"\u0114\u0001\u0000"+
		"\u0000\u0000$\u0119\u0001\u0000\u0000\u0000&\u0120\u0001\u0000\u0000\u0000"+
		"(\u0126\u0001\u0000\u0000\u0000*\u012f\u0001\u0000\u0000\u0000,\u013d"+
		"\u0001\u0000\u0000\u0000.\u0141\u0001\u0000\u0000\u00000\u014b\u0001\u0000"+
		"\u0000\u00002\u015e\u0001\u0000\u0000\u00004\u0168\u0001\u0000\u0000\u0000"+
		"6\u0178\u0001\u0000\u0000\u00008:\u0003\u0002\u0001\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:>\u0001\u0000\u0000\u0000;=\u0003"+
		"\u0004\u0002\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0014\u0000\u0000DE\u0005&\u0000\u0000EJ\u0005"+
		"*\u0000\u0000FG\u0007\u0000\u0000\u0000GI\u0005&\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MN\u0005+\u0000\u0000NP\u0005,\u0000\u0000OQ\u0003\u0004\u0002\u0000P"+
		"O\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005-\u0000"+
		"\u0000U\u0003\u0001\u0000\u0000\u0000VW\u0005\u0017\u0000\u0000WX\u0005"+
		"&\u0000\u0000Xd\u0005*\u0000\u0000YZ\u0007\u0000\u0000\u0000Z[\u0005&"+
		"\u0000\u0000[a\u0001\u0000\u0000\u0000\\]\u0005\'\u0000\u0000]^\u0007"+
		"\u0000\u0000\u0000^`\u0005&\u0000\u0000_\\\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dY\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005+\u0000"+
		"\u0000gi\u0005,\u0000\u0000hj\u00032\u0019\u0000ih\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0005-\u0000\u0000n\u0005\u0001\u0000"+
		"\u0000\u0000op\u0005&\u0000\u0000py\u0005*\u0000\u0000qv\u0005&\u0000"+
		"\u0000rs\u0005\'\u0000\u0000su\u0005&\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yq\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0005+\u0000\u0000|}\u0005(\u0000\u0000}\u0007\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u001b\u0000\u0000\u007f\u0080\u0005&\u0000\u0000\u0080\u0087"+
		"\u0005 \u0000\u0000\u0081\u0088\u0005!\u0000\u0000\u0082\u0088\u0003\u0010"+
		"\b\u0000\u0083\u0088\u0003\u0012\t\u0000\u0084\u0086\u00034\u001a\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000"+
		"\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005(\u0000\u0000\u008a\t\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u001c\u0000\u0000\u008c\u008d\u0005&\u0000\u0000\u008d\u0090"+
		"\u0005 \u0000\u0000\u008e\u0091\u0005$\u0000\u0000\u008f\u0091\u0003\u0010"+
		"\b\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005(\u0000\u0000"+
		"\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u001a\u0000\u0000"+
		"\u0095\u0096\u0005&\u0000\u0000\u0096\u0099\u0005 \u0000\u0000\u0097\u009a"+
		"\u0005%\u0000\u0000\u0098\u009a\u0003\u0010\b\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005(\u0000\u0000\u009c\r\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u0019\u0000\u0000\u009e\u009f\u0005&\u0000"+
		"\u0000\u009f\u00a2\u0005 \u0000\u0000\u00a0\u00a3\u0005\"\u0000\u0000"+
		"\u00a1\u00a3\u0003\u0010\b\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005(\u0000\u0000\u00a5\u000f\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u001e\u0000\u0000\u00a7\u00a8\u0005*\u0000\u0000\u00a8\u00a9\u0005"+
		"+\u0000\u0000\u00a9\u0011\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u001f"+
		"\u0000\u0000\u00ab\u00ad\u0005*\u0000\u0000\u00ac\u00ae\u00036\u001b\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0005+\u0000\u0000\u00b0"+
		"\u0013\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0010\u0000\u0000\u00b2"+
		"\u00b3\u0005*\u0000\u0000\u00b3\u00b4\u0003*\u0015\u0000\u00b4\u00b5\u0005"+
		"+\u0000\u0000\u00b5\u00b6\u0005)\u0000\u0000\u00b6\u00ba\u0005,\u0000"+
		"\u0000\u00b7\u00b9\u00032\u0019\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c1\u0005-\u0000\u0000\u00be"+
		"\u00c0\u0003\u0016\u000b\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c6\u0003\u0018\f\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u0015"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0011\u0000\u0000\u00c8\u00c9"+
		"\u0005*\u0000\u0000\u00c9\u00ca\u0003*\u0015\u0000\u00ca\u00cb\u0005+"+
		"\u0000\u0000\u00cb\u00cc\u0005)\u0000\u0000\u00cc\u00d0\u0005,\u0000\u0000"+
		"\u00cd\u00cf\u00032\u0019\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005-\u0000\u0000\u00d4\u0017"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0012\u0000\u0000\u00d6\u00d7"+
		"\u0005)\u0000\u0000\u00d7\u00db\u0005,\u0000\u0000\u00d8\u00da\u00032"+
		"\u0019\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005-\u0000\u0000\u00df\u0019\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0018\u0000\u0000\u00e1\u00e2\u0005*\u0000\u0000"+
		"\u00e2\u00e3\u0005&\u0000\u0000\u00e3\u00e4\u0005+\u0000\u0000\u00e4\u00e5"+
		"\u0005(\u0000\u0000\u00e5\u001b\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0015\u0000\u0000\u00e7\u00e8\u0005*\u0000\u0000\u00e8\u00e9\u0003*\u0015"+
		"\u0000\u00e9\u00ea\u0005+\u0000\u0000\u00ea\u00eb\u0005)\u0000\u0000\u00eb"+
		"\u00ed\u0005,\u0000\u0000\u00ec\u00ee\u00032\u0019\u0000\u00ed\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u0013\u0000\u0000\u00f2\u00f4\u0005"+
		"(\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005-\u0000"+
		"\u0000\u00f6\u001d\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0015\u0000"+
		"\u0000\u00f8\u00f9\u0005)\u0000\u0000\u00f9\u00fb\u0005,\u0000\u0000\u00fa"+
		"\u00fc\u00032\u0019\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\u0013\u0000\u0000\u0100\u0102\u0005(\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005-\u0000\u0000\u0104\u0105\u0005\u0016"+
		"\u0000\u0000\u0105\u0109\u0005*\u0000\u0000\u0106\u0108\u0003*\u0015\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005+\u0000\u0000\u010d\u010e\u0005(\u0000\u0000\u010e\u001f"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005&\u0000\u0000\u0110\u0111\u0005"+
		" \u0000\u0000\u0111\u0112\u0005&\u0000\u0000\u0112\u0113\u0005(\u0000"+
		"\u0000\u0113!\u0001\u0000\u0000\u0000\u0114\u0115\u0005&\u0000\u0000\u0115"+
		"\u0116\u0005 \u0000\u0000\u0116\u0117\u0005$\u0000\u0000\u0117\u0118\u0005"+
		"(\u0000\u0000\u0118#\u0001\u0000\u0000\u0000\u0119\u011a\u0005&\u0000"+
		"\u0000\u011a\u011b\u0005 \u0000\u0000\u011b\u011c\u0005&\u0000\u0000\u011c"+
		"\u011d\u0007\u0001\u0000\u0000\u011d\u011e\u0005&\u0000\u0000\u011e\u011f"+
		"\u0005(\u0000\u0000\u011f%\u0001\u0000\u0000\u0000\u0120\u0121\u0005&"+
		"\u0000\u0000\u0121\u0122\u0007\u0001\u0000\u0000\u0122\u0123\u0005 \u0000"+
		"\u0000\u0123\u0124\u0007\u0002\u0000\u0000\u0124\u0125\u0005(\u0000\u0000"+
		"\u0125\'\u0001\u0000\u0000\u0000\u0126\u0127\u0005&\u0000\u0000\u0127"+
		"\u0129\u0005 \u0000\u0000\u0128\u012a\u00034\u001a\u0000\u0129\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005(\u0000\u0000\u012e)\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0006\u0015\uffff\uffff\u0000\u0130\u0131\u0003,\u0016"+
		"\u0000\u0131\u013a\u0001\u0000\u0000\u0000\u0132\u0133\n\u0003\u0000\u0000"+
		"\u0133\u0134\u0005\u000f\u0000\u0000\u0134\u0139\u0003*\u0015\u0004\u0135"+
		"\u0136\n\u0002\u0000\u0000\u0136\u0137\u0005\u000e\u0000\u0000\u0137\u0139"+
		"\u0003*\u0015\u0003\u0138\u0132\u0001\u0000\u0000\u0000\u0138\u0135\u0001"+
		"\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b+\u0001\u0000"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013e\u00034\u001a"+
		"\u0000\u013e\u013f\u0007\u0003\u0000\u0000\u013f\u0140\u00034\u001a\u0000"+
		"\u0140-\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u001d\u0000\u0000\u0142"+
		"\u0143\u0005*\u0000\u0000\u0143\u0144\u0007\u0004\u0000\u0000\u0144\u0145"+
		"\u0005+\u0000\u0000\u0145\u0146\u0005(\u0000\u0000\u0146/\u0001\u0000"+
		"\u0000\u0000\u0147\u014c\u0003\b\u0004\u0000\u0148\u014c\u0003\n\u0005"+
		"\u0000\u0149\u014c\u0003\u000e\u0007\u0000\u014a\u014c\u0003\f\u0006\u0000"+
		"\u014b\u0147\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c1\u0001\u0000\u0000\u0000\u014d\u015f\u0003\u0006\u0003\u0000\u014e"+
		"\u015f\u0003\u001a\r\u0000\u014f\u015f\u0003\"\u0011\u0000\u0150\u015f"+
		"\u0003(\u0014\u0000\u0151\u015f\u0003\u0014\n\u0000\u0152\u015f\u0003"+
		"\n\u0005\u0000\u0153\u015f\u0003\u001e\u000f\u0000\u0154\u015f\u0003\u001c"+
		"\u000e\u0000\u0155\u015f\u0003\b\u0004\u0000\u0156\u015f\u0003.\u0017"+
		"\u0000\u0157\u015f\u0003\f\u0006\u0000\u0158\u015f\u0003\u000e\u0007\u0000"+
		"\u0159\u015f\u0003&\u0013\u0000\u015a\u015b\u0005\u0001\u0000\u0000\u015b"+
		"\u015f\u00034\u001a\u0000\u015c\u015f\u0003 \u0010\u0000\u015d\u015f\u0003"+
		"$\u0012\u0000\u015e\u014d\u0001\u0000\u0000\u0000\u015e\u014e\u0001\u0000"+
		"\u0000\u0000\u015e\u014f\u0001\u0000\u0000\u0000\u015e\u0150\u0001\u0000"+
		"\u0000\u0000\u015e\u0151\u0001\u0000\u0000\u0000\u015e\u0152\u0001\u0000"+
		"\u0000\u0000\u015e\u0153\u0001\u0000\u0000\u0000\u015e\u0154\u0001\u0000"+
		"\u0000\u0000\u015e\u0155\u0001\u0000\u0000\u0000\u015e\u0156\u0001\u0000"+
		"\u0000\u0000\u015e\u0157\u0001\u0000\u0000\u0000\u015e\u0158\u0001\u0000"+
		"\u0000\u0000\u015e\u0159\u0001\u0000\u0000\u0000\u015e\u015a\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015d\u0001\u0000"+
		"\u0000\u0000\u015f3\u0001\u0000\u0000\u0000\u0160\u0161\u0006\u001a\uffff"+
		"\uffff\u0000\u0161\u0162\u0005*\u0000\u0000\u0162\u0163\u00034\u001a\u0000"+
		"\u0163\u0164\u0005+\u0000\u0000\u0164\u0169\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0005\u0003\u0000\u0000\u0166\u0169\u00034\u001a\u0005\u0167\u0169"+
		"\u00036\u001b\u0000\u0168\u0160\u0001\u0000\u0000\u0000\u0168\u0165\u0001"+
		"\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u0175\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\n\u0004\u0000\u0000\u016b\u016c\u0007\u0005"+
		"\u0000\u0000\u016c\u0174\u00034\u001a\u0005\u016d\u016e\n\u0003\u0000"+
		"\u0000\u016e\u016f\u0007\u0006\u0000\u0000\u016f\u0174\u00034\u001a\u0004"+
		"\u0170\u0171\n\u0002\u0000\u0000\u0171\u0172\u0007\u0007\u0000\u0000\u0172"+
		"\u0174\u00034\u001a\u0003\u0173\u016a\u0001\u0000\u0000\u0000\u0173\u016d"+
		"\u0001\u0000\u0000\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u01765\u0001\u0000\u0000\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0007\b\u0000\u0000\u01797\u0001\u0000"+
		"\u0000\u0000!9>JRadkvy\u0085\u0087\u0090\u0099\u00a2\u00ad\u00ba\u00c1"+
		"\u00c5\u00d0\u00db\u00ef\u00f3\u00fd\u0101\u0109\u012b\u0138\u013a\u014b"+
		"\u015e\u0168\u0173\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}