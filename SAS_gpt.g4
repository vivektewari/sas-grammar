grammar SAS;

// The starting point for the parser
program: statement* EOF;

// Define various statements in SAS
statement
    : dataStep
    | procStep
    | macroCall
    | comment
    ;

// Data step definition
dataStep
    : 'DATA' dataSetName ';' dataStepBody 'RUN;'
    ;

dataStepBody
    : (dataLine)*
    ;

dataLine
    : variableDeclaration
    | dataInput
    | dataModification
    ;

variableDeclaration
    : variableName typeDeclaration ';'
    ;

dataInput
    : 'INPUT' variableList ';'
    ;

dataModification
    : ('SET' dataSetName ';' | 'MERGE' dataSetList ';')
    ;

// Procedure step definition
procStep
    : 'PROC' procedureName ';' procStepBody 'RUN;'
    ;

procStepBody
    : (procStatement)*
    ;

procStatement
    : optionStatement
    | outputStatement
    | procStep
    ;

// Macro call definition
macroCall
    : '%' macroName '(' macroArguments? ');'
    ;

macroArguments
    : argument (',' argument)*
    ;

// Definitions of identifiers, variables, and types
dataSetName
    : IDENTIFIER
    ;

dataSetList
    : dataSetName (',' dataSetName)*
    ;

variableList
    : variableName (',' variableName)*
    ;

variableName
    : IDENTIFIER
    ;

typeDeclaration
    : 'NUM' | 'CHAR' length?
    ;

length
    : 'LENGTH' NUMBER
    ;

// Procedure name definition
procedureName
    : 'PRINT' | 'SORT' | 'MEANS' | 'REG' | 'SQL' | // Add more as needed
    ;

// Identifier and literals
IDENTIFIER
    : LETTER (LETTER | DIGIT | '_')*
    ;

NUMBER
    : DIGIT+
    ;

STRING_LITERAL
    : '\'' (CHAR | '\\' .)* '\'' // Single-quoted strings
    | '\"' (CHAR | '\\' .)* '\"' // Double-quoted strings
    ;

// Comment definitions
comment
    : '/*' (CHAR | NEWLINE)* '*/'
    | '*' (CHAR | NEWLINE)* ';'
    ;

// Lexer rules
LETTER
    : [a-zA-Z]
    ;

DIGIT
    : [0-9]
    ;

CHAR
    : ~[\r\n]
    ;

NEWLINE
    : [\r\n]+
    ;

// Skip whitespace
WS
    : [ \t]+ -> skip
    ;
