// Generated from Cobra.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, STRING=16, 
		ID=17, WS=18, COMMENT=19;
	public static final int
		RULE_cobra = 0, RULE_stat = 1, RULE_backup = 2, RULE_use = 3, RULE_folder = 4, 
		RULE_excludes = 5, RULE_file = 6, RULE_instructions = 7, RULE_cmd = 8, 
		RULE_replace = 9, RULE_assignment = 10, RULE_array = 11, RULE_atomic = 12, 
		RULE_tofind = 13, RULE_replacewith = 14, RULE_string = 15;
	public static final String[] ruleNames = {
		"cobra", "stat", "backup", "use", "folder", "excludes", "file", "instructions", 
		"cmd", "replace", "assignment", "array", "atomic", "tofind", "replacewith", 
		"string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'backup'", "'on'", "'use'", "'folder'", "','", "'sub'", 
		"'exclude'", "'file'", "'exit'", "'replace'", "'='", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "STRING", "ID", "WS", "COMMENT"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				stat();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ID))) != 0) );
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
		public BackupContext backup() {
			return getRuleContext(BackupContext.class,0);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				use();
				setState(38);
				match(T__0);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << ID))) != 0)) {
					{
					{
					setState(39);
					instructions();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45);
				match(T__1);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				assignment();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				backup();
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

	public static class BackupContext extends ParserRuleContext {
		public BackupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backup; }
	 
		public BackupContext() { }
		public void copyFrom(BackupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackuponContext extends BackupContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BackuponContext(BackupContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitBackupon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackupContext backup() throws RecognitionException {
		BackupContext _localctx = new BackupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_backup);
		try {
			_localctx = new BackuponContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__2);
			setState(52);
			match(T__3);
			setState(53);
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
		enterRule(_localctx, 6, RULE_use);
		int _la;
		try {
			_localctx = new UseStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__7:
					{
					setState(56);
					folder();
					}
					break;
				case T__9:
					{
					setState(57);
					file();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__9))) != 0) );
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
		enterRule(_localctx, 8, RULE_folder);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new FoldersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__5);
				setState(63);
				atomic();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(64);
					match(T__6);
					setState(65);
					atomic();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__7:
				_localctx = new SubFolderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__7);
				setState(72);
				folder();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(73);
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
		enterRule(_localctx, 10, RULE_excludes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__8);
			setState(79);
			atomic();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(80);
				match(T__6);
				setState(81);
				atomic();
				}
				}
				setState(86);
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
		enterRule(_localctx, 12, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__9);
			setState(88);
			atomic();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(89);
				match(T__6);
				setState(90);
				atomic();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(96);
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
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
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
		enterRule(_localctx, 14, RULE_instructions);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				assignment();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				replace();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				cmd();
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

	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExitContext extends CmdContext {
		public ExitContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			_localctx = new ExitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__10);
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
		enterRule(_localctx, 18, RULE_replace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__11);
			setState(107);
			tofind();
			setState(108);
			match(T__6);
			setState(109);
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
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(T__12);
			setState(113);
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
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__13);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				atomic();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << STRING) | (1L << ID))) != 0) );
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(121);
				match(T__6);
				setState(122);
				atomic();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(T__14);
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
		enterRule(_localctx, 24, RULE_atomic);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				string();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				array();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
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
		enterRule(_localctx, 26, RULE_tofind);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			atomic();
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(T__6);
					setState(137);
					atomic();
					}
					} 
				}
				setState(142);
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
		enterRule(_localctx, 28, RULE_replacewith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5=\n\5\r\5\16\5>\3\6\3\6\3\6\3"+
		"\6\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\6\5\6M\n\6\5\6O\n\6\3\7\3\7\3\7\3"+
		"\7\7\7U\n\7\f\7\16\7X\13\7\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\b"+
		"\5\bd\n\b\3\t\3\t\3\t\5\ti\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\6\rx\n\r\r\r\16\ry\3\r\3\r\7\r~\n\r\f\r\16\r\u0081"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17\7\17\u008d"+
		"\n\17\f\17\16\17\u0090\13\17\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \2\2\2\u0098\2#\3\2\2\2\4\63\3\2\2\2\6\65"+
		"\3\2\2\2\b9\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16Y\3\2\2\2\20h\3\2\2\2\22j"+
		"\3\2\2\2\24l\3\2\2\2\26q\3\2\2\2\30u\3\2\2\2\32\u0087\3\2\2\2\34\u0089"+
		"\3\2\2\2\36\u0091\3\2\2\2 \u0093\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\5\b\5\2(,\7\3\2\2)+\5\20\t\2*)\3"+
		"\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\4\2\2\60"+
		"\64\3\2\2\2\61\64\5\26\f\2\62\64\5\6\4\2\63\'\3\2\2\2\63\61\3\2\2\2\63"+
		"\62\3\2\2\2\64\5\3\2\2\2\65\66\7\5\2\2\66\67\7\6\2\2\678\5 \21\28\7\3"+
		"\2\2\29<\7\7\2\2:=\5\n\6\2;=\5\16\b\2<:\3\2\2\2<;\3\2\2\2=>\3\2\2\2><"+
		"\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@A\7\b\2\2AF\5\32\16\2BC\7\t\2\2CE\5\32\16"+
		"\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GO\3\2\2\2HF\3\2\2\2IJ\7\n\2"+
		"\2JL\5\n\6\2KM\5\f\7\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2N@\3\2\2\2NI\3\2\2"+
		"\2O\13\3\2\2\2PQ\7\13\2\2QV\5\32\16\2RS\7\t\2\2SU\5\32\16\2TR\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\r\3\2\2\2XV\3\2\2\2YZ\7\f\2\2Z_\5\32\16"+
		"\2[\\\7\t\2\2\\^\5\32\16\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3"+
		"\2\2\2a_\3\2\2\2bd\5\f\7\2cb\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ei\5\26\f\2"+
		"fi\5\24\13\2gi\5\22\n\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\21\3\2\2\2jk\7"+
		"\r\2\2k\23\3\2\2\2lm\7\16\2\2mn\5\34\17\2no\7\t\2\2op\5\36\20\2p\25\3"+
		"\2\2\2qr\7\23\2\2rs\7\17\2\2st\5\32\16\2t\27\3\2\2\2uw\7\20\2\2vx\5\32"+
		"\16\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\177\3\2\2\2{|\7\t\2\2|"+
		"~\5\32\16\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\21\2\2\u0083\31\3\2\2\2"+
		"\u0084\u0088\5 \21\2\u0085\u0088\5\30\r\2\u0086\u0088\7\23\2\2\u0087\u0084"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\33\3\2\2\2\u0089"+
		"\u008e\5\32\16\2\u008a\u008b\7\t\2\2\u008b\u008d\5\32\16\2\u008c\u008a"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\35\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5\32\16\2\u0092\37\3\2\2\2"+
		"\u0093\u0094\7\22\2\2\u0094!\3\2\2\2\22%,\63<>FLNV_chy\177\u0087\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}