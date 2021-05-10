package mainBoard;

import javax.swing.*;
import java.awt.event.*;



public class SetSquaresToClickable {

    InitializeBoard initializeBoard=new InitializeBoard();
    JPanel[][] squares=initializeBoard.getSquares();


    SetSquaresToClickable(){
        for(int i=0;i<8;i++)
        {for(int j=0;j<8;j++)
        {
            if((i+j)%2==0)
            {squares[i][j].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println("The white square was clicked");

                }
            });
            }
            else if((i+j)%2!=0)
            {
                squares[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("The black square was clicked");
                    }
                });
            }
        }}


    }


    public static void main(String[] args) {
        new SetSquaresToClickable();


    }
}
