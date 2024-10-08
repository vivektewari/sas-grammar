grammar SetStmt;
import CommonGrammar ;

//set_main
// : (set_stmt)* EOF
// ;

set_stmt
 : SET ';'
 | SET Tk_NULL datastmt_cmd? NOLIST? ';'
 | SET dataset_name_opt+ datastmt_cmd? NOLIST? ';'

 ;
// DATA <data-set-name-1 <(data-set-options-1)>>
// DATA view-name <data-set-name-1 <(data-set-options-1)>>
dataset_name_opt
 : dataset_name ('(' variables '=' (~('('|')'))*? ')')?
 ;

datastmt_cmd
 : '/' DEBUG? NESTING? (STACK '=' INT)?
 ;

 // view-name <data-set-name-1 <(data-set-options-1)>>
view_dsname_opt
 : variables variables? ('(' variables '=' (~('('|')'))*? ')')?
 ;

view_name : variables  ;
dataset_name : variables;
program_name : variables;
passwd_opt  : '(' (ALTER|READ|PW) '=' (~('('|')'))*? ')' ;
source_opt : ('(' SOURCE '=' (SAVE | ENCRYPT | NOSAVE) ')') ;