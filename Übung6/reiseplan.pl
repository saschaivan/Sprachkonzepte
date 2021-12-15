zug(konstanz, 08.40, offenburg, 10.59).
zug(konstanz, 08.40, karlsruhe, 11.49).
zug(konstanz, 08.53, singen, 09.26).
zug(singen, 09.37, stuttgart, 11.32).
zug(offenburg, 11.29, mannheim, 12.24).
zug(karlsruhe, 12.08, mainz, 13.47).
zug(stuttgart, 11.51, mannheim, 12.28).
zug(mannheim, 12.39, mainz, 13.18).

verbindung(Start, StartZ, Ziel, Reiseplan) :-
    zug(Start, X, Y, Z),
    StartZ =< X,
    zug(Start, StartZ, Y1, Z1),
	append([Start, StartZ, Ziel, ZielZ], Reiseplan).
	
    

