/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class TabbedPane extends JFrame{
    public TabbedPane() {
        super("Tabbed Panes");
        this.setSize(new Dimension(389, 91));
        this.setLocationRelativeTo(null);
        
        JPanel jpOne = new JPanel();
        JPanel jpTwo = new JPanel();
        JPanel jpThree = new JPanel();
        JPanel jpFour = new JPanel();
        JPanel jpFive = new JPanel();
        
        JTabbedPane tpTab = new JTabbedPane(JTabbedPane.TOP,
                JTabbedPane.SCROLL_TAB_LAYOUT);
        tpTab.add("One", jpOne);
        tpTab.add("Two", jpTwo);
        tpTab.add("Three", jpThree);
        tpTab.add("Four", jpFour);
        tpTab.add("Five", jpFive);
        this.add(tpTab);
        this.setVisible(true);
    }
}
