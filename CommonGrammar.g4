grammar CommonGrammar;
import CommonLexerRules;
// FIXME: normally positive/negative prefix come ahead of multiple or divide, but antlr4 seem not agree
// FIXME: I hate '=' as equal to operator so much that I use '==' instead
expression
 : literal
 | Identifier
 | '(' expression ')'
 | expression '(' expressionList? ')'
 | expression '{' expression '}'
 | expression '[' expression ']'
 | <assoc=right> expression '**' expression
 | <assoc=right> ('+'|'-') expression
 | NOT expression
 | expression MIN expression
 | expression MAX expression
 | expression ('*'|'/'|'%') expression
 | expression ('+'|'-') expression
 | expression ('||' | '!!' ) expression
 | expression (EQ | NE | GT | LT | GE | LE ) expression
 | expression (EQC | NEC | GTC | LTC | GEC | LEC ) expression
 | expression (IN | INColon) in_var_list
 | expression (AND | OR ) expression
 | <assoc=right> expression '=' expression
 ;
expressionList 
 : (expression | of_var_list) (',' (expression|of_var_list))*
 | expressionList ','+ expressionList
 ;

of_var_list 
 : 'of' (Identifier '-' Identifier) ((COMMA 'of')? (Identifier '-' Identifier) )*
 | 'of' Identifier Identifier*
 | 'of' Identifier '[' '*' ']'
 ;
identifiers_list
 : (Identifier | Identifier '-' Identifier)+
 ;

in_var_list
 : Identifier
 | '(' (literal|colonInts) (',' (literal|colonInts))* ')'
 ;
colonInts
 : INT ':' INT
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
 | DOT
 ;

variables
 : variables DOT variables
 | Identifier
 // place all the keywords here to resolve "keywords can also be identifiers" problem   
 | DATE
 | ALTER
 | DROP
 ;
/**
 * Tokens 
 * */
 

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


WS  :   [ \r\t\u000C\n]+ -> channel(HIDDEN) ;
COMMENT    :   '/*' .*? '*/'    -> channel(HIDDEN) ;
LINE_COMMENT    :   '*' ~[\r\n]* -> channel(HIDDEN) ;
