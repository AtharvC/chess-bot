package mainBoard;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class InitializeBoard {
    JFrame frame;
    JPanel[][] squares = new JPanel[8][8];

    HashMap<String, int[][]> Values = new HashMap<>();



    InitializeBoard() {

        //initializes board pattern
        frame = new JFrame("Chess");
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(8, 8));
        //Image icon=Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/Chess Logo.jpg"));
        //frame.setIconImage(icon);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel();
                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(Color.white);
                } else {
                    squares[i][j].setBackground(Color.black);
                }

                frame.add(squares[i][j]);
            }
        }

        //puts the pieces on the board

        squares[0][0].add(new JLabel(new ImageIcon(this.getClass().getResource("/brook.png"))));
        Piece brook = new Piece(1, "A8", 'b');
        squares[0][1].add(new JLabel(new ImageIcon(this.getClass().getResource("/bknight.png"))));
        Piece bknight = new Piece(2, "B8", 'b');
        squares[0][2].add(new JLabel(new ImageIcon(this.getClass().getResource("/bbishop.png"))));
        Piece bbishop = new Piece(3, "C8", 'b');
        squares[0][3].add(new JLabel(new ImageIcon(this.getClass().getResource("/bqueen.png"))));
        Piece bqueen = new Piece(4, "D8", 'b');
        squares[0][4].add(new JLabel(new ImageIcon(this.getClass().getResource("/bking.png"))));
        Piece bking = new Piece(5, "E8", 'b');
        squares[0][5].add(new JLabel(new ImageIcon(this.getClass().getResource("/bbishop.png"))));
        Piece bbishop2 = new Piece(3, "G8", 'b');
        squares[0][6].add(new JLabel(new ImageIcon(this.getClass().getResource("/bknight.png"))));
        Piece bknight2 = new Piece(2, "H8", 'b');
        squares[0][7].add(new JLabel(new ImageIcon(this.getClass().getResource("/brook.png"))));
        Piece brook2 = new Piece(1, "I8", 'b');


        squares[7][0].add(new JLabel(new ImageIcon(this.getClass().getResource("/wrook.png"))));
        Piece wrook1 = new Piece(1, "A1", 'w');
        squares[7][1].add(new JLabel(new ImageIcon(this.getClass().getResource("/wknight.png"))));
        Piece wknight1 = new Piece(2, "A2", 'w');
        squares[7][2].add(new JLabel(new ImageIcon(this.getClass().getResource("/wbishop.png"))));
        Piece wbishop1 = new Piece(3, "A3", 'w');
        squares[7][3].add(new JLabel(new ImageIcon(this.getClass().getResource("/wqueen.png"))));
        Piece wqueen = new Piece(4, "A4", 'w');
        squares[7][4].add(new JLabel(new ImageIcon(this.getClass().getResource("/wking.png"))));
        Piece wking = new Piece(5, "A5", 'w');
        squares[7][5].add(new JLabel(new ImageIcon(this.getClass().getResource("/wbishop.png"))));
        Piece wbishop2 = new Piece(3, "A6", 'w');
        squares[7][6].add(new JLabel(new ImageIcon(this.getClass().getResource("/wknight.png"))));
        Piece wknight2 = new Piece(2, "A7", 'w');
        squares[7][7].add(new JLabel(new ImageIcon(this.getClass().getResource("/wrook.png"))));
        Piece wrook2 = new Piece(1, "A8", 'w');
        for (int i=0;i<8;i++)
        {
            squares[1][i].add(new JLabel(new ImageIcon(this.getClass().getResource("/bpawn.png"))));
            squares[6][i].add(new JLabel(new ImageIcon(this.getClass().getResource("/wpawn.png"))));
        }
        squares[0][0].add(new JLabel(new ImageIcon(this.getClass().getResource("/brook.png"))));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public JPanel[][] getSquares() {
        return squares.clone();
    }

    public JFrame getFrame(){

        return frame;
    }

    public static void main(String[] args) {

        new InitializeBoard();


        Piece Brook = new Piece(1, "A1", 'b');
        String[] places = Brook.canMoveto();
    }
}


