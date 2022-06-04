## Oppgaver
<h4 style="color:rgb(255, 200, 0)">Det skal skrives kode i 1 klasse for hver oppgave: Race, Shape3D() og Chess()</h4>
<h4 style="color:rgb(255, 200, 0)">Opprett forekomster av klassene og skriv ut i Oop.Race, Oop.Shape3D() og Oop.Chess()</h4>
<h4 style="color:rgb(255, 200, 0)">Utskriftene som skal genereres skal være mest mulig identiske med eksemplene som er vist for hver oppgave</h4>
<h4 style="color:rgb(255, 200, 0)">Formater utskriften ved å bruke *System.lineSeparator()* for newlines og *\t* for innrykk</h4>

 
<h3 style="color:rgb(128, 255, 128)">Oppgave 1, 30%: Race()</h3>

Et gateløp arrangeres med deltagere i 6 grupper:

1. Jenter under 12 år
2. Jenter 12-18 år
3. Jenter over 18 år
4. Gutter under 12 år
5. Gutter 12-18 år
6. Gutter over 18 år

- Opprett klassen *Race*
- Opprett lokale klasser i *Race* for å registre: *Group* og  *Runner*
- Registrer alle grupper
- Registrer 1 deltager i hver gruppe
- Opprett metoden *race.start()* som mottar løpere, gruppe og distanse 
  - Opprett overloaded versjon som også mottar *offset* [sek]
  - legg til *offset* til *startTime*  
- start alle grupper med 5 minutter offset mellom hver
- Opprett metoden *Group.simulate()* som simulerer et gjennomført løp
  - metoden mottar en liste med alle brukere samt gruppens gjennomsnittsfart [km/time]
- Kall metoden *Group.simulate()* for alle grupper
- Opprett metode i *Group* som gir utskriften nedenfor:


    Simulated race runners:
    Start: 22:24:29.942, End: 22:33:04.227, Used: 08:34.285, Distance: 2.0, Speed: 14,00, Age: 8, Name: Olga Olsen, Age-group: Jenter under 12
    Start: 22:19:29.942, End: 22:28:58.363, Used: 09:28.421, Distance: 3.0, Speed: 19,00, Age: 17, Name: Trine Hansen, Age-group: Jenter 12 - 18
    Start: 22:14:29.942, End: 22:24:29.942, Used: 10:00.000, Distance: 4.0, Speed: 24,00, Age: 19, Name: Lise Jensen, Age-group: Jenter over 18
    Start: 22:09:29.942, End: 22:19:29.942, Used: 10:00.000, Distance: 2.5, Speed: 15,00, Age: 8, Name: Ole Olsen, Age-group: Gutter under 12
    Start: 22:04:29.942, End: 22:14:59.942, Used: 10:30.000, Distance: 3.5, Speed: 20,00, Age: 17, Name: Hans Hansen, Age-group: Gutter 12 - 18
    Start: 21:59:29.942, End: 22:10:17.942, Used: 10:48.000, Distance: 4.5, Speed: 25,00, Age: 19, Name: Jens Jensen, Age-group: Gutter over 18
    
    =========================================

<h3 style="color:rgb(128, 255, 128)">Oppgave 2, 30%: shape3d()</h3>

- Opprett klassen *Shape3d*
- Opprett interface *Calc*
- Opprett sub-klasser av *Shape3d* og *Calc*  med metoder som produserer denne utskriften:


    Shape3d:
    
    Cube, width: 20.0, area: 2400.0, volume: 8000.0
    Pyramid, width: 20.0, height: 30.0, area: 1664.9110640673516, volume: 4000.0
    Cylinder, radius: 20.0, height: 30.0, area: 6283.185307179587, volume: 37699.11184307752
    Cone, radius: 20.0, height: 30.0, area: 3522.0717412637127, volume: 12566.370614359172
    Sphere, radius: 20.0, area: 2513.2741228718346, volume: 33510.32163829113
    
    =========================================
<h3 style="color:rgb(128, 255, 128)">Oppgave 3, 40%: chess()</h3>

- Opprett klasse for brikker og sub-klasse for hver brikke 
- sub-klassene skal implementere interface *Chess.Move* som deklarerer metoden *setLegalSquares()*
- sub-klassene skal overstyre (override) metoden *tostring()*  som generer utskriften nedenfor

*setLegalSquares()* finner alle lovlige ruter en brikke kan navigere til fra possisjonen den befinner seg på
(når ikke andre brikker blokkerer tilgangen)

For *Bonde* vises også ruter som kan nås ved slag av andre brikker

    Chess:
    Legal squares for Rook (Tårn) at E5:
    0 | 0 | 0 | 0 | 2 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 2 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 2 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 2 | 0 | 0 | 0
    2 | 2 | 2 | 2 | 1 | 2 | 2 | 2
    0 | 0 | 0 | 0 | 2 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 2 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 2 | 0 | 0 | 0
    
    Legal squares for Knight (Hest) at D5:
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 2 | 0 | 2 | 0 | 0 | 0
    0 | 2 | 0 | 0 | 0 | 2 | 0 | 0
    0 | 0 | 0 | 1 | 0 | 0 | 0 | 0
    0 | 2 | 0 | 0 | 0 | 2 | 0 | 0
    0 | 0 | 2 | 0 | 2 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    
    Legal squares for Bishop (Løper) at F4:
    0 | 0 | 2 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 2 | 0 | 0 | 0 | 2
    0 | 0 | 0 | 0 | 2 | 0 | 2 | 0
    0 | 0 | 0 | 0 | 0 | 1 | 0 | 0
    0 | 0 | 0 | 0 | 2 | 0 | 2 | 0
    0 | 0 | 0 | 2 | 0 | 0 | 0 | 2
    0 | 0 | 2 | 0 | 0 | 0 | 0 | 0
    0 | 2 | 0 | 0 | 0 | 0 | 0 | 0
    
    Legal squares for Queen (Dronning) at F5:
    0 | 2 | 0 | 0 | 0 | 2 | 0 | 0
    0 | 0 | 2 | 0 | 0 | 2 | 0 | 0
    0 | 0 | 0 | 2 | 0 | 2 | 0 | 2
    0 | 0 | 0 | 0 | 2 | 2 | 2 | 0
    2 | 2 | 2 | 2 | 2 | 1 | 2 | 2
    0 | 0 | 0 | 0 | 2 | 2 | 2 | 0
    0 | 0 | 0 | 2 | 0 | 2 | 0 | 2
    0 | 0 | 2 | 0 | 0 | 2 | 0 | 0
    
    Legal squares for King (Konge) at E1:
    0 | 0 | 0 | 2 | 1 | 2 | 0 | 0
    0 | 0 | 0 | 2 | 2 | 2 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    
    Legal squares for King (Konge) at E8:
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 2 | 2 | 2 | 0 | 0
    0 | 0 | 0 | 2 | 1 | 2 | 0 | 0
    
    Legal squares for King (Konge) at A1:
    1 | 2 | 0 | 0 | 0 | 0 | 0 | 0
    2 | 2 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    
    Legal squares for King (Konge) at H1:
    0 | 0 | 0 | 0 | 0 | 0 | 2 | 1
    0 | 0 | 0 | 0 | 0 | 0 | 2 | 2
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    
    Legal squares for King (Konge) at A8:
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    2 | 2 | 0 | 0 | 0 | 0 | 0 | 0
    1 | 2 | 0 | 0 | 0 | 0 | 0 | 0
    
    Legal squares for King (Konge) at H8:
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 2 | 2
    0 | 0 | 0 | 0 | 0 | 0 | 2 | 1
    
    Legal squares for King (Konge) at E5:
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 2 | 2 | 2 | 0 | 0
    0 | 0 | 0 | 2 | 1 | 2 | 0 | 0
    0 | 0 | 0 | 2 | 2 | 2 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    
    Legal squares for Pawn (Bonde) at E2:
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 1 | 0 | 0 | 0
    0 | 0 | 0 | 2 | 2 | 2 | 0 | 0
    0 | 0 | 0 | 0 | 2 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    
    Legal squares for Pawn (Bonde) at E3:
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 1 | 0 | 0 | 0
    0 | 0 | 0 | 2 | 2 | 2 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
    0 | 0 | 0 | 0 | 0 | 0 | 0 | 0