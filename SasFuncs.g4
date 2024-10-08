grammar SasFuncs;
import CommonGrammar ;
// Entry point for a function call


functionCall : Identifier '(' (arguments (',' arguments)*)? ')' ';';

// Keywords and identifiers


// Expressions
arguments  : Identifier
            | Number
            | STRINGLITERAL
            | functionCall
            | arithmeticExpression;



arithmeticExpression : expression ('+' | '-' | '*' | '/') expression;


// Whitespace handling
WS : [ \t\n\r]+ -> skip;
