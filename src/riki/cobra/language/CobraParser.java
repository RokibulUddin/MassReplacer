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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, ID=11, WS=12;
	public static final int
		RULE_cobra = 0, RULE_stat = 1, RULE_use = 2, RULE_folder = 3, RULE_excludes = 4, 
		RULE_file = 5, RULE_instructions = 6, RULE_atomic = 7, RULE_assignment = 8, 
		RULE_string = 9;
	public static final String[] ruleNames = {
		"cobra", "stat", "use", "folder", "excludes", "file", "instructions", 
		"atomic", "assignment", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'use'", "'folder'", "','", "'sub'", "'exclude'", 
		"'file'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "STRING", 
		"ID", "WS"
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				stat();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==ID );
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
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				use();
				setState(26);
				match(T__0);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(27);
					instructions();
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(33);
				match(T__1);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				assignment();
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
			setState(38);
			match(T__2);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__5:
					{
					setState(39);
					folder();
					}
					break;
				case T__7:
					{
					setState(40);
					file();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43); 
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
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new FoldersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__3);
				setState(46);
				atomic();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(47);
					match(T__4);
					setState(48);
					atomic();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				_localctx = new SubFolderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__5);
				setState(55);
				folder();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(56);
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
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
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
			setState(61);
			match(T__6);
			setState(62);
			atomic();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(63);
				match(T__4);
				setState(64);
				atomic();
				}
				}
				setState(69);
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
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public ExcludesContext excludes() {
			return getRuleContext(ExcludesContext.class,0);
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
			setState(70);
			match(T__7);
			setState(71);
			atomic();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(72);
				match(T__4);
				setState(73);
				atomic();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(79);
				excludes();
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

	public static class InstructionsContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instructions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			assignment();
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

	public static class AtomicContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitAtomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomic);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				string();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(ID);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(T__8);
			setState(90);
			string();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CobraParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3"+
		"\3\3\3\5\3\'\n\3\3\4\3\4\3\4\6\4,\n\4\r\4\16\4-\3\5\3\5\3\5\3\5\7\5\64"+
		"\n\5\f\5\16\5\67\13\5\3\5\3\5\3\5\5\5<\n\5\5\5>\n\5\3\6\3\6\3\6\3\6\7"+
		"\6D\n\6\f\6\16\6G\13\6\3\7\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\5\7"+
		"S\n\7\3\b\3\b\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\2\2\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\2\2b\2\27\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b=\3"+
		"\2\2\2\n?\3\2\2\2\fH\3\2\2\2\16T\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24^\3"+
		"\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\3\3\2\2\2\33\34\5\6\4\2\34 \7\3\2\2\35\37\5\16\b\2\36\35\3\2"+
		"\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\4\2\2"+
		"$\'\3\2\2\2%\'\5\22\n\2&\33\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2(+\7\5\2\2),"+
		"\5\b\5\2*,\5\f\7\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2."+
		"\7\3\2\2\2/\60\7\6\2\2\60\65\5\20\t\2\61\62\7\7\2\2\62\64\5\20\t\2\63"+
		"\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66>\3\2\2\2\67\65"+
		"\3\2\2\289\7\b\2\29;\5\b\5\2:<\5\n\6\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2="+
		"/\3\2\2\2=8\3\2\2\2>\t\3\2\2\2?@\7\t\2\2@E\5\20\t\2AB\7\7\2\2BD\5\20\t"+
		"\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GE\3\2\2\2HI\7\n"+
		"\2\2IN\5\20\t\2JK\7\7\2\2KM\5\20\t\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2OR\3\2\2\2PN\3\2\2\2QS\5\n\6\2RQ\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TU"+
		"\5\22\n\2U\17\3\2\2\2VY\5\24\13\2WY\7\r\2\2XV\3\2\2\2XW\3\2\2\2Y\21\3"+
		"\2\2\2Z[\7\r\2\2[\\\7\13\2\2\\]\5\24\13\2]\23\3\2\2\2^_\7\f\2\2_\25\3"+
		"\2\2\2\16\31 &+-\65;=ENRX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}