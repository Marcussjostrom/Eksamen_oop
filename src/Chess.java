public class Chess {

    class chessobjects implements Chess.Move{

        @Override
        public String toString() {
            return null;
        }

    }
    class rook extends chessobjects implements Chess.Move{

    }
    class pawn extends chessobjects implements Chess.Move{

    }
    class knight extends chessobjects implements Chess.Move{

    }
    class bishop extends chessobjects implements Chess.Move{

    }
    class queen extends  chessobjects implements Chess.Move{

    }
    class king extends  chessobjects implements Chess.Move{

    }



    interface Move {

    }
}

/* Hadde skrevet en del her, men fjernet det. Ble bare tull, så her er  kunn skjellettet til chess klassen.*/
