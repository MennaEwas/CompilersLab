grammar g;
WHITESPACE:[ \t\n]->skip;
Comment: '//'.*?'\n'->skip;
//terminals are capital
TYPE: 'int'|'boolean';
Char_literal: '\'' CHAR '\'';
String_literal: '"' CHAR* '"';
//char: ;
//basic
fragment CHAR: SP|DIGIT|ALPHA;
fragment SP:'!'|'\\\''|'\\'|'\''|'#'|'$'|'%'|'&'|'('|')'|'*'|'+'|'-'|'.'|'/'|';'|':'|'<'|'>'|'='|'?'|'@'|'['|']'|'^'|'_'|'`'|'{'|'}'|'~'|' ';
BOOL_LITERAL: 'true' | 'false';
DIGIT: [0-9]+;
//operations
ALPHA: [a-zA-Z]+ |'_'+;
ARITH_OP: '+'|'-';
REL_OP: '<'|'>'|'<='|'>=';
EQ_OP:'==' | '!=';
COND_OP: '&&' | '||';
assign_op: '='| '+=' | '-=';
HEX: 'a'..'f'|'A'..'F';
HEX_DIGIT: DIGIT|HEX;
HEX_LITERAL: '0x' HEX_DIGIT+;
//types
program: 'class Program' '{' field_decl* method_decl* '}';
//program
field_decl: TYPE (id | id '[' int_literal ']') (','(id | id '[' int_literal ']'))* ';' ;
method_decl: (TYPE | 'void') id '('((TYPE id)(','(TYPE id))*)?')' block;
block: '{' var_decl* statement* '}';
var_decl: TYPE (id)(',' id)* ';' ;
statement: location assign_op expr';'
            | method_call
            | 'if' '(' expr ')' block ('else' block)?
            | 'for' id '=' expr ',' expr block
            | 'return' (expr)? ';'
            | 'break' ';'
            | 'continue' ';'
            |block;

method_call: method_name '(' ( (expr)(',' expr)* )? ')' ';'
            | 'callout' '(' String_literal (',' (callout_arg) (',' callout_arg)*)?')' ';';
method_name: id;
location: id | id '['expr']';
expr: location | method_call | literal | expr bin_op expr | '-' expr | '!' expr | '('expr')';
callout_arg: expr | String_literal;
bin_op: ARITH_OP | REL_OP | EQ_OP |COND_OP;
literal: int_literal | Char_literal | BOOL_LITERAL;
id: ALPHA | alpha_num;
alpha_num: ALPHA | DIGIT;
int_literal: decimal_literal | HEX_LITERAL;
decimal_literal: DIGIT DIGIT*;
