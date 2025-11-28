grammar CoffieLang;

// =======================
// PROGRAMA
// =======================

prog
    : classDef+ EOF
    ;

// =======================
// ESTRUTURA DE CLASSES
// =======================

classDef
    : PUBLIC CLASS name=ID LB classBody* RB
    ;

classBody
    : fieldDecl
    | methodDef
    | mainMethod
    ;

fieldDecl
    : type ID SEMI
    ;

methodDef
    : PUBLIC type ID LP params? RP block
    ;

mainMethod
    : PUBLIC STATIC VOID MAIN LP STRING LB_ARR RB_ARR ID RP block
    ;

params
    : param (COMMA param)*
    ;

param
    : type ID
    ;

// =======================
// BLOCOS E COMANDOS
// =======================

block
    : LB statement* RB
    ;

statement
    : varDecl SEMI                  # StmtVarDecl
    | assignment SEMI               # StmtAssign
    | printStmt SEMI                # StmtPrint
    | ifStmt                        # StmtIf
    | whileStmt                     # StmtWhile
    | forStmt                       # StmtFor
    | returnStmt SEMI               # StmtReturn
    | callStmt SEMI                 # StmtCall
    ;

varDecl
    : type ID (ASSIGN expr)?
    ;

assignment
    : ID (DOT ID)? ASSIGN expr
    ;

printStmt
    : SYSTEM_OUT_PRINTLN LP expr RP
    ;

ifStmt
    : IF LP expr RP block (ELSE block)?
    ;

whileStmt
    : WHILE LP expr RP block
    ;

forStmt
    : FOR LP (varDecl | assignment)? SEMI expr? SEMI assignment? RP block
    ;

returnStmt
    : RETURN expr?
    ;

// Chamada de método: func() ou obj.metodo()
callStmt
    : ID (DOT ID)? LP args? RP
    ;

// =======================
// EXPRESSÕES
// =======================

expr
    : expr (MULT | DIV | MOD) expr      # ExprMultDiv
    | expr (PLUS | MINUS) expr          # ExprAddSub
    | expr (LT | GT | LE | GE) expr     # ExprRelational
    | expr (EQ | NEQ) expr              # ExprEquality
    | NEW ID LP RP                      # ExprNewObject
    | atom                              # ExprAtom
    ;

atom
    : INT_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | ID (DOT ID)?          
    | ID (DOT ID)? LP args? RP        
    | LP expr RP
    ;

args
    : expr (COMMA expr)*
    ;

type
    : TYPE_INT
    | TYPE_DOUBLE
    | TYPE_BOOLEAN
    | TYPE_STRING
    | TYPE_VOID
    | ID            
    ;

// =======================
// LEXER
// =======================

PUBLIC      : 'public';
CLASS       : 'class';
STATIC      : 'static';
VOID        : 'void';
MAIN        : 'main';
NEW         : 'new';
IF          : 'if';
ELSE        : 'else';
WHILE       : 'while';
FOR         : 'for';
RETURN      : 'return';
SYSTEM_OUT_PRINTLN : 'System.out.println';

// Definições explícitas para evitar warnings
TYPE_INT    : 'int';
TYPE_DOUBLE : 'double';
TYPE_BOOLEAN: 'boolean';
TYPE_STRING : 'String'; 
TYPE_VOID   : 'void';

PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
MOD         : '%';
ASSIGN      : '=';
EQ          : '==';
NEQ         : '!=';
LT          : '<';
GT          : '>';
LE          : '<=';
GE          : '>=';
DOT         : '.';
COMMA       : ',';
SEMI        : ';';
LP          : '(';
RP          : ')';
LB          : '{';
RB          : '}';
LB_ARR      : '[';
RB_ARR      : ']';

BOOL_LITERAL    : 'true' | 'false';
INT_LITERAL     : [0-9]+;
FLOAT_LITERAL   : [0-9]+ '.' [0-9]+;
STRING_LITERAL  : '"' (~["\r\n])* '"';

ID : [a-zA-Z_] [a-zA-Z_0-9]*;

COMMENT : '//' ~[\r\n]* -> skip;
WS      : [ \t\r\n]+ -> skip;