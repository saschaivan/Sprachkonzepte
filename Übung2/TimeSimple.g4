// TimeSimple.g4
lexer grammar TimeSimple;

Clock: Time Identifier | Twelve Noonight;

fragment Time: Hours ':' Minutes;
fragment Identifier: ' a.m.'|' p.m.';
fragment Twelve: '12 ';
fragment Noonight: [n|N]'oon'|[m|M]'idnight';
fragment Minutes: [0-5][0-9];
fragment Hours: [1-9]|'1'[0-2];

WS: [ \t\r\n]+ -> channel(HIDDEN);