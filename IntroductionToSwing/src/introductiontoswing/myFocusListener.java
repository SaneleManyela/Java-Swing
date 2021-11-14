/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class myFocusListener extends JFrame{
    public myFocusListener() {
        super("Sanele");
        this.setBounds(300, 300, 400, 350);
        this.setLocationRelativeTo(null);
        
        JTextArea taTextArea = new JTextArea(10, 45);
        taTextArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                taTextArea.setText("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                taTextArea.setText("Focus Lost");
            }
        });
        JScrollPane spScrollPane = new JScrollPane(taTextArea);
        
        JButton btnButton = new JButton("Click!");
        
        
        JPanel jpPanel = new JPanel();
        jpPanel.add(spScrollPane);
        jpPanel.add(btnButton);
        
        this.add(jpPanel);
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setVisible(true);
    }
}
