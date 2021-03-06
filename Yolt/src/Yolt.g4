grammar Yolt;

application: global_var_declaration* function_declaration* EOF ;

function_declaration: FUNCTION (INT | STRING | BOOLEAN | COINS)? IDENTIFIER PAREN_OPEN (variables (COMMA variables)*)? PAREN_CLOSE BRACKET_OPEN (statement+ return_statement? | return_statement) BRACKET_CLOSE;

function_call: IDENTIFIER PAREN_OPEN (expr (COMMA expr)*)? PAREN_CLOSE;

global_var_declaration: GLOBAL (INT | STRING | BOOLEAN | COINS) IDENTIFIER  (SEMICOLON | EQUALS expr SEMICOLON);
var_declaration: (INT | STRING | BOOLEAN | COINS) IDENTIFIER EQUALS expr SEMICOLON;

var_assignment: IDENTIFIER EQUALS expr SEMICOLON;
var_assignment_short: IDENTIFIER (POW | MOD | MUL | DIV | ADD | SUB) EQUALS expr SEMICOLON;

prompt_input: PROMPT PAREN_OPEN (INT | STRING) PAREN_CLOSE;
random_input: RANDOM PAREN_OPEN (expr? | BOOLEAN) PAREN_CLOSE;

if_statement: IF PAREN_OPEN logic_expr PAREN_CLOSE COLON BRACKET_OPEN statement+ BRACKET_CLOSE else_if_statement* else_statement?;
else_if_statement: ELSE_IF PAREN_OPEN logic_expr PAREN_CLOSE COLON BRACKET_OPEN statement+ BRACKET_CLOSE;
else_statement: ELSE COLON BRACKET_OPEN statement+ BRACKET_CLOSE;
return_statement: RETURN PAREN_OPEN expr PAREN_CLOSE SEMICOLON;

while_loop: LOOP PAREN_OPEN logic_expr PAREN_CLOSE COLON BRACKET_OPEN statement+ break_statement? BRACKET_CLOSE;
do_while_loop: LOOP COLON BRACKET_OPEN statement+ break_statement? BRACKET_CLOSE WHILE PAREN_OPEN logic_expr PAREN_CLOSE SEMICOLON;

variables: ((COINS | INT | BOOLEAN | STRING) IDENTIFIER);

break_statement: BREAK SEMICOLON;


print_stmt: PRINT PAREN_OPEN expr PAREN_CLOSE SEMICOLON;

expr: (PAREN_OPEN expr PAREN_CLOSE)    # ParanExpression
    | left=expr (POW | MOD) right=expr # PowModExpression
    | left=expr (MUL | DIV) right=expr # MulDivExpression
    | left=expr (ADD | SUB) right=expr # AddSubExpression
    | function_call # FunctionExpression
    | IDENTIFIER # VarIdentifier
    | random_input # RandomIdentifier
    | prompt_input # PromptIdentifier
    | INT_VALUE # IntIdentifier
    | BOOLEAN_VALUE # BoolIdentifier
    | COINS_VALUE # CoinIdentifier
    | STRING_VALUE #StringIdentifier
    ;

logic_expr:  logic_expr  LOGIC_AND logic_expr  # LogicAnd
           | logic_expr  LOGIC_OR logic_expr   # LogicOr
           | compare_values                    # ValueExpression
           ;

compare_values: expr (LOGIC_BIGGER | LOGIC_EQUAL | LOGIC_LOWER | LOGIC_UNEQUAL | LOGIC_BIGGER_EQUAL | LOGIC_LOWER_EQUAL | LOGIC_UNEQUAL) expr;
statement: function_call SEMICOLON | if_statement | var_declaration | do_while_loop | while_loop | print_stmt | var_assignment_short | break_statement | var_assignment;

//Classes and functions.
CLASS: 'CLASS';
GLOBAL: 'GLOBAL';
STATIC: 'STATIC';
FUNCTION: 'FUNCTION';
RETURN: 'RETURN';

//Statements.
IF: 'IF';
ELSE_IF: 'ELSE IF';
ELSE: 'ELSE';
LOOP: 'REPEAT';
WHILE: 'WHILE';
BREAK: 'STOP';

//Variables and Types
INT: 'NUMBER';
BOOLEAN: 'BOOL';
STRING: 'WORDS';
COINS: 'COINS';
PRINT: 'SPEAK';
PROMPT: 'TELL';
RANDOM: 'RANDOM';

//Type values.
INT_VALUE: [-]?[1-9][0-9]* |[0];
STRING_VALUE: '"'[a-zA-Z0-9,.'/!:?= ]+'"';
BOOLEAN_VALUE: 'FALSE' | 'TRUE';
COINS_VALUE: ((GOLD'_'SILVER'_'BRONZE) | GOLD'_'SILVER | GOLD'_'BRONZE | SILVER'_'BRONZE | GOLD | SILVER | BRONZE); //There is probably a better / smarter regex for this but yeah...
GOLD: [1-9][0-9]*[G];
SILVER: [1-9][0-9]*[S];
BRONZE: ([1-9][0-9]*[B]|[0][B]);
IDENTIFIER: [a-zA-Z0-9]+; //Variable identifier.


//Expressions.
ADD: '+';
SUB: '-';
MUL: '*';
MOD: '%';
DIV: '/';
POW: '^';

//Logic expressions.
LOGIC_EQUAL: '==';
LOGIC_UNEQUAL: '=!=';
LOGIC_BIGGER: '>';
LOGIC_LOWER: '<';
LOGIC_BIGGER_EQUAL: '>=';
LOGIC_LOWER_EQUAL: '<=';
LOGIC_OR: '||';
LOGIC_AND: '&&';

//Style.
EQUALS: '=';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
APOSTROPHE: '"';
COMMENT: '//*'.*? [\n\r]+ -> skip;
WS: [\r\n ]+ -> skip;

