grammar json;
file : prop+;

prop : '{' String_literal ':' '{' expr(',' expr)*'}' '}';
//id: ALPHA;
expr: String_literal ':' r (',' expr)*;
r : '[]' | '[' (String_literal)(',' String_literal)* ']' | INT;

WHITESPACE:[ \t\n]->skip;
String_literal: '"' CHAR* '"';
fragment CHAR: ALPHA;
ALPHA: [a-zA-Z]+ |'_'+ | '.'+;
INT: [0-9]+;