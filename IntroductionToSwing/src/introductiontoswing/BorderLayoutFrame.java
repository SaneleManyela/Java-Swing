/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class BorderLayoutFrame extends JFrame{
    public BorderLayoutFrame() {
        super("BorderLayout Frame");
        this.setBounds(200, 200, 500, 300);
        this.setLocationRelativeTo(null);
        
        JButton btnNorth = new JButton("North");
        btnNorth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(BorderLayoutFrame.this,
                        "I am the North button", "Button Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnNorth.setSize(new Dimension(0, 30));
        
        JButton btnEast = new JButton("East");
        btnEast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(BorderLayoutFrame.this,
                        "I am the East button", "Button Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnEast.setSize(new Dimension(100, 0));
        
        JButton btnCenter = new JButton("Center");
        btnCenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(BorderLayoutFrame.this,
                        "I am the Center button", "Button Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnCenter.setSize(new Dimension(0, 0));
        
        JButton btnSouth = new JButton("South");
        btnSouth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(BorderLayoutFrame.this,
                        "I am the South button", "Button Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnSouth.setSize(new Dimension(0, 40));
        
        JButton btnWest = new JButton("West");
        btnWest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(BorderLayoutFrame.this,
                        "I am the West button", "Button Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnWest.setSize(new Dimension(80, 0));
        
        this.setLayout(new BorderLayout(10, 20));
        this.add(btnNorth, BorderLayout.NORTH);
        this.add(btnSouth, BorderLayout.SOUTH);
        this.add(btnEast, BorderLayout.EAST);
        this.add(btnWest, BorderLayout.WEST);
        this.add(btnCenter, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
}
