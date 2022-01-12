zug(konstanz, 08.40, offenburg, 10.59).
zug(konstanz, 08.40, karlsruhe, 11.49).
zug(konstanz, 08.53, singen, 09.26).
zug(singen, 09.37, stuttgart, 11.32).
zug(offenburg, 11.29, mannheim, 12.24).
zug(karlsruhe, 12.08, mainz, 13.47).
zug(stuttgart, 11.51, mannheim, 12.28).
zug(mannheim, 12.39, mainz, 13.18).

verbindung(Start, Zeit, End_Ziel, Reiseplan) :-
    zug(Start, Start_Zeit, End_Ziel, Ziel_Zeit),
    Start_Zeit >= Zeit,
    append([Start, Start_Zeit, End_Ziel, Ziel_Zeit], [], Reiseplan).
verbindung(Start, Zeit, End_Ziel, Reiseplan) :-
    zug(Start, Start_Zeit, Umstieg, Umstieg_Zeit),
    Start_Zeit >= Zeit,
    verbindung(Umstieg, Umstieg_Zeit, End_Ziel, New_Reiseplan),
    append([Start, Start_Zeit, Umstieg, Umstieg_Zeit], New_Reiseplan, Reiseplan).
	
    

