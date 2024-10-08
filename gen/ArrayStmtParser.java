// Generated from /home/pooja/PycharmProjects/sas-grammar/ArrayStmt.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArrayStmtParser extends Parser {
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
		RULE_array_main = 0, RULE_array_stmt = 1, RULE_array_name = 2, RULE_array_subscript = 3, 
		RULE_array_elements = 4, RULE_initial_value_list = 5, RULE_initial_value_list_item = 6, 
		RULE_initial_value_list_bk = 7, RULE_constant_iter_value = 8, RULE_constant_value = 9, 
		RULE_expression = 10, RULE_expressionList = 11, RULE_of_var_list = 12, 
		RULE_identifiers_list = 13, RULE_in_var_list = 14, RULE_colonInts = 15, 
		RULE_literal = 16, RULE_variables = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"array_main", "array_stmt", "array_name", "array_subscript", "array_elements", 
			"initial_value_list", "initial_value_list_item", "initial_value_list_bk", 
			"constant_iter_value", "constant_value", "expression", "expressionList", 
			"of_var_list", "identifiers_list", "in_var_list", "colonInts", "literal", 
			"variables"
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
	public String getGrammarFileName() { return "ArrayStmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArrayStmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_mainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArrayStmtParser.EOF, 0); }
		public List<Array_stmtContext> array_stmt() {
			return getRuleContexts(Array_stmtContext.class);
		}
		public Array_stmtContext array_stmt(int i) {
			return getRuleContext(Array_stmtContext.class,i);
		}
		public Array_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterArray_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitArray_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitArray_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_mainContext array_main() throws RecognitionException {
		Array_mainContext _localctx = new Array_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_array_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY) {
				{
				{
				setState(36);
				array_stmt();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
	public static class Array_stmtContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(ArrayStmtParser.ARRAY, 0); }
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public TerminalNode LBracket() { return getToken(ArrayStmtParser.LBracket, 0); }
		public Array_subscriptContext array_subscript() {
			return getRuleContext(Array_subscriptContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(ArrayStmtParser.RBracket, 0); }
		public TerminalNode SEMICOLON() { return getToken(ArrayStmtParser.SEMICOLON, 0); }
		public TerminalNode DOLLAR() { return getToken(ArrayStmtParser.DOLLAR, 0); }
		public TerminalNode INT() { return getToken(ArrayStmtParser.INT, 0); }
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Initial_value_listContext initial_value_list() {
			return getRuleContext(Initial_value_listContext.class,0);
		}
		public Array_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterArray_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitArray_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitArray_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_stmtContext array_stmt() throws RecognitionException {
		Array_stmtContext _localctx = new Array_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_array_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ARRAY);
			setState(45);
			array_name();
			setState(46);
			match(LBracket);
			setState(47);
			array_subscript();
			setState(48);
			match(RBracket);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(49);
				match(DOLLAR);
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(52);
				match(INT);
				}
			}

			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0) || _la==Identifier) {
				{
				setState(55);
				array_elements();
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LParentheses) {
				{
				setState(58);
				initial_value_list();
				}
			}

			setState(61);
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
	public static class Array_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ArrayStmtParser.Identifier, 0); }
		public Array_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterArray_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitArray_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitArray_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_nameContext array_name() throws RecognitionException {
		Array_nameContext _localctx = new Array_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(Identifier);
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
	public static class Array_subscriptContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(ArrayStmtParser.MUL, 0); }
		public List<TerminalNode> INT() { return getTokens(ArrayStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ArrayStmtParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArrayStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrayStmtParser.COMMA, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ArrayStmtParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ArrayStmtParser.COLON, i);
		}
		public Array_subscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterArray_subscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitArray_subscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitArray_subscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_subscriptContext array_subscript() throws RecognitionException {
		Array_subscriptContext _localctx = new Array_subscriptContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_subscript);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(MUL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(INT);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(67);
					match(COMMA);
					setState(68);
					match(INT);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(INT);
				setState(75);
				match(COLON);
				setState(76);
				match(INT);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					match(INT);
					setState(79);
					match(COLON);
					setState(80);
					match(INT);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Array_elementsContext extends ParserRuleContext {
		public TerminalNode ARRAY_NUMERIC_ELEMENTS() { return getToken(ArrayStmtParser.ARRAY_NUMERIC_ELEMENTS, 0); }
		public TerminalNode ARRAY_CHARACTER_ELEMENTS() { return getToken(ArrayStmtParser.ARRAY_CHARACTER_ELEMENTS, 0); }
		public TerminalNode ARRAY_ALL_ELEMENTS() { return getToken(ArrayStmtParser.ARRAY_ALL_ELEMENTS, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ArrayStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ArrayStmtParser.Identifier, i);
		}
		public TerminalNode SUB() { return getToken(ArrayStmtParser.SUB, 0); }
		public Array_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterArray_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitArray_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitArray_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elementsContext array_elements() throws RecognitionException {
		Array_elementsContext _localctx = new Array_elementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_elements);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(ARRAY_NUMERIC_ELEMENTS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ARRAY_CHARACTER_ELEMENTS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(ARRAY_ALL_ELEMENTS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					match(Identifier);
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(Identifier);
				setState(97);
				match(SUB);
				setState(98);
				match(Identifier);
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
	public static class Initial_value_listContext extends ParserRuleContext {
		public TerminalNode LParentheses() { return getToken(ArrayStmtParser.LParentheses, 0); }
		public TerminalNode RParentheses() { return getToken(ArrayStmtParser.RParentheses, 0); }
		public List<Initial_value_list_itemContext> initial_value_list_item() {
			return getRuleContexts(Initial_value_list_itemContext.class);
		}
		public Initial_value_list_itemContext initial_value_list_item(int i) {
			return getRuleContext(Initial_value_list_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArrayStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrayStmtParser.COMMA, i);
		}
		public Initial_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterInitial_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitInitial_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitInitial_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_value_listContext initial_value_list() throws RecognitionException {
		Initial_value_listContext _localctx = new Initial_value_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initial_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LParentheses);
			{
			setState(102);
			initial_value_list_item();
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 135L) != 0)) {
				{
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(103);
					match(COMMA);
					}
				}

				setState(106);
				initial_value_list_item();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(RParentheses);
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
	public static class Initial_value_list_itemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ArrayStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ArrayStmtParser.INT, i);
		}
		public TerminalNode COLON() { return getToken(ArrayStmtParser.COLON, 0); }
		public Constant_iter_valueContext constant_iter_value() {
			return getRuleContext(Constant_iter_valueContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ArrayStmtParser.MUL, 0); }
		public Initial_value_listContext initial_value_list() {
			return getRuleContext(Initial_value_listContext.class,0);
		}
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public Initial_value_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_value_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterInitial_value_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitInitial_value_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitInitial_value_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_value_list_itemContext initial_value_list_item() throws RecognitionException {
		Initial_value_list_itemContext _localctx = new Initial_value_list_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initial_value_list_item);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(INT);
				setState(115);
				match(COLON);
				setState(116);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				constant_iter_value();
				setState(118);
				match(MUL);
				setState(119);
				initial_value_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				constant_iter_value();
				setState(122);
				match(MUL);
				setState(123);
				constant_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				constant_value();
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
	public static class Initial_value_list_bkContext extends ParserRuleContext {
		public TerminalNode LParentheses() { return getToken(ArrayStmtParser.LParentheses, 0); }
		public TerminalNode RParentheses() { return getToken(ArrayStmtParser.RParentheses, 0); }
		public List<Constant_valueContext> constant_value() {
			return getRuleContexts(Constant_valueContext.class);
		}
		public Constant_valueContext constant_value(int i) {
			return getRuleContext(Constant_valueContext.class,i);
		}
		public List<Constant_iter_valueContext> constant_iter_value() {
			return getRuleContexts(Constant_iter_valueContext.class);
		}
		public Constant_iter_valueContext constant_iter_value(int i) {
			return getRuleContext(Constant_iter_valueContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ArrayStmtParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ArrayStmtParser.MUL, i);
		}
		public List<Initial_value_listContext> initial_value_list() {
			return getRuleContexts(Initial_value_listContext.class);
		}
		public Initial_value_listContext initial_value_list(int i) {
			return getRuleContext(Initial_value_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArrayStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrayStmtParser.COMMA, i);
		}
		public Initial_value_list_bkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_value_list_bk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterInitial_value_list_bk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitInitial_value_list_bk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitInitial_value_list_bk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_value_list_bkContext initial_value_list_bk() throws RecognitionException {
		Initial_value_list_bkContext _localctx = new Initial_value_list_bkContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initial_value_list_bk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(LParentheses);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(129);
				constant_iter_value();
				setState(130);
				match(MUL);
				setState(131);
				initial_value_list();
				}
				}
				break;
			case 2:
				{
				{
				setState(133);
				constant_iter_value();
				setState(134);
				match(MUL);
				setState(135);
				constant_value();
				}
				}
				break;
			case 3:
				{
				setState(137);
				constant_value();
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 135L) != 0)) {
				{
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(140);
					match(COMMA);
					}
				}

				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					{
					setState(143);
					constant_iter_value();
					setState(144);
					match(MUL);
					setState(145);
					initial_value_list();
					}
					}
					break;
				case 2:
					{
					{
					setState(147);
					constant_iter_value();
					setState(148);
					match(MUL);
					setState(149);
					constant_value();
					}
					}
					break;
				case 3:
					{
					setState(151);
					constant_value();
					}
					break;
				}
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(RParentheses);
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
	public static class Constant_iter_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArrayStmtParser.INT, 0); }
		public Constant_iter_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_iter_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterConstant_iter_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitConstant_iter_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitConstant_iter_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_iter_valueContext constant_iter_value() throws RecognitionException {
		Constant_iter_valueContext _localctx = new Constant_iter_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant_iter_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
	public static class Constant_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArrayStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ArrayStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(ArrayStmtParser.STRINGLITERAL, 0); }
		public Constant_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterConstant_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitConstant_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitConstant_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_valueContext constant_value() throws RecognitionException {
		Constant_valueContext _localctx = new Constant_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 7L) != 0)) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ArrayStmtParser.Identifier, 0); }
		public TerminalNode LParentheses() { return getToken(ArrayStmtParser.LParentheses, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RParentheses() { return getToken(ArrayStmtParser.RParentheses, 0); }
		public TerminalNode ADD() { return getToken(ArrayStmtParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ArrayStmtParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(ArrayStmtParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(ArrayStmtParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ArrayStmtParser.MAX, 0); }
		public TerminalNode MUL() { return getToken(ArrayStmtParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArrayStmtParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(ArrayStmtParser.PERCENT, 0); }
		public TerminalNode EQ() { return getToken(ArrayStmtParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ArrayStmtParser.NE, 0); }
		public TerminalNode GT() { return getToken(ArrayStmtParser.GT, 0); }
		public TerminalNode LT() { return getToken(ArrayStmtParser.LT, 0); }
		public TerminalNode GE() { return getToken(ArrayStmtParser.GE, 0); }
		public TerminalNode LE() { return getToken(ArrayStmtParser.LE, 0); }
		public TerminalNode EQC() { return getToken(ArrayStmtParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(ArrayStmtParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(ArrayStmtParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(ArrayStmtParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(ArrayStmtParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(ArrayStmtParser.LEC, 0); }
		public TerminalNode AND() { return getToken(ArrayStmtParser.AND, 0); }
		public TerminalNode OR() { return getToken(ArrayStmtParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(ArrayStmtParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode LBraces() { return getToken(ArrayStmtParser.LBraces, 0); }
		public TerminalNode RBraces() { return getToken(ArrayStmtParser.RBraces, 0); }
		public TerminalNode LSqBracket() { return getToken(ArrayStmtParser.LSqBracket, 0); }
		public TerminalNode RSqBracket() { return getToken(ArrayStmtParser.RSqBracket, 0); }
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(ArrayStmtParser.IN, 0); }
		public TerminalNode INColon() { return getToken(ArrayStmtParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
				setState(166);
				literal();
				}
				break;
			case Identifier:
				{
				setState(167);
				match(Identifier);
				}
				break;
			case LParentheses:
				{
				setState(168);
				match(LParentheses);
				setState(169);
				expression(0);
				setState(170);
				match(RParentheses);
				}
				break;
			case ADD:
			case SUB:
				{
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(174);
				match(NOT);
				setState(175);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(179);
						match(T__0);
						setState(180);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(182);
						match(MIN);
						setState(183);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(185);
						match(MAX);
						setState(186);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(188);
						_la = _input.LA(1);
						if ( !(((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & 25L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(191);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(194);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(197);
						_la = _input.LA(1);
						if ( !(((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						_la = _input.LA(1);
						if ( !(((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(203);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(206);
						match(EQUAL);
						setState(207);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(209);
						match(LParentheses);
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3 || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 4374671353L) != 0)) {
							{
							setState(210);
							expressionList(0);
							}
						}

						setState(213);
						match(RParentheses);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(215);
						match(LBraces);
						setState(216);
						expression(0);
						setState(217);
						match(RBraces);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(220);
						match(LSqBracket);
						setState(221);
						expression(0);
						setState(222);
						match(RSqBracket);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(225);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(ArrayStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrayStmtParser.COMMA, i);
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
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitExpressionList(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
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
				setState(233);
				expression(0);
				}
				break;
			case T__3:
				{
				setState(234);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					match(COMMA);
					setState(240);
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
						setState(238);
						expression(0);
						}
						break;
					case T__3:
						{
						setState(239);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(247);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(248);
						match(COMMA);
						}
						}
						setState(251); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(253);
					expressionList(2);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(ArrayStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ArrayStmtParser.Identifier, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ArrayStmtParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ArrayStmtParser.SUB, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArrayStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrayStmtParser.COMMA, i);
		}
		public TerminalNode LSqBracket() { return getToken(ArrayStmtParser.LSqBracket, 0); }
		public TerminalNode MUL() { return getToken(ArrayStmtParser.MUL, 0); }
		public TerminalNode RSqBracket() { return getToken(ArrayStmtParser.RSqBracket, 0); }
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__3);
				{
				setState(260);
				match(Identifier);
				setState(261);
				match(SUB);
				setState(262);
				match(Identifier);
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(264);
							match(COMMA);
							setState(265);
							match(T__3);
							}
						}

						{
						setState(268);
						match(Identifier);
						setState(269);
						match(SUB);
						setState(270);
						match(Identifier);
						}
						}
						} 
					}
					setState(275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__3);
				setState(277);
				match(Identifier);
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(278);
						match(Identifier);
						}
						} 
					}
					setState(283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__3);
				setState(285);
				match(Identifier);
				setState(286);
				match(LSqBracket);
				setState(287);
				match(MUL);
				setState(288);
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
		public List<TerminalNode> Identifier() { return getTokens(ArrayStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ArrayStmtParser.Identifier, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ArrayStmtParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ArrayStmtParser.SUB, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(291);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(292);
					match(Identifier);
					setState(293);
					match(SUB);
					setState(294);
					match(Identifier);
					}
					break;
				}
				}
				setState(297); 
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
		public TerminalNode Identifier() { return getToken(ArrayStmtParser.Identifier, 0); }
		public TerminalNode LParentheses() { return getToken(ArrayStmtParser.LParentheses, 0); }
		public TerminalNode RParentheses() { return getToken(ArrayStmtParser.RParentheses, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(ArrayStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrayStmtParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_in_var_list);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(Identifier);
				}
				break;
			case LParentheses:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(LParentheses);
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(301);
					literal();
					}
					break;
				case 2:
					{
					setState(302);
					colonInts();
					}
					break;
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(305);
					match(COMMA);
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(306);
						literal();
						}
						break;
					case 2:
						{
						setState(307);
						colonInts();
						}
						break;
					}
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
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
		public List<TerminalNode> INT() { return getTokens(ArrayStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ArrayStmtParser.INT, i);
		}
		public TerminalNode COLON() { return getToken(ArrayStmtParser.COLON, 0); }
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(INT);
			setState(320);
			match(COLON);
			setState(321);
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
		public TerminalNode INT() { return getToken(ArrayStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ArrayStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(ArrayStmtParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(ArrayStmtParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(ArrayStmtParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(ArrayStmtParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(ArrayStmtParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(ArrayStmtParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(ArrayStmtParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(ArrayStmtParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		public TerminalNode Identifier() { return getToken(ArrayStmtParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(ArrayStmtParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(ArrayStmtParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(ArrayStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ArrayStmtParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayStmtListener ) ((ArrayStmtListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayStmtVisitor ) return ((ArrayStmtVisitor<? extends T>)visitor).visitVariables(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(326);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(327);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(328);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(329);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variables);
					setState(332);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(333);
					match(DOT);
					setState(334);
					variables(6);
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 17:
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
		"\u0004\u0001\u00e0\u0155\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005"+
		"\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00013\b\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001\u0003\u0001"+
		"9\b\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003R\b"+
		"\u0003\n\u0003\f\u0003U\t\u0003\u0003\u0003W\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004]\b\u0004\u000b\u0004\f\u0004"+
		"^\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004d\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001\u0005\u0005\u0005"+
		"l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u007f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u008b\b\u0007\u0001\u0007\u0003\u0007\u008e\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0099\b\u0007\u0005\u0007\u009b\b\u0007"+
		"\n\u0007\f\u0007\u009e\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b1\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d4\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00e4\b\n\n\n\f\n\u00e7\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00ec\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00f1\b\u000b\u0005\u000b\u00f3\b\u000b\n\u000b\f\u000b\u00f6"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00fa\b\u000b\u000b\u000b"+
		"\f\u000b\u00fb\u0001\u000b\u0005\u000b\u00ff\b\u000b\n\u000b\f\u000b\u0102"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u010b\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u0110\b\f\n\f\f\f\u0113\t"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0118\b\f\n\f\f\f\u011b\t\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0122\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0004\r\u0128\b\r\u000b\r\f\r\u0129\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0130\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0135\b\u000e\u0005\u000e\u0137\b\u000e\n\u000e"+
		"\f\u000e\u013a\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u013e\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u014b\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0150\b"+
		"\u0011\n\u0011\f\u0011\u0153\t\u0011\u0001\u0011\u0000\u0003\u0014\u0016"+
		"\"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\t\u0001\u0000\u00c9\u00cb\u0001\u0000\u00d6"+
		"\u00d7\u0002\u0000\u00d5\u00d5\u00d8\u00d9\u0001\u0000\u0002\u0003\u0001"+
		"\u0000\u00b0\u00b5\u0001\u0000\u00b7\u00bc\u0001\u0000\u00be\u00bf\u0002"+
		"\u0000\u00b6\u00b6\u00bd\u00bd\u0002\u0000\u00c3\u00cb\u00cd\u00cd\u0182"+
		"\u0000\'\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004"+
		"?\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\bc\u0001\u0000"+
		"\u0000\u0000\ne\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000\u000e"+
		"\u0080\u0001\u0000\u0000\u0000\u0010\u00a1\u0001\u0000\u0000\u0000\u0012"+
		"\u00a3\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000\u0000\u0000\u0016"+
		"\u00e8\u0001\u0000\u0000\u0000\u0018\u0121\u0001\u0000\u0000\u0000\u001a"+
		"\u0127\u0001\u0000\u0000\u0000\u001c\u013d\u0001\u0000\u0000\u0000\u001e"+
		"\u013f\u0001\u0000\u0000\u0000 \u0143\u0001\u0000\u0000\u0000\"\u014a"+
		"\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000"+
		"\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0000\u0000\u0001+\u0001\u0001\u0000\u0000\u0000,-\u0005\u000e\u0000"+
		"\u0000-.\u0003\u0004\u0002\u0000./\u0005\u00d1\u0000\u0000/0\u0003\u0006"+
		"\u0003\u000002\u0005\u00d2\u0000\u000013\u0005\u00af\u0000\u000021\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u0000"+
		"46\u0005\u00ca\u0000\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000068\u0001\u0000\u0000\u000079\u0003\b\u0004\u000087\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:<\u0003\n\u0005"+
		"\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u00056\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?@\u0005"+
		"\u00e0\u0000\u0000@\u0005\u0001\u0000\u0000\u0000AW\u0005\u00d8\u0000"+
		"\u0000BG\u0005\u00ca\u0000\u0000CD\u0005\u00d0\u0000\u0000DF\u0005\u00ca"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HW\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JK\u0005\u00ca\u0000\u0000KL\u0005\u00d4\u0000"+
		"\u0000LS\u0005\u00ca\u0000\u0000MN\u0005\u00d0\u0000\u0000NO\u0005\u00ca"+
		"\u0000\u0000OP\u0005\u00d4\u0000\u0000PR\u0005\u00ca\u0000\u0000QM\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VA\u0001\u0000\u0000\u0000VB\u0001\u0000\u0000\u0000VJ\u0001\u0000"+
		"\u0000\u0000W\u0007\u0001\u0000\u0000\u0000Xd\u0005\u000f\u0000\u0000"+
		"Yd\u0005\u0010\u0000\u0000Zd\u0005\u0011\u0000\u0000[]\u0005\u00e0\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_d\u0001\u0000\u0000\u0000`a\u0005"+
		"\u00e0\u0000\u0000ab\u0005\u00d7\u0000\u0000bd\u0005\u00e0\u0000\u0000"+
		"cX\u0001\u0000\u0000\u0000cY\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000"+
		"\u0000c\\\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000d\t\u0001\u0000"+
		"\u0000\u0000ef\u0005\u00da\u0000\u0000fm\u0003\f\u0006\u0000gi\u0005\u00d0"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jl\u0003\f\u0006\u0000kh\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u00db\u0000"+
		"\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0005\u00ca\u0000\u0000st\u0005"+
		"\u00d4\u0000\u0000t\u007f\u0005\u00ca\u0000\u0000uv\u0003\u0010\b\u0000"+
		"vw\u0005\u00d8\u0000\u0000wx\u0003\n\u0005\u0000x\u007f\u0001\u0000\u0000"+
		"\u0000yz\u0003\u0010\b\u0000z{\u0005\u00d8\u0000\u0000{|\u0003\u0012\t"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}\u007f\u0003\u0012\t\u0000~r\u0001"+
		"\u0000\u0000\u0000~u\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080\u008a"+
		"\u0005\u00da\u0000\u0000\u0081\u0082\u0003\u0010\b\u0000\u0082\u0083\u0005"+
		"\u00d8\u0000\u0000\u0083\u0084\u0003\n\u0005\u0000\u0084\u008b\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0003\u0010\b\u0000\u0086\u0087\u0005\u00d8\u0000"+
		"\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\u008b\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0003\u0012\t\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a"+
		"\u0085\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u009c\u0001\u0000\u0000\u0000\u008c\u008e\u0005\u00d0\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u0098\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u0010\b\u0000\u0090\u0091"+
		"\u0005\u00d8\u0000\u0000\u0091\u0092\u0003\n\u0005\u0000\u0092\u0099\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0003\u0010\b\u0000\u0094\u0095\u0005\u00d8"+
		"\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096\u0099\u0001\u0000\u0000"+
		"\u0000\u0097\u0099\u0003\u0012\t\u0000\u0098\u008f\u0001\u0000\u0000\u0000"+
		"\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u008d\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u00db\u0000\u0000"+
		"\u00a0\u000f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u00ca\u0000\u0000"+
		"\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u0000\u0000\u0000"+
		"\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0006\n\uffff\uffff\u0000"+
		"\u00a6\u00b1\u0003 \u0010\u0000\u00a7\u00b1\u0005\u00e0\u0000\u0000\u00a8"+
		"\u00a9\u0005\u00da\u0000\u0000\u00a9\u00aa\u0003\u0014\n\u0000\u00aa\u00ab"+
		"\u0005\u00db\u0000\u0000\u00ab\u00b1\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0007\u0001\u0000\u0000\u00ad\u00b1\u0003\u0014\n\f\u00ae\u00af\u0005"+
		"\u00c0\u0000\u0000\u00af\u00b1\u0003\u0014\n\u000b\u00b0\u00a5\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b1\u00e5\u0001\u0000\u0000\u0000\u00b2\u00b3\n\r\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0001\u0000\u0000\u00b4\u00e4\u0003\u0014\n\r"+
		"\u00b5\u00b6\n\n\u0000\u0000\u00b6\u00b7\u0005\u00c1\u0000\u0000\u00b7"+
		"\u00e4\u0003\u0014\n\u000b\u00b8\u00b9\n\t\u0000\u0000\u00b9\u00ba\u0005"+
		"\u00c2\u0000\u0000\u00ba\u00e4\u0003\u0014\n\n\u00bb\u00bc\n\b\u0000\u0000"+
		"\u00bc\u00bd\u0007\u0002\u0000\u0000\u00bd\u00e4\u0003\u0014\n\t\u00be"+
		"\u00bf\n\u0007\u0000\u0000\u00bf\u00c0\u0007\u0001\u0000\u0000\u00c0\u00e4"+
		"\u0003\u0014\n\b\u00c1\u00c2\n\u0006\u0000\u0000\u00c2\u00c3\u0007\u0003"+
		"\u0000\u0000\u00c3\u00e4\u0003\u0014\n\u0007\u00c4\u00c5\n\u0005\u0000"+
		"\u0000\u00c5\u00c6\u0007\u0004\u0000\u0000\u00c6\u00e4\u0003\u0014\n\u0006"+
		"\u00c7\u00c8\n\u0004\u0000\u0000\u00c8\u00c9\u0007\u0005\u0000\u0000\u00c9"+
		"\u00e4\u0003\u0014\n\u0005\u00ca\u00cb\n\u0002\u0000\u0000\u00cb\u00cc"+
		"\u0007\u0006\u0000\u0000\u00cc\u00e4\u0003\u0014\n\u0003\u00cd\u00ce\n"+
		"\u0001\u0000\u0000\u00ce\u00cf\u0005\u00cf\u0000\u0000\u00cf\u00e4\u0003"+
		"\u0014\n\u0001\u00d0\u00d1\n\u0010\u0000\u0000\u00d1\u00d3\u0005\u00da"+
		"\u0000\u0000\u00d2\u00d4\u0003\u0016\u000b\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00e4\u0005\u00db\u0000\u0000\u00d6\u00d7\n\u000f\u0000"+
		"\u0000\u00d7\u00d8\u0005\u00dc\u0000\u0000\u00d8\u00d9\u0003\u0014\n\u0000"+
		"\u00d9\u00da\u0005\u00dd\u0000\u0000\u00da\u00e4\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\n\u000e\u0000\u0000\u00dc\u00dd\u0005\u00de\u0000\u0000\u00dd"+
		"\u00de\u0003\u0014\n\u0000\u00de\u00df\u0005\u00df\u0000\u0000\u00df\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\n\u0003\u0000\u0000\u00e1\u00e2\u0007"+
		"\u0007\u0000\u0000\u00e2\u00e4\u0003\u001c\u000e\u0000\u00e3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00e3\u00b5\u0001\u0000\u0000\u0000\u00e3\u00b8\u0001"+
		"\u0000\u0000\u0000\u00e3\u00bb\u0001\u0000\u0000\u0000\u00e3\u00be\u0001"+
		"\u0000\u0000\u0000\u00e3\u00c1\u0001\u0000\u0000\u0000\u00e3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00e3\u00c7\u0001\u0000\u0000\u0000\u00e3\u00ca\u0001"+
		"\u0000\u0000\u0000\u00e3\u00cd\u0001\u0000\u0000\u0000\u00e3\u00d0\u0001"+
		"\u0000\u0000\u0000\u00e3\u00d6\u0001\u0000\u0000\u0000\u00e3\u00db\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u0015\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0006\u000b\uffff\uffff\u0000\u00e9\u00ec"+
		"\u0003\u0014\n\u0000\u00ea\u00ec\u0003\u0018\f\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00f4\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f0\u0005\u00d0\u0000\u0000\u00ee\u00f1\u0003"+
		"\u0014\n\u0000\u00ef\u00f1\u0003\u0018\f\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u0100\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f9\n\u0001\u0000\u0000\u00f8\u00fa\u0005\u00d0\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003\u0016\u000b"+
		"\u0002\u00fe\u00f7\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0017\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005\u0004\u0000\u0000\u0104\u0105\u0005\u00e0\u0000"+
		"\u0000\u0105\u0106\u0005\u00d7\u0000\u0000\u0106\u0107\u0005\u00e0\u0000"+
		"\u0000\u0107\u0111\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u00d0\u0000"+
		"\u0000\u0109\u010b\u0005\u0004\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005\u00e0\u0000\u0000\u010d\u010e\u0005\u00d7\u0000"+
		"\u0000\u010e\u0110\u0005\u00e0\u0000\u0000\u010f\u010a\u0001\u0000\u0000"+
		"\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0122\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0004\u0000"+
		"\u0000\u0115\u0119\u0005\u00e0\u0000\u0000\u0116\u0118\u0005\u00e0\u0000"+
		"\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u0122\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0005\u0004\u0000\u0000\u011d\u011e\u0005\u00e0\u0000"+
		"\u0000\u011e\u011f\u0005\u00de\u0000\u0000\u011f\u0120\u0005\u00d8\u0000"+
		"\u0000\u0120\u0122\u0005\u00df\u0000\u0000\u0121\u0103\u0001\u0000\u0000"+
		"\u0000\u0121\u0114\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000"+
		"\u0000\u0122\u0019\u0001\u0000\u0000\u0000\u0123\u0128\u0005\u00e0\u0000"+
		"\u0000\u0124\u0125\u0005\u00e0\u0000\u0000\u0125\u0126\u0005\u00d7\u0000"+
		"\u0000\u0126\u0128\u0005\u00e0\u0000\u0000\u0127\u0123\u0001\u0000\u0000"+
		"\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u001b\u0001\u0000\u0000\u0000\u012b\u013e\u0005\u00e0\u0000"+
		"\u0000\u012c\u012f\u0005\u00da\u0000\u0000\u012d\u0130\u0003 \u0010\u0000"+
		"\u012e\u0130\u0003\u001e\u000f\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0138\u0001\u0000\u0000\u0000"+
		"\u0131\u0134\u0005\u00d0\u0000\u0000\u0132\u0135\u0003 \u0010\u0000\u0133"+
		"\u0135\u0003\u001e\u000f\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134"+
		"\u0133\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136"+
		"\u0131\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u013b\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005\u00db\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d"+
		"\u012b\u0001\u0000\u0000\u0000\u013d\u012c\u0001\u0000\u0000\u0000\u013e"+
		"\u001d\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u00ca\u0000\u0000\u0140"+
		"\u0141\u0005\u00d4\u0000\u0000\u0141\u0142\u0005\u00ca\u0000\u0000\u0142"+
		"\u001f\u0001\u0000\u0000\u0000\u0143\u0144\u0007\b\u0000\u0000\u0144!"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0006\u0011\uffff\uffff\u0000\u0146"+
		"\u014b\u0005\u00e0\u0000\u0000\u0147\u014b\u0005\u00a0\u0000\u0000\u0148"+
		"\u014b\u0005\u009e\u0000\u0000\u0149\u014b\u0005\u00a5\u0000\u0000\u014a"+
		"\u0145\u0001\u0000\u0000\u0000\u014a\u0147\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u0151\u0001\u0000\u0000\u0000\u014c\u014d\n\u0005\u0000\u0000\u014d\u014e"+
		"\u0005\u00cd\u0000\u0000\u014e\u0150\u0003\"\u0011\u0006\u014f\u014c\u0001"+
		"\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152#\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000&\'258;GSV^chm~\u008a"+
		"\u008d\u0098\u009c\u00b0\u00d3\u00e3\u00e5\u00eb\u00f0\u00f4\u00fb\u0100"+
		"\u010a\u0111\u0119\u0121\u0127\u0129\u012f\u0134\u0138\u013d\u014a\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}