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
public class MenuBars extends JFrame {
    public MenuBars() {
        super("My Frame");
        this.setSize(300, 150);
        JMenuBar mbMenuBar = new JMenuBar();
        this.setJMenuBar(mbMenuBar);
        
        JMenu mnuMenu = new JMenu("Menu");
        JMenuItem mnuItem = new JMenuItem("Menu Item");
        JMenu mnuSubMenu = new JMenu("Sub Menu");
        
    }
}
