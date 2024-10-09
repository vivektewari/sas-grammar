lexer grammar CommonLexerRules; // note "lexer grammar"




fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');
// infile

SUM : S U M ;
INFILE : I N F I L E ;
DISK :  D I S K; 
DUMMY :  D U M M Y ; 
GTERM : G T E R M ;
PIPE : P I P E ;
PLOTTER : P L O T T E R ;
PRINTER : P R I N T E R ;
TAPE : T A P E ;
TEMP : T E M P ;
TERMINAL : T E R M I N A L ;
UPRINTER : U P R I N T E R ;
DSD : D S D ;
EXPANDTABS : E X P A N D T A B S ;
NOEXPANDTABS : N O E X P A N D T A B S;
FLOWOVER : F L O W O V E R ;
MISSOVER : M I S S O V E R;
PAD : P A D ;
NOPAD : N O P A D ;
SCANOVER : S C A N O V E R ;
SHAREBUFFERS : S H A R E B U F F E R S;
STOPOVER : S T O P O V E R;
TRUNCOVER : T R U N C O V E R;
V_INFILE_ : '_' I N F I L E '_' ;
SEMICOLON : ';' ;


// reserved keywords

ABORT : A B O R T;
ABEND  : A B E N D;
CANCEL : C A N C E L ;
FILE   : F I L E ;
RETURN : R E T U R N ;
NOLIST : N O L I S T ;

//array
ARRAY : A R R A Y ;
ARRAY_NUMERIC_ELEMENTS : '_' N U M E R I C '_' ;
//TODO:  MAKE CASE INSENSITIVE
ARRAY_CHARACTER_ELEMENTS : '_CHARACTER_' ;
ARRAY_ALL_ELEMENTS : '_ALL_' ;

// by
BY : 'by' ;
GROUPFORMAT : 'groupformat' ;
NOTSORTED : 'notsorted' ;
DESCENDING : 'descending' ;
// call
CALL : 'call' ;
// datalines
DATALINES : 'datalines' ;
CARDS : 'cards' ;
LINES : 'lines' ;
DATALINES4 : 'datalines4' ;
CARDS4 : 'cards4' ;
LINES4 : 'lines4' ;
END_DATALINES4 : ';;;;' ;

END : E N D ;
LENGTH : L E N G T H ;
QKUPCASE : Q K U P C A S E ;
SYSEVALF : S Y S E V A L F ;

EVAL : E V A L ;
LET : L E T ;
QSCAN : Q S C A N ;
SYSEXEC : S Y S E X E C ;
ACT : A C T ;

LIST : L I S T ;
QSUBSTR : Q S U B S T R ;
SYSFUNC : S Y S F U N C ;
ACTIVATE : A C T I V A T E ;
GLOBAL : G L O B A L ;
LISTM : L I S T M ;
QSYSFUNC : Q S Y S F U N C ;
SYSGET : S Y S G E T ;
BQUOTE : B Q U O T E ;
GO : G O ;
LOCAL : L O C A L ;
QUOTE : Q U O T E ;
SYSRPUT : S Y S R P U T ;

GOTO : G O T O ;
MACRO : M A C R O ;
QUPCASE : Q U P C A S E ;
THEN : T H E N ;
CLEAR : C L E A R ;
IF : I F ;
MEND : M E N D ;
RESOLVE : R E S O L V E ;
TO : T O ;
CLOSE : C L O S E ;
INC : I N C ;
PAUSE : P A U S E ;

TSO : T S O ;
CMS : C M S ;
INCLUDE : I N C L U D E ;
NRSTR : N R S T R ;
RUN : R U N ;
UNQUOTE : U N Q U O T E ;
COMANDR : C O M A N D R ;
INDEX : I N D E X ;
ON : O N ;
SAVE : S A V E ;
UNSTR : U N S T R ;
COPY : C O P Y ;

OPEN : O P E N ;
SCAN : S C A N ;
UNTIL : U N T I L ;
DEACT : D E A C T ;
INPUT : I N P U T ;
PUT : P U T ;
STOP : S T O P ;
UPCASE : U P C A S E ;
DEL : D E L ;
KCMPRES : K C M P R E S ;
NRBQUOTE : N R B Q U O T E ;
STR : S T R ;
WHILE : W H I L E ;
DELETE : D E L E T E ;
KINDEX : K I N D E X ;
NRQUOTE : N R Q U O T E ;
SYSCALL : S Y S C A L L ;
WINDOW : W I N D O W ;
DISPLAY : D I S P L A Y ;
KLEFT : K L E F T ;
METASYM : M E T A S Y M ;
SUBSTR : S U B S T R ;
DMIDSPLY : D M I D S P L Y ;
KLENGTH : K L E N G T H ;
QKCMPRES : Q K C M P R E S ;
SUPERQ : S U P E R Q ;
DMISPLIT : D M I S P L I T ;
KSCAN : K S C A N ;
QKLEFT : Q K L E F T ;
SYMDEL : S Y M D E L ;
DO : D O ;
KSUBSTR : K S U B S T R ;
QKSCAN : Q K S C A N ;
SYMEXIST : S Y M E X I S T ;
EDIT : E D I T ;
KTRIM : K T R I M ;
QKSUBSTR : Q K S U B S T R ;
SYMGLOBL : S Y M G L O B L ;
ELSE : E L S E ;
KUPCASE : K U P C A S E ;
QKTRIM : Q K T R I M ;
SYMLOCAL : S Y M L O C A L ;
Tk_NULL : '_' N U L L '_';

// fix 1
EXECUTE: E X E C U T E;
DESCRIBE: D E S C R I B E;
LIBNAME : L I B N A M E ;
OUTPUT :  O U T P U T ;

// abort





// data statement
DEBUG : D E B U G ;
NESTING : N E S T I N G ;
STACK : S T A C K;
READ: R E A D;
PW: P W ;
SOURCE: S O U R C E ;
VIEW : V I E W ;
PGM: P G M ;
ENCRYPT : E N C R Y P T ;
NOSAVE : N O S A V E ;
SET : S E T ;
// datalines

ALTER : A L T E R ;
//

// infile


//input
INPUT_ODS : '_' O D S '_' ;

// informat
DATE : D A T E ;
DATETIME : D A T E T I M E ;
DDMMYY : D D M M Y Y;
INFORMAT_COMMA : C O M M A;
INFORMAT_CHAR : C H A R;

// Drop
DROP: D R O P;


// procedure names
PROC : P R O C ;
ANOVA : A N O V A;
MEANS : M E A N S ;
REG : R E G ;
CORR : C O R R;
SGPLOT : S G P L O T ;
PRINT: P R I N T;
DATA: D A T A;

// SAS informat : http://support.sas.com/documentation/cdl/en/lrdict/64316/HTML/default/viewer.htm#a001239776.htm
// Here only a short list is supported
Informat
 : DOLLAR FloatingPointLiteral
 | DOLLAR UPCASE FloatingPointLiteral
 | DOLLAR INFORMAT_CHAR FloatingPointLiteral
 | DATE FloatingPointLiteral
 | DATETIME FloatingPointLiteral
 | DDMMYY FloatingPointLiteral
 | INFORMAT_COMMA FloatingPointLiteral
 | FloatingPointLiteral
 | INT '*' Informat
 ;

// ahead of Identifier, in case, eq is recognized as identifier
DOLLAR : '$' ;
EQ : E Q | '==' ;
NE : N E | '^=' | '~=';
GT : G T | '>' ;
LT : L T | '<' ;
GE : G E | '>=';
LE : L E | '<=';
IN : I N;
EQC : EQ ':' ;
NEC : NE ':' ;
GTC : GT ':' ;
LTC : LT ':' ;
GEC : GE ':' ;
LEC : LE ':' ;
INColon : IN ':' ;
AND : A N D | '&' ;
OR : O R | '|' | '!' ;
NOT : N O T | '^' | '~' ;
MIN : '><';
MAX : '<>';

// NOTE: date, time or bit literals must go ahead of Identifier
// in case '01jan04'd being recognized as string + Identifier
DateLiteral: STRINGLITERAL D;
TimeLiteral: STRINGLITERAL T;
DateTimeLiteral: STRINGLITERAL D T;
BitLiteral: STRINGLITERAL B;
NameLiteral: STRINGLITERAL N;
HexLiteral: STRINGLITERAL X;

STRINGLITERAL
    :   '"' ( ESC | ~[\\"] )* '"'
    |   '\'' ( ESC | ~[\\'] )* '\''
    ;
fragment ESC :   '\\' [abtnfrv"'\\]    ;

INT : [0-9]+ ;
FloatingPointLiteral
 : [0-9]* ('.') [0-9]+ ([eE][-+]?[0-9]+)?
 | INT '.'
 ;

 //fix 1 commenting below as it is avaible in common
//Identifier  : [a-zA-Z_] [a-zA-Z_0-9]*  ;


// nicknames
DOT : '.' ;
AT : '@' ;
EQUAL : '=' ;
COMMA : ',' ;
LBracket : '(' | '[' | '{' ;
RBracket : ')' | ']' | '}' ;


// ahead of Identifier, in case, eq is recognized as identifier
OF : O F ;





COLON : ':' ;

PERCENT : '%' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

LParentheses : '(' ;
RParentheses : ')' ;
LBraces : '{' ;
RBraces : '}' ;
LSqBracket : '[' ;
RSqBracket : ']' ;

WS  :   [ \r\t\u000C\n]+ -> skip    ;
COMMENT    :   '/*' .*? '*/'    -> skip    ;
LINE_COMMENT    :   '*' ~[\r\n]* -> channel(HIDDEN) ;




Identifier
 : [a-zA-Z_] [a-zA-Z_0-9]*
 // place all the keywords here to resolve "keywords can also be identifiers" problem
 ;