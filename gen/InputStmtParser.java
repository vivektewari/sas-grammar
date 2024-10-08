// Generated from /home/pooja/PycharmProjects/sas-grammar/InputStmt.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class InputStmtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, COMMENT=11, LINE_COMMENT=12, ABORT=13, ABEND=14, CANCEL=15, FILE=16, 
		RETURN=17, NOLIST=18, ARRAY=19, ARRAY_NUMERIC_ELEMENTS=20, ARRAY_CHARACTER_ELEMENTS=21, 
		ARRAY_ALL_ELEMENTS=22, BY=23, GROUPFORMAT=24, NOTSORTED=25, DESCENDING=26, 
		CALL=27, DATALINES=28, CARDS=29, LINES=30, DATALINES4=31, CARDS4=32, LINES4=33, 
		END_DATALINES4=34, SUM=35, INFILE=36, DISK=37, DUMMY=38, GTERM=39, PIPE=40, 
		PLOTTER=41, PRINTER=42, TAPE=43, TEMP=44, TERMINAL=45, UPRINTER=46, DSD=47, 
		EXPANDTABS=48, NOEXPANDTABS=49, FLOWOVER=50, MISSOVER=51, PAD=52, NOPAD=53, 
		SCANOVER=54, SHAREBUFFERS=55, STOPOVER=56, TRUNCOVER=57, V_INFILE_=58, 
		SEMICOLON=59, END=60, LENGTH=61, QKUPCASE=62, SYSEVALF=63, EVAL=64, LET=65, 
		QSCAN=66, SYSEXEC=67, ACT=68, LIST=69, QSUBSTR=70, SYSFUNC=71, ACTIVATE=72, 
		GLOBAL=73, LISTM=74, QSYSFUNC=75, SYSGET=76, BQUOTE=77, GO=78, LOCAL=79, 
		QUOTE=80, SYSRPUT=81, GOTO=82, MACRO=83, QUPCASE=84, THEN=85, CLEAR=86, 
		IF=87, MEND=88, RESOLVE=89, TO=90, CLOSE=91, INC=92, PAUSE=93, TSO=94, 
		CMS=95, INCLUDE=96, NRSTR=97, RUN=98, UNQUOTE=99, COMANDR=100, INDEX=101, 
		ON=102, SAVE=103, UNSTR=104, COPY=105, OPEN=106, SCAN=107, UNTIL=108, 
		DEACT=109, INPUT=110, PUT=111, STOP=112, UPCASE=113, DEL=114, KCMPRES=115, 
		NRBQUOTE=116, STR=117, WHILE=118, DELETE=119, KINDEX=120, NRQUOTE=121, 
		SYSCALL=122, WINDOW=123, DISPLAY=124, KLEFT=125, METASYM=126, SUBSTR=127, 
		DMIDSPLY=128, KLENGTH=129, QKCMPRES=130, SUPERQ=131, DMISPLIT=132, KSCAN=133, 
		QKLEFT=134, SYMDEL=135, DO=136, KSUBSTR=137, QKSCAN=138, SYMEXIST=139, 
		EDIT=140, KTRIM=141, QKSUBSTR=142, SYMGLOBL=143, ELSE=144, KUPCASE=145, 
		QKTRIM=146, SYMLOCAL=147, Tk_NULL=148, EXECUTE=149, DESCRIBE=150, LIBNAME=151, 
		DEBUG=152, NESTING=153, STACK=154, READ=155, PW=156, SOURCE=157, VIEW=158, 
		PGM=159, ENCRYPT=160, NOSAVE=161, SET=162, ALTER=163, INPUT_ODS=164, DATE=165, 
		DATETIME=166, DDMMYY=167, INFORMAT_COMMA=168, INFORMAT_CHAR=169, DROP=170, 
		PROC=171, ANOVA=172, MEANS=173, REG=174, CORR=175, SGPLOT=176, PRINT=177, 
		DATA=178, Informat=179, DOLLAR=180, EQ=181, NE=182, GT=183, LT=184, GE=185, 
		LE=186, IN=187, EQC=188, NEC=189, GTC=190, LTC=191, GEC=192, LEC=193, 
		INColon=194, AND=195, OR=196, NOT=197, MIN=198, MAX=199, DateLiteral=200, 
		TimeLiteral=201, DateTimeLiteral=202, BitLiteral=203, NameLiteral=204, 
		HexLiteral=205, STRINGLITERAL=206, INT=207, FloatingPointLiteral=208, 
		Number=209, DOT=210, AT=211, EQUAL=212, COMMA=213, LBracket=214, RBracket=215, 
		OF=216, COLON=217, PERCENT=218, ADD=219, SUB=220, MUL=221, DIV=222, LParentheses=223, 
		RParentheses=224, LBraces=225, RBraces=226, LSqBracket=227, RSqBracket=228, 
		Identifier=229;
	public static final int
		RULE_input_main = 0, RULE_input_stmt = 1, RULE_put_stmt = 2, RULE_input_specification = 3, 
		RULE_put_specification = 4, RULE_pointer_control = 5, RULE_informat_list = 6, 
		RULE_input_variable_format = 7, RULE_input_variable = 8, RULE_put_variable_format = 9, 
		RULE_put_variable = 10, RULE_column_point_control = 11, RULE_line_point_control = 12, 
		RULE_format_modifier = 13, RULE_column_specifications = 14, RULE_expression = 15, 
		RULE_expressionList = 16, RULE_of_var_list = 17, RULE_identifiers_list = 18, 
		RULE_in_var_list = 19, RULE_colonInts = 20, RULE_literal = 21, RULE_variables = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"input_main", "input_stmt", "put_stmt", "input_specification", "put_specification", 
			"pointer_control", "informat_list", "input_variable_format", "input_variable", 
			"put_variable_format", "put_variable", "column_point_control", "line_point_control", 
			"format_modifier", "column_specifications", "expression", "expressionList", 
			"of_var_list", "identifiers_list", "in_var_list", "colonInts", "literal", 
			"variables"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'?'", "'??'", "'&'", "'~'", "'**'", "'||'", "'!!'", "'of'", 
			null, null, null, "'abort'", "'abend'", "'cancel'", "'file'", "'return'", 
			"'nolist'", "'array'", "'_NUMERIC_'", "'_CHARACTER_'", "'_ALL_'", "'by'", 
			"'groupformat'", "'notsorted'", "'descending'", "'call'", "'datalines'", 
			"'cards'", "'lines'", "'datalines4'", "'cards4'", "'lines4'", "';;;;'", 
			null, "'infile'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "';'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'$'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'><'", "'<>'", null, 
			null, null, null, null, null, null, null, null, null, "'.'", "'@'", "'='", 
			"','", null, null, null, "':'", "'%'", "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "COMMENT", 
			"LINE_COMMENT", "ABORT", "ABEND", "CANCEL", "FILE", "RETURN", "NOLIST", 
			"ARRAY", "ARRAY_NUMERIC_ELEMENTS", "ARRAY_CHARACTER_ELEMENTS", "ARRAY_ALL_ELEMENTS", 
			"BY", "GROUPFORMAT", "NOTSORTED", "DESCENDING", "CALL", "DATALINES", 
			"CARDS", "LINES", "DATALINES4", "CARDS4", "LINES4", "END_DATALINES4", 
			"SUM", "INFILE", "DISK", "DUMMY", "GTERM", "PIPE", "PLOTTER", "PRINTER", 
			"TAPE", "TEMP", "TERMINAL", "UPRINTER", "DSD", "EXPANDTABS", "NOEXPANDTABS", 
			"FLOWOVER", "MISSOVER", "PAD", "NOPAD", "SCANOVER", "SHAREBUFFERS", "STOPOVER", 
			"TRUNCOVER", "V_INFILE_", "SEMICOLON", "END", "LENGTH", "QKUPCASE", "SYSEVALF", 
			"EVAL", "LET", "QSCAN", "SYSEXEC", "ACT", "LIST", "QSUBSTR", "SYSFUNC", 
			"ACTIVATE", "GLOBAL", "LISTM", "QSYSFUNC", "SYSGET", "BQUOTE", "GO", 
			"LOCAL", "QUOTE", "SYSRPUT", "GOTO", "MACRO", "QUPCASE", "THEN", "CLEAR", 
			"IF", "MEND", "RESOLVE", "TO", "CLOSE", "INC", "PAUSE", "TSO", "CMS", 
			"INCLUDE", "NRSTR", "RUN", "UNQUOTE", "COMANDR", "INDEX", "ON", "SAVE", 
			"UNSTR", "COPY", "OPEN", "SCAN", "UNTIL", "DEACT", "INPUT", "PUT", "STOP", 
			"UPCASE", "DEL", "KCMPRES", "NRBQUOTE", "STR", "WHILE", "DELETE", "KINDEX", 
			"NRQUOTE", "SYSCALL", "WINDOW", "DISPLAY", "KLEFT", "METASYM", "SUBSTR", 
			"DMIDSPLY", "KLENGTH", "QKCMPRES", "SUPERQ", "DMISPLIT", "KSCAN", "QKLEFT", 
			"SYMDEL", "DO", "KSUBSTR", "QKSCAN", "SYMEXIST", "EDIT", "KTRIM", "QKSUBSTR", 
			"SYMGLOBL", "ELSE", "KUPCASE", "QKTRIM", "SYMLOCAL", "Tk_NULL", "EXECUTE", 
			"DESCRIBE", "LIBNAME", "DEBUG", "NESTING", "STACK", "READ", "PW", "SOURCE", 
			"VIEW", "PGM", "ENCRYPT", "NOSAVE", "SET", "ALTER", "INPUT_ODS", "DATE", 
			"DATETIME", "DDMMYY", "INFORMAT_COMMA", "INFORMAT_CHAR", "DROP", "PROC", 
			"ANOVA", "MEANS", "REG", "CORR", "SGPLOT", "PRINT", "DATA", "Informat", 
			"DOLLAR", "EQ", "NE", "GT", "LT", "GE", "LE", "IN", "EQC", "NEC", "GTC", 
			"LTC", "GEC", "LEC", "INColon", "AND", "OR", "NOT", "MIN", "MAX", "DateLiteral", 
			"TimeLiteral", "DateTimeLiteral", "BitLiteral", "NameLiteral", "HexLiteral", 
			"STRINGLITERAL", "INT", "FloatingPointLiteral", "Number", "DOT", "AT", 
			"EQUAL", "COMMA", "LBracket", "RBracket", "OF", "COLON", "PERCENT", "ADD", 
			"SUB", "MUL", "DIV", "LParentheses", "RParentheses", "LBraces", "RBraces", 
			"LSqBracket", "RSqBracket", "Identifier"
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
	public String getGrammarFileName() { return "InputStmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InputStmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_mainContext extends ParserRuleContext {
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Put_stmtContext put_stmt() {
			return getRuleContext(Put_stmtContext.class,0);
		}
		public Input_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_mainContext input_main() throws RecognitionException {
		Input_mainContext _localctx = new Input_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				{
				setState(46);
				input_stmt();
				}
				break;
			case PUT:
				{
				setState(47);
				put_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(InputStmtParser.INPUT, 0); }
		public TerminalNode SEMICOLON() { return getToken(InputStmtParser.SEMICOLON, 0); }
		public List<Input_specificationContext> input_specification() {
			return getRuleContexts(Input_specificationContext.class);
		}
		public Input_specificationContext input_specification(int i) {
			return getRuleContext(Input_specificationContext.class,i);
		}
		public TerminalNode INPUT_ODS() { return getToken(InputStmtParser.INPUT_ODS, 0); }
		public List<TerminalNode> AT() { return getTokens(InputStmtParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(InputStmtParser.AT, i);
		}
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(INPUT);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					input_specification();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_ODS) {
				{
				setState(57);
				match(INPUT_ODS);
				}
			}

			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(60);
				match(AT);
				}
				break;
			case 2:
				{
				setState(61);
				match(AT);
				setState(62);
				match(AT);
				}
				break;
			}
			setState(65);
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
	public static class Put_stmtContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(InputStmtParser.PUT, 0); }
		public TerminalNode SEMICOLON() { return getToken(InputStmtParser.SEMICOLON, 0); }
		public List<Put_specificationContext> put_specification() {
			return getRuleContexts(Put_specificationContext.class);
		}
		public Put_specificationContext put_specification(int i) {
			return getRuleContext(Put_specificationContext.class,i);
		}
		public TerminalNode INPUT_ODS() { return getToken(InputStmtParser.INPUT_ODS, 0); }
		public List<TerminalNode> AT() { return getTokens(InputStmtParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(InputStmtParser.AT, i);
		}
		public Put_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPut_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPut_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPut_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Put_stmtContext put_stmt() throws RecognitionException {
		Put_stmtContext _localctx = new Put_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_put_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PUT);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					put_specification();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_ODS) {
				{
				setState(74);
				match(INPUT_ODS);
				}
			}

			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(77);
				match(AT);
				}
				break;
			case 2:
				{
				setState(78);
				match(AT);
				setState(79);
				match(AT);
				}
				break;
			}
			setState(82);
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
	public static class Input_specificationContext extends ParserRuleContext {
		public Pointer_controlContext pointer_control() {
			return getRuleContext(Pointer_controlContext.class,0);
		}
		public Input_variable_formatContext input_variable_format() {
			return getRuleContext(Input_variable_formatContext.class,0);
		}
		public Column_specificationsContext column_specifications() {
			return getRuleContext(Column_specificationsContext.class,0);
		}
		public List<TerminalNode> LParentheses() { return getTokens(InputStmtParser.LParentheses); }
		public TerminalNode LParentheses(int i) {
			return getToken(InputStmtParser.LParentheses, i);
		}
		public Identifiers_listContext identifiers_list() {
			return getRuleContext(Identifiers_listContext.class,0);
		}
		public List<TerminalNode> RParentheses() { return getTokens(InputStmtParser.RParentheses); }
		public TerminalNode RParentheses(int i) {
			return getToken(InputStmtParser.RParentheses, i);
		}
		public Informat_listContext informat_list() {
			return getRuleContext(Informat_listContext.class,0);
		}
		public Input_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_specificationContext input_specification() throws RecognitionException {
		Input_specificationContext _localctx = new Input_specificationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_specification);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case AT:
			case ADD:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				pointer_control();
				}
				break;
			case ALTER:
			case DATE:
			case DROP:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				input_variable_format();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				column_specifications();
				}
				break;
			case LParentheses:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(LParentheses);
				setState(88);
				identifiers_list();
				setState(89);
				match(RParentheses);
				setState(90);
				match(LParentheses);
				setState(91);
				informat_list();
				setState(92);
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
	public static class Put_specificationContext extends ParserRuleContext {
		public Pointer_controlContext pointer_control() {
			return getRuleContext(Pointer_controlContext.class,0);
		}
		public Put_variable_formatContext put_variable_format() {
			return getRuleContext(Put_variable_formatContext.class,0);
		}
		public Column_specificationsContext column_specifications() {
			return getRuleContext(Column_specificationsContext.class,0);
		}
		public List<TerminalNode> LParentheses() { return getTokens(InputStmtParser.LParentheses); }
		public TerminalNode LParentheses(int i) {
			return getToken(InputStmtParser.LParentheses, i);
		}
		public Identifiers_listContext identifiers_list() {
			return getRuleContext(Identifiers_listContext.class,0);
		}
		public List<TerminalNode> RParentheses() { return getTokens(InputStmtParser.RParentheses); }
		public TerminalNode RParentheses(int i) {
			return getToken(InputStmtParser.RParentheses, i);
		}
		public Informat_listContext informat_list() {
			return getRuleContext(Informat_listContext.class,0);
		}
		public Put_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPut_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPut_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPut_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Put_specificationContext put_specification() throws RecognitionException {
		Put_specificationContext _localctx = new Put_specificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_put_specification);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				pointer_control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				put_variable_format();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				column_specifications();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(LParentheses);
				setState(100);
				identifiers_list();
				setState(101);
				match(RParentheses);
				setState(102);
				match(LParentheses);
				setState(103);
				informat_list();
				setState(104);
				match(RParentheses);
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
	public static class Pointer_controlContext extends ParserRuleContext {
		public Line_point_controlContext line_point_control() {
			return getRuleContext(Line_point_controlContext.class,0);
		}
		public Column_point_controlContext column_point_control() {
			return getRuleContext(Column_point_controlContext.class,0);
		}
		public Pointer_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPointer_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPointer_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPointer_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_controlContext pointer_control() throws RecognitionException {
		Pointer_controlContext _localctx = new Pointer_controlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pointer_control);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				line_point_control();
				}
				break;
			case AT:
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				column_point_control();
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
	public static class Informat_listContext extends ParserRuleContext {
		public List<TerminalNode> Informat() { return getTokens(InputStmtParser.Informat); }
		public TerminalNode Informat(int i) {
			return getToken(InputStmtParser.Informat, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InputStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InputStmtParser.COMMA, i);
		}
		public List<Pointer_controlContext> pointer_control() {
			return getRuleContexts(Pointer_controlContext.class);
		}
		public Pointer_controlContext pointer_control(int i) {
			return getRuleContext(Pointer_controlContext.class,i);
		}
		public Informat_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informat_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInformat_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInformat_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInformat_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Informat_listContext informat_list() throws RecognitionException {
		Informat_listContext _localctx = new Informat_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_informat_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				match(Informat);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(113);
					match(COMMA);
					}
				}

				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & 2305L) != 0)) {
					{
					setState(116);
					pointer_control();
					}
				}

				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Informat );
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
	public static class Input_variable_formatContext extends ParserRuleContext {
		public Input_variableContext input_variable() {
			return getRuleContext(Input_variableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(InputStmtParser.EQUAL, 0); }
		public Format_modifierContext format_modifier() {
			return getRuleContext(Format_modifierContext.class,0);
		}
		public TerminalNode Informat() { return getToken(InputStmtParser.Informat, 0); }
		public TerminalNode DOLLAR() { return getToken(InputStmtParser.DOLLAR, 0); }
		public Input_variable_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_variable_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_variable_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_variable_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_variable_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_variable_formatContext input_variable_format() throws RecognitionException {
		Input_variable_formatContext _localctx = new Input_variable_formatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_input_variable_format);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				input_variable();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(124);
					match(EQUAL);
					}
				}

				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) || _la==COLON) {
					{
					setState(127);
					format_modifier();
					}
				}

				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Informat) {
					{
					setState(130);
					match(Informat);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				input_variable();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(134);
					match(EQUAL);
					}
				}

				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) || _la==COLON) {
					{
					setState(137);
					format_modifier();
					}
				}

				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(140);
					match(DOLLAR);
					}
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
	public static class Input_variableContext extends ParserRuleContext {
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode SUB() { return getToken(InputStmtParser.SUB, 0); }
		public TerminalNode LBraces() { return getToken(InputStmtParser.LBraces, 0); }
		public TerminalNode MUL() { return getToken(InputStmtParser.MUL, 0); }
		public TerminalNode RBraces() { return getToken(InputStmtParser.RBraces, 0); }
		public Input_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_variableContext input_variable() throws RecognitionException {
		Input_variableContext _localctx = new Input_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_input_variable);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				variables(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				variables(0);
				setState(147);
				match(SUB);
				setState(148);
				variables(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				variables(0);
				setState(151);
				match(LBraces);
				setState(152);
				match(MUL);
				setState(153);
				match(RBraces);
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
	public static class Put_variable_formatContext extends ParserRuleContext {
		public Put_variableContext put_variable() {
			return getRuleContext(Put_variableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(InputStmtParser.EQUAL, 0); }
		public Format_modifierContext format_modifier() {
			return getRuleContext(Format_modifierContext.class,0);
		}
		public TerminalNode Informat() { return getToken(InputStmtParser.Informat, 0); }
		public TerminalNode DOLLAR() { return getToken(InputStmtParser.DOLLAR, 0); }
		public Put_variable_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_variable_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPut_variable_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPut_variable_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPut_variable_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Put_variable_formatContext put_variable_format() throws RecognitionException {
		Put_variable_formatContext _localctx = new Put_variable_formatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_put_variable_format);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				put_variable();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(158);
					match(EQUAL);
					}
				}

				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) || _la==COLON) {
					{
					setState(161);
					format_modifier();
					}
				}

				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Informat) {
					{
					setState(164);
					match(Informat);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				put_variable();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(168);
					match(EQUAL);
					}
				}

				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) || _la==COLON) {
					{
					setState(171);
					format_modifier();
					}
				}

				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(174);
					match(DOLLAR);
					}
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
	public static class Put_variableContext extends ParserRuleContext {
		public TerminalNode V_INFILE_() { return getToken(InputStmtParser.V_INFILE_, 0); }
		public TerminalNode ARRAY_ALL_ELEMENTS() { return getToken(InputStmtParser.ARRAY_ALL_ELEMENTS, 0); }
		public Input_variableContext input_variable() {
			return getRuleContext(Input_variableContext.class,0);
		}
		public TerminalNode STRINGLITERAL() { return getToken(InputStmtParser.STRINGLITERAL, 0); }
		public TerminalNode INT() { return getToken(InputStmtParser.INT, 0); }
		public TerminalNode MUL() { return getToken(InputStmtParser.MUL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Put_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPut_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPut_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPut_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Put_variableContext put_variable() throws RecognitionException {
		Put_variableContext _localctx = new Put_variableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_put_variable);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(V_INFILE_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(ARRAY_ALL_ELEMENTS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				input_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(182);
					match(INT);
					setState(183);
					match(MUL);
					}
				}

				setState(186);
				match(STRINGLITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				literal();
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
	public static class Column_point_controlContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(InputStmtParser.AT, 0); }
		public TerminalNode INT() { return getToken(InputStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(InputStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public TerminalNode LParentheses() { return getToken(InputStmtParser.LParentheses, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParentheses() { return getToken(InputStmtParser.RParentheses, 0); }
		public TerminalNode ADD() { return getToken(InputStmtParser.ADD, 0); }
		public Column_point_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_point_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterColumn_point_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitColumn_point_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitColumn_point_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_point_controlContext column_point_control() throws RecognitionException {
		Column_point_controlContext _localctx = new Column_point_controlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column_point_control);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(AT);
				setState(191);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(AT);
				setState(193);
				match(FloatingPointLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(AT);
				setState(195);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(AT);
				setState(197);
				match(LParentheses);
				setState(198);
				expression(0);
				setState(199);
				match(RParentheses);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(ADD);
				setState(202);
				match(INT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(ADD);
				setState(204);
				match(Identifier);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				match(ADD);
				setState(206);
				match(FloatingPointLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				match(ADD);
				setState(208);
				match(LParentheses);
				setState(209);
				expression(0);
				setState(210);
				match(RParentheses);
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
	public static class Line_point_controlContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(InputStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(InputStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode LParentheses() { return getToken(InputStmtParser.LParentheses, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParentheses() { return getToken(InputStmtParser.RParentheses, 0); }
		public TerminalNode DIV() { return getToken(InputStmtParser.DIV, 0); }
		public Line_point_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_point_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterLine_point_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitLine_point_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitLine_point_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_point_controlContext line_point_control() throws RecognitionException {
		Line_point_controlContext _localctx = new Line_point_controlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line_point_control);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__0);
				setState(215);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__0);
				setState(217);
				match(FloatingPointLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(T__0);
				setState(219);
				match(LParentheses);
				setState(220);
				expression(0);
				setState(221);
				match(RParentheses);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(DIV);
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
	public static class Format_modifierContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(InputStmtParser.COLON, 0); }
		public Format_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterFormat_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitFormat_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitFormat_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Format_modifierContext format_modifier() throws RecognitionException {
		Format_modifierContext _localctx = new Format_modifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_format_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) || _la==COLON) ) {
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
	public static class Column_specificationsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(InputStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InputStmtParser.INT, i);
		}
		public TerminalNode SUB() { return getToken(InputStmtParser.SUB, 0); }
		public Column_specificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_specifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterColumn_specifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitColumn_specifications(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitColumn_specifications(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_specificationsContext column_specifications() throws RecognitionException {
		Column_specificationsContext _localctx = new Column_specificationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_specifications);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(INT);
			setState(229);
			match(SUB);
			setState(230);
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
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public TerminalNode LParentheses() { return getToken(InputStmtParser.LParentheses, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RParentheses() { return getToken(InputStmtParser.RParentheses, 0); }
		public TerminalNode ADD() { return getToken(InputStmtParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(InputStmtParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(InputStmtParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(InputStmtParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(InputStmtParser.MAX, 0); }
		public TerminalNode MUL() { return getToken(InputStmtParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(InputStmtParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(InputStmtParser.PERCENT, 0); }
		public TerminalNode EQ() { return getToken(InputStmtParser.EQ, 0); }
		public TerminalNode NE() { return getToken(InputStmtParser.NE, 0); }
		public TerminalNode GT() { return getToken(InputStmtParser.GT, 0); }
		public TerminalNode LT() { return getToken(InputStmtParser.LT, 0); }
		public TerminalNode GE() { return getToken(InputStmtParser.GE, 0); }
		public TerminalNode LE() { return getToken(InputStmtParser.LE, 0); }
		public TerminalNode EQC() { return getToken(InputStmtParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(InputStmtParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(InputStmtParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(InputStmtParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(InputStmtParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(InputStmtParser.LEC, 0); }
		public TerminalNode AND() { return getToken(InputStmtParser.AND, 0); }
		public TerminalNode OR() { return getToken(InputStmtParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(InputStmtParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode LBraces() { return getToken(InputStmtParser.LBraces, 0); }
		public TerminalNode RBraces() { return getToken(InputStmtParser.RBraces, 0); }
		public TerminalNode LSqBracket() { return getToken(InputStmtParser.LSqBracket, 0); }
		public TerminalNode RSqBracket() { return getToken(InputStmtParser.RSqBracket, 0); }
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(InputStmtParser.IN, 0); }
		public TerminalNode INColon() { return getToken(InputStmtParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
				setState(233);
				literal();
				}
				break;
			case Identifier:
				{
				setState(234);
				match(Identifier);
				}
				break;
			case LParentheses:
				{
				setState(235);
				match(LParentheses);
				setState(236);
				expression(0);
				setState(237);
				match(RParentheses);
				}
				break;
			case ADD:
			case SUB:
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(241);
				match(NOT);
				setState(242);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(246);
						match(T__5);
						setState(247);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(249);
						match(MIN);
						setState(250);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(252);
						match(MAX);
						setState(253);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(255);
						_la = _input.LA(1);
						if ( !(((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & 25L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(256);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(258);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(261);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(264);
						_la = _input.LA(1);
						if ( !(((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(267);
						_la = _input.LA(1);
						if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(270);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(273);
						match(EQUAL);
						setState(274);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(276);
						match(LParentheses);
						setState(278);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__8 || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & 4374671353L) != 0)) {
							{
							setState(277);
							expressionList(0);
							}
						}

						setState(280);
						match(RParentheses);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(282);
						match(LBraces);
						setState(283);
						expression(0);
						setState(284);
						match(RBraces);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(287);
						match(LSqBracket);
						setState(288);
						expression(0);
						setState(289);
						match(RSqBracket);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(InputStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InputStmtParser.COMMA, i);
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
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitExpressionList(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
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
				setState(300);
				expression(0);
				}
				break;
			case T__8:
				{
				setState(301);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					match(COMMA);
					setState(307);
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
						setState(305);
						expression(0);
						}
						break;
					case T__8:
						{
						setState(306);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(314);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(315);
						match(COMMA);
						}
						}
						setState(318); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(320);
					expressionList(2);
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(InputStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(InputStmtParser.Identifier, i);
		}
		public List<TerminalNode> SUB() { return getTokens(InputStmtParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(InputStmtParser.SUB, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InputStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InputStmtParser.COMMA, i);
		}
		public TerminalNode LSqBracket() { return getToken(InputStmtParser.LSqBracket, 0); }
		public TerminalNode MUL() { return getToken(InputStmtParser.MUL, 0); }
		public TerminalNode RSqBracket() { return getToken(InputStmtParser.RSqBracket, 0); }
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__8);
				{
				setState(327);
				match(Identifier);
				setState(328);
				match(SUB);
				setState(329);
				match(Identifier);
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(331);
							match(COMMA);
							setState(332);
							match(T__8);
							}
						}

						{
						setState(335);
						match(Identifier);
						setState(336);
						match(SUB);
						setState(337);
						match(Identifier);
						}
						}
						} 
					}
					setState(342);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(T__8);
				setState(344);
				match(Identifier);
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						match(Identifier);
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(T__8);
				setState(352);
				match(Identifier);
				setState(353);
				match(LSqBracket);
				setState(354);
				match(MUL);
				setState(355);
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
		public List<TerminalNode> Identifier() { return getTokens(InputStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(InputStmtParser.Identifier, i);
		}
		public List<TerminalNode> SUB() { return getTokens(InputStmtParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(InputStmtParser.SUB, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(358);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(359);
					match(Identifier);
					setState(360);
					match(SUB);
					setState(361);
					match(Identifier);
					}
					break;
				}
				}
				setState(364); 
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
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public TerminalNode LParentheses() { return getToken(InputStmtParser.LParentheses, 0); }
		public TerminalNode RParentheses() { return getToken(InputStmtParser.RParentheses, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(InputStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InputStmtParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_in_var_list);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(Identifier);
				}
				break;
			case LParentheses:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(LParentheses);
				setState(370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(368);
					literal();
					}
					break;
				case 2:
					{
					setState(369);
					colonInts();
					}
					break;
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(372);
					match(COMMA);
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(373);
						literal();
						}
						break;
					case 2:
						{
						setState(374);
						colonInts();
						}
						break;
					}
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
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
		public List<TerminalNode> INT() { return getTokens(InputStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InputStmtParser.INT, i);
		}
		public TerminalNode COLON() { return getToken(InputStmtParser.COLON, 0); }
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(INT);
			setState(387);
			match(COLON);
			setState(388);
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
		public TerminalNode INT() { return getToken(InputStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(InputStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(InputStmtParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(InputStmtParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(InputStmtParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(InputStmtParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(InputStmtParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(InputStmtParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(InputStmtParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(InputStmtParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 1535L) != 0)) ) {
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
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(InputStmtParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(InputStmtParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(InputStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(InputStmtParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitVariables(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(393);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(394);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(395);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(396);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variables);
					setState(399);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(400);
					match(DOT);
					setState(401);
					variables(6);
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 22:
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
		"\u0004\u0001\u00e5\u0198\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0003\u00001\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t"+
		"\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002F\b\u0002\n\u0002\f\u0002I\t\u0002\u0001\u0002\u0003"+
		"\u0002L\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Q\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003_\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004k\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0006\u0003\u0006v\b\u0006"+
		"\u0004\u0006x\b\u0006\u000b\u0006\f\u0006y\u0001\u0007\u0001\u0007\u0003"+
		"\u0007~\b\u0007\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0084\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0088\b\u0007"+
		"\u0001\u0007\u0003\u0007\u008b\b\u0007\u0001\u0007\u0003\u0007\u008e\b"+
		"\u0007\u0003\u0007\u0090\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\t\u0001"+
		"\t\u0003\t\u00a0\b\t\u0001\t\u0003\t\u00a3\b\t\u0001\t\u0003\t\u00a6\b"+
		"\t\u0001\t\u0001\t\u0003\t\u00aa\b\t\u0001\t\u0003\t\u00ad\b\t\u0001\t"+
		"\u0003\t\u00b0\b\t\u0003\t\u00b2\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00b9\b\n\u0001\n\u0001\n\u0003\n\u00bd\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d5\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00e1\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00f4\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0117"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0127\b\u000f\n\u000f\f\u000f"+
		"\u012a\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u012f\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0134\b\u0010\u0005"+
		"\u0010\u0136\b\u0010\n\u0010\f\u0010\u0139\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u013d\b\u0010\u000b\u0010\f\u0010\u013e\u0001\u0010\u0005"+
		"\u0010\u0142\b\u0010\n\u0010\f\u0010\u0145\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u014e\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0153\b"+
		"\u0011\n\u0011\f\u0011\u0156\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u015b\b\u0011\n\u0011\f\u0011\u015e\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0165\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u016b\b\u0012\u000b"+
		"\u0012\f\u0012\u016c\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0173\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0178"+
		"\b\u0013\u0005\u0013\u017a\b\u0013\n\u0013\f\u0013\u017d\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0181\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u018e\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0193\b\u0016\n\u0016\f\u0016\u0196\t\u0016"+
		"\u0001\u0016\u0000\u0003\u001e ,\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\t\u0002"+
		"\u0000\u0002\u0005\u00d9\u00d9\u0001\u0000\u00db\u00dc\u0002\u0000\u00da"+
		"\u00da\u00dd\u00de\u0001\u0000\u0007\b\u0001\u0000\u00b5\u00ba\u0001\u0000"+
		"\u00bc\u00c1\u0001\u0000\u00c3\u00c4\u0002\u0000\u00bb\u00bb\u00c2\u00c2"+
		"\u0002\u0000\u00c8\u00d0\u00d2\u00d2\u01d9\u00000\u0001\u0000\u0000\u0000"+
		"\u00022\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006^"+
		"\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000"+
		"\u0000\fw\u0001\u0000\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000"+
		"\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u00b1\u0001\u0000\u0000\u0000"+
		"\u0014\u00bc\u0001\u0000\u0000\u0000\u0016\u00d4\u0001\u0000\u0000\u0000"+
		"\u0018\u00e0\u0001\u0000\u0000\u0000\u001a\u00e2\u0001\u0000\u0000\u0000"+
		"\u001c\u00e4\u0001\u0000\u0000\u0000\u001e\u00f3\u0001\u0000\u0000\u0000"+
		" \u012b\u0001\u0000\u0000\u0000\"\u0164\u0001\u0000\u0000\u0000$\u016a"+
		"\u0001\u0000\u0000\u0000&\u0180\u0001\u0000\u0000\u0000(\u0182\u0001\u0000"+
		"\u0000\u0000*\u0186\u0001\u0000\u0000\u0000,\u018d\u0001\u0000\u0000\u0000"+
		".1\u0003\u0002\u0001\u0000/1\u0003\u0004\u0002\u00000.\u0001\u0000\u0000"+
		"\u00000/\u0001\u0000\u0000\u00001\u0001\u0001\u0000\u0000\u000026\u0005"+
		"n\u0000\u000035\u0003\u0006\u0003\u000043\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009;\u0005\u00a4\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;?\u0001\u0000"+
		"\u0000\u0000<@\u0005\u00d3\u0000\u0000=>\u0005\u00d3\u0000\u0000>@\u0005"+
		"\u00d3\u0000\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005;\u0000\u0000"+
		"B\u0003\u0001\u0000\u0000\u0000CG\u0005o\u0000\u0000DF\u0003\b\u0004\u0000"+
		"ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JL\u0005\u00a4\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LP\u0001\u0000\u0000\u0000MQ\u0005\u00d3\u0000\u0000"+
		"NO\u0005\u00d3\u0000\u0000OQ\u0005\u00d3\u0000\u0000PM\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0005;\u0000\u0000S\u0005\u0001\u0000\u0000\u0000T_\u0003"+
		"\n\u0005\u0000U_\u0003\u000e\u0007\u0000V_\u0003\u001c\u000e\u0000WX\u0005"+
		"\u00df\u0000\u0000XY\u0003$\u0012\u0000YZ\u0005\u00e0\u0000\u0000Z[\u0005"+
		"\u00df\u0000\u0000[\\\u0003\f\u0006\u0000\\]\u0005\u00e0\u0000\u0000]"+
		"_\u0001\u0000\u0000\u0000^T\u0001\u0000\u0000\u0000^U\u0001\u0000\u0000"+
		"\u0000^V\u0001\u0000\u0000\u0000^W\u0001\u0000\u0000\u0000_\u0007\u0001"+
		"\u0000\u0000\u0000`k\u0003\n\u0005\u0000ak\u0003\u0012\t\u0000bk\u0003"+
		"\u001c\u000e\u0000cd\u0005\u00df\u0000\u0000de\u0003$\u0012\u0000ef\u0005"+
		"\u00e0\u0000\u0000fg\u0005\u00df\u0000\u0000gh\u0003\f\u0006\u0000hi\u0005"+
		"\u00e0\u0000\u0000ik\u0001\u0000\u0000\u0000j`\u0001\u0000\u0000\u0000"+
		"ja\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000jc\u0001\u0000\u0000"+
		"\u0000k\t\u0001\u0000\u0000\u0000lo\u0003\u0018\f\u0000mo\u0003\u0016"+
		"\u000b\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u000b"+
		"\u0001\u0000\u0000\u0000pr\u0005\u00b3\u0000\u0000qs\u0005\u00d5\u0000"+
		"\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tv\u0003\n\u0005\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wp\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z\r\u0001\u0000\u0000\u0000{}\u0003\u0010\b\u0000|~\u0005\u00d4\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f\u0081\u0003\u001a\r\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000"+
		"\u0000\u0000\u0082\u0084\u0005\u00b3\u0000\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0090\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0003\u0010\b\u0000\u0086\u0088\u0005\u00d4\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u001a\r\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008e\u0005\u00b4\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0001\u0000\u0000\u0000\u008f{\u0001\u0000\u0000\u0000\u008f"+
		"\u0085\u0001\u0000\u0000\u0000\u0090\u000f\u0001\u0000\u0000\u0000\u0091"+
		"\u009c\u0003,\u0016\u0000\u0092\u0093\u0003,\u0016\u0000\u0093\u0094\u0005"+
		"\u00dc\u0000\u0000\u0094\u0095\u0003,\u0016\u0000\u0095\u009c\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0003,\u0016\u0000\u0097\u0098\u0005\u00e1\u0000"+
		"\u0000\u0098\u0099\u0005\u00dd\u0000\u0000\u0099\u009a\u0005\u00e2\u0000"+
		"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0091\u0001\u0000\u0000"+
		"\u0000\u009b\u0092\u0001\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000"+
		"\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009f\u0003\u0014\n\u0000"+
		"\u009e\u00a0\u0005\u00d4\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0003\u001a\r\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0005\u00b3\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00b2\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0003\u0014\n\u0000\u00a8\u00aa\u0005\u00d4\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\u001a\r\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0005\u00b4\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u009d\u0001\u0000\u0000\u0000\u00b1\u00a7\u0001"+
		"\u0000\u0000\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00bd\u0005"+
		":\u0000\u0000\u00b4\u00bd\u0005\u0016\u0000\u0000\u00b5\u00bd\u0003\u0010"+
		"\b\u0000\u00b6\u00b7\u0005\u00cf\u0000\u0000\u00b7\u00b9\u0005\u00dd\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0005\u00ce\u0000"+
		"\u0000\u00bb\u00bd\u0003*\u0015\u0000\u00bc\u00b3\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00b5\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u0015\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u00d3\u0000\u0000"+
		"\u00bf\u00d5\u0005\u00cf\u0000\u0000\u00c0\u00c1\u0005\u00d3\u0000\u0000"+
		"\u00c1\u00d5\u0005\u00d0\u0000\u0000\u00c2\u00c3\u0005\u00d3\u0000\u0000"+
		"\u00c3\u00d5\u0005\u00e5\u0000\u0000\u00c4\u00c5\u0005\u00d3\u0000\u0000"+
		"\u00c5\u00c6\u0005\u00df\u0000\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000"+
		"\u00c7\u00c8\u0005\u00e0\u0000\u0000\u00c8\u00d5\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u00db\u0000\u0000\u00ca\u00d5\u0005\u00cf\u0000\u0000"+
		"\u00cb\u00cc\u0005\u00db\u0000\u0000\u00cc\u00d5\u0005\u00e5\u0000\u0000"+
		"\u00cd\u00ce\u0005\u00db\u0000\u0000\u00ce\u00d5\u0005\u00d0\u0000\u0000"+
		"\u00cf\u00d0\u0005\u00db\u0000\u0000\u00d0\u00d1\u0005\u00df\u0000\u0000"+
		"\u00d1\u00d2\u0003\u001e\u000f\u0000\u00d2\u00d3\u0005\u00e0\u0000\u0000"+
		"\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00be\u0001\u0000\u0000\u0000"+
		"\u00d4\u00c0\u0001\u0000\u0000\u0000\u00d4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00c4\u0001\u0000\u0000\u0000\u00d4\u00c9\u0001\u0000\u0000\u0000"+
		"\u00d4\u00cb\u0001\u0000\u0000\u0000\u00d4\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d5\u0017\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\u0001\u0000\u0000\u00d7\u00e1\u0005\u00cf\u0000\u0000"+
		"\u00d8\u00d9\u0005\u0001\u0000\u0000\u00d9\u00e1\u0005\u00d0\u0000\u0000"+
		"\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00dc\u0005\u00df\u0000\u0000"+
		"\u00dc\u00dd\u0003\u001e\u000f\u0000\u00dd\u00de\u0005\u00e0\u0000\u0000"+
		"\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00e1\u0005\u00de\u0000\u0000"+
		"\u00e0\u00d6\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000\u0000"+
		"\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u0019\u0001\u0000\u0000\u0000\u00e2\u00e3\u0007\u0000\u0000\u0000"+
		"\u00e3\u001b\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u00cf\u0000\u0000"+
		"\u00e5\u00e6\u0005\u00dc\u0000\u0000\u00e6\u00e7\u0005\u00cf\u0000\u0000"+
		"\u00e7\u001d\u0001\u0000\u0000\u0000\u00e8\u00e9\u0006\u000f\uffff\uffff"+
		"\u0000\u00e9\u00f4\u0003*\u0015\u0000\u00ea\u00f4\u0005\u00e5\u0000\u0000"+
		"\u00eb\u00ec\u0005\u00df\u0000\u0000\u00ec\u00ed\u0003\u001e\u000f\u0000"+
		"\u00ed\u00ee\u0005\u00e0\u0000\u0000\u00ee\u00f4\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0007\u0001\u0000\u0000\u00f0\u00f4\u0003\u001e\u000f\f\u00f1"+
		"\u00f2\u0005\u00c5\u0000\u0000\u00f2\u00f4\u0003\u001e\u000f\u000b\u00f3"+
		"\u00e8\u0001\u0000\u0000\u0000\u00f3\u00ea\u0001\u0000\u0000\u0000\u00f3"+
		"\u00eb\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u0128\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\n\r\u0000\u0000\u00f6\u00f7\u0005\u0006\u0000\u0000\u00f7\u0127"+
		"\u0003\u001e\u000f\r\u00f8\u00f9\n\n\u0000\u0000\u00f9\u00fa\u0005\u00c6"+
		"\u0000\u0000\u00fa\u0127\u0003\u001e\u000f\u000b\u00fb\u00fc\n\t\u0000"+
		"\u0000\u00fc\u00fd\u0005\u00c7\u0000\u0000\u00fd\u0127\u0003\u001e\u000f"+
		"\n\u00fe\u00ff\n\b\u0000\u0000\u00ff\u0100\u0007\u0002\u0000\u0000\u0100"+
		"\u0127\u0003\u001e\u000f\t\u0101\u0102\n\u0007\u0000\u0000\u0102\u0103"+
		"\u0007\u0001\u0000\u0000\u0103\u0127\u0003\u001e\u000f\b\u0104\u0105\n"+
		"\u0006\u0000\u0000\u0105\u0106\u0007\u0003\u0000\u0000\u0106\u0127\u0003"+
		"\u001e\u000f\u0007\u0107\u0108\n\u0005\u0000\u0000\u0108\u0109\u0007\u0004"+
		"\u0000\u0000\u0109\u0127\u0003\u001e\u000f\u0006\u010a\u010b\n\u0004\u0000"+
		"\u0000\u010b\u010c\u0007\u0005\u0000\u0000\u010c\u0127\u0003\u001e\u000f"+
		"\u0005\u010d\u010e\n\u0002\u0000\u0000\u010e\u010f\u0007\u0006\u0000\u0000"+
		"\u010f\u0127\u0003\u001e\u000f\u0003\u0110\u0111\n\u0001\u0000\u0000\u0111"+
		"\u0112\u0005\u00d4\u0000\u0000\u0112\u0127\u0003\u001e\u000f\u0001\u0113"+
		"\u0114\n\u0010\u0000\u0000\u0114\u0116\u0005\u00df\u0000\u0000\u0115\u0117"+
		"\u0003 \u0010\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0127\u0005"+
		"\u00e0\u0000\u0000\u0119\u011a\n\u000f\u0000\u0000\u011a\u011b\u0005\u00e1"+
		"\u0000\u0000\u011b\u011c\u0003\u001e\u000f\u0000\u011c\u011d\u0005\u00e2"+
		"\u0000\u0000\u011d\u0127\u0001\u0000\u0000\u0000\u011e\u011f\n\u000e\u0000"+
		"\u0000\u011f\u0120\u0005\u00e3\u0000\u0000\u0120\u0121\u0003\u001e\u000f"+
		"\u0000\u0121\u0122\u0005\u00e4\u0000\u0000\u0122\u0127\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\n\u0003\u0000\u0000\u0124\u0125\u0007\u0007\u0000\u0000"+
		"\u0125\u0127\u0003&\u0013\u0000\u0126\u00f5\u0001\u0000\u0000\u0000\u0126"+
		"\u00f8\u0001\u0000\u0000\u0000\u0126\u00fb\u0001\u0000\u0000\u0000\u0126"+
		"\u00fe\u0001\u0000\u0000\u0000\u0126\u0101\u0001\u0000\u0000\u0000\u0126"+
		"\u0104\u0001\u0000\u0000\u0000\u0126\u0107\u0001\u0000\u0000\u0000\u0126"+
		"\u010a\u0001\u0000\u0000\u0000\u0126\u010d\u0001\u0000\u0000\u0000\u0126"+
		"\u0110\u0001\u0000\u0000\u0000\u0126\u0113\u0001\u0000\u0000\u0000\u0126"+
		"\u0119\u0001\u0000\u0000\u0000\u0126\u011e\u0001\u0000\u0000\u0000\u0126"+
		"\u0123\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u001f\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b"+
		"\u012e\u0006\u0010\uffff\uffff\u0000\u012c\u012f\u0003\u001e\u000f\u0000"+
		"\u012d\u012f\u0003\"\u0011\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u0137\u0001\u0000\u0000\u0000\u0130"+
		"\u0133\u0005\u00d5\u0000\u0000\u0131\u0134\u0003\u001e\u000f\u0000\u0132"+
		"\u0134\u0003\"\u0011\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0130"+
		"\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0143"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013c"+
		"\n\u0001\u0000\u0000\u013b\u013d\u0005\u00d5\u0000\u0000\u013c\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0142\u0003 \u0010\u0002\u0141\u013a\u0001\u0000"+
		"\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144!\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0005\t\u0000\u0000"+
		"\u0147\u0148\u0005\u00e5\u0000\u0000\u0148\u0149\u0005\u00dc\u0000\u0000"+
		"\u0149\u014a\u0005\u00e5\u0000\u0000\u014a\u0154\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0005\u00d5\u0000\u0000\u014c\u014e\u0005\t\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u00e5\u0000\u0000\u0150"+
		"\u0151\u0005\u00dc\u0000\u0000\u0151\u0153\u0005\u00e5\u0000\u0000\u0152"+
		"\u014d\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154"+
		"\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155"+
		"\u0165\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0005\t\u0000\u0000\u0158\u015c\u0005\u00e5\u0000\u0000\u0159\u015b"+
		"\u0005\u00e5\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\u015e"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u0165\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0005\t\u0000\u0000\u0160\u0161\u0005"+
		"\u00e5\u0000\u0000\u0161\u0162\u0005\u00e3\u0000\u0000\u0162\u0163\u0005"+
		"\u00dd\u0000\u0000\u0163\u0165\u0005\u00e4\u0000\u0000\u0164\u0146\u0001"+
		"\u0000\u0000\u0000\u0164\u0157\u0001\u0000\u0000\u0000\u0164\u015f\u0001"+
		"\u0000\u0000\u0000\u0165#\u0001\u0000\u0000\u0000\u0166\u016b\u0005\u00e5"+
		"\u0000\u0000\u0167\u0168\u0005\u00e5\u0000\u0000\u0168\u0169\u0005\u00dc"+
		"\u0000\u0000\u0169\u016b\u0005\u00e5\u0000\u0000\u016a\u0166\u0001\u0000"+
		"\u0000\u0000\u016a\u0167\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d%\u0001\u0000\u0000\u0000\u016e\u0181\u0005\u00e5\u0000"+
		"\u0000\u016f\u0172\u0005\u00df\u0000\u0000\u0170\u0173\u0003*\u0015\u0000"+
		"\u0171\u0173\u0003(\u0014\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0171\u0001\u0000\u0000\u0000\u0173\u017b\u0001\u0000\u0000\u0000\u0174"+
		"\u0177\u0005\u00d5\u0000\u0000\u0175\u0178\u0003*\u0015\u0000\u0176\u0178"+
		"\u0003(\u0014\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0176\u0001"+
		"\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0174\u0001"+
		"\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0001"+
		"\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u017f\u0005"+
		"\u00e0\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u016e\u0001"+
		"\u0000\u0000\u0000\u0180\u016f\u0001\u0000\u0000\u0000\u0181\'\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0005\u00cf\u0000\u0000\u0183\u0184\u0005\u00d9"+
		"\u0000\u0000\u0184\u0185\u0005\u00cf\u0000\u0000\u0185)\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0007\b\u0000\u0000\u0187+\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0006\u0016\uffff\uffff\u0000\u0189\u018e\u0005\u00e5\u0000"+
		"\u0000\u018a\u018e\u0005\u00a5\u0000\u0000\u018b\u018e\u0005\u00a3\u0000"+
		"\u0000\u018c\u018e\u0005\u00aa\u0000\u0000\u018d\u0188\u0001\u0000\u0000"+
		"\u0000\u018d\u018a\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0194\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\n\u0005\u0000\u0000\u0190\u0191\u0005\u00d2\u0000\u0000"+
		"\u0191\u0193\u0003,\u0016\u0006\u0192\u018f\u0001\u0000\u0000\u0000\u0193"+
		"\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0001\u0000\u0000\u0000\u0195-\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000506:?GKP^jnruy}\u0080\u0083\u0087\u008a\u008d"+
		"\u008f\u009b\u009f\u00a2\u00a5\u00a9\u00ac\u00af\u00b1\u00b8\u00bc\u00d4"+
		"\u00e0\u00f3\u0116\u0126\u0128\u012e\u0133\u0137\u013e\u0143\u014d\u0154"+
		"\u015c\u0164\u016a\u016c\u0172\u0177\u017b\u0180\u018d\u0194";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}