grammar Stmt;
import CommonGrammar,StmtInput;
//assign_main
// : (assign_stmt)* EOF
// ;



// Entry point for an IF statement
if_stmt
:IF expr THEN statement (ELSE statement)? ';'
| IF expr THEN OUTPUT ';'

;



// Expressions

// Logical and Comparison Expressions

comparisonExpression : Identifier (EQ | GT | LT | LE | GE) expression;

// Arithmetic Expression
arithmeticExpression
                    : assign_stmt
                    | STRINGLITERAL
                    | arithmeticExpression ('+' | '-' | '*' | '/') arithmeticExpression;



// Statement
statement    : assign_stmt
             | put_stmt
             | if_stmt
             | compoundStatement; // Support for nested ifs

// Assignment Statement (simplified)


// Compound Statement for blocks (e.g., DO-END)
compoundStatement : 'DO' statement* 'END;';
assign_stmt
 : Identifier '=' expr ';'
 ;
expr
: expr ('AND' | 'OR') expr
| comparisonExpression
| arithmeticExpression
| literal
;




