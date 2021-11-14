/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class FlowLayoutFrame extends JFrame{
    public FlowLayoutFrame() {
        super("FlowLayout Frame");
        this.setBounds(200, 200, 350, 220);
        this.setLocationRelativeTo(null);
        
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        
        for(char c = 'A'; c <= 'Z'; c++) {
            this.add(button(""+c));
        }
        this.setVisible(true);
    }
    
    private JButton button(String strText) {
        JButton btnButton = new JButton(strText);
        btnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(FlowLayoutFrame.this, "I am " +
                        btnButton.getText(), "Selected", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnButton.setPreferredSize(new Dimension(50, 30));
        return btnButton;
    }
}