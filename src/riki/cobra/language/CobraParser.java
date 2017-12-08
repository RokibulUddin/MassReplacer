// Generated from Cobra.g4 by ANTLR 4.7

package riki.cobra.language;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CobraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING=9, 
		WS=10;
	public static final int
		RULE_cobra = 0, RULE_stat = 1, RULE_use = 2, RULE_folder = 3, RULE_excludes = 4, 
		RULE_file = 5;
	public static final String[] ruleNames = {
		"cobra", "stat", "use", "folder", "excludes", "file"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'use'", "'folder'", "','", "'sub'", "'excludes'", 
		"'file'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "STRING", "WS"
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

	@Override
	public String getGrammarFileName() { return "Cobra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CobraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CobraContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public CobraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobra; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitCobra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CobraContext cobra() throws RecognitionException {
		CobraContext _localctx = new CobraContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cobra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class StatContext extends ParserRuleContext {
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			use();
			setState(18);
			match(T__0);
			setState(19);
			match(T__1);
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

	public static class UseContext extends ParserRuleContext {
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	 
		public UseContext() { }
		public void copyFrom(UseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UseStatContext extends UseContext {
		public List<FolderContext> folder() {
			return getRuleContexts(FolderContext.class);
		}
		public FolderContext folder(int i) {
			return getRuleContext(FolderContext.class,i);
		}
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public UseStatContext(UseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitUseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_use);
		int _la;
		try {
			_localctx = new UseStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(T__2);
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__5:
					{
					setState(22);
					folder();
					}
					break;
				case T__7:
					{
					setState(23);
					file();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7))) != 0) );
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

	public static class FolderContext extends ParserRuleContext {
		public FolderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folder; }
	 
		public FolderContext() { }
		public void copyFrom(FolderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubFolderContext extends FolderContext {
		public FolderContext folder() {
			return getRuleContext(FolderContext.class,0);
		}
		public ExcludesContext excludes() {
			return getRuleContext(ExcludesContext.class,0);
		}
		public SubFolderContext(FolderContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitSubFolder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FoldersContext extends FolderContext {
		public List<TerminalNode> STRING() { return getTokens(CobraParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CobraParser.STRING, i);
		}
		public FoldersContext(FolderContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitFolders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FolderContext folder() throws RecognitionException {
		FolderContext _localctx = new FolderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_folder);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new FoldersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__3);
				setState(29);
				match(STRING);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(30);
					match(T__4);
					setState(31);
					match(STRING);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				_localctx = new SubFolderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__5);
				setState(38);
				folder();
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(39);
					excludes();
					}
					break;
				}
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

	public static class ExcludesContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(CobraParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CobraParser.STRING, i);
		}
		public ExcludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitExcludes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcludesContext excludes() throws RecognitionException {
		ExcludesContext _localctx = new ExcludesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_excludes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__6);
			setState(45);
			match(STRING);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(46);
				match(T__4);
				setState(47);
				match(STRING);
				}
				}
				setState(52);
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

	public static class FileContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(CobraParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CobraParser.STRING, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__7);
			setState(54);
			match(STRING);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(55);
				match(T__4);
				setState(56);
				match(STRING);
				}
				}
				setState(61);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fA\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\6\4\33\n\4\r\4\16\4\34\3\5\3\5\3\5\3\5\7\5#\n\5\f"+
		"\5\16\5&\13\5\3\5\3\5\3\5\5\5+\n\5\5\5-\n\5\3\6\3\6\3\6\3\6\7\6\63\n\6"+
		"\f\6\16\6\66\13\6\3\7\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\7\2\2\b\2"+
		"\4\6\b\n\f\2\2\2B\2\17\3\2\2\2\4\23\3\2\2\2\6\27\3\2\2\2\b,\3\2\2\2\n"+
		".\3\2\2\2\f\67\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17"+
		"\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\25\7\3\2\2\25\26"+
		"\7\4\2\2\26\5\3\2\2\2\27\32\7\5\2\2\30\33\5\b\5\2\31\33\5\f\7\2\32\30"+
		"\3\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\7"+
		"\3\2\2\2\36\37\7\6\2\2\37$\7\13\2\2 !\7\7\2\2!#\7\13\2\2\" \3\2\2\2#&"+
		"\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%-\3\2\2\2&$\3\2\2\2\'(\7\b\2\2(*\5\b\5\2"+
		")+\5\n\6\2*)\3\2\2\2*+\3\2\2\2+-\3\2\2\2,\36\3\2\2\2,\'\3\2\2\2-\t\3\2"+
		"\2\2./\7\t\2\2/\64\7\13\2\2\60\61\7\7\2\2\61\63\7\13\2\2\62\60\3\2\2\2"+
		"\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\64\3\2\2\2"+
		"\678\7\n\2\28=\7\13\2\29:\7\7\2\2:<\7\13\2\2;9\3\2\2\2<?\3\2\2\2=;\3\2"+
		"\2\2=>\3\2\2\2>\r\3\2\2\2?=\3\2\2\2\n\21\32\34$*,\64=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}