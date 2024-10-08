
grammar SAS;
import CommonLexerRules,DataStep, CommonParserRules,OutsideStepStmt,ProcStmt; //DataStmt,C, CommonParserRules


@header {
	package org.opensas01.antlr4;
}

/* this grammar implements this script 
data crime;
  infile "crime.csv" delimiter="," firstobs=2;
  input sid state $ crime murder pctmetro pctwhite pcths poverty single;
run;

proc means data = crime;
  var crime poverty single;
run;
*/
parse
 : (sas_stmt_block)* EOF
 ;

// a statement block is either data statement, procedure block or new lines
sas_stmt_block
 : data_step_block
 | proc_stmt_block
 | libnameStatement
 ;

// must treat NEWLINE by hand, since raw data often delimited by newline
//data_stmt_block
// : DATA ( ID_NULL | Identifier ) ';'
//   data_stmt_list*
//   RUN ';'
// ;

// here goes all supported data statements, either executive or declarative 
data_stmt_list
 : infile_stmt
   actual_dataLines
 | input_stmt
 ;

// TODO: incomplete
infile_stmt
 : INFILE file_specification infile_options* ';'
 | file_specification
;
file_specification
 : STRINGLITERAL  //filename
 | CARDS 
 | DATALINES ';'
 ;

actual_dataLines
: (INT )+ ';'

;
 //actual_dataLines
 //:  actual_dataLine (NEW_LINE actual_dataLine)*  NEW_LINE ';'
 //;

infile_options
 : DELIMITER '=' STRINGLITERAL 
 | FIRSTOBS '=' INT 
 | OBS '=' INT
 ; 

//input_stmt
// : INPUT (STRINGLITERAL '$')+ ';'
// | INPUT spaced_identifiers  ';'
// ;


// Specify SAS procedures one by one, because they do not have unify syntaxes
proc_stmt_block_list
 : proc_means_block
 | proc_freq_block
 ;
 
proc_freq_block
 : FREQ ';'
   RUN ';'
 ;


proc_means_block
 : PROC MEANS (proc_means_options)* (statistic_keyword)* ';'
   proc_means_stmt_list*
   RUN ';'
 ;

// TODO: incomplete, see goo.gl/mRH37N for more options
proc_means_options
 :	DATA '=' Identifier
 |	NOTRAP
 |	SUMSIZE '='
 ;
statistic_keyword
 : SK_MIN
 | SK_MAX
 | SK_MEAN
 | SK_N
 | SK_SUM
 | SK_VAR
 ;
spaced_identifiers
 : Identifier Identifier*
 ;

// TODO: incomplete, see http://goo.gl/DfW9KK 
proc_means_stmt_list
 : var_stmt
 | title_stmt
 ;

var_stmt
 : spaced_identifiers ';'
 ;

title_stmt
 : STRINGLITERAL ';'
 ;
DATA : 'data' ;
INPUT: 'input' ;
DATALINES : 'datalines' ;
RUN: 'run' ;

//Identifier
// : [a-zA-Z_] [a-zA-Z_0-9]*
// ;

INFILE: 'infile' ;
NOTRAP: 'notrap' ;
//fix 1 commented this as this is coming from common lexer
//STRINGLITERAL : '"' (~["\r\n] | '""')* '"';
//SQSTR : '\'' (~['"] | DQSTR)* '\'';
//DQSTR : '"'  (~['"] | SQSTR)* '"';
//str : SQSTR | DQSTR;

PROC : 'proc' ;
ID_NULL : '_null_' ;

FREQ : 'freq' ;

MEANS : 'means' ;
SUMSIZE : 'sumsize' ;
CARDS : 'cards' ;
CARDS4 : 'cards4' ;

DATALINES4 : 'datalines4' ;
DELIMITER : 'delim' | 'delimiter' ;
FIRSTOBS : 'firstobs' ;
OBS: 'obs' ;

INT: DIGIT+ ;
DIGIT: [0-9] ;
SK_MIN : 'MIN' ;
SK_MAX : 'MAX' ;
SK_MEAN : 'MEAN' ;
SK_N : 'N' ;
SK_SUM : 'SUM' ;
SK_VAR : 'VAR' ;
// NEW_LINE : '\n' ;
WS: [ \n\t\r]+ -> skip;

//end
