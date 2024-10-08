grammar OutsideStepStmt;
import CommonGrammar;
//assign_main
// : (assign_stmt)* EOF
// ;
libnameStatement
: LIBNAME Identifier STRINGLITERAL ';'
;