grammar propertyFile;
file : prop+;
id: ALPHA;
prop : id '=' String_literal'\n';
WHITESPACE:[ \t\n]->skip;
String_literal: '"' CHAR* '"';
fragment CHAR: ALPHA;
ALPHA: [a-zA-Z]+ |'_'+;

