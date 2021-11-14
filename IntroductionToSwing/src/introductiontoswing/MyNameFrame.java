/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class MyNameFrame extends JFrame{
    public MyNameFrame() {
        super("Sanele");
        this.setBounds(300, 300, 400, 350);
        this.setLocationRelativeTo(null);
        
        JTextArea taTextArea = new JTextArea(10, 45);
        JScrollPane spScrollPane = new JScrollPane(taTextArea);
        
        JButton btnButton = new JButton("Click!");
        btnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                taTextArea.setText(MyNameFrame.this.getTitle());
            }
        });
        
        JPanel jpPanel = new JPanel();
        jpPanel.add(spScrollPane);
        jpPanel.add(btnButton);
        
        this.add(jpPanel);
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setVisible(true);
    }
}
