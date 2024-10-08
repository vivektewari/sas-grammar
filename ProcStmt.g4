grammar ProcStmt;
import CommonGrammar ;

proc_stmt_block
 : proc_stmt RUN ';'
 ;
 
proc_stmt
 : PROC proc_name (~';')*? ';'
 | PROC proc_name  DATA EQUAL Identifier ';'
 ;
 
proc_name
 : ANOVA
 | CORR
 | MEANS
 | REG
 | SGPLOT
 | PRINT
 ;
