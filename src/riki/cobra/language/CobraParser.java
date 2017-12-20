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
		T__9=10, T__10=11, T__11=12, STRING=13, ID=14, WS=15;
	public static final int
		RULE_cobra = 0, RULE_stat = 1, RULE_use = 2, RULE_folder = 3, RULE_excludes = 4, 
		RULE_file = 5, RULE_instructions = 6, RULE_replace = 7, RULE_assignment = 8, 
		RULE_array = 9, RULE_atomic = 10, RULE_tofind = 11, RULE_replacewith = 12, 
		RULE_string = 13;
	public static final String[] ruleNames = {
		"cobra", "stat", "use", "folder", "excludes", "file", "instructions", 
		"replace", "assignment", "array", "atomic", "tofind", "replacewith", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'use'", "'folder'", "','", "'sub'", "'exclude'", 
		"'file'", "'replace'", "'='", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "STRING", "ID", "WS"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				stat();
				}
				}
				setState(31); 
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				use();
				setState(34);
				match(T__0);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8 || _la==ID) {
					{
					{
					setState(35);
					instructions();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				match(T__1);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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
			setState(46);
			match(T__2);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__5:
					{
					setState(47);
					folder();
					}
					break;
				case T__7:
					{
					setState(48);
					file();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51); 
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new FoldersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(T__3);
				setState(54);
				atomic();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(55);
					match(T__4);
					setState(56);
					atomic();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				_localctx = new SubFolderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__5);
				setState(63);
				folder();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(64);
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
			setState(69);
			match(T__6);
			setState(70);
			atomic();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(71);
				match(T__4);
				setState(72);
				atomic();
				}
				}
				setState(77);
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
			setState(78);
			match(T__7);
			setState(79);
			atomic();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(80);
				match(T__4);
				setState(81);
				atomic();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(87);
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
		public ReplaceContext replace() {
			return getRuleContext(ReplaceContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				assignment();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				replace();
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

	public static class ReplaceContext extends ParserRuleContext {
		public TofindContext tofind() {
			return getRuleContext(TofindContext.class,0);
		}
		public ReplacewithContext replacewith() {
			return getRuleContext(ReplacewithContext.class,0);
		}
		public ReplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitReplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceContext replace() throws RecognitionException {
		ReplaceContext _localctx = new ReplaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_replace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__8);
			setState(95);
			tofind();
			setState(96);
			match(T__4);
			setState(97);
			replacewith();
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
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
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
			setState(99);
			match(ID);
			setState(100);
			match(T__9);
			setState(101);
			atomic();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__10);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				atomic();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << STRING) | (1L << ID))) != 0) );
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(109);
				match(T__4);
				setState(110);
				atomic();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__11);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
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
		enterRule(_localctx, 20, RULE_atomic);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				string();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				array();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
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

	public static class TofindContext extends ParserRuleContext {
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public TofindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tofind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitTofind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TofindContext tofind() throws RecognitionException {
		TofindContext _localctx = new TofindContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tofind);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			atomic();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(T__4);
					setState(125);
					atomic();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ReplacewithContext extends ParserRuleContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public ReplacewithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacewith; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitReplacewith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplacewithContext replacewith() throws RecognitionException {
		ReplacewithContext _localctx = new ReplacewithContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replacewith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			atomic();
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
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3"+
		"\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\5\5"+
		"\5D\n\5\5\5F\n\5\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3\7\3"+
		"\7\7\7U\n\7\f\7\16\7X\13\7\3\7\5\7[\n\7\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\6\13l\n\13\r\13\16\13m\3\13\3\13\7\13"+
		"r\n\13\f\13\16\13u\13\13\3\13\3\13\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\7"+
		"\r\u0081\n\r\f\r\16\r\u0084\13\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u008c\2\37\3\2\2\2\4.\3\2\2\2\6\60"+
		"\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fP\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22e"+
		"\3\2\2\2\24i\3\2\2\2\26{\3\2\2\2\30}\3\2\2\2\32\u0085\3\2\2\2\34\u0087"+
		"\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"\3\3\2\2\2#$\5\6\4\2$(\7\3\2\2%\'\5\16\b\2&%\3\2\2\2\'*\3\2\2\2(&\3\2"+
		"\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\4\2\2,/\3\2\2\2-/\5\22\n\2.#\3"+
		"\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\63\7\5\2\2\61\64\5\b\5\2\62\64\5\f\7\2"+
		"\63\61\3\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2"+
		"\66\7\3\2\2\2\678\7\6\2\28=\5\26\f\29:\7\7\2\2:<\5\26\f\2;9\3\2\2\2<?"+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>F\3\2\2\2?=\3\2\2\2@A\7\b\2\2AC\5\b\5\2B"+
		"D\5\n\6\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2E\67\3\2\2\2E@\3\2\2\2F\t\3\2\2"+
		"\2GH\7\t\2\2HM\5\26\f\2IJ\7\7\2\2JL\5\26\f\2KI\3\2\2\2LO\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2N\13\3\2\2\2OM\3\2\2\2PQ\7\n\2\2QV\5\26\f\2RS\7\7\2\2SU"+
		"\5\26\f\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"Y[\5\n\6\2ZY\3\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\_\5\22\n\2]_\5\20\t\2^\\\3"+
		"\2\2\2^]\3\2\2\2_\17\3\2\2\2`a\7\13\2\2ab\5\30\r\2bc\7\7\2\2cd\5\32\16"+
		"\2d\21\3\2\2\2ef\7\20\2\2fg\7\f\2\2gh\5\26\f\2h\23\3\2\2\2ik\7\r\2\2j"+
		"l\5\26\f\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2op\7\7\2\2"+
		"pr\5\26\f\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2"+
		"\2vw\7\16\2\2w\25\3\2\2\2x|\5\34\17\2y|\5\24\13\2z|\7\20\2\2{x\3\2\2\2"+
		"{y\3\2\2\2{z\3\2\2\2|\27\3\2\2\2}\u0082\5\26\f\2~\177\7\7\2\2\177\u0081"+
		"\5\26\f\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\31\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5\26\f"+
		"\2\u0086\33\3\2\2\2\u0087\u0088\7\17\2\2\u0088\35\3\2\2\2\22!(.\63\65"+
		"=CEMVZ^ms{\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}