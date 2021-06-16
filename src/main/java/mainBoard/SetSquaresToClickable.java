package mainBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class SetSquaresToClickable {


    InitializeBoard initializeBoard = new InitializeBoard();
    JPanel[][] squares = initializeBoard.getSquares();
    JPanel newSquareClicked;
    boolean isNewSquareClicked = false;
    MouseAdapter onSquareClick;
    int prevX = -1, prevY = -1;

    SetSquaresToClickable() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (squares[i][j].getComponents().length > 0) {
                    int finalI = i;
                    int finalJ = j;
                    if (newSquareClicked != null)
                        newSquareClicked.setBackground(squares[i][j].getBackground());
                    squares[i][j].addMouseListener(setOnSquareClick(i, j));
                }
                /*
                if (isNewSquareClicked) {
                    squares[i][j].setBackground(newSquareClicked.getBackground());
                }
                isNewSquareClicked = false;
                 */
            }
        }
    }

    public MouseListener setOnSquareClick(int i, int j) {
        onSquareClick = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                squares[i][j].setBackground(Color.blue);

                isNewSquareClicked = prevX != i && prevY != j;

                if (isNewSquareClicked = true) {
                    if (prevX != -1 && prevY != -1) {
                        if (((prevX & 1) == 0 && (prevY & 1) == 0) || ((prevX & 1) == 1 && (prevY & 1) == 1)) {
                            squares[prevX - 1][prevY - 1].setBackground(Color.WHITE);
                        } else {
                            squares[prevX - 1][prevY - 1].setBackground(Color.BLACK);
                        }
                    }
                }

                prevX = i + 1;
                prevY = j + 1;
            }
        };
        return onSquareClick;
    }

    public static void main(String[] args) {
        new SetSquaresToClickable();

    }
}