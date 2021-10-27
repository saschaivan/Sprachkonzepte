// Generated from TimeSimple.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TimeSimple extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Clock=1, WS=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Clock", "Time", "Identifier", "Twelve", "Noonight", "Minutes", "Hours", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Clock", "WS"
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


	public TimeSimple(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TimeSimple.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\4L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\b\3\b\3\b\5\bD\n\b\3\t\6\tG\n\t\r\t"+
		"\16\tH\3\t\3\t\2\2\n\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\4\3\2\t\5\2PPpp"+
		"~~\5\2OOoo~~\3\2\62\67\3\2\62;\3\2\63;\3\2\62\64\5\2\13\f\17\17\"\"\2"+
		"J\2\3\3\2\2\2\2\21\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7)\3\2\2\2\t+\3\2"+
		"\2\2\13;\3\2\2\2\r=\3\2\2\2\17C\3\2\2\2\21F\3\2\2\2\23\24\5\5\3\2\24\25"+
		"\5\7\4\2\25\32\3\2\2\2\26\27\5\t\5\2\27\30\5\13\6\2\30\32\3\2\2\2\31\23"+
		"\3\2\2\2\31\26\3\2\2\2\32\4\3\2\2\2\33\34\5\17\b\2\34\35\7<\2\2\35\36"+
		"\5\r\7\2\36\6\3\2\2\2\37 \7\"\2\2 !\7c\2\2!\"\7\60\2\2\"#\7o\2\2#*\7\60"+
		"\2\2$%\7\"\2\2%&\7r\2\2&\'\7\60\2\2\'(\7o\2\2(*\7\60\2\2)\37\3\2\2\2)"+
		"$\3\2\2\2*\b\3\2\2\2+,\7\63\2\2,-\7\64\2\2-.\7\"\2\2.\n\3\2\2\2/\60\t"+
		"\2\2\2\60\61\7q\2\2\61\62\7q\2\2\62<\7p\2\2\63\64\t\3\2\2\64\65\7k\2\2"+
		"\65\66\7f\2\2\66\67\7p\2\2\678\7k\2\289\7i\2\29:\7j\2\2:<\7v\2\2;/\3\2"+
		"\2\2;\63\3\2\2\2<\f\3\2\2\2=>\t\4\2\2>?\t\5\2\2?\16\3\2\2\2@D\t\6\2\2"+
		"AB\7\63\2\2BD\t\7\2\2C@\3\2\2\2CA\3\2\2\2D\20\3\2\2\2EG\t\b\2\2FE\3\2"+
		"\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\t\2\2K\22\3\2\2\2\b\2"+
		"\31);CH\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}