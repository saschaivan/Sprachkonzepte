// Generated from .\SaschParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SaschParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, VS=2, Champion=3, COLON=4, DIVIDER=5, BRACKETOPEN=6, BRACKETCLOSE=7, 
		Kills=8, SLASH=9, Deaths=10, Assists=11, Mythics=12, COMMA=13, Normal=14, 
		Unique=15;
	public static final int
		RULE_matchup = 0, RULE_side = 1, RULE_score = 2, RULE_items = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"matchup", "side", "score", "items"
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
			null, "WS", "VS", "Champion", "COLON", "DIVIDER", "BRACKETOPEN", "BRACKETCLOSE", 
			"Kills", "SLASH", "Deaths", "Assists", "Mythics", "COMMA", "Normal", 
			"Unique"
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
	public String getGrammarFileName() { return "SaschParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SaschParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MatchupContext extends ParserRuleContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public TerminalNode VS() { return getToken(SaschParser.VS, 0); }
		public MatchupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterMatchup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitMatchup(this);
		}
	}

	public final MatchupContext matchup() throws RecognitionException {
		MatchupContext _localctx = new MatchupContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_matchup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			side();
			setState(9);
			match(VS);
			setState(10);
			side();
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

	public static class SideContext extends ParserRuleContext {
		public TerminalNode Champion() { return getToken(SaschParser.Champion, 0); }
		public TerminalNode COLON() { return getToken(SaschParser.COLON, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public TerminalNode DIVIDER() { return getToken(SaschParser.DIVIDER, 0); }
		public TerminalNode BRACKETOPEN() { return getToken(SaschParser.BRACKETOPEN, 0); }
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public TerminalNode BRACKETCLOSE() { return getToken(SaschParser.BRACKETCLOSE, 0); }
		public SideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_side; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitSide(this);
		}
	}

	public final SideContext side() throws RecognitionException {
		SideContext _localctx = new SideContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_side);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(Champion);
			setState(13);
			match(COLON);
			setState(14);
			score();
			setState(15);
			match(DIVIDER);
			setState(16);
			match(BRACKETOPEN);
			setState(17);
			items();
			setState(18);
			match(BRACKETCLOSE);
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

	public static class ScoreContext extends ParserRuleContext {
		public TerminalNode Kills() { return getToken(SaschParser.Kills, 0); }
		public List<TerminalNode> SLASH() { return getTokens(SaschParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(SaschParser.SLASH, i);
		}
		public TerminalNode Deaths() { return getToken(SaschParser.Deaths, 0); }
		public TerminalNode Assists() { return getToken(SaschParser.Assists, 0); }
		public ScoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitScore(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_score);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(Kills);
			setState(21);
			match(SLASH);
			setState(22);
			match(Deaths);
			setState(23);
			match(SLASH);
			setState(24);
			match(Assists);
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

	public static class ItemsContext extends ParserRuleContext {
		public TerminalNode Mythics() { return getToken(SaschParser.Mythics, 0); }
		public TerminalNode COMMA() { return getToken(SaschParser.COMMA, 0); }
		public TerminalNode Normal() { return getToken(SaschParser.Normal, 0); }
		public TerminalNode Unique() { return getToken(SaschParser.Unique, 0); }
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitItems(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_items);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(Mythics);
				setState(27);
				match(COMMA);
				setState(28);
				match(Normal);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(Mythics);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(Normal);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(Unique);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5#\n\5\3\5\2\2\6\2\4\6"+
		"\b\2\2\2#\2\n\3\2\2\2\4\16\3\2\2\2\6\26\3\2\2\2\b\"\3\2\2\2\n\13\5\4\3"+
		"\2\13\f\7\4\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17\7\5\2\2\17\20\7\6\2\2\20"+
		"\21\5\6\4\2\21\22\7\7\2\2\22\23\7\b\2\2\23\24\5\b\5\2\24\25\7\t\2\2\25"+
		"\5\3\2\2\2\26\27\7\n\2\2\27\30\7\13\2\2\30\31\7\f\2\2\31\32\7\13\2\2\32"+
		"\33\7\r\2\2\33\7\3\2\2\2\34\35\7\16\2\2\35\36\7\17\2\2\36#\7\20\2\2\37"+
		"#\7\16\2\2 #\7\20\2\2!#\7\21\2\2\"\34\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2"+
		"\"!\3\2\2\2#\t\3\2\2\2\3\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}