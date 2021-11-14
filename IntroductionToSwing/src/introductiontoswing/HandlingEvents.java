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
public class HandlingEvents extends JFrame implements ActionListener, ItemListener{
    JButton btnClick = new JButton("Click Me!");
    JCheckBox cbCheck = new JCheckBox("Check this!");
    
    public HandlingEvents() {
        super("My Events");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        cbCheck.addItemListener(HandlingEvents.this);
        btnClick.addActionListener(HandlingEvents.this);
        
        JPanel jpPanel = new JPanel();
        jpPanel.add(cbCheck);
        jpPanel.add(btnClick);
        
        this.add(jpPanel);
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        
        if(source.equals(btnClick)) {
            JOptionPane.showMessageDialog(HandlingEvents.this, 
                    "You clicked the button", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if(source.equals(cbCheck)) {
            JOptionPane.showMessageDialog(HandlingEvents.this, "You checked a check button",
                    "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
