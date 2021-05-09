package mainBoard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SetComponentsToClickable implements ActionListener {
    private InitializeBoard initializeBoard;
    private JFrame frame;
    SetComponentsToClickable(InitializeBoard initializeBoard){
        this.initializeBoard=initializeBoard;
        this.frame=initializeBoard.getFrame();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
