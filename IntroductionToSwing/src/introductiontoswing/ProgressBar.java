/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class ProgressBar extends JFrame {
    JProgressBar pbProgressBar = new JProgressBar();
    
    public ProgressBar() {
        super("Progress Bar");
        this.setSize(new Dimension(400, 200));
        this.setLocationRelativeTo(null);
        pbProgressBar.setStringPainted(true);
        this.add(pbProgressBar);
        this.setVisible(true);
        changeBar();
    }
    
    private void changeBar() {
        for(int i = 0; i < (pbProgressBar.getMaximum() + 1); i++) {
            pbProgressBar.setValue(i);
            
            try {
                Thread.sleep(20);
            } catch(InterruptedException e) {
                JOptionPane.showMessageDialog(ProgressBar.this, e.getMessage(),
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
