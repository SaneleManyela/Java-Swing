package introductiontoswing;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL.2021.T2D0G7
 */
public class CheckBoxes extends JFrame{
    public CheckBoxes() {
        super("Covered Topics");
        this.setBounds(200, 200, 200, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Constructs all the components
        JLabel lblLabel = new JLabel("Select a topic you enjoyed in unit 1:");
        JCheckBox cbIntroToOOP = new JCheckBox("Intro to OOP");
        
    }
}
