package mainBoard;

public class Piece {
    Piece piece;

    final int rook = 1;
    final int knight = 2;
    final int bishop = 3;
    final int queen = 4;
    final int king = 5;
    final int slave = 6;

    Piece(int ID){
        piece = new Piece(ID);
    }


    public Piece onDeath() {
        return null;
    }
    public Piece onRevive() {
        return null;
    }

    public String[] canMoveto() {
        return new String[0];
    }
}
