// Generated from Cobra.g4 by ANTLR 4.4

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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, STRING=19, ID=20, WS=21, COMMENT=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'file'", "'replace'", "'use'", "'to'", "'exit'", "'sub'", 
		"'['", "'exclude'", "'{'", "'on'", "']'", "'='", "'with'", "'}'", "'from'", 
		"'folder'", "','", "'backup'", "STRING", "ID", "WS", "COMMENT"
	};
	public static final int
		RULE_cobra = 0, RULE_stat = 1, RULE_backup = 2, RULE_use = 3, RULE_folder = 4, 
		RULE_excludes = 5, RULE_file = 6, RULE_instructions = 7, RULE_cmd = 8, 
		RULE_replace = 9, RULE_replacefrom = 10, RULE_assignment = 11, RULE_array = 12, 
		RULE_atomic = 13, RULE_tofind = 14, RULE_replacewith = 15, RULE_string = 16;
	public static final String[] ruleNames = {
		"cobra", "stat", "backup", "use", "folder", "excludes", "file", "instructions", 
		"cmd", "replace", "replacefrom", "assignment", "array", "atomic", "tofind", 
		"replacewith", "string"
	};

	@Override
	public String getGrammarFileName() { return "Cobra.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); stat();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__0) | (1L << ID))) != 0) );
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BackupContext backup() {
			return getRuleContext(BackupContext.class,0);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
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
			setState(51);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); use();
				setState(40); match(T__9);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << ID))) != 0)) {
					{
					{
					setState(41); instructions();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47); match(T__4);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); assignment();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); backup();
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
			setState(53); match(T__0);
			setState(54); match(T__8);
			setState(55); string();
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
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public FolderContext folder(int i) {
			return getRuleContext(FolderContext.class,i);
		}
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
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
			setState(57); match(T__15);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				switch (_input.LA(1)) {
				case T__12:
				case T__2:
					{
					setState(58); folder();
					}
					break;
				case T__17:
					{
					setState(59); file();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__12) | (1L << T__2))) != 0) );
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
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
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
			setState(78);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new FoldersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(T__2);
				setState(65); atomic();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(66); match(T__1);
					setState(67); atomic();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				_localctx = new SubFolderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(T__12);
				setState(74); folder();
				setState(76);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(75); excludes();
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
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
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
			setState(80); match(T__10);
			setState(81); atomic();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(82); match(T__1);
				setState(83); atomic();
				}
				}
				setState(88);
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
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public ExcludesContext excludes() {
			return getRuleContext(ExcludesContext.class,0);
		}
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
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
			setState(89); match(T__17);
			setState(90); atomic();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(91); match(T__1);
				setState(92); atomic();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(98); excludes();
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
		public ReplaceContext replace() {
			return getRuleContext(ReplaceContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReplacefromContext replacefrom() {
			return getRuleContext(ReplacefromContext.class,0);
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
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); replace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); replacefrom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104); cmd();
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
			setState(107); match(T__13);
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
			setState(109); match(T__16);
			setState(110); tofind();
			setState(111); match(T__1);
			setState(112); replacewith();
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

	public static class ReplacefromContext extends ParserRuleContext {
		public AtomicContext from;
		public AtomicContext to;
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public ReplacewithContext replacewith() {
			return getRuleContext(ReplacewithContext.class,0);
		}
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public ReplacefromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacefrom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobraVisitor ) return ((CobraVisitor<? extends T>)visitor).visitReplacefrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplacefromContext replacefrom() throws RecognitionException {
		ReplacefromContext _localctx = new ReplacefromContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_replacefrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(T__16);
			setState(115); match(T__3);
			setState(116); ((ReplacefromContext)_localctx).from = atomic();
			setState(117); match(T__14);
			setState(118); ((ReplacefromContext)_localctx).to = atomic();
			setState(119); match(T__5);
			setState(120); replacewith();
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
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(ID);
			setState(123); match(T__6);
			setState(124); atomic();
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
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
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
		enterRule(_localctx, 24, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(T__11);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127); atomic();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << STRING) | (1L << ID))) != 0) );
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(132); match(T__1);
				setState(133); atomic();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139); match(T__7);
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
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_atomic);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); string();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); array();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); match(ID);
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
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
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
		enterRule(_localctx, 28, RULE_tofind);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146); atomic();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147); match(T__1);
					setState(148); atomic();
					}
					} 
				}
				setState(153);
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
		enterRule(_localctx, 30, RULE_replacewith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); atomic();
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
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3"+
		"\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5?\n\5\r\5\16\5@\3\6"+
		"\3\6\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\6\3\6\3\6\5\6O\n\6\5\6Q\n\6\3\7"+
		"\3\7\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\b"+
		"c\13\b\3\b\5\bf\n\b\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\6\16"+
		"\u0083\n\16\r\16\16\16\u0084\3\16\3\16\7\16\u0089\n\16\f\16\16\16\u008c"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\5\17\u0093\n\17\3\20\3\20\3\20\7\20\u0098"+
		"\n\20\f\20\16\20\u009b\13\20\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"\2\2\u00a3\2%\3\2\2\2\4\65\3\2\2\2\6\67"+
		"\3\2\2\2\b;\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16[\3\2\2\2\20k\3\2\2\2\22m"+
		"\3\2\2\2\24o\3\2\2\2\26t\3\2\2\2\30|\3\2\2\2\32\u0080\3\2\2\2\34\u0092"+
		"\3\2\2\2\36\u0094\3\2\2\2 \u009c\3\2\2\2\"\u009e\3\2\2\2$&\5\4\3\2%$\3"+
		"\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\5\b\5\2*.\7\13\2"+
		"\2+-\5\20\t\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60"+
		".\3\2\2\2\61\62\7\20\2\2\62\66\3\2\2\2\63\66\5\30\r\2\64\66\5\6\4\2\65"+
		")\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\24\2\289\7\f"+
		"\2\29:\5\"\22\2:\7\3\2\2\2;>\7\5\2\2<?\5\n\6\2=?\5\16\b\2><\3\2\2\2>="+
		"\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\t\3\2\2\2BC\7\22\2\2CH\5\34\17"+
		"\2DE\7\23\2\2EG\5\34\17\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IQ\3"+
		"\2\2\2JH\3\2\2\2KL\7\b\2\2LN\5\n\6\2MO\5\f\7\2NM\3\2\2\2NO\3\2\2\2OQ\3"+
		"\2\2\2PB\3\2\2\2PK\3\2\2\2Q\13\3\2\2\2RS\7\n\2\2SX\5\34\17\2TU\7\23\2"+
		"\2UW\5\34\17\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2ZX\3"+
		"\2\2\2[\\\7\3\2\2\\a\5\34\17\2]^\7\23\2\2^`\5\34\17\2_]\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2df\5\f\7\2ed\3\2\2\2ef\3\2"+
		"\2\2f\17\3\2\2\2gl\5\30\r\2hl\5\24\13\2il\5\26\f\2jl\5\22\n\2kg\3\2\2"+
		"\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\21\3\2\2\2mn\7\7\2\2n\23\3\2\2\2op\7"+
		"\4\2\2pq\5\36\20\2qr\7\23\2\2rs\5 \21\2s\25\3\2\2\2tu\7\4\2\2uv\7\21\2"+
		"\2vw\5\34\17\2wx\7\6\2\2xy\5\34\17\2yz\7\17\2\2z{\5 \21\2{\27\3\2\2\2"+
		"|}\7\26\2\2}~\7\16\2\2~\177\5\34\17\2\177\31\3\2\2\2\u0080\u0082\7\t\2"+
		"\2\u0081\u0083\5\34\17\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008a\3\2\2\2\u0086\u0087\7\23"+
		"\2\2\u0087\u0089\5\34\17\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\r\2\2\u008e\33\3\2\2\2\u008f\u0093\5\"\22\2\u0090\u0093"+
		"\5\32\16\2\u0091\u0093\7\26\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0092\u0091\3\2\2\2\u0093\35\3\2\2\2\u0094\u0099\5\34\17\2\u0095\u0096"+
		"\7\23\2\2\u0096\u0098\5\34\17\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\37\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\5\34\17\2\u009d!\3\2\2\2\u009e\u009f\7\25\2\2\u009f"+
		"#\3\2\2\2\22\'.\65>@HNPXaek\u0084\u008a\u0092\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}