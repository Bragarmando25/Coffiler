grammar CoffieLang;

@header {
package coffie;
}

// =======================
// PARSER RULES
// =======================

program
  : classDeclaration+ EOF
  ;

classDeclaration
  : 'public'? 'class' Identifier LBRACE classBody* RBRACE
  ;

classBody
  : methodDeclaration
  | fieldDeclaration
  | statement
  ;

fieldDeclaration
  : type Identifier (ASSIGN expression)? SEMI
  ;

methodDeclaration
  : 'public'? 'static'? type Identifier LPAREN parameterList? RPAREN block
  ;

parameterList
  : parameter (COMMA parameter)*
  ;

parameter
  : type arrayType? Identifier
  ;

arrayType
  : LBRACK RBRACK
  ;

// ---- Statements ----

statement
  : block
  | variableDeclaration
  | ifStatement
  | whileStatement
  | forStatement
  | returnStatement
  | printStatement
  | expressionStatement
  | SEMI
  ;

block
  : LBRACE statement* RBRACE
  ;

variableDeclaration
  : type Identifier (ASSIGN expression)? SEMI
  ;

ifStatement
  : 'if' LPAREN expression RPAREN statement ('else' statement)?
  ;

whileStatement
  : 'while' LPAREN expression RPAREN statement
  ;

forStatement
  : 'for' LPAREN (variableDeclaration | expressionStatement | SEMI)
        expression? SEMI
        expressionStatement? RPAREN statement
  ;

returnStatement
  : 'return' expression? SEMI
  ;

// ---- Print (System.out.println) ----

printStatement
  : 'System' DOT 'out' DOT 'println' LPAREN expression? RPAREN SEMI
  ;

// ---- Expression rules ----

expressionStatement
  : (expression | methodCall) SEMI
  ;

expression
  : assignmentExpression
  ;

assignmentExpression
  : Identifier (DOT Identifier)* ASSIGN expression
  | logicalOrExpression
  ;

logicalOrExpression
  : logicalAndExpression (OR_OR logicalAndExpression)*
  ;

logicalAndExpression
  : equalityExpression (AND_AND equalityExpression)*
  ;

equalityExpression
  : relationalExpression ((EQ | NEQ) relationalExpression)*
  ;

relationalExpression
  : additiveExpression ((LT | GT | LE | GE) additiveExpression)*
  ;

additiveExpression
  : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
  ;

multiplicativeExpression
  : unaryExpression ((STAR | DIV | MOD) unaryExpression)*
  ;

unaryExpression
  : (PLUS | MINUS | NOT)? primaryExpression
  ;

primaryExpression
  : Identifier (DOT Identifier)*                      // acesso a campos e variáveis
  | literal                                           // literais
  | LPAREN expression RPAREN                          // expressões entre parênteses
  ;

// ---- Method calls ----

methodCall
  : Identifier (DOT Identifier)* LPAREN argumentList? RPAREN
  ;

argumentList
  : expression (COMMA expression)*
  ;

// ---- Types & literals ----

type
  : 'int'
  | 'float'
  | 'double'
  | 'boolean'
  | 'String'
  | 'void'
  ;

literal
  : IntegerLiteral
  | FloatLiteral
  | BooleanLiteral
  | StringLiteral
  ;

// =======================
// LEXER RULES
// =======================

// Delimiters
LPAREN  : '(' ;
RPAREN  : ')' ;
LBRACE  : '{' ;
RBRACE  : '}' ;
LBRACK  : '[' ;
RBRACK  : ']' ;
SEMI    : ';' ;
COMMA   : ',' ;
DOT     : '.' ;

// Operators
ASSIGN  : '=' ;
PLUS    : '+' ;
MINUS   : '-' ;
STAR    : '*' ;
DIV     : '/' ;
MOD     : '%' ;
LT      : '<' ;
GT      : '>' ;
LE      : '<=' ;
GE      : '>=' ;
EQ      : '==' ;
NEQ     : '!=' ;
AND_AND : '&&' ;
OR_OR   : '||' ;
NOT     : '!' ;

// Literals
IntegerLiteral : [0-9]+ ;
FloatLiteral   : [0-9]+ '.' [0-9]* ;
BooleanLiteral : 'true' | 'false' ;
StringLiteral  : '"' (~["\\\r\n])* '"' ;

// Identifiers
Identifier : [a-zA-Z_][a-zA-Z0-9_]* ;

// Comments & whitespace
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip ;
