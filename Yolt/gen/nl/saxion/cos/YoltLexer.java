package nl.saxion.cos;// Generated from C:/Users/mathi/Desktop/Compilers en Operating Systems/01-master/src\Yolt.g4 by ANTLR 4.10.1
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
		INT=1, PRINT=2, IDENTIFIER=3, EQUALS=4, INT_VALUE=5, SEMICOLON=6, PAREN_OPEN=7, 
		PAREN_CLOSE=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "PRINT", "IDENTIFIER", "EQUALS", "INT_VALUE", "SEMICOLON", "PAREN_OPEN", 
			"PAREN_CLOSE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'print'", null, "'='", null, "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "PRINT", "IDENTIFIER", "EQUALS", "INT_VALUE", "SEMICOLON", 
			"PAREN_OPEN", "PAREN_CLOSE", "WS"
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
		"\u0004\u0000\t8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002\f\u0002 \u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004\'\b\u0004\n\u0004"+
		"\f\u0004*\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0004\b3\b\b\u000b\b\f\b4\u0001\b\u0001\b\u0000"+
		"\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\u0004\u0002\u0000AZaz\u0001"+
		"\u000019\u0001\u000009\u0003\u0000\t\n\r\r  :\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0001\u0013\u0001\u0000\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000"+
		"\u0005\u001e\u0001\u0000\u0000\u0000\u0007\"\u0001\u0000\u0000\u0000\t"+
		"$\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r-\u0001\u0000"+
		"\u0000\u0000\u000f/\u0001\u0000\u0000\u0000\u00112\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0005i\u0000\u0000\u0014\u0015\u0005n\u0000\u0000\u0015\u0016"+
		"\u0005t\u0000\u0000\u0016\u0002\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"p\u0000\u0000\u0018\u0019\u0005r\u0000\u0000\u0019\u001a\u0005i\u0000"+
		"\u0000\u001a\u001b\u0005n\u0000\u0000\u001b\u001c\u0005t\u0000\u0000\u001c"+
		"\u0004\u0001\u0000\u0000\u0000\u001d\u001f\u0007\u0000\u0000\u0000\u001e"+
		"\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0006\u0001\u0000\u0000"+
		"\u0000\"#\u0005=\u0000\u0000#\b\u0001\u0000\u0000\u0000$(\u0007\u0001"+
		"\u0000\u0000%\'\u0007\u0002\u0000\u0000&%\u0001\u0000\u0000\u0000\'*\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")\n\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005;\u0000\u0000"+
		",\f\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\u000e\u0001\u0000\u0000"+
		"\u0000/0\u0005)\u0000\u00000\u0010\u0001\u0000\u0000\u000013\u0007\u0003"+
		"\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"67\u0006\b\u0000\u00007\u0012\u0001\u0000\u0000\u0000\u0004\u0000 (4\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}