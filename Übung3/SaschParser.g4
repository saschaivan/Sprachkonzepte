parser grammar SaschParser ;
options { tokenVocab=Sasch ; }

matchup: side VS side ; 

side: champion COLON score DIVIDER BRACKETOPEN items BRACKETCLOSE;

champion: Champion ;

score: Score ;

items: Items ;

/*
score: kills SLASH deaths SLASH assists ;

kills: Kills ;

deaths: Deaths ;

assists: Assists ;

items: mythic | mythic COMMA normal (COMMA (Normal | Unique) COMMA items)? ;

mythic: Mythics ; 

normal: Normal ;

unique: Unique ;
*/