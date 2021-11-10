parser grammar SaschParser ;
options { tokenVocab=Sasch ; }

matchup: side VS side ; 

side: Champion COLON score DIVIDER BRACKETOPEN items BRACKETCLOSE;

score: Kills SLASH Deaths SLASH Assists ;

items: Mythics COMMA Normal | Mythics | Normal | Unique ;