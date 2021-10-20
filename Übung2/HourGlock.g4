// HourGlock.g4
lexer grammar HourGlock;
                    
Number: Digits ('.' Digits)? ;

fragment Digits: ([0-9])+ ;

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
LPAREN: '(';
RPAREN: ')';

WS: [ \t\r\n]+ -> channel(HIDDEN);

