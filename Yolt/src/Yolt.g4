grammar Yolt;

program: function_decleration* EOF;

//class_decleration: CLASS IDENTIFIER HAAKIE_OPEN function_decleration+ HAAKIE_CLOSE;
function_decleration: FUNCTION IDENTIFIER PAREN_OPEN PAREN_CLOSE HAAKIE_OPEN statement* HAAKIE_CLOSE;

int_declaration: INT IDENTIFIER EQUALS INT_VALUE SEMICOLON;
int_addition: IDENTIFIER ADD EQUALS INT_VALUE SEMICOLON;
string_declaration: STRING IDENTIFIER EQUALS THING IDENTIFIER THING SEMICOLON;
gold_decleration: GOLD IDENTIFIER EQUALS  GOLD_VALUE SEMICOLON;
print_stmt: PRINT PAREN_OPEN THING IDENTIFIER THING PAREN_CLOSE SEMICOLON;
for_loop: LOOP ;


statement: for_loop | int_declaration | print_stmt | string_declaration | gold_decleration | int_addition | 'ADD' expr;

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

CLASS: 'CLASS';
LOOP: 'REPEAT';
FUNCTION: 'FUNCTION';
GOLD: 'GOLD';
STRING: 'WORDS';
INT: 'NUMBER';
BOOLEAN: 'BOOL';
PRINT: 'SPEAK';
PROMPT: 'TALK';
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

WS: [\r\n ]+ -> skip;

