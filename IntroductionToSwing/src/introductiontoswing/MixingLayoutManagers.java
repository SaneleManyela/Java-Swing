/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class MixingLayoutManagers extends JFrame {
    JPanel jpPane = new JPanel();
    GridLayout grid = new GridLayout(2, 3);
    
    public MixingLayoutManagers() {
        super("Layouts");
        this.setBounds(200, 200, 200, 150);
        this.setLocationRelativeTo(null);
        
        this.add(BorderLayout.NORTH, new JButton("I am north!"));
        this.add(BorderLayout.SOUTH, new JButton("I am South!"));
        
        this.jpPane.setLayout(this.grid);
        
        for(int i = 1; i < 7; i++) {
            this.jpPane.add(new JButton("Grid " + i));
        }
        
        this.add(this.jpPane);
        this.pack();
        this.setVisible(true);
    }
}
