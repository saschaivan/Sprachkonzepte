append([],L,L).
append([H|T1],L,[H|T2]) :- append(T1,L,T2).