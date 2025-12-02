grammar CoffieLang;

// =======================
// PROGRAM
// =======================
prog
    : (directive | structDef | unionDef | varDecl SEMI | methodDef)* EOF
    ;

directive
    : SHARP_INCLUDE
    | SHARP_DEFINE
    ;

// =======================
// DATA STRUCTURES
// =======================
structDef
    : STRUCT ID LB fieldDecl* RB SEMI
    ;

unionDef
    : UNION ID LB fieldDecl* RB SEMI
    ;

fieldDecl
    : type ID (LB_ARR INT_LITERAL RB_ARR)? SEMI 
    ;

// =======================
// METHODS
// =======================
methodDef
    : type ID LP params? RP block
    ;

params
    : param (COMMA param)*
    ;

param
    : type ID (LB_ARR RB_ARR)? 
    ;

// =======================
// BLOCKS & STATEMENTS
// =======================
block
    : LB statement* RB
    ;

// CORREÇÃO: "statement" agora inclui o bloco, permitindo if(...) statement
statement
    : block                         # StmtBlock
    | varDecl SEMI                  # StmtVarDecl
    | assignment SEMI               # StmtAssign
    | printStmt SEMI                # StmtPrint
    | scanStmt SEMI                 # StmtScan
    | getsStmt SEMI                 # StmtGets
    | putsStmt SEMI                 # StmtPuts
    | ifStmt                        # StmtIf
    | switchStmt                    # StmtSwitch
    | whileStmt                     # StmtWhile
    | doWhileStmt SEMI              # StmtDoWhile
    | forStmt                       # StmtFor
    | returnStmt SEMI               # StmtReturn
    | callStmt SEMI                 # StmtCall
    | BREAK SEMI                    # StmtBreak
    ;

varDecl
    : type ID (LB_ARR INT_LITERAL RB_ARR)? (ASSIGN expr)? 
    ;

assignment
    : atom ASSIGN expr 
    ;

printStmt
    : PRINTF LP STRING_LITERAL (COMMA expr)* RP
    ;

// CORREÇÃO: Permite &variavel ou &struct.campo
scanStmt
    : SCANF LP STRING_LITERAL (COMMA (AND_ADDR? atom)) RP
    ;

getsStmt
    : GETS LP ID RP
    ;

putsStmt
    : PUTS LP expr RP
    ;

// CORREÇÃO: Usa 'statement' em vez de 'block' para permitir comandos de uma linha
ifStmt
    : IF LP expr RP statement (ELSE statement)?
    ;

switchStmt
    : SWITCH LP expr RP LB caseBlock* (DEFAULT COLON statement*)? RB
    ;

caseBlock
    : CASE expr COLON statement*
    ;

whileStmt
    : WHILE LP expr RP statement
    ;

doWhileStmt
    : DO statement WHILE LP expr RP
    ;

forStmt
    : FOR LP (varDecl | assignment)? SEMI expr? SEMI assignment? RP statement
    ;

returnStmt
    : RETURN expr?
    ;

callStmt
    : ID LP args? RP
    ;

// =======================
// EXPRESSIONS
// =======================
expr
    : NOT expr                                 # ExprUnary
    | expr (MULT | DIV | MOD) expr             # ExprMultDiv
    | expr (PLUS | MINUS) expr                 # ExprAddSub
    | expr (LT | GT | LE | GE) expr            # ExprRelational
    | expr (EQ | NEQ) expr                     # ExprEquality
    | expr (AND | OR) expr                     # ExprLogic
    | atom                                     # ExprAtom
    ;

atom
    : INT_LITERAL
    | FLOAT_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | ID (LB_ARR expr RB_ARR)? (DOT ID)?  
    | ID LP args? RP                      
    | LP expr RP
    | MULT atom        
    | AND_ADDR atom // CORREÇÃO: Permite & complexo (&d.id)
    ;

args
    : expr (COMMA expr)*
    ;

type
    : (TYPE_INT | TYPE_DOUBLE | TYPE_CHAR | TYPE_VOID) (MULT)?
    | STRUCT ID (MULT)? 
    | UNION ID (MULT)?
    | ID (MULT)?            
    ;

// =======================
// LEXER
// =======================
STRUCT      : 'struct';
UNION       : 'union';
IF          : 'if';
ELSE        : 'else';
SWITCH      : 'switch';
CASE        : 'case';
DEFAULT     : 'default';
BREAK       : 'break';
WHILE       : 'while';
DO          : 'do';
FOR         : 'for';
RETURN      : 'return';
PRINTF      : 'printf';
SCANF       : 'scanf';
GETS        : 'gets';
PUTS        : 'puts';
TYPE_INT    : 'int';
TYPE_DOUBLE : 'double' | 'float';
TYPE_CHAR   : 'char' (MULT)?;
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
AND         : '&&';
OR          : '||';
NOT         : '!';
DOT         : '.';
COLON       : ':';
COMMA       : ',';
SEMI        : ';';
LP          : '(';
RP          : ')';
LB          : '{';
RB          : '}';
LB_ARR      : '[';
RB_ARR      : ']';
SHARP       : '#';
AND_ADDR    : '&'; 

SHARP_INCLUDE : '#' [ \t]* 'include' [ \t]* ('<' .*? '>' | '"' .*? '"') -> skip;
SHARP_DEFINE  : '#' [ \t]* 'define' [ \t]* ID [ \t]* .*? '\r'? '\n' -> skip;

BOOL_LITERAL    : 'true' | 'false';
INT_LITERAL     : [0-9]+;
FLOAT_LITERAL: [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
CHAR_LITERAL    : '\'' . '\'' ;
STRING_LITERAL  : '"' (~["\r\n])* '"';

ID : [a-zA-Z_] [a-zA-Z_0-9]*;

COMMENT : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
WS      : [ \t\r\n]+ -> skip;