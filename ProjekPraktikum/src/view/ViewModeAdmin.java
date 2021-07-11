/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author edlan
 */
public class ViewModeAdmin extends JFrame
{
    public Font fnama;
    public Label lnama;
    public JButton btntambahgame,btnlogout,btncheckgame;
    
    public ViewModeAdmin () 
    { 
        
           setLayout(null);
           setVisible(false);
           setSize(350,400);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
           setBackground(new java.awt.Color(204,204,204));
           setTitle("Legend");
           
           lnama = new Label();
           add(lnama);
           
           btntambahgame = new JButton("Add Game");
           add(btntambahgame);
           
           btncheckgame = new JButton("Check Game");
           add(btncheckgame);
           
           btnlogout = new JButton("Logout");
           add(btnlogout);
           
           fnama = new Font("Helvetica", Font.BOLD, 21);

           lnama.setBounds(130,20,200,30);
           lnama.setFont(fnama);
           
           btntambahgame.setBounds(80,100,180,30);
           btntambahgame.setBackground(Color.BLACK);
           btntambahgame.setForeground(Color.GREEN);
           
           btncheckgame.setBounds(80,150,180,30);
           btncheckgame.setBackground(Color.BLACK);
           btncheckgame.setForeground(Color.CYAN);
           
           btnlogout.setBounds(80,200,180,30);
           btnlogout.setBackground(Color.BLACK);
           btnlogout.setForeground(Color.RED);        
    }
    
}


