/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontoswing;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class FrmMain extends JFrame{
    public FrmMain() {
        super("Main");
        this.setBounds(200, 200, 500, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JButton btnMyFrame = new JButton("My Frame");
        btnMyFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new MyFrame();
            }
        });
        btnMyFrame.setPreferredSize(new Dimension(150, 50));
        
                
        JButton btnFrmLogin = new JButton("FrmLogin");
        btnFrmLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new FrmLogin();
            }
        });
        btnFrmLogin.setPreferredSize(new Dimension(150, 50));
        
        JButton btnFrameCbo = new JButton("Frame Combo Box");
        btnFrameCbo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new FrameComboBox();
            }
        });
        btnFrameCbo.setPreferredSize(new Dimension(150, 50));
        
        JButton btnFlowLayoutFrame = new JButton("FlowLayout Frame");
        btnFlowLayoutFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new FlowLayoutFrame();
            }
        });
        btnFlowLayoutFrame.setPreferredSize(new Dimension(150, 50));
        
        JButton btnGridLayoutFrame = new JButton("GridLayout Frame");
        btnGridLayoutFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new GridLayoutFrame();
            }
        });
        btnGridLayoutFrame.setPreferredSize(new Dimension(150, 50));
        
        JButton btnBorderLayoutFrame = new JButton("BorderLayout Frame");
        btnBorderLayoutFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new BorderLayoutFrame();
            }
        });
        btnBorderLayoutFrame.setPreferredSize(new Dimension(150, 50));
        
        JButton btnMixingLayouts = new JButton("Mixing Layouts");
        btnMixingLayouts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new MixingLayoutManagers();
            }
        });
        btnMixingLayouts.setPreferredSize(new Dimension(150, 50));
        
        JButton btnMyDialogBoxes = new JButton("Dialog Boxes");
        btnMyDialogBoxes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new MyDialogBoxes();
            }
        });
        btnMyDialogBoxes.setPreferredSize(new Dimension(150, 50));
        
        JButton btnMyIcons = new JButton("My Icons");
        btnMyIcons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new MyIcons();
            }
        });
        btnMyIcons.setPreferredSize(new Dimension(150, 50));
        
        JButton btnMySlider = new JButton("My Sliders");
        btnMySlider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new MySlider(); //To change body of generated methods, choose Tools | Templates.
            }
        });
        btnMySlider.setPreferredSize(new Dimension(150, 50));
        
        JButton btnToolbar = new JButton("Toolbar");
        btnToolbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Toolbars();
            }
        });
        btnToolbar.setPreferredSize(new Dimension(150, 50));
        
        JButton btnProgressBar = new JButton("Progress Bar");
        btnProgressBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new ProgressBar();
            }
        });
        btnProgressBar.setPreferredSize(new Dimension(150, 50));
        
        JButton btnTabPane = new JButton("Tabbed Pane");
        
        btnTabPane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new TabbedPane();
            }
        });
        btnTabPane.setPreferredSize(new Dimension(150, 50));
        
        JButton btnEvents = new JButton("Events");
        btnEvents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new HandlingEvents();
            }
        });
        btnEvents.setPreferredSize(new Dimension(150, 50));
        
        JButton btnMyFocusListener = new JButton("Focus Listener");
        btnMyFocusListener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new myFocusListener();
            }
        });
        btnMyFocusListener.setPreferredSize(new Dimension(150, 50));
        
        JButton btnDifferentEvents = new JButton("Different Events");
        btnDifferentEvents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new DifferentEvents();
            }
        });
        btnDifferentEvents.setPreferredSize(new Dimension(150, 50));
        
        JPanel jpPanel = new JPanel();
        jpPanel.add(btnMyFrame);
        jpPanel.add(btnFrmLogin);
        jpPanel.add(btnFrameCbo);
        jpPanel.add(btnFlowLayoutFrame);
        jpPanel.add(btnGridLayoutFrame);
        jpPanel.add(btnBorderLayoutFrame);
        jpPanel.add(btnMixingLayouts);
        jpPanel.add(btnMyDialogBoxes);
        jpPanel.add(btnMyIcons);
        jpPanel.add(btnMySlider);
        jpPanel.add(btnToolbar);
        jpPanel.add(btnProgressBar);
        jpPanel.add(btnTabPane);
        jpPanel.add(btnEvents);
        jpPanel.add(btnMyFocusListener);
        jpPanel.add(btnDifferentEvents);
        
        this.add(jpPanel);
        
        try {
//            UIManager.setLookAndFeel(
//                   ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"));
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//            
            //UIManager.setLookAndFeel(
                   //("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"));
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(FrmMain.this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(true);
    }
}
