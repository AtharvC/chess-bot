package mainBoard;

public class Piece {
    Piece piece;

    final int rook = 1;
    final int knight = 2;
    final int bishop = 3;
    final int queen = 4;
    final int king = 5;
    final int slave = 6;

    Piece(int iD, String loc, char team){
        ID = iD;
        location = loc;
        bw = team;
    }

    public int getPieceID(){
        return ID;
    }

    public void onMove(String newLocation){
        location = newLocation;
    }

    public String getLocation(){
        return location;
    }


    public String onDeath() {
        return location;
    }

    public Piece onRevive(int RevivalID) {
        return new Piece(RevivalID, location, bw);
    }

    public String[] canMoveto() { System.out.println(ID);
        //TODO: We should highlight the squares right here
        //  Just like it was done in Windows 7 chess
        //  We're making it return a string array cuz we need it to make sure the pieces go to the right place

        return new String[0];
    }

}
