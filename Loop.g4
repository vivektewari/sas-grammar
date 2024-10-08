grammar Loop;
import Stmt,CommonGrammar,Stmt;
// Entry point for a DO loop
doLoop : DO loopVariable EQUAL startValue TO endValue (BY incrementValue)? ';' (statement)+ END ';';




// Loop Variable
loopVariable  : Identifier;

// Numeric Values
startValue    : INT;
endValue      : INT;
incrementValue: INT;

// Statements within the loop
statement     : doLoop
              | putStatement
              | assign_stmt
              | ifStatement
              ;
               // Allow nesting of DO loops

// Assignment Statement (simplified)
//assignmentStatement : Identifier '=' expression ';';

// Put Statement (simplified)
putStatement : PUT outputExpression ';';

// Output expressions
outputExpression : Identifier| STRINGLITERAL;

// Expressions

