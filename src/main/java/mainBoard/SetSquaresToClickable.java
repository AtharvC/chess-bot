package mainBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;


public class SetSquaresToClickable {


    InitializeBoard initializeBoard = new InitializeBoard();
    JPanel[][] squares = initializeBoard.getSquares();


    SetSquaresToClickable() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (squares[i][j].getComponents().length > 0) {
                    int finalI = i;
                    int finalJ = j;
                    squares[i][j].addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            squares[finalI][finalJ].setBackground(Color.blue);
                            System.out.println(Arrays.toString(Arrays.stream(squares[finalI][finalJ].getComponents()).toArray()));

                        }
                    });
                }


            }
        }
    }


    public static void main(String[] args) {
        new SetSquaresToClickable();

    }
}