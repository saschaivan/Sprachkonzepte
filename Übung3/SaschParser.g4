parser grammar SaschParser;
options {
	tokenVocab = SaschLexer;
}

game: matchup+;

matchup: side VS side;

side: champion COLON score DIVIDER items;

champion: Champion;

score: kills SLASH deaths SLASH assists;

kills: NUMBER;

deaths: NUMBER;

assists: NUMBER;

items:
	(BRACKETOPEN BRACKETCLOSE)
	| (
		BRACKETOPEN (mythic | normal | unique | chargesStacks) BRACKETCLOSE
	)
	| BRACKETOPEN (mythic | normal | unique | chargesStacks) (
		COMMA (normal | unique | chargesStacks)
	)+ BRACKETCLOSE;

mythic: Mythics;

normal: Normal;

unique: Unique;

chargesStacks: ChargesStacks;