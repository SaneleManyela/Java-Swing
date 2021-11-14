/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class GridLayoutFrame extends JFrame{
    public GridLayoutFrame() {
        super("GridLayout Frame");
        this.setBounds(200, 200, 350, 350);
        this.setLocationRelativeTo(null);
        
        this.setLayout(new GridLayout(4, 3, 10, 10));
        
        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!GridLayoutFrame.this.lst.isEmpty()) {
                    GridLayoutFrame.this.lst.forEach((lstItem) -> {
                        intSum += Integer.parseInt(lstItem.toString());
                    });
                } else {
                    JOptionPane.showMessageDialog(GridLayoutFrame.this, "No values selected",
                            "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        this.add(btnPlus);
        
        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(GridLayoutFrame.this, 
                        "The sum of the selected values is " + intSum,
                            "Sum", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        this.add(btnEqual);
                
        for(int i = 0; i <= 9; i++) {
            this.add(button(String.valueOf(i)));
        }
        
        this.setVisible(true);
    }
    
    java.util.List lst = new ArrayList();
    int intSum = 0;
    
    private JButton button(String strText) {
        JButton btnButton = new JButton(strText);
        
        btnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GridLayoutFrame.this.lst.add(Integer.parseInt(btnButton.getText()));
            }
        });
        //btnButton.setPreferredSize(new Dimension(120, 90));
        return btnButton;
    }
}
