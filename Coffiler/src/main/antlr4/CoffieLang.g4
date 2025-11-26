grammar CoffieLang;

@header {
package coffie;
import java.util.*;
}


// =======================
//  Regras de PARSER
// =======================

prog
    : line+                         // programa = varias linhas
    ;

line
    : atrib EOL                     // declaracao/atribuicao
    | input EOL                     // leitura
    | output EOL                    // escrita
    | controlflow                   // if / if-else
    | loop                          // while
    | function                      // declaracao de funcao
    | callFunction EOL              // chamada de funcao
    | lib                           // #import "arquivo"
    | typecast EOL                  // cast (int) x;
    | typeof EOL                    // typeof(x);
    | ternary EOL                   // cond ? a : b;
    ;

// -----------------------
//  ATRIBUICAO / DECLARACAO
// -----------------------

atrib
    : VAR ASSIGN STR                        # VariavelExistenteString
    | STRING VAR ASSIGN STR                # VariavelNovaString
    | (INTEGER | DOUBLE) VAR ASSIGN expr   # VariavelNova
    | BOOLEAN VAR ASSIGN BOOL              # VariavelNovaBoolean
    | VAR ASSIGN expr                      # VariavelExistente
    | VAR ASSIGN BOOL                      # VariavelExistenteBoolean
    ;

// -----------------------
//  I/O
// -----------------------

input
    : READ LP VAR RP                       # InputVar
    ;

output
    : PRINT LP STR RP                      # OutputStr
    | PRINT LP VAR RP                      # OutputVar
    | PRINT LP expr RP                     # OutputExpr
    ;

// -----------------------
//  EXPRESSOES ARITMETICAS
// -----------------------

expr
    : term SUM expr                        # ExprSum
    | term SUB expr                        # ExprSub
    | term                                 # ExprTerm
    ;

term
    : factor MULT term                     # TermMult
    | factor DIV term                      # TermDiv
    | factor MOD term                      # TermMod
    | factor                               # TermFactor
    ;

factor
    : NUM                                  # FactorNum
    | NUMD                                 # FactorNumD
    | VAR                                  # FactorVar
    | STR                                  # FactorStr
    | BOOL                                 # FactorBool
    | LP expr RP                           # FactorExpr
    ;

// -----------------------
//  EXPRESSOES BOOLEANAS
// -----------------------

bexpr
    : expr ( (LT | LE | GT | GE | EQ | NE) expr )?   // comparacoes: x < y, x == y, etc
    | BOOL
    | VAR
    ;

// -----------------------
//  CONTROLE DE FLUXO (IF / IF-ELSE)
// -----------------------

controlflow
    : IF LP bexpr RP block                          # IfBlock
    | IF LP bexpr RP block ELSE block               # IfElseBlock
    ;

// -----------------------
//  LACO (WHILE)
// -----------------------

loop
    : WHILE LP bexpr RP block                       # LoopBlock
    ;

// -----------------------
//  BLOCOS
// -----------------------

block
    : LB line* RB                                   # BlockLine
    ;

// Bloco de funcao com retorno
rblock
    : LB rbody RB                                   # FnBlockLine
    ;

rbody
    : line* RETURN expr? EOL                        # FnBodyLine
    ;

// -----------------------
//  FUNCOES
// -----------------------

function
    : type VAR LP params? RP rblock                 # FnDecl
    ;

type
    : INTEGER
    | DOUBLE
    | STRING
    | BOOLEAN
    | VOID
    ;

params
    : type VAR (SEP type VAR)*                      # ParamList
    ;

paramsCall
    : expr (SEP expr)*                              # ParamCallList
    ;

// chamada de funcao: f(), f(x), f(a, b + c)
callFunction
    : VAR LP paramsCall? RP                         # FuncInvoc
    ;

// -----------------------
//  BIBLIOTECAS / IMPORT
// -----------------------

lib
    : IMPORT STR EOL                                # LibStmt
    ;

// -----------------------
//  TYPECAST
// -----------------------

typecast
    : LP type RP expr                               # TypeCast
    ;

// -----------------------
//  TYPEOF
// -----------------------

typeof
    : TYPEOF LP VAR RP                              # TypeOfVar
    ;

// -----------------------
//  OPERADOR TERNARIO
// -----------------------

ternary
    : bexpr '?' expr ':' expr                       # TernaryCond
    ;

// =======================
//  Regras de LEXER
// =======================

// Palavras-chave / simbolos

WHILE      : 'while';
RETURN     : 'return';
IMPORT     : '#import';
TYPEOF     : 'typeof';
IF         : 'if';
ELSE       : 'else';
EOL        : ';';
PRINT      : 'print';
READ       : 'read';

INTEGER    : 'int';
DOUBLE     : 'double';
BOOLEAN    : 'bool';
STRING     : 'str';
VOID       : 'void';

SUM        : '+';
SUB        : '-';
DIV        : '/';
MULT       : '*';
MOD        : '%';
ASSIGN     : '=';
SEP        : ',';
LP         : '(';
RP         : ')';
LB         : '{';
RB         : '}';

LE         : '<=';
LT         : '<';
GT         : '>';
GE         : '>=';
EQ         : '==';
NE         : '!=';

// Literais

NUMD       : DIGIT+ '.' DIGIT+;              // numero com ponto
NUM        : DIGIT+;                         // inteiro

BOOL       : 'true' | 'false';

STR
    : '"' (~["\r\n])* '"'                   // string simples entre aspas
    ;

// Identificadores

VAR
    : [a-zA-Z_] [a-zA-Z_0-9]*               // nome de variavel / funcao
    ;

// Comentarios e espacos

COMMENT
    : '//' ~[\r\n]* -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

// Fragmentos

fragment DIGIT : [0-9];
