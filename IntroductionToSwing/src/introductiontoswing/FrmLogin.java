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
public class FrmLogin extends JFrame {
    public FrmLogin() {
        super("Login");
        this.setBounds(200, 200, 200, 180);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JLabel lblName = new JLabel("Enter your name:");
        JTextField txtName = new JTextField(10);
        
        JLabel lblPassword = new JLabel("Enter your password:");
        JPasswordField txtPassword = new JPasswordField(10);
        
        txtName.setHorizontalAlignment(SwingConstants.CENTER);
        txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
        
        txtPassword.setEchoChar('*');
        
        JPanel jpPanel = new JPanel();
        jpPanel.add(lblName);
        jpPanel.add(txtName);
        jpPanel.add(lblPassword);
        jpPanel.add(txtPassword);
        jpPanel.add(new JButton("Login"));
        
        this.add(jpPanel);
        this.setVisible(true);
    }
}
