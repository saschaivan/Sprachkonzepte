lexer grammar Sasch;

Sasch: Champion ' : ' Score ' - ' '['Items']' ' vs. ' Champion ' : ' Score ' - ' '['Items']';

fragment Champion:  'Aatrox' |
                    'Ahri' |
                    'Akali' |
                    'Akshan' |
                    'Alistar' |
                    'Amumu'|
                    'Anivia' |
                    'Annie' |
                    'Lucian' |
                    'Ziggs' ;
fragment Score: [0-9]?[0-9]'/'[0-9]?[0-9]'/'[0-9]?[0-9] ;
fragment Items: Mythics ', ' Normal | Mythics | Normal | Unique ;
fragment Mythics:   'Bloodward' |
                    'Ceaseless Hunger' |
                    'Deicide' |
                    'Divine Sunderer' |
                    'Draktharr\'s Shadowcarver' |
                    'Dreamshatter' |
                    'Duskblade of Drakkthar' |
                    'Eclipse' |
                    'Eternal Winter' |
                    'Galeforce' |
                    'Luden\'s Echo' ;
fragment Normal:    'Abyssal Mask' |
                    'Aegis of the Legion' |
                    'Aether Wisp' |
                    'Amplifying Tome' |
                    'Anathema\'s Chains' |
                    'Archangel\'s Staff' |
                    'Phantom Dancer' |
                    'Rabadons' ;
fragment Unique:    'Black Spear' |
                    'Death\'s Daugther' | 'Fire At Will' | 'Raise Morale' |
                    'Scarecrow Effigy' | 
                    'Slightly Magical Boots' |
                    'Your Cut' ;

WS: [ \t\r\n]+ -> channel(HIDDEN);