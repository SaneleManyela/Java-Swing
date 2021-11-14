/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import javax.swing.*;
/**
 *
 * @author EL.2021.T2D0G7
 */
public class MyIcons extends JFrame{
    public MyIcons() {
        super("Icons");
        this.setSize(450, 150);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JPanel jpPane = new JPanel();
        
        JLabel lblIcon = new JLabel("I have an Icon!", 
                new ImageIcon("javaIcon.png"), 
                SwingConstants.CENTER);
        jpPane.add(lblIcon);
        
        JButton btnIcon = new JButton("Me too!");
        btnIcon.setIcon(new ImageIcon("Oracle.png"));
        jpPane.add(btnIcon);
        
        this.add(jpPane);
        this.setVisible(true);
    }
}
