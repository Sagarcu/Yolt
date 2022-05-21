// Generated from C:/Users/mathi/Desktop/Yolt/Yolt/src\Yolt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YoltLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ADD", "SUB", "MUL", "DIV", "POW", "LOGIC_EQUAL", "LOGIC_UNEQUAL", 
			"LOGIC_BIGGER", "LOGIC_LOWER", "LOGIC_OR", "LOGIC_AND", "CLASS", "GOLD", 
			"STRING", "INT", "PRINT", "IDENTIFIER", "EQUALS", "INT_VALUE", "GOLD_VALUE", 
			"SEMICOLON", "PAREN_OPEN", "PAREN_CLOSE", "HAAKIE_OPEN", "HAAKIE_CLOSE", 
			"THING", "COMMENT", "WS"
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


	public YoltLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Yolt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001d\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011x\b\u0011"+
		"\u000b\u0011\f\u0011y\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0080\b\u0013\n\u0013\f\u0013\u0083\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0087\b\u0014\n\u0014\f\u0014\u008a\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0004\u001c\u009f\b\u001c\u000b\u001c\f\u001c\u00a0\u0001\u001c\u0001"+
		"\u001c\u0000\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		"\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u000019\u0001\u000009\u0001\u0000"+
		"GG\u0003\u0000\t\n\r\r  \u00a7\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;"+
		"\u0001\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005A\u0001\u0000"+
		"\u0000\u0000\u0007C\u0001\u0000\u0000\u0000\tE\u0001\u0000\u0000\u0000"+
		"\u000bG\u0001\u0000\u0000\u0000\rI\u0001\u0000\u0000\u0000\u000fL\u0001"+
		"\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000"+
		"\u0000\u0015T\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019"+
		"Z\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001de\u0001"+
		"\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!p\u0001\u0000\u0000"+
		"\u0000#w\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000\u0000\'}\u0001\u0000"+
		"\u0000\u0000)\u0084\u0001\u0000\u0000\u0000+\u008d\u0001\u0000\u0000\u0000"+
		"-\u008f\u0001\u0000\u0000\u0000/\u0091\u0001\u0000\u0000\u00001\u0093"+
		"\u0001\u0000\u0000\u00003\u0095\u0001\u0000\u0000\u00005\u0097\u0001\u0000"+
		"\u0000\u00007\u0099\u0001\u0000\u0000\u00009\u009e\u0001\u0000\u0000\u0000"+
		";<\u0005A\u0000\u0000<=\u0005D\u0000\u0000=>\u0005D\u0000\u0000>\u0002"+
		"\u0001\u0000\u0000\u0000?@\u0005+\u0000\u0000@\u0004\u0001\u0000\u0000"+
		"\u0000AB\u0005-\u0000\u0000B\u0006\u0001\u0000\u0000\u0000CD\u0005*\u0000"+
		"\u0000D\b\u0001\u0000\u0000\u0000EF\u0005/\u0000\u0000F\n\u0001\u0000"+
		"\u0000\u0000GH\u0005^\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0005="+
		"\u0000\u0000JK\u0005=\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005"+
		"=\u0000\u0000MN\u0005!\u0000\u0000NO\u0005=\u0000\u0000O\u0010\u0001\u0000"+
		"\u0000\u0000PQ\u0005>\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005"+
		"<\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005|\u0000\u0000UV\u0005"+
		"|\u0000\u0000V\u0016\u0001\u0000\u0000\u0000WX\u0005&\u0000\u0000XY\u0005"+
		"&\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000Z[\u0005C\u0000\u0000[\\\u0005"+
		"l\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005s\u0000\u0000^_\u0005s\u0000"+
		"\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005g\u0000\u0000ab\u0005o\u0000"+
		"\u0000bc\u0005l\u0000\u0000cd\u0005d\u0000\u0000d\u001c\u0001\u0000\u0000"+
		"\u0000ef\u0005s\u0000\u0000fg\u0005t\u0000\u0000gh\u0005r\u0000\u0000"+
		"hi\u0005i\u0000\u0000ij\u0005n\u0000\u0000jk\u0005g\u0000\u0000k\u001e"+
		"\u0001\u0000\u0000\u0000lm\u0005i\u0000\u0000mn\u0005n\u0000\u0000no\u0005"+
		"t\u0000\u0000o \u0001\u0000\u0000\u0000pq\u0005p\u0000\u0000qr\u0005r"+
		"\u0000\u0000rs\u0005i\u0000\u0000st\u0005n\u0000\u0000tu\u0005t\u0000"+
		"\u0000u\"\u0001\u0000\u0000\u0000vx\u0007\u0000\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z$\u0001\u0000\u0000\u0000{|\u0005=\u0000\u0000|&\u0001"+
		"\u0000\u0000\u0000}\u0081\u0007\u0001\u0000\u0000~\u0080\u0007\u0002\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082(\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0088\u0007\u0001\u0000\u0000\u0085\u0087\u0007\u0002\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0007\u0003\u0000\u0000\u008c*\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005;\u0000\u0000\u008e,\u0001\u0000\u0000\u0000\u008f\u0090\u0005("+
		"\u0000\u0000\u0090.\u0001\u0000\u0000\u0000\u0091\u0092\u0005)\u0000\u0000"+
		"\u00920\u0001\u0000\u0000\u0000\u0093\u0094\u0005{\u0000\u0000\u00942"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005}\u0000\u0000\u00964\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\"\u0000\u0000\u00986\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005/\u0000\u0000\u009a\u009b\u0005/\u0000\u0000\u009b"+
		"\u009c\u0005*\u0000\u0000\u009c8\u0001\u0000\u0000\u0000\u009d\u009f\u0007"+
		"\u0004\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006"+
		"\u001c\u0000\u0000\u00a3:\u0001\u0000\u0000\u0000\u0005\u0000y\u0081\u0088"+
		"\u00a0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}