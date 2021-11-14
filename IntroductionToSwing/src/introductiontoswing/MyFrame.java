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
public class MyFrame extends JFrame{
    public MyFrame() {
        super("MyFrame");
        this.setBounds(200, 200, 250, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JButton btnButton = new JButton("Click Me!");
        this.add(btnButton);
        btnButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnButton.setSize(100, 50);
        btnButton.setLocation(new Point(75, 100));
        
        JPanel jpPane = new JPanel();
        JLabel lblLabel = new JLabel();
        jpPane.add(lblLabel);
        
        lblLabel.setText("Button position is: (" + 
                btnButton.getLocation().getY() + ", " + 
                btnButton.getLocation().getY() + ")");
        
        JLabel lblLabel2 = new JLabel();
        jpPane.add(lblLabel2);        
        
        lblLabel2.setText("There are " + jpPane.getComponentCount() 
                + " comnponents in this panel.");
        lblLabel2.setForeground(Color.BLUE);
       
        
        this.add(jpPane);
        
        this.setVisible(true);
    }
}
