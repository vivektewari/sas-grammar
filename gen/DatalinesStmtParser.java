// Generated from /home/pooja/PycharmProjects/sas-grammar/DatalinesStmt.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DatalinesStmtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, COMMENT=6, LINE_COMMENT=7, ABORT=8, 
		ABEND=9, CANCEL=10, FILE=11, RETURN=12, NOLIST=13, ARRAY=14, ARRAY_NUMERIC_ELEMENTS=15, 
		ARRAY_CHARACTER_ELEMENTS=16, ARRAY_ALL_ELEMENTS=17, BY=18, GROUPFORMAT=19, 
		NOTSORTED=20, DESCENDING=21, CALL=22, DATALINES=23, CARDS=24, LINES=25, 
		DATALINES4=26, CARDS4=27, LINES4=28, END_DATALINES4=29, SUM=30, INFILE=31, 
		DISK=32, DUMMY=33, GTERM=34, PIPE=35, PLOTTER=36, PRINTER=37, TAPE=38, 
		TEMP=39, TERMINAL=40, UPRINTER=41, DSD=42, EXPANDTABS=43, NOEXPANDTABS=44, 
		FLOWOVER=45, MISSOVER=46, PAD=47, NOPAD=48, SCANOVER=49, SHAREBUFFERS=50, 
		STOPOVER=51, TRUNCOVER=52, V_INFILE_=53, SEMICOLON=54, END=55, LENGTH=56, 
		QKUPCASE=57, SYSEVALF=58, EVAL=59, LET=60, QSCAN=61, SYSEXEC=62, ACT=63, 
		LIST=64, QSUBSTR=65, SYSFUNC=66, ACTIVATE=67, GLOBAL=68, LISTM=69, QSYSFUNC=70, 
		SYSGET=71, BQUOTE=72, GO=73, LOCAL=74, QUOTE=75, SYSRPUT=76, GOTO=77, 
		MACRO=78, QUPCASE=79, THEN=80, CLEAR=81, IF=82, MEND=83, RESOLVE=84, TO=85, 
		CLOSE=86, INC=87, PAUSE=88, TSO=89, CMS=90, INCLUDE=91, NRSTR=92, RUN=93, 
		UNQUOTE=94, COMANDR=95, INDEX=96, ON=97, SAVE=98, UNSTR=99, COPY=100, 
		OPEN=101, SCAN=102, UNTIL=103, DEACT=104, INPUT=105, PUT=106, STOP=107, 
		UPCASE=108, DEL=109, KCMPRES=110, NRBQUOTE=111, STR=112, WHILE=113, DELETE=114, 
		KINDEX=115, NRQUOTE=116, SYSCALL=117, WINDOW=118, DISPLAY=119, KLEFT=120, 
		METASYM=121, SUBSTR=122, DMIDSPLY=123, KLENGTH=124, QKCMPRES=125, SUPERQ=126, 
		DMISPLIT=127, KSCAN=128, QKLEFT=129, SYMDEL=130, DO=131, KSUBSTR=132, 
		QKSCAN=133, SYMEXIST=134, EDIT=135, KTRIM=136, QKSUBSTR=137, SYMGLOBL=138, 
		ELSE=139, KUPCASE=140, QKTRIM=141, SYMLOCAL=142, Tk_NULL=143, EXECUTE=144, 
		DESCRIBE=145, LIBNAME=146, DEBUG=147, NESTING=148, STACK=149, READ=150, 
		PW=151, SOURCE=152, VIEW=153, PGM=154, ENCRYPT=155, NOSAVE=156, SET=157, 
		ALTER=158, INPUT_ODS=159, DATE=160, DATETIME=161, DDMMYY=162, INFORMAT_COMMA=163, 
		INFORMAT_CHAR=164, DROP=165, PROC=166, ANOVA=167, MEANS=168, REG=169, 
		CORR=170, SGPLOT=171, PRINT=172, DATA=173, Informat=174, DOLLAR=175, EQ=176, 
		NE=177, GT=178, LT=179, GE=180, LE=181, IN=182, EQC=183, NEC=184, GTC=185, 
		LTC=186, GEC=187, LEC=188, INColon=189, AND=190, OR=191, NOT=192, MIN=193, 
		MAX=194, DateLiteral=195, TimeLiteral=196, DateTimeLiteral=197, BitLiteral=198, 
		NameLiteral=199, HexLiteral=200, STRINGLITERAL=201, INT=202, FloatingPointLiteral=203, 
		Number=204, DOT=205, AT=206, EQUAL=207, COMMA=208, LBracket=209, RBracket=210, 
		OF=211, COLON=212, PERCENT=213, ADD=214, SUB=215, MUL=216, DIV=217, LParentheses=218, 
		RParentheses=219, LBraces=220, RBraces=221, LSqBracket=222, RSqBracket=223, 
		Identifier=224;
	public static final int
		RULE_datalines_main = 0, RULE_datalines_stmt = 1, RULE_datalines4_stmt = 2, 
		RULE_expression = 3, RULE_expressionList = 4, RULE_of_var_list = 5, RULE_identifiers_list = 6, 
		RULE_in_var_list = 7, RULE_colonInts = 8, RULE_literal = 9, RULE_variables = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"datalines_main", "datalines_stmt", "datalines4_stmt", "expression", 
			"expressionList", "of_var_list", "identifiers_list", "in_var_list", "colonInts", 
			"literal", "variables"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'**'", "'||'", "'!!'", "'of'", null, null, null, "'abort'", "'abend'", 
			"'cancel'", "'file'", "'return'", "'nolist'", "'array'", "'_NUMERIC_'", 
			"'_CHARACTER_'", "'_ALL_'", "'by'", "'groupformat'", "'notsorted'", "'descending'", 
			"'call'", "'datalines'", "'cards'", "'lines'", "'datalines4'", "'cards4'", 
			"'lines4'", "';;;;'", null, "'infile'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "';'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'$'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'><'", "'<>'", null, null, null, null, null, null, null, null, null, 
			null, "'.'", "'@'", "'='", "','", null, null, null, "':'", "'%'", "'+'", 
			"'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", "ABORT", 
			"ABEND", "CANCEL", "FILE", "RETURN", "NOLIST", "ARRAY", "ARRAY_NUMERIC_ELEMENTS", 
			"ARRAY_CHARACTER_ELEMENTS", "ARRAY_ALL_ELEMENTS", "BY", "GROUPFORMAT", 
			"NOTSORTED", "DESCENDING", "CALL", "DATALINES", "CARDS", "LINES", "DATALINES4", 
			"CARDS4", "LINES4", "END_DATALINES4", "SUM", "INFILE", "DISK", "DUMMY", 
			"GTERM", "PIPE", "PLOTTER", "PRINTER", "TAPE", "TEMP", "TERMINAL", "UPRINTER", 
			"DSD", "EXPANDTABS", "NOEXPANDTABS", "FLOWOVER", "MISSOVER", "PAD", "NOPAD", 
			"SCANOVER", "SHAREBUFFERS", "STOPOVER", "TRUNCOVER", "V_INFILE_", "SEMICOLON", 
			"END", "LENGTH", "QKUPCASE", "SYSEVALF", "EVAL", "LET", "QSCAN", "SYSEXEC", 
			"ACT", "LIST", "QSUBSTR", "SYSFUNC", "ACTIVATE", "GLOBAL", "LISTM", "QSYSFUNC", 
			"SYSGET", "BQUOTE", "GO", "LOCAL", "QUOTE", "SYSRPUT", "GOTO", "MACRO", 
			"QUPCASE", "THEN", "CLEAR", "IF", "MEND", "RESOLVE", "TO", "CLOSE", "INC", 
			"PAUSE", "TSO", "CMS", "INCLUDE", "NRSTR", "RUN", "UNQUOTE", "COMANDR", 
			"INDEX", "ON", "SAVE", "UNSTR", "COPY", "OPEN", "SCAN", "UNTIL", "DEACT", 
			"INPUT", "PUT", "STOP", "UPCASE", "DEL", "KCMPRES", "NRBQUOTE", "STR", 
			"WHILE", "DELETE", "KINDEX", "NRQUOTE", "SYSCALL", "WINDOW", "DISPLAY", 
			"KLEFT", "METASYM", "SUBSTR", "DMIDSPLY", "KLENGTH", "QKCMPRES", "SUPERQ", 
			"DMISPLIT", "KSCAN", "QKLEFT", "SYMDEL", "DO", "KSUBSTR", "QKSCAN", "SYMEXIST", 
			"EDIT", "KTRIM", "QKSUBSTR", "SYMGLOBL", "ELSE", "KUPCASE", "QKTRIM", 
			"SYMLOCAL", "Tk_NULL", "EXECUTE", "DESCRIBE", "LIBNAME", "DEBUG", "NESTING", 
			"STACK", "READ", "PW", "SOURCE", "VIEW", "PGM", "ENCRYPT", "NOSAVE", 
			"SET", "ALTER", "INPUT_ODS", "DATE", "DATETIME", "DDMMYY", "INFORMAT_COMMA", 
			"INFORMAT_CHAR", "DROP", "PROC", "ANOVA", "MEANS", "REG", "CORR", "SGPLOT", 
			"PRINT", "DATA", "Informat", "DOLLAR", "EQ", "NE", "GT", "LT", "GE", 
			"LE", "IN", "EQC", "NEC", "GTC", "LTC", "GEC", "LEC", "INColon", "AND", 
			"OR", "NOT", "MIN", "MAX", "DateLiteral", "TimeLiteral", "DateTimeLiteral", 
			"BitLiteral", "NameLiteral", "HexLiteral", "STRINGLITERAL", "INT", "FloatingPointLiteral", 
			"Number", "DOT", "AT", "EQUAL", "COMMA", "LBracket", "RBracket", "OF", 
			"COLON", "PERCENT", "ADD", "SUB", "MUL", "DIV", "LParentheses", "RParentheses", 
			"LBraces", "RBraces", "LSqBracket", "RSqBracket", "Identifier"
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
	public String getGrammarFileName() { return "DatalinesStmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatalinesStmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Datalines_mainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DatalinesStmtParser.EOF, 0); }
		public List<Datalines_stmtContext> datalines_stmt() {
			return getRuleContexts(Datalines_stmtContext.class);
		}
		public Datalines_stmtContext datalines_stmt(int i) {
			return getRuleContext(Datalines_stmtContext.class,i);
		}
		public List<Datalines4_stmtContext> datalines4_stmt() {
			return getRuleContexts(Datalines4_stmtContext.class);
		}
		public Datalines4_stmtContext datalines4_stmt(int i) {
			return getRuleContext(Datalines4_stmtContext.class,i);
		}
		public Datalines_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datalines_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterDatalines_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitDatalines_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitDatalines_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datalines_mainContext datalines_main() throws RecognitionException {
		Datalines_mainContext _localctx = new Datalines_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_datalines_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 226492416L) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATALINES:
				case CARDS:
					{
					setState(22);
					datalines_stmt();
					}
					break;
				case DATALINES4:
				case CARDS4:
					{
					setState(23);
					datalines4_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Datalines_stmtContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(DatalinesStmtParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DatalinesStmtParser.SEMICOLON, i);
		}
		public TerminalNode DATALINES() { return getToken(DatalinesStmtParser.DATALINES, 0); }
		public TerminalNode CARDS() { return getToken(DatalinesStmtParser.CARDS, 0); }
		public Datalines_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datalines_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterDatalines_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitDatalines_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitDatalines_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datalines_stmtContext datalines_stmt() throws RecognitionException {
		Datalines_stmtContext _localctx = new Datalines_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_datalines_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==DATALINES || _la==CARDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(32);
			match(SEMICOLON);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(33);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(39);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Datalines4_stmtContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(DatalinesStmtParser.SEMICOLON, 0); }
		public TerminalNode END_DATALINES4() { return getToken(DatalinesStmtParser.END_DATALINES4, 0); }
		public TerminalNode DATALINES4() { return getToken(DatalinesStmtParser.DATALINES4, 0); }
		public TerminalNode CARDS4() { return getToken(DatalinesStmtParser.CARDS4, 0); }
		public Datalines4_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datalines4_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterDatalines4_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitDatalines4_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitDatalines4_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datalines4_stmtContext datalines4_stmt() throws RecognitionException {
		Datalines4_stmtContext _localctx = new Datalines4_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datalines4_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==DATALINES4 || _la==CARDS4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
			match(SEMICOLON);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(43);
					matchWildcard();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(49);
			match(END_DATALINES4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public TerminalNode LParentheses() { return getToken(DatalinesStmtParser.LParentheses, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RParentheses() { return getToken(DatalinesStmtParser.RParentheses, 0); }
		public TerminalNode ADD() { return getToken(DatalinesStmtParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DatalinesStmtParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(DatalinesStmtParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(DatalinesStmtParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(DatalinesStmtParser.MAX, 0); }
		public TerminalNode MUL() { return getToken(DatalinesStmtParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DatalinesStmtParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(DatalinesStmtParser.PERCENT, 0); }
		public TerminalNode EQ() { return getToken(DatalinesStmtParser.EQ, 0); }
		public TerminalNode NE() { return getToken(DatalinesStmtParser.NE, 0); }
		public TerminalNode GT() { return getToken(DatalinesStmtParser.GT, 0); }
		public TerminalNode LT() { return getToken(DatalinesStmtParser.LT, 0); }
		public TerminalNode GE() { return getToken(DatalinesStmtParser.GE, 0); }
		public TerminalNode LE() { return getToken(DatalinesStmtParser.LE, 0); }
		public TerminalNode EQC() { return getToken(DatalinesStmtParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(DatalinesStmtParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(DatalinesStmtParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(DatalinesStmtParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(DatalinesStmtParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(DatalinesStmtParser.LEC, 0); }
		public TerminalNode AND() { return getToken(DatalinesStmtParser.AND, 0); }
		public TerminalNode OR() { return getToken(DatalinesStmtParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(DatalinesStmtParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode LBraces() { return getToken(DatalinesStmtParser.LBraces, 0); }
		public TerminalNode RBraces() { return getToken(DatalinesStmtParser.RBraces, 0); }
		public TerminalNode LSqBracket() { return getToken(DatalinesStmtParser.LSqBracket, 0); }
		public TerminalNode RSqBracket() { return getToken(DatalinesStmtParser.RSqBracket, 0); }
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(DatalinesStmtParser.IN, 0); }
		public TerminalNode INColon() { return getToken(DatalinesStmtParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DateLiteral:
			case TimeLiteral:
			case DateTimeLiteral:
			case BitLiteral:
			case NameLiteral:
			case HexLiteral:
			case STRINGLITERAL:
			case INT:
			case FloatingPointLiteral:
			case DOT:
				{
				setState(52);
				literal();
				}
				break;
			case Identifier:
				{
				setState(53);
				match(Identifier);
				}
				break;
			case LParentheses:
				{
				setState(54);
				match(LParentheses);
				setState(55);
				expression(0);
				setState(56);
				match(RParentheses);
				}
				break;
			case ADD:
			case SUB:
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(59);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(60);
				match(NOT);
				setState(61);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(64);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(65);
						match(T__0);
						setState(66);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(68);
						match(MIN);
						setState(69);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(71);
						match(MAX);
						setState(72);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(74);
						_la = _input.LA(1);
						if ( !(((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & 25L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(77);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(80);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(83);
						_la = _input.LA(1);
						if ( !(((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						_la = _input.LA(1);
						if ( !(((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(89);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(92);
						match(EQUAL);
						setState(93);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(95);
						match(LParentheses);
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3 || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 4374671353L) != 0)) {
							{
							setState(96);
							expressionList(0);
							}
						}

						setState(99);
						match(RParentheses);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(101);
						match(LBraces);
						setState(102);
						expression(0);
						setState(103);
						match(RBraces);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(106);
						match(LSqBracket);
						setState(107);
						expression(0);
						setState(108);
						match(RSqBracket);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Of_var_listContext> of_var_list() {
			return getRuleContexts(Of_var_listContext.class);
		}
		public Of_var_listContext of_var_list(int i) {
			return getRuleContext(Of_var_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DatalinesStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DatalinesStmtParser.COMMA, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case DateLiteral:
			case TimeLiteral:
			case DateTimeLiteral:
			case BitLiteral:
			case NameLiteral:
			case HexLiteral:
			case STRINGLITERAL:
			case INT:
			case FloatingPointLiteral:
			case DOT:
			case ADD:
			case SUB:
			case LParentheses:
			case Identifier:
				{
				setState(119);
				expression(0);
				}
				break;
			case T__3:
				{
				setState(120);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(COMMA);
					setState(126);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NOT:
					case DateLiteral:
					case TimeLiteral:
					case DateTimeLiteral:
					case BitLiteral:
					case NameLiteral:
					case HexLiteral:
					case STRINGLITERAL:
					case INT:
					case FloatingPointLiteral:
					case DOT:
					case ADD:
					case SUB:
					case LParentheses:
					case Identifier:
						{
						setState(124);
						expression(0);
						}
						break;
					case T__3:
						{
						setState(125);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(134);
						match(COMMA);
						}
						}
						setState(137); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(139);
					expressionList(2);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Of_var_listContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DatalinesStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DatalinesStmtParser.Identifier, i);
		}
		public List<TerminalNode> SUB() { return getTokens(DatalinesStmtParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(DatalinesStmtParser.SUB, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DatalinesStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DatalinesStmtParser.COMMA, i);
		}
		public TerminalNode LSqBracket() { return getToken(DatalinesStmtParser.LSqBracket, 0); }
		public TerminalNode MUL() { return getToken(DatalinesStmtParser.MUL, 0); }
		public TerminalNode RSqBracket() { return getToken(DatalinesStmtParser.RSqBracket, 0); }
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__3);
				{
				setState(146);
				match(Identifier);
				setState(147);
				match(SUB);
				setState(148);
				match(Identifier);
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(150);
							match(COMMA);
							setState(151);
							match(T__3);
							}
						}

						{
						setState(154);
						match(Identifier);
						setState(155);
						match(SUB);
						setState(156);
						match(Identifier);
						}
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__3);
				setState(163);
				match(Identifier);
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(164);
						match(Identifier);
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(T__3);
				setState(171);
				match(Identifier);
				setState(172);
				match(LSqBracket);
				setState(173);
				match(MUL);
				setState(174);
				match(RSqBracket);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Identifiers_listContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DatalinesStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DatalinesStmtParser.Identifier, i);
		}
		public List<TerminalNode> SUB() { return getTokens(DatalinesStmtParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(DatalinesStmtParser.SUB, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(177);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(178);
					match(Identifier);
					setState(179);
					match(SUB);
					setState(180);
					match(Identifier);
					}
					break;
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
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

	@SuppressWarnings("CheckReturnValue")
	public static class In_var_listContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public TerminalNode LParentheses() { return getToken(DatalinesStmtParser.LParentheses, 0); }
		public TerminalNode RParentheses() { return getToken(DatalinesStmtParser.RParentheses, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<ColonIntsContext> colonInts() {
			return getRuleContexts(ColonIntsContext.class);
		}
		public ColonIntsContext colonInts(int i) {
			return getRuleContext(ColonIntsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DatalinesStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DatalinesStmtParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_in_var_list);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(Identifier);
				}
				break;
			case LParentheses:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(LParentheses);
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(187);
					literal();
					}
					break;
				case 2:
					{
					setState(188);
					colonInts();
					}
					break;
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191);
					match(COMMA);
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(192);
						literal();
						}
						break;
					case 2:
						{
						setState(193);
						colonInts();
						}
						break;
					}
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(RParentheses);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColonIntsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DatalinesStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DatalinesStmtParser.INT, i);
		}
		public TerminalNode COLON() { return getToken(DatalinesStmtParser.COLON, 0); }
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(INT);
			setState(206);
			match(COLON);
			setState(207);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DatalinesStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(DatalinesStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(DatalinesStmtParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(DatalinesStmtParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(DatalinesStmtParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(DatalinesStmtParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(DatalinesStmtParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(DatalinesStmtParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(DatalinesStmtParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(DatalinesStmtParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & 1535L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(DatalinesStmtParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(DatalinesStmtParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(DatalinesStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DatalinesStmtParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		return variables(0);
	}

	private VariablesContext variables(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariablesContext _localctx = new VariablesContext(_ctx, _parentState);
		VariablesContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(212);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(213);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(214);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(215);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variables);
					setState(218);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(219);
					match(DOT);
					setState(220);
					variables(6);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 10:
			return variables_sempred((VariablesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variables_sempred(VariablesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00e0\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001#\b\u0001\n\u0001"+
		"\f\u0001&\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003?\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003b\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003r\b\u0003\n\u0003\f\u0003u\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004z\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0005\u0004\u0081"+
		"\b\u0004\n\u0004\f\u0004\u0084\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u0088\b\u0004\u000b\u0004\f\u0004\u0089\u0001\u0004\u0005\u0004\u008d"+
		"\b\u0004\n\u0004\f\u0004\u0090\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0099\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u009e\b\u0005\n\u0005"+
		"\f\u0005\u00a1\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00a6\b\u0005\n\u0005\f\u0005\u00a9\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b0\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00b6\b\u0006\u000b\u0006\f"+
		"\u0006\u00b7\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00be\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c3\b"+
		"\u0007\u0005\u0007\u00c5\b\u0007\n\u0007\f\u0007\u00c8\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00cc\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d9"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00de\b\n\n\n\f\n\u00e1\t\n\u0001"+
		"\n\u0002$.\u0003\u0006\b\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u000b\u0001\u0000\u0017\u0018\u0001\u000066\u0001"+
		"\u0000\u001a\u001b\u0001\u0000\u00d6\u00d7\u0002\u0000\u00d5\u00d5\u00d8"+
		"\u00d9\u0001\u0000\u0002\u0003\u0001\u0000\u00b0\u00b5\u0001\u0000\u00b7"+
		"\u00bc\u0001\u0000\u00be\u00bf\u0002\u0000\u00b6\u00b6\u00bd\u00bd\u0002"+
		"\u0000\u00c3\u00cb\u00cd\u00cd\u0102\u0000\u001a\u0001\u0000\u0000\u0000"+
		"\u0002\u001f\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006"+
		">\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000\n\u00af\u0001\u0000"+
		"\u0000\u0000\f\u00b5\u0001\u0000\u0000\u0000\u000e\u00cb\u0001\u0000\u0000"+
		"\u0000\u0010\u00cd\u0001\u0000\u0000\u0000\u0012\u00d1\u0001\u0000\u0000"+
		"\u0000\u0014\u00d8\u0001\u0000\u0000\u0000\u0016\u0019\u0003\u0002\u0001"+
		"\u0000\u0017\u0019\u0003\u0004\u0002\u0000\u0018\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e\u0001\u0001\u0000\u0000"+
		"\u0000\u001f \u0007\u0000\u0000\u0000 $\u00056\u0000\u0000!#\b\u0001\u0000"+
		"\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000\'(\u00056\u0000\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")*\u0007\u0002\u0000\u0000*.\u00056\u0000\u0000+-\t\u0000\u0000\u0000"+
		",+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000012\u0005\u001d\u0000\u00002\u0005\u0001\u0000\u0000\u0000"+
		"34\u0006\u0003\uffff\uffff\u00004?\u0003\u0012\t\u00005?\u0005\u00e0\u0000"+
		"\u000067\u0005\u00da\u0000\u000078\u0003\u0006\u0003\u000089\u0005\u00db"+
		"\u0000\u00009?\u0001\u0000\u0000\u0000:;\u0007\u0003\u0000\u0000;?\u0003"+
		"\u0006\u0003\f<=\u0005\u00c0\u0000\u0000=?\u0003\u0006\u0003\u000b>3\u0001"+
		"\u0000\u0000\u0000>5\u0001\u0000\u0000\u0000>6\u0001\u0000\u0000\u0000"+
		">:\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?s\u0001\u0000\u0000"+
		"\u0000@A\n\r\u0000\u0000AB\u0005\u0001\u0000\u0000Br\u0003\u0006\u0003"+
		"\rCD\n\n\u0000\u0000DE\u0005\u00c1\u0000\u0000Er\u0003\u0006\u0003\u000b"+
		"FG\n\t\u0000\u0000GH\u0005\u00c2\u0000\u0000Hr\u0003\u0006\u0003\nIJ\n"+
		"\b\u0000\u0000JK\u0007\u0004\u0000\u0000Kr\u0003\u0006\u0003\tLM\n\u0007"+
		"\u0000\u0000MN\u0007\u0003\u0000\u0000Nr\u0003\u0006\u0003\bOP\n\u0006"+
		"\u0000\u0000PQ\u0007\u0005\u0000\u0000Qr\u0003\u0006\u0003\u0007RS\n\u0005"+
		"\u0000\u0000ST\u0007\u0006\u0000\u0000Tr\u0003\u0006\u0003\u0006UV\n\u0004"+
		"\u0000\u0000VW\u0007\u0007\u0000\u0000Wr\u0003\u0006\u0003\u0005XY\n\u0002"+
		"\u0000\u0000YZ\u0007\b\u0000\u0000Zr\u0003\u0006\u0003\u0003[\\\n\u0001"+
		"\u0000\u0000\\]\u0005\u00cf\u0000\u0000]r\u0003\u0006\u0003\u0001^_\n"+
		"\u0010\u0000\u0000_a\u0005\u00da\u0000\u0000`b\u0003\b\u0004\u0000a`\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cr\u0005\u00db\u0000\u0000de\n\u000f\u0000\u0000ef\u0005\u00dc\u0000\u0000"+
		"fg\u0003\u0006\u0003\u0000gh\u0005\u00dd\u0000\u0000hr\u0001\u0000\u0000"+
		"\u0000ij\n\u000e\u0000\u0000jk\u0005\u00de\u0000\u0000kl\u0003\u0006\u0003"+
		"\u0000lm\u0005\u00df\u0000\u0000mr\u0001\u0000\u0000\u0000no\n\u0003\u0000"+
		"\u0000op\u0007\t\u0000\u0000pr\u0003\u000e\u0007\u0000q@\u0001\u0000\u0000"+
		"\u0000qC\u0001\u0000\u0000\u0000qF\u0001\u0000\u0000\u0000qI\u0001\u0000"+
		"\u0000\u0000qL\u0001\u0000\u0000\u0000qO\u0001\u0000\u0000\u0000qR\u0001"+
		"\u0000\u0000\u0000qU\u0001\u0000\u0000\u0000qX\u0001\u0000\u0000\u0000"+
		"q[\u0001\u0000\u0000\u0000q^\u0001\u0000\u0000\u0000qd\u0001\u0000\u0000"+
		"\u0000qi\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000ru\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0007"+
		"\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vy\u0006\u0004\uffff"+
		"\uffff\u0000wz\u0003\u0006\u0003\u0000xz\u0003\n\u0005\u0000yw\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0082\u0001\u0000\u0000\u0000"+
		"{~\u0005\u00d0\u0000\u0000|\u007f\u0003\u0006\u0003\u0000}\u007f\u0003"+
		"\n\u0005\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u008e\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\n\u0001\u0000\u0000\u0086\u0088\u0005"+
		"\u00d0\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0003"+
		"\b\u0004\u0002\u008c\u0085\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\t\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0093\u0005\u00e0\u0000"+
		"\u0000\u0093\u0094\u0005\u00d7\u0000\u0000\u0094\u0095\u0005\u00e0\u0000"+
		"\u0000\u0095\u009f\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u00d0\u0000"+
		"\u0000\u0097\u0099\u0005\u0004\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u00e0\u0000\u0000\u009b\u009c\u0005\u00d7\u0000"+
		"\u0000\u009c\u009e\u0005\u00e0\u0000\u0000\u009d\u0098\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00b0\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000"+
		"\u0000\u00a3\u00a7\u0005\u00e0\u0000\u0000\u00a4\u00a6\u0005\u00e0\u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00b0\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0004\u0000\u0000\u00ab\u00ac\u0005\u00e0\u0000"+
		"\u0000\u00ac\u00ad\u0005\u00de\u0000\u0000\u00ad\u00ae\u0005\u00d8\u0000"+
		"\u0000\u00ae\u00b0\u0005\u00df\u0000\u0000\u00af\u0091\u0001\u0000\u0000"+
		"\u0000\u00af\u00a2\u0001\u0000\u0000\u0000\u00af\u00aa\u0001\u0000\u0000"+
		"\u0000\u00b0\u000b\u0001\u0000\u0000\u0000\u00b1\u00b6\u0005\u00e0\u0000"+
		"\u0000\u00b2\u00b3\u0005\u00e0\u0000\u0000\u00b3\u00b4\u0005\u00d7\u0000"+
		"\u0000\u00b4\u00b6\u0005\u00e0\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\r\u0001\u0000\u0000\u0000\u00b9\u00cc\u0005\u00e0\u0000\u0000"+
		"\u00ba\u00bd\u0005\u00da\u0000\u0000\u00bb\u00be\u0003\u0012\t\u0000\u00bc"+
		"\u00be\u0003\u0010\b\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00c6\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0005\u00d0\u0000\u0000\u00c0\u00c3\u0003\u0012\t\u0000\u00c1\u00c3\u0003"+
		"\u0010\b\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u00db"+
		"\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ba\u0001\u0000\u0000\u0000\u00cc\u000f\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005\u00ca\u0000\u0000\u00ce\u00cf\u0005\u00d4"+
		"\u0000\u0000\u00cf\u00d0\u0005\u00ca\u0000\u0000\u00d0\u0011\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0007\n\u0000\u0000\u00d2\u0013\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0006\n\uffff\uffff\u0000\u00d4\u00d9\u0005\u00e0\u0000"+
		"\u0000\u00d5\u00d9\u0005\u00a0\u0000\u0000\u00d6\u00d9\u0005\u009e\u0000"+
		"\u0000\u00d7\u00d9\u0005\u00a5\u0000\u0000\u00d8\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00df\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\n\u0005\u0000\u0000\u00db\u00dc\u0005\u00cd\u0000\u0000"+
		"\u00dc\u00de\u0003\u0014\n\u0006\u00dd\u00da\u0001\u0000\u0000\u0000\u00de"+
		"\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u0015\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u0019\u0018\u001a$.>aqsy~\u0082\u0089\u008e"+
		"\u0098\u009f\u00a7\u00af\u00b5\u00b7\u00bd\u00c2\u00c6\u00cb\u00d8\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}