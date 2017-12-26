// Generated from Cobra.g4 by ANTLR 4.7.1

package riki.cobra.language;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CobraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, ID=15, WS=16, COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "STRING", "ID", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'use'", "'folder'", "','", "'sub'", "'exclude'", 
		"'file'", "'exit'", "'replace'", "'='", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "STRING", "ID", "WS", "COMMENT"
	};
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


	public CobraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cobra.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1));
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText(getText().substring(1, getText().length()));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17_\n\17\f\17\16\17b\13\17\3\17\3\17"+
		"\3\17\3\20\3\20\6\20i\n\20\r\20\16\20j\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\7\22u\n\22\f\22\16\22x\13\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3"+
		"\2\6\5\2\f\f\17\17$$\4\2C\\aa\5\2\13\f\17\17\"\"\5\2\f\f\17\17AA\2~\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t-\3\2\2\2\13\64\3\2\2\2\r\66\3\2"+
		"\2\2\17:\3\2\2\2\21B\3\2\2\2\23G\3\2\2\2\25L\3\2\2\2\27T\3\2\2\2\31V\3"+
		"\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37f\3\2\2\2!n\3\2\2\2#r\3\2\2\2%&\7}\2"+
		"\2&\4\3\2\2\2\'(\7\177\2\2(\6\3\2\2\2)*\7w\2\2*+\7u\2\2+,\7g\2\2,\b\3"+
		"\2\2\2-.\7h\2\2./\7q\2\2/\60\7n\2\2\60\61\7f\2\2\61\62\7g\2\2\62\63\7"+
		"t\2\2\63\n\3\2\2\2\64\65\7.\2\2\65\f\3\2\2\2\66\67\7u\2\2\678\7w\2\28"+
		"9\7d\2\29\16\3\2\2\2:;\7g\2\2;<\7z\2\2<=\7e\2\2=>\7n\2\2>?\7w\2\2?@\7"+
		"f\2\2@A\7g\2\2A\20\3\2\2\2BC\7h\2\2CD\7k\2\2DE\7n\2\2EF\7g\2\2F\22\3\2"+
		"\2\2GH\7g\2\2HI\7z\2\2IJ\7k\2\2JK\7v\2\2K\24\3\2\2\2LM\7t\2\2MN\7g\2\2"+
		"NO\7r\2\2OP\7n\2\2PQ\7c\2\2QR\7e\2\2RS\7g\2\2S\26\3\2\2\2TU\7?\2\2U\30"+
		"\3\2\2\2VW\7]\2\2W\32\3\2\2\2XY\7_\2\2Y\34\3\2\2\2Z`\7$\2\2[_\n\2\2\2"+
		"\\]\7^\2\2]_\7$\2\2^[\3\2\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"ac\3\2\2\2b`\3\2\2\2cd\7$\2\2de\b\17\2\2e\36\3\2\2\2fh\7&\2\2gi\t\3\2"+
		"\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\20\3\2m \3\2"+
		"\2\2no\t\4\2\2op\3\2\2\2pq\b\21\4\2q\"\3\2\2\2rv\7%\2\2su\n\5\2\2ts\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\b\22\4\2z$"+
		"\3\2\2\2\7\2^`jv\5\3\17\2\3\20\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}