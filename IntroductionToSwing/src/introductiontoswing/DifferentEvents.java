/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.*;
import java.awt.geom.*; // Used to draw lines
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class DifferentEvents extends JFrame implements ActionListener, 
    WindowListener, MouseListener{
    
    JLabel lblLabel = new JLabel("Move your mouse here");
    Painter paint = new Painter();
    JMenuBar mbMenuBar = new JMenuBar();
    JMenu mnuMenu = new JMenu("File");
    JMenuItem mnuItemExit = new JMenuItem("Exit");
    
        
    public DifferentEvents() {
        super("Line Magic");
        this.setBounds(250, 200, 250, 250);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(this);
        lblLabel.addMouseListener(this);
        paint.addMouseListener(this);
        mnuItemExit.addActionListener(this);
        lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mnuMenu.add(mnuItemExit);
        mbMenuBar.add(mnuMenu);
        this.setJMenuBar(mbMenuBar);
        this.add(BorderLayout.NORTH, lblLabel);
        this.add(BorderLayout.CENTER, paint);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed (ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(mnuItemExit)) {
            System.exit(0);
        }
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(DifferentEvents.this, "Welcome");
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        int intResponse = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit?");
        
        if(intResponse == JOptionPane.YES_OPTION) {
            DifferentEvents.this.dispose();
        }
    }
    
    @Override
    public void windowActivated(WindowEvent e) {
    }
    
    @Override
    public void windowClosed(WindowEvent e) {
    }
    
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
   
    @Override
    public void windowIconified(WindowEvent e) {
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        Object source = e.getSource();
        if(source.equals(lblLabel)) {
            lblLabel.setText("Click on <X> to exit");
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {   
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        paint.x = e.getX(); // Set the initial starting
        paint.y = e.getY(); // values for the drawing
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object source = e.getSource();
        if(source.equals(lblLabel)) {
            lblLabel.setText("Drag your mouse on panel below.");
        }
    }
}

class Painter extends JPanel implements MouseMotionListener {
    Line2D.Float ln = new Line2D.Float();
    float x = 0, y = 0;
    
    Painter() {
        this.setBorder(LineBorder.createBlackLineBorder());
        this.addMouseMotionListener(this);
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        ln = new Line2D.Float(x, y, e.getX(), e.getY());
        repaint();
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(Color.yellow);
        comp2D.draw(ln);
    }
}    
