/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author edlan
 */
public class ViewLoginAdmin extends JFrame 
{
    public JLabel lJudul = new JLabel("Login Admin");
    
    public JLabel lUsername = new JLabel("Username");
    public JTextField tfUsername = new JTextField();
    
    public JLabel lPass = new JLabel("Password");
    public JPasswordField tfPass = new JPasswordField();
            
    public JButton btnLogin = new JButton("Login");
    public JButton btnKembali = new JButton("Back");
   
    public ViewLoginAdmin()
    {
        setTitle("Legend");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(400, 450);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnLogin);
        
        add(lJudul);
        lJudul.setBounds(110, 30, 180, 35);
        lJudul.setFont(new java.awt.Font("Helvetica", 0, 30));
        
        add(lUsername);
        lUsername.setBounds(60, 100, 120, 25);
        lUsername.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfUsername);
        tfUsername.setBounds(60, 125, 260, 25);
        tfUsername.setBackground(Color.BLACK);
        tfUsername.setForeground(Color.ORANGE);
        
        add(lPass);
        lPass.setBounds(60, 155, 120, 25);
        lPass.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfPass);
        tfPass.setBounds(60, 180, 260, 25);
        tfPass.setBackground(Color.BLACK);
        tfPass.setForeground(Color.ORANGE);
        
        add(btnKembali);
        btnKembali.setBounds(85, 250, 100, 30);
        btnKembali.setBackground(Color.BLACK);
        btnKembali.setForeground(Color.getHSBColor(446, 240, 640));
        add(btnLogin);
        btnLogin.setBounds(195, 250, 100, 30);
        btnLogin.setBackground(Color.BLACK);
        btnLogin.setForeground(Color.CYAN);
    }

}
