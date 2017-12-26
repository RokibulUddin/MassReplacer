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
		T__9=10, T__10=11, T__11=12, STRING=13, ID=14, WS=15, COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "STRING", "ID", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'use'", "'folder'", "','", "'sub'", "'exclude'", 
		"'file'", "'replace'", "'='", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "STRING", "ID", "WS", "COMMENT"
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
		case 12:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\7\16"+
		"X\n\16\f\16\16\16[\13\16\3\16\3\16\3\16\3\17\3\17\6\17b\n\17\r\17\16\17"+
		"c\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\7\21n\n\21\f\21\16\21q\13\21"+
		"\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\6\5\2\f\f\17\17$$\4\2C\\aa\5\2\13\f\17\17"+
		"\"\"\5\2\f\f\17\17AA\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t+\3\2\2\2\13\62\3\2"+
		"\2\2\r\64\3\2\2\2\178\3\2\2\2\21@\3\2\2\2\23E\3\2\2\2\25M\3\2\2\2\27O"+
		"\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35_\3\2\2\2\37g\3\2\2\2!k\3\2\2\2#$\7"+
		"}\2\2$\4\3\2\2\2%&\7\177\2\2&\6\3\2\2\2\'(\7w\2\2()\7u\2\2)*\7g\2\2*\b"+
		"\3\2\2\2+,\7h\2\2,-\7q\2\2-.\7n\2\2./\7f\2\2/\60\7g\2\2\60\61\7t\2\2\61"+
		"\n\3\2\2\2\62\63\7.\2\2\63\f\3\2\2\2\64\65\7u\2\2\65\66\7w\2\2\66\67\7"+
		"d\2\2\67\16\3\2\2\289\7g\2\29:\7z\2\2:;\7e\2\2;<\7n\2\2<=\7w\2\2=>\7f"+
		"\2\2>?\7g\2\2?\20\3\2\2\2@A\7h\2\2AB\7k\2\2BC\7n\2\2CD\7g\2\2D\22\3\2"+
		"\2\2EF\7t\2\2FG\7g\2\2GH\7r\2\2HI\7n\2\2IJ\7c\2\2JK\7e\2\2KL\7g\2\2L\24"+
		"\3\2\2\2MN\7?\2\2N\26\3\2\2\2OP\7]\2\2P\30\3\2\2\2QR\7_\2\2R\32\3\2\2"+
		"\2SY\7$\2\2TX\n\2\2\2UV\7^\2\2VX\7$\2\2WT\3\2\2\2WU\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7$\2\2]^\b\16\2\2^\34\3\2"+
		"\2\2_a\7&\2\2`b\t\3\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2"+
		"\2\2ef\b\17\3\2f\36\3\2\2\2gh\t\4\2\2hi\3\2\2\2ij\b\20\4\2j \3\2\2\2k"+
		"o\7%\2\2ln\n\5\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2q"+
		"o\3\2\2\2rs\b\21\4\2s\"\3\2\2\2\7\2WYco\5\3\16\2\3\17\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}