/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapplication;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Sanele
 */
public class SwingApplication extends JFrame {
    public SwingApplication() {
        super("My Swing Application");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JMenuBar mbMenuBar = new JMenuBar();
        this.setJMenuBar(mbMenuBar);
        
        JMenu mnuFile = new JMenu("File");
        JMenuItem mnuItemClose = new JMenuItem("Close");
        JMenuItem mnuItemMinimise = new JMenuItem("Minimise");
        
        JMenu mnuView = new JMenu("View");
        JMenu mnuLookAndFeel = new JMenu("Look & Feel");
        
        ButtonGroup bgMenuItems = new ButtonGroup();
        JRadioButtonMenuItem rbMnuItemWindows = new JRadioButtonMenuItem("Windows");
        JRadioButtonMenuItem rbMnuItemMotif = new JRadioButtonMenuItem("Motif");
        JRadioButtonMenuItem rbMnuItemMetal = new JRadioButtonMenuItem("Metal");
        bgMenuItems.add(rbMnuItemWindows);
        bgMenuItems.add(rbMnuItemMotif);
        bgMenuItems.add(rbMnuItemMetal);
                
        JMenu mnuHelp = new JMenu("Help");
        JMenuItem mnuItemAbout = new JMenuItem("About");
        
        mnuFile.add(mnuItemClose);
        mnuFile.add(mnuItemMinimise);
        
        mnuLookAndFeel.add(rbMnuItemWindows);
        mnuLookAndFeel.add(new JSeparator());
        mnuLookAndFeel.add(rbMnuItemMotif);
        mnuLookAndFeel.add(new JSeparator());
        mnuLookAndFeel.add(rbMnuItemMetal);
        mnuView.add(mnuLookAndFeel);
        
        mnuHelp.add(mnuItemAbout);
        
        mbMenuBar.add(mnuFile);
        mbMenuBar.add(mnuView);
        mbMenuBar.add(mnuHelp);
        
        JPanel jpPanel = new JPanel(new BorderLayout(5, 5));
        
        JLabel lblLabel = new JLabel();
        jpPanel.add(lblLabel, BorderLayout.NORTH);
        lblLabel.setToolTipText("My label");
        
        JScrollBar sbScrollBar = new JScrollBar(JScrollBar.VERTICAL);
        this.add(sbScrollBar, BorderLayout.EAST);
        
        JCheckBox cbCheck = new JCheckBox("Check!");
        cbCheck.setToolTipText("Check Me!");
        jpPanel.add(cbCheck, BorderLayout.CENTER);
        
        this.add(jpPanel);
        this.setVisible(true);
        
        lblLabel.setText(JOptionPane.showInputDialog(SwingApplication.this,
                "Provide text for a label", "Label Text",
                JOptionPane.INFORMATION_MESSAGE));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arrOptions = {"Menu Frame", "Tabbed Frame"};
        int intResponse = JOptionPane.showOptionDialog(null,
                "Choose frame to display", "Swing Application", 0,
                JOptionPane.QUESTION_MESSAGE, null, arrOptions, arrOptions[0]);
        
        if(intResponse == 0) {
            new SwingApplication();
        } else {
            new TabbedPanes();
        }
    }
    
}
