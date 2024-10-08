grammar Stmt;
import CommonGrammar,InputStmt;
//assign_main
// : (assign_stmt)* EOF
// ;



// Entry point for an IF statement
ifStatement
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
             | ifStatement
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
literal
 : INT
 | FloatingPointLiteral
 | STRINGLITERAL
 | DateLiteral
 | TimeLiteral
 | DateTimeLiteral
 | BitLiteral
 | NameLiteral
 | HexLiteral

 ;
number :
INT
|FloatingPointLiteral
;
// Whitespace handling
WS : [ \t\n\r]+ -> skip;

