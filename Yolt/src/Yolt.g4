grammar Yolt;

program: class_decleration? function_decleration* EOF ;

//TODO's:
//FIX BUG WHERE YOU CAN ADD MULTIPLE NORMAL VALUES BEHIND EACH OTHER IN EXPRESSION (i i + 3 = 0) for example.

class_decleration: CLASS IDENTIFIER PAREN_OPEN ((GOLD | INT | BOOLEAN | STRING) IDENTIFIER)*  PAREN_CLOSE BRACKET_OPEN function_decleration+ BRACKET_CLOSE;
function_decleration: FUNCTION IDENTIFIER PAREN_OPEN (((GOLD | INT | BOOLEAN | STRING) IDENTIFIER) (COMMA ((GOLD | INT | BOOLEAN | STRING) IDENTIFIER))*)? PAREN_CLOSE BRACKET_OPEN statement* BRACKET_CLOSE;
function_call: IDENTIFIER PAREN_OPEN (IDENTIFIER (COMMA IDENTIFIER)*)? PAREN_CLOSE SEMICOLON;

int_declaration: INT IDENTIFIER EQUALS (INT_VALUE | prompt_input | random_input) SEMICOLON;
boolean_declaration: BOOLEAN IDENTIFIER EQUALS (BOOLEAN_VALUE | prompt_input) SEMICOLON;
string_declaration: STRING IDENTIFIER EQUALS ((STRING_VALUE) | prompt_input) SEMICOLON;
gold_decleration: GOLD IDENTIFIER EQUALS (GOLD_VALUE | prompt_input) SEMICOLON;
prompt_input: PROMPT PAREN_OPEN PAREN_CLOSE;
random_input: RANDOM PAREN_OPEN INT_VALUE PAREN_CLOSE;


if_statement: IF PAREN_OPEN compare_values PAREN_CLOSE COLON BRACKET_OPEN statement* BRACKET_CLOSE else_if_statement* else_statement*;
else_if_statement: ELSE_IF PAREN_OPEN compare_values PAREN_CLOSE COLON BRACKET_OPEN statement* BRACKET_CLOSE;
else_statement: ELSE COLON BRACKET_OPEN statement* BRACKET_CLOSE;
return_statement: RETURN PAREN_OPEN IDENTIFIER PAREN_CLOSE SEMICOLON;

while_loop: LOOP PAREN_OPEN compare_multiple_values PAREN_CLOSE COLON BRACKET_OPEN statement+ (BREAK SEMICOLON)? BRACKET_CLOSE;
do_while_loop: LOOP COLON BRACKET_OPEN statement+ (BREAK SEMICOLON)? BRACKET_CLOSE WHILE PAREN_OPEN compare_multiple_values PAREN_CLOSE SEMICOLON;

var_assignment: IDENTIFIER EQUALS IDENTIFIER SEMICOLON;
bool_assignment: IDENTIFIER EQUALS BOOLEAN_VALUE SEMICOLON;
var_addition: IDENTIFIER EQUALS IDENTIFIER (POW | MOD | MUL | DIV | ADD | SUB) IDENTIFIER SEMICOLON;
int_addition_short: IDENTIFIER (POW | MOD | MUL | DIV | ADD | SUB) EQUALS (INT_VALUE | GOLD_VALUE) SEMICOLON;
int_addition: IDENTIFIER EQUALS expr+ SEMICOLON;

compare_multiple_values: compare_values ((LOGIC_AND | LOGIC_OR) compare_values)*;
compare_values: expr* (LOGIC_BIGGER | LOGIC_EQUAL | LOGIC_LOWER | LOGIC_UNEQUAL | LOGIC_BIGGER_EQUAL | LOGIC_LOWER_EQUAL) (INT_VALUE | IDENTIFIER | BOOLEAN_VALUE | STRING_VALUE);

print_stmt: PRINT PAREN_OPEN (IDENTIFIER |  STRING_VALUE) PAREN_CLOSE SEMICOLON;


statement: function_call | return_statement | bool_assignment | int_addition | if_statement | boolean_declaration | do_while_loop | while_loop | int_declaration | print_stmt | string_declaration | gold_decleration | int_addition_short | 'ADD' expr | var_assignment | var_addition;

expr: (PAREN_OPEN expr PAREN_CLOSE)
    | expr (POW | MOD) expr
    | expr (MUL | DIV) expr
    | expr (ADD | SUB) expr
    | number
    ;

number: INT_VALUE | IDENTIFIER;

ADD: '+';
SUB: '-';
MUL: '*';
MOD: '%';
DIV: '/';
POW: '^';

LOGIC_EQUAL: '==';
LOGIC_UNEQUAL: '=!=';
LOGIC_BIGGER: '>';
LOGIC_LOWER: '<';
LOGIC_BIGGER_EQUAL: '>=';
LOGIC_LOWER_EQUAL: '<=';
LOGIC_OR: '||';
LOGIC_AND: '&&';

IF: 'IF';
ELSE_IF: 'ELSE IF';
ELSE: 'ELSE';

BREAK: 'STOP';

CLASS: 'CLASS';
LOOP: 'REPEAT';
WHILE: 'WHILE';
FUNCTION: 'FUNCTION';
RETURN: 'RETURN';

GOLD: 'GOLD';
STRING: 'WORDS';
INT: 'NUMBER';
BOOLEAN: 'BOOL';


PRINT: 'SPEAK';
PROMPT: 'TALK';
RANDOM: 'RANDOM';
EQUALS: '=';

INT_VALUE: [1-9][0-9]* |[0];
GOLD_VALUE: [1-9][0-9]*[G];
BOOLEAN_VALUE: 'FALSE' | 'TRUE';
STRING_VALUE: '"'[a-zA-Z0-9,/!: ]+'"';

IDENTIFIER: [a-zA-Z0-9]+;

COMMA: ',';
SEMICOLON: ';';
COLON: ':';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
APOSTROPHE: '"';
COMMENT: '//*';

WS: [\r\n ]+ -> skip;

