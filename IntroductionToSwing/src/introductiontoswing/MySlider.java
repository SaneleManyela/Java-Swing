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
public class MySlider extends JFrame {
    public MySlider() {
        super("Java Sliders");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        
        JPanel jpPanel = new JPanel();
        
        JLabel lblLabelOne = new JLabel("On a scale from -50 to 50 how comfortable are you with GUI programming?");
        jpPanel.add(lblLabelOne);
        
        JSlider slideOne = new JSlider(JSlider.HORIZONTAL, -50, 50, 0);
        slideOne = slideProperties(slideOne);
        jpPanel.add(slideOne);
        
        JLabel lblLabelTwo = new JLabel("Using the scale below how likely are you to recommend Java?");
        jpPanel.add(lblLabelTwo);
        JSlider slideTwo = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
        slideTwo = slideProperties(slideTwo);
        jpPanel.add(slideTwo);
        
        this.add(jpPanel);
        this.setVisible(true);
    }
    
    private JSlider slideProperties(JSlider slide) {
        slide.setMajorTickSpacing(20);
        slide.setMinorTickSpacing(5);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        return slide;
    }
}
