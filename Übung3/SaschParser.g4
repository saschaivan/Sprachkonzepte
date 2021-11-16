parser grammar SaschParser;
options {
	tokenVocab = Sasch;
}

matchup: (side VS side)+;

side: champion COLON score DIVIDER items;

champion: Champion;

score: kills SLASH deaths SLASH assists;

kills: NUMBER;

deaths: NUMBER;

assists: NUMBER;

items:
	(BRACKETOPEN BRACKETCLOSE)
	| (BRACKETOPEN (mythic | normal | unique) BRACKETCLOSE)
	| BRACKETOPEN (mythic | normal | unique) (
		COMMA (normal | unique)
	)+ BRACKETCLOSE;

mythic: Mythics;

normal: Normal;

unique: Unique;