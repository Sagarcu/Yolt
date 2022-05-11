grammar ExampleLang;

program: statement* EOF;

statement: (HELLO | HI) SEMICOLON;

HELLO: 'hello';
HI:    'hi bitch';
SEMICOLON: ';';

WS: [\r\n\t ]+ -> skip;
