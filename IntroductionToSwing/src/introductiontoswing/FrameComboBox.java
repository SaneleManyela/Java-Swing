/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class FrameComboBox extends JFrame {
    
    public FrameComboBox() {
        super("Food");
        this.setBounds(200, 200, 200, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        for(String str : arrFood) {
            cboFood.addItem(str);
        }
        
        JButton btnLunch = new JButton("Click Me!");
        btnLunch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(FrameComboBox.this, "Today's lunch is a " +
                        cboFood.getSelectedItem().toString(), "Lunch",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        this.jpPanel.add(lblLabel);
        this.jpPanel.add(cboFood);
        this.jpPanel.add(btnLunch);
        
        this.add(this.jpPanel);
        this.pack();
        this.setVisible(true);
    }
    
    String[] arrFood = {"Pizza", "Burgers", "Sandwich", "Hotdogs", "Salad"};
    JComboBox cboFood = new JComboBox();
    JLabel lblLabel = new JLabel("What's for lunch?");
    JPanel jpPanel = new JPanel();
}
