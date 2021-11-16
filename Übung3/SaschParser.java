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
		VS=1, DIVIDER=2, BRACKETOPEN=3, BRACKETCLOSE=4, COLON=5, SLASH=6, COMMA=7, 
		Champion=8, NUMBER=9, Mythics=10, Normal=11, Unique=12, WS=13;
	public static final int
		RULE_matchup = 0, RULE_side = 1, RULE_champion = 2, RULE_score = 3, RULE_kills = 4, 
		RULE_deaths = 5, RULE_assists = 6, RULE_items = 7, RULE_mythic = 8, RULE_normal = 9, 
		RULE_unique = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"matchup", "side", "champion", "score", "kills", "deaths", "assists", 
			"items", "mythic", "normal", "unique"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' vs. '", "' - '", "'['", "']'", "' : '", "'/'", "', '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VS", "DIVIDER", "BRACKETOPEN", "BRACKETCLOSE", "COLON", "SLASH", 
			"COMMA", "Champion", "NUMBER", "Mythics", "Normal", "Unique", "WS"
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
		public List<TerminalNode> VS() { return getTokens(SaschParser.VS); }
		public TerminalNode VS(int i) {
			return getToken(SaschParser.VS, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				side();
				setState(23);
				match(VS);
				setState(24);
				side();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Champion );
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
		public ChampionContext champion() {
			return getRuleContext(ChampionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SaschParser.COLON, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public TerminalNode DIVIDER() { return getToken(SaschParser.DIVIDER, 0); }
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
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
			setState(30);
			champion();
			setState(31);
			match(COLON);
			setState(32);
			score();
			setState(33);
			match(DIVIDER);
			setState(34);
			items();
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

	public static class ChampionContext extends ParserRuleContext {
		public TerminalNode Champion() { return getToken(SaschParser.Champion, 0); }
		public ChampionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_champion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterChampion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitChampion(this);
		}
	}

	public final ChampionContext champion() throws RecognitionException {
		ChampionContext _localctx = new ChampionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_champion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Champion);
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
		public KillsContext kills() {
			return getRuleContext(KillsContext.class,0);
		}
		public List<TerminalNode> SLASH() { return getTokens(SaschParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(SaschParser.SLASH, i);
		}
		public DeathsContext deaths() {
			return getRuleContext(DeathsContext.class,0);
		}
		public AssistsContext assists() {
			return getRuleContext(AssistsContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_score);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			kills();
			setState(39);
			match(SLASH);
			setState(40);
			deaths();
			setState(41);
			match(SLASH);
			setState(42);
			assists();
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

	public static class KillsContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SaschParser.NUMBER, 0); }
		public KillsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kills; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterKills(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitKills(this);
		}
	}

	public final KillsContext kills() throws RecognitionException {
		KillsContext _localctx = new KillsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kills);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(NUMBER);
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

	public static class DeathsContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SaschParser.NUMBER, 0); }
		public DeathsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deaths; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterDeaths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitDeaths(this);
		}
	}

	public final DeathsContext deaths() throws RecognitionException {
		DeathsContext _localctx = new DeathsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deaths);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(NUMBER);
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

	public static class AssistsContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SaschParser.NUMBER, 0); }
		public AssistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterAssists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitAssists(this);
		}
	}

	public final AssistsContext assists() throws RecognitionException {
		AssistsContext _localctx = new AssistsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NUMBER);
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
		public TerminalNode BRACKETOPEN() { return getToken(SaschParser.BRACKETOPEN, 0); }
		public TerminalNode BRACKETCLOSE() { return getToken(SaschParser.BRACKETCLOSE, 0); }
		public MythicContext mythic() {
			return getRuleContext(MythicContext.class,0);
		}
		public List<NormalContext> normal() {
			return getRuleContexts(NormalContext.class);
		}
		public NormalContext normal(int i) {
			return getRuleContext(NormalContext.class,i);
		}
		public List<UniqueContext> unique() {
			return getRuleContexts(UniqueContext.class);
		}
		public UniqueContext unique(int i) {
			return getRuleContext(UniqueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SaschParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SaschParser.COMMA, i);
		}
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
		enterRule(_localctx, 14, RULE_items);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(50);
				match(BRACKETOPEN);
				setState(51);
				match(BRACKETCLOSE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(52);
				match(BRACKETOPEN);
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Mythics:
					{
					setState(53);
					mythic();
					}
					break;
				case Normal:
					{
					setState(54);
					normal();
					}
					break;
				case Unique:
					{
					setState(55);
					unique();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58);
				match(BRACKETCLOSE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(BRACKETOPEN);
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Mythics:
					{
					setState(61);
					mythic();
					}
					break;
				case Normal:
					{
					setState(62);
					normal();
					}
					break;
				case Unique:
					{
					setState(63);
					unique();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					match(COMMA);
					setState(69);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Normal:
						{
						setState(67);
						normal();
						}
						break;
					case Unique:
						{
						setState(68);
						unique();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(75);
				match(BRACKETCLOSE);
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

	public static class MythicContext extends ParserRuleContext {
		public TerminalNode Mythics() { return getToken(SaschParser.Mythics, 0); }
		public MythicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mythic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterMythic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitMythic(this);
		}
	}

	public final MythicContext mythic() throws RecognitionException {
		MythicContext _localctx = new MythicContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mythic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(Mythics);
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

	public static class NormalContext extends ParserRuleContext {
		public TerminalNode Normal() { return getToken(SaschParser.Normal, 0); }
		public NormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitNormal(this);
		}
	}

	public final NormalContext normal() throws RecognitionException {
		NormalContext _localctx = new NormalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_normal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(Normal);
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

	public static class UniqueContext extends ParserRuleContext {
		public TerminalNode Unique() { return getToken(SaschParser.Unique, 0); }
		public UniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).enterUnique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaschParserListener ) ((SaschParserListener)listener).exitUnique(this);
		}
	}

	public final UniqueContext unique() throws RecognitionException {
		UniqueContext _localctx = new UniqueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(Unique);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t;\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tC\n\t\3\t\3\t\3\t\5\tH"+
		"\n\t\6\tJ\n\t\r\t\16\tK\3\t\3\t\5\tP\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2U\2\34\3\2\2\2\4 \3\2\2\2\6&\3"+
		"\2\2\2\b(\3\2\2\2\n.\3\2\2\2\f\60\3\2\2\2\16\62\3\2\2\2\20O\3\2\2\2\22"+
		"Q\3\2\2\2\24S\3\2\2\2\26U\3\2\2\2\30\31\5\4\3\2\31\32\7\3\2\2\32\33\5"+
		"\4\3\2\33\35\3\2\2\2\34\30\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3"+
		"\2\2\2\37\3\3\2\2\2 !\5\6\4\2!\"\7\7\2\2\"#\5\b\5\2#$\7\4\2\2$%\5\20\t"+
		"\2%\5\3\2\2\2&\'\7\n\2\2\'\7\3\2\2\2()\5\n\6\2)*\7\b\2\2*+\5\f\7\2+,\7"+
		"\b\2\2,-\5\16\b\2-\t\3\2\2\2./\7\13\2\2/\13\3\2\2\2\60\61\7\13\2\2\61"+
		"\r\3\2\2\2\62\63\7\13\2\2\63\17\3\2\2\2\64\65\7\5\2\2\65P\7\6\2\2\66:"+
		"\7\5\2\2\67;\5\22\n\28;\5\24\13\29;\5\26\f\2:\67\3\2\2\2:8\3\2\2\2:9\3"+
		"\2\2\2;<\3\2\2\2<=\7\6\2\2=P\3\2\2\2>B\7\5\2\2?C\5\22\n\2@C\5\24\13\2"+
		"AC\5\26\f\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2CI\3\2\2\2DG\7\t\2\2EH\5\24\13"+
		"\2FH\5\26\f\2GE\3\2\2\2GF\3\2\2\2HJ\3\2\2\2ID\3\2\2\2JK\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2LM\3\2\2\2MN\7\6\2\2NP\3\2\2\2O\64\3\2\2\2O\66\3\2\2\2O"+
		">\3\2\2\2P\21\3\2\2\2QR\7\f\2\2R\23\3\2\2\2ST\7\r\2\2T\25\3\2\2\2UV\7"+
		"\16\2\2V\27\3\2\2\2\b\36:BGKO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}