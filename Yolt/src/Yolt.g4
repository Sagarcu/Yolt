grammar Yolt;

program: statement* EOF;


int_declaration: INT IDENTIFIER EQUALS INT_VALUE SEMICOLON;
int_addition: IDENTIFIER ADD EQUALS INT_VALUE SEMICOLON;

class_decleration: CLASS IDENTIFIER HAAKIE_OPEN HAAKIE_CLOSE SEMICOLON;
string_declaration: STRING IDENTIFIER EQUALS THING IDENTIFIER THING SEMICOLON;
gold_decleration: GOLD IDENTIFIER EQUALS  GOLD_VALUE SEMICOLON;
print_stmt: PRINT PAREN_OPEN THING IDENTIFIER THING PAREN_CLOSE SEMICOLON;

statement: int_declaration | print_stmt | string_declaration | gold_decleration | int_addition | class_decleration | 'ADD' expr;

expr: expr ('^') expr
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | INT_VALUE
    ;




ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
POW: '^';

LOGIC_EQUAL: '==';
LOGIC_UNEQUAL: '=!=';
LOGIC_BIGGER: '>';
LOGIC_LOWER: '<';
LOGIC_OR: '||';
LOGIC_AND: '&&';

CLASS: 'Class';
GOLD: 'gold';
STRING: 'string';
INT: 'int';
PRINT: 'print';
IDENTIFIER: [a-zA-Z]+;
EQUALS: '=';
INT_VALUE: [1-9][0-9]*;
GOLD_VALUE: [1-9][0-9]*[G];
SEMICOLON: ';';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
HAAKIE_OPEN: '{';
HAAKIE_CLOSE: '}';
THING: '"';
COMMENT: '//*';

WS: [\r\n\t ]+ -> skip;

