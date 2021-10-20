// Time.g4
lexer grammar Time;

Hour: [1-9]|'1'[0-2] ;

Minutes: [0-5][0-9] ;

Identifier: 'a.m.'|'p.m.'|[n|N]'oon'|[m|M]'idnight' ;

DIVIDER: ':';

WS: [ \t\r\n]+ -> channel(HIDDEN);