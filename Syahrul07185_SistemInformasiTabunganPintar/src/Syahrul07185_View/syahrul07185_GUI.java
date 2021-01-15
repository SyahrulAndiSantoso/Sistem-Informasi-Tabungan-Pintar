/*
 * To change this license header, choose License syahrul07185_Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syahrul07185_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class syahrul07185_GUI {
  
    JFrame syahrul07185_Menu = new JFrame();
    JLabel syahrul07185_Header,syahrul07185_EmailLabel,syahrul07185_PasswordLabel,syahrul07185_LoginLabel;
    JTextField syahrul07185_TextEmail;
    JPasswordField syahrul07185_TextPassword;
    JButton syahrul07185_Login,syahrul07185_Daftar;
   
  
    public syahrul07185_GUI() {
        syahrul07185_Menu.setSize(750, 600);
        syahrul07185_Menu.setLayout(null);
        syahrul07185_Menu.getContentPane().setBackground(Color.ORANGE);
        
        syahrul07185_Header = new JLabel("Tabungan Pintar",JLabel.CENTER);
        syahrul07185_Header.setBounds(150,30,400,60);
        syahrul07185_Header.setFont(new Font("Times New Roman",Font.BOLD,50));
        syahrul07185_Menu.add(syahrul07185_Header);
        
        syahrul07185_LoginLabel = new JLabel("Login",JLabel.CENTER);
        syahrul07185_LoginLabel.setBounds(300, 130, 100, 40);
        syahrul07185_LoginLabel.setFont(new Font("Times New Roman",Font.BOLD,30));
        syahrul07185_Menu.add(syahrul07185_LoginLabel);
        
        syahrul07185_EmailLabel = new JLabel("Email");
        syahrul07185_EmailLabel.setBounds(250, 200, 75, 25);
        syahrul07185_EmailLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        syahrul07185_Menu.add(syahrul07185_EmailLabel);
        syahrul07185_TextEmail= new JTextField();
       syahrul07185_TextEmail.setBounds(250, 230, 200, 30);
        syahrul07185_Menu.add(syahrul07185_TextEmail);
        
        syahrul07185_PasswordLabel = new JLabel("Password");
        syahrul07185_PasswordLabel.setBounds(250, 265, 90, 25);
        syahrul07185_PasswordLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        syahrul07185_Menu.add(syahrul07185_PasswordLabel);
        
        syahrul07185_TextPassword = new JPasswordField();
        syahrul07185_TextPassword.setBounds(250, 295, 200, 30);
        syahrul07185_Menu.add(syahrul07185_TextPassword);
        
        syahrul07185_Login = new JButton("Login");
        syahrul07185_Login.setBounds(255,360,90,40);
        syahrul07185_Login.setForeground(Color.white);
        syahrul07185_Login.setBackground(Color.BLACK);
        syahrul07185_Menu.add(syahrul07185_Login);
        
        syahrul07185_Daftar = new JButton("Daftar");
        syahrul07185_Daftar.setBounds(355,360,90,40);
        syahrul07185_Daftar.setBackground(Color.WHITE);
        syahrul07185_Menu.add(syahrul07185_Daftar);
       
        
        syahrul07185_Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        syahrul07185_Menu.setVisible(true);
        syahrul07185_Menu.setLocationRelativeTo(null);
        
         syahrul07185_Login .addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae){ 
                 
                
                        int syahrul07185_cek = syahrul07185_Allobjctrl.user.syahrul07185_loginUser(syahrul07185_TextEmail.getText(),syahrul07185_TextPassword.getText());
                        if(syahrul07185_cek>=0){
                              JOptionPane.showMessageDialog(null, "Selamat datang "+ syahrul07185_Allobjctrl.user.syahrul07185_Costumer(syahrul07185_cek).getSyahrul07185_nama(),"information", JOptionPane.INFORMATION_MESSAGE);
                      syahrul07185_Menu.dispose();
                    syahrul07185_MenuUtama syahrul07185_MenuUtama = new syahrul07185_MenuUtama();
                        }else{
                              JOptionPane.showMessageDialog(null, "Password atau Email Salah","information", JOptionPane.INFORMATION_MESSAGE);
                        }
              
                 
                 
                     
                       
                        
                 
             }
         });
        
           syahrul07185_Daftar.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae){
                  syahrul07185_Menu.dispose();
                  syahrul07185_DaftarGui menu = new syahrul07185_DaftarGui();     
             }
         });
       
        
        
    }
    
    
}
