package mainBoard;

import javax.swing.*;
import java.awt.*;

public class InitializeBoard {
    JFrame frame;
    JPanel[][] squares = new JPanel[8][8];

    InitializeBoard() {

        //initializes board pattern
        frame = new JFrame("Chess");
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(8, 8));
        Image icon=Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/Chess Logo.jpg"));
        frame.setIconImage(icon);

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
        squares[0][1].add(new JLabel(new ImageIcon(this.getClass().getResource("/bknight.png"))));
        squares[0][2].add(new JLabel(new ImageIcon(this.getClass().getResource("/bbishop.png"))));
        squares[0][3].add(new JLabel(new ImageIcon(this.getClass().getResource("/bqueen.png"))));
        squares[0][4].add(new JLabel(new ImageIcon(this.getClass().getResource("/bking.png"))));
        squares[0][5].add(new JLabel(new ImageIcon(this.getClass().getResource("/bbishop.png"))));
        squares[0][6].add(new JLabel(new ImageIcon(this.getClass().getResource("/bknight.png"))));
        squares[0][7].add(new JLabel(new ImageIcon(this.getClass().getResource("/brook.png"))));

        squares[7][0].add(new JLabel(new ImageIcon(this.getClass().getResource("/wrook.png"))));
        squares[7][1].add(new JLabel(new ImageIcon(this.getClass().getResource("/wknight.png"))));
        squares[7][2].add(new JLabel(new ImageIcon(this.getClass().getResource("/wbishop.png"))));
        squares[7][3].add(new JLabel(new ImageIcon(this.getClass().getResource("/wqueen.png"))));
        squares[7][4].add(new JLabel(new ImageIcon(this.getClass().getResource("/wking.png"))));
        squares[7][5].add(new JLabel(new ImageIcon(this.getClass().getResource("/wbishop.png"))));
        squares[7][6].add(new JLabel(new ImageIcon(this.getClass().getResource("/wknight.png"))));
        squares[7][7].add(new JLabel(new ImageIcon(this.getClass().getResource("/wrook.png"))));
        for (int i=0;i<8;i++)
        {
            squares[1][i].add(new JLabel(new ImageIcon(this.getClass().getResource("/bpawn.png"))));
            squares[6][i].add(new JLabel(new ImageIcon(this.getClass().getResource("/wpawn.png"))));
        }


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
    }
}


