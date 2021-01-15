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
import java.util.Date;
import javax.swing.*;
/**
 *
 * @author ASUS
 */
public class syahrul07185_DaftarGui {
 
    JFrame syahrul07185_tampilan = new JFrame();
    JLabel syahrul07185_header,syahrul07185_namalabel,syahrul07185_emaillabel,syahrul07185_passwordlabel;
     JTextField syahrul07185_textnama,syahrul07185_textemail;
    boolean syahrul07185_cekKelamin;
     JPasswordField syahrul07185_textpassword;
     JButton syahrul07185_back,syahrul07185_daftar;
    JRadioButton syahrul07185_laki, perempuan;
    public syahrul07185_DaftarGui() {
        syahrul07185_tampilan.setSize(600, 600);
        syahrul07185_tampilan.setLayout(null);
        syahrul07185_tampilan.getContentPane().setBackground(Color.ORANGE);
        
        syahrul07185_header = new JLabel("Daftar Akun");
       syahrul07185_header.setBounds(190, 70, 200, 40);
      syahrul07185_header.setFont(new Font("Times New Roman",Font.BOLD,30));
        syahrul07185_tampilan.add(syahrul07185_header);
        
        syahrul07185_namalabel = new JLabel("Nama");
      syahrul07185_namalabel.setBounds(170, 140, 75, 25);
       syahrul07185_namalabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        syahrul07185_tampilan.add(syahrul07185_namalabel);
        
        syahrul07185_textnama = new JTextField();
        syahrul07185_textnama.setBounds(170, 170, 220, 30);
        syahrul07185_tampilan.add(syahrul07185_textnama);
        
        syahrul07185_laki= new JRadioButton("Laki - Laki");
        syahrul07185_laki.setBounds(170, 225, 100, 35);
       
        syahrul07185_laki.setBackground(Color.PINK);
       syahrul07185_tampilan.add(syahrul07185_laki);
        
        perempuan = new JRadioButton("Perempuan");
        perempuan.setBounds(290, 225, 100, 35);
         perempuan.setBackground(Color.PINK);
        syahrul07185_tampilan.add(perempuan);
        
          syahrul07185_emaillabel = new JLabel("Email");
       syahrul07185_emaillabel.setBounds(170, 270, 150, 25);
     syahrul07185_emaillabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        syahrul07185_tampilan.add(syahrul07185_emaillabel);
        
          syahrul07185_textemail = new JTextField();
       syahrul07185_textemail.setBounds(170, 300, 220, 30);
      syahrul07185_tampilan.add(syahrul07185_textemail);
        
          syahrul07185_passwordlabel = new JLabel("Password");
        syahrul07185_passwordlabel.setBounds(170, 335, 150, 25);
        syahrul07185_passwordlabel.setFont(new Font("Times New Roman",Font.BOLD,20));
       syahrul07185_tampilan.add(syahrul07185_passwordlabel);
        
         syahrul07185_textpassword= new JPasswordField();
        syahrul07185_textpassword.setBounds(170, 365, 220, 30);
      syahrul07185_tampilan.add(syahrul07185_textpassword);
        
        syahrul07185_back= new JButton("Back");
        syahrul07185_back.setBounds(170,430,95,40);
       syahrul07185_back.setForeground(Color.white);
      syahrul07185_back.setBackground(Color.BLACK);
       syahrul07185_tampilan.add(syahrul07185_back);
        
        syahrul07185_daftar= new JButton("Daftar");
       syahrul07185_daftar.setBounds(295,430,95,40);
        syahrul07185_daftar.setBackground(Color.WHITE);
       syahrul07185_tampilan.add(syahrul07185_daftar);
        
        
       syahrul07185_tampilan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        syahrul07185_tampilan.setVisible(true);
        syahrul07185_tampilan.setLocationRelativeTo(null);
        
      syahrul07185_daftar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            
               if(syahrul07185_cekKelamin==true){
                   String nama =syahrul07185_textnama.getText();
                   String jeniskelamin ="Laki - laki";
                   String email = syahrul07185_textemail.getText();
                   String password = syahrul07185_textpassword.getText();
                   syahrul07185_Allobjctrl.user.syahrul07185_InsertDataPengguna(email, nama, password, jeniskelamin);
                     JOptionPane.showMessageDialog(null, "Registrasi sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                   kosong();
               }else{
                    String nama =syahrul07185_textnama.getText();
                   String jeniskelamin ="Perempuan";
                   String email = syahrul07185_textemail.getText();
                   String password =syahrul07185_textpassword.getText();
                   syahrul07185_Allobjctrl.user.syahrul07185_InsertDataPengguna(email, nama, password, jeniskelamin);
                   JOptionPane.showMessageDialog(null, "Registrasi sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                   kosong();
               }
                
           
            
        }
    });
        
         syahrul07185_laki.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
                 if(syahrul07185_laki.isSelected()){
                    perempuan.setSelected(false);
                  syahrul07185_cekKelamin=true;
                 }
            
        }
    });
         
          perempuan.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
                 if(perempuan.isSelected()){
                   syahrul07185_laki.setSelected(false);
                      syahrul07185_cekKelamin=false;
                 }
            
        }
    });
          
    syahrul07185_back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
             
               syahrul07185_tampilan.dispose();
               syahrul07185_GUI login = new syahrul07185_GUI();
            
        }
    });
         
    }
    void kosong(){
        syahrul07185_textnama.setText(null);
       syahrul07185_textemail.setText(null);
        syahrul07185_textpassword.setText(null);
    }
   
    
     
    
}
