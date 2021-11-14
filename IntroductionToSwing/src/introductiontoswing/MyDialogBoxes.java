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
public class MyDialogBoxes extends JFrame{
    public MyDialogBoxes() {
        super("Dialog Boxes");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.setVisible(true);
        
        int intResponse = JOptionPane.showConfirmDialog(MyDialogBoxes.this, 
                "Do you like this programming language?", "Survey", 
                JOptionPane.YES_NO_CANCEL_OPTION);
        
        switch (intResponse) {
            case JOptionPane.YES_OPTION:
                if(JOptionPane.showConfirmDialog(MyDialogBoxes.this, "Would you like to ditch the language",
                        "Survey", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(MyDialogBoxes.this,
                            "Great choice. Thank you for your response.", "Survey",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    
                } else {
                    JOptionPane.showInputDialog(MyDialogBoxes.this, "In so many words, please explain why.",
                            "User Explanation", JOptionPane.QUESTION_MESSAGE);
                    this.dispose();
                }   break;
            case JOptionPane.NO_OPTION:
                String[] arrLanguages = {"C++", "C#", "Visual Basic"};
                intResponse = JOptionPane.showOptionDialog (MyDialogBoxes.this, "Is there a language you like in these?",
                        "Programming Languages", 0, JOptionPane.QUESTION_MESSAGE, null,
                        arrLanguages, arrLanguages[1]);
                if(intResponse == 0) {
                    JOptionPane.showMessageDialog(MyDialogBoxes.this, "That'll show you flames",
                            "System Response", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    
                } else if(intResponse == 1) {
                    JOptionPane.showMessageDialog(MyDialogBoxes.this, "You can actually like Java",
                            "System Response", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    
                } else if(intResponse == 2) {
                    JOptionPane.showMessageDialog(MyDialogBoxes.this, "Better C#",
                            "System Response", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }   break;
            default:
                this.dispose();
                break;
        }        
    }
}
