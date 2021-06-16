package mainBoard;

public class ChessMain {

    private final int rook = 1;
    private final int knight = 2;
    private final int bishop = 3;
    private final int queen = 4;
    private final int king = 5;
    private final int pawn = 6;

    public int[][] board = new int[8][8];

    public static void main(String[] args) {
        InitializeBoard initializeBoard = new InitializeBoard();

    }
}