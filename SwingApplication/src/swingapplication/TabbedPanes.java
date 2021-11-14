/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapplication;

import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author Sanele
 */
public class TabbedPanes extends JFrame {
    public TabbedPanes() {
        super("Tabbed Panes");
        this.setSize(new Dimension(400, 300));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel jpFilePanel = new JPanel();
        jpFilePanel.add(new JLabel("Save"));
        jpFilePanel.add(new JButton("OK"));
        
        JPanel jpPasswordPanel = new JPanel();
        jpPasswordPanel.add(new JLabel("Enter Password:"));
        jpPasswordPanel.add(new JPasswordField(10));
        
        JPanel jpSliderPanel = new JPanel();
        JSlider slide = new JSlider(JSlider.HORIZONTAL, -100, 100, 0);
        slide.setMajorTickSpacing(20);
        slide.setMinorTickSpacing(10);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        jpSliderPanel.add(slide);
        
        JTabbedPane tpTab = new JTabbedPane(JTabbedPane.TOP,
                JTabbedPane.SCROLL_TAB_LAYOUT);
        tpTab.add("File", jpFilePanel);
        tpTab.add("Password", jpPasswordPanel);
        tpTab.add("Slider", jpSliderPanel);
        this.add(tpTab);
        
        this.setVisible(true);
    }
}
