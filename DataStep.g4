grammar DataStep;
import CommonGrammar,StmtDataSet, Stmt,Loop,StmtDatalines;

data_step_block
 : data_stmt (set_stmt)? (input_main|data_step_statement|datalines_stmt)* RUN ';'
 ;

 data_step_statement
 :doLoop
 |assign_stmt
 |if_stmt

 ;