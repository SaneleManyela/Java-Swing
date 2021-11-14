/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class Toolbars extends JFrame {
    public Toolbars() {
        super("Toolbars");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        
        ImageIcon openIcon = new ImageIcon(
                "Open.jfif");
        
        ImageIcon saveIcon = new ImageIcon(
                "Save.png");
        
        ImageIcon printIcon = new ImageIcon(
                "Print.png");
        
        JButton btnOpen = new JButton("Open", openIcon);
        JButton btnSave = new JButton("Save", saveIcon);
        JButton btnPrint = new JButton("Print", printIcon);
        
        JToolBar toolBar = new JToolBar();
        toolBar.add(btnOpen);
        toolBar.add(btnSave);
        toolBar.add(new JToolBar.Separator());
        toolBar.add(btnPrint);
        
        JTextArea taTextArea = new JTextArea(10, 40);
        JScrollPane spScrollPane = new JScrollPane(taTextArea);
        
        this.add(toolBar, BorderLayout.NORTH);
        this.add(spScrollPane, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
}
