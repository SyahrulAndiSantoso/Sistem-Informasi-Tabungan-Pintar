/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syahrul07185_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class syahrul07185_UpdaateGui {
        syahrul07185_Allobjctrl Allobject = new syahrul07185_Allobjctrl();
    JFrame syahrul07185_Update = new JFrame();
     JLabel syahrul07185_EmailLamaLabel,syahrul07185_EmailLabel,syahrul07185_Header;
     JTextField syahrul07185_TextEmailLama,syahrul07185_TextEmail;
     JButton syahrul07185_Kembali,syahrul07185_Checkout;
    public syahrul07185_UpdaateGui() {
           syahrul07185_Update.setSize(300, 300);
        syahrul07185_Update.setLayout(null);
        syahrul07185_Update.getContentPane().setBackground(Color.ORANGE);
        
        syahrul07185_Header = new JLabel("Update");
        syahrul07185_Header.setBounds(20, 20, 250, 35);
        syahrul07185_Header.setFont(new Font("Times New Roman",Font.BOLD,30));
        syahrul07185_Update.add(syahrul07185_Header);
        
        syahrul07185_EmailLamaLabel = new JLabel("Email Lama ");
        syahrul07185_EmailLamaLabel.setBounds(50,60,150,15);
        syahrul07185_Update.add(syahrul07185_EmailLamaLabel);
        
        syahrul07185_TextEmailLama = new JTextField();
        syahrul07185_TextEmailLama.setBounds(50, 80, 190, 25);
         syahrul07185_Update.add(syahrul07185_TextEmailLama);
         
         syahrul07185_EmailLabel = new JLabel("Email Baru  ");
        syahrul07185_EmailLabel.setBounds(50,110,150,25);
        syahrul07185_Update.add(syahrul07185_EmailLabel);
         
           syahrul07185_TextEmail = new JTextField();
        syahrul07185_TextEmail.setBounds(50, 130, 190, 25);
         syahrul07185_Update.add(syahrul07185_TextEmail);
         
         syahrul07185_Checkout = new JButton("Selesai");
      syahrul07185_Checkout.setBounds(80,170,120,30);
        syahrul07185_Update.add(syahrul07185_Checkout);
        
         syahrul07185_Kembali = new JButton("Kembali");
      syahrul07185_Kembali.setBounds(80,210,120,30);
        syahrul07185_Update.add(syahrul07185_Kembali);
         
        
       syahrul07185_Update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        syahrul07185_Update.setVisible(true);
        syahrul07185_Update.setLocationRelativeTo(null);
        
         syahrul07185_Checkout.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
             
             int syahrul07185_Cek = syahrul07185_Allobjctrl.user.syahrul07185_update(syahrul07185_TextEmailLama.getText(),syahrul07185_TextEmail.getText());
             if(syahrul07185_Cek==1){
                  JOptionPane.showMessageDialog(null, "Berhasil Update","information", JOptionPane.INFORMATION_MESSAGE);
             }else{
                  JOptionPane.showMessageDialog(null, "Email Tidak Ditemukan","information", JOptionPane.INFORMATION_MESSAGE);
             }
              
            
        }
    });
         
                     syahrul07185_Kembali .addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
               
                    
                         syahrul07185_Update.dispose();
                  syahrul07185_MenuUtama menu = new syahrul07185_MenuUtama();
                     
      
            
        }
    });
         
    }
    
}
