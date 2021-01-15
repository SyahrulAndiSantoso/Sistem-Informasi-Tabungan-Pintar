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
import java.text.SimpleDateFormat;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class syahrul07185_MenuUtama {
    JFrame syahrul07185_MenuUtama = new JFrame();
       
    JButton syahrul07185_Menabung,  syahrul07185_Update,syahrul07185_Hapus,syahrul07185_Exit,Syahrul07185_Menabung;
    JLabel syahrul07185_Header,syahrul07185_Header1;
    JTextArea  syahrul07185_ViewArea;

      SimpleDateFormat syahrul07185_sdf= new SimpleDateFormat("dd-MM-yyyy");

    public syahrul07185_MenuUtama() {
        syahrul07185_MenuUtama.setSize(600, 600);
        syahrul07185_MenuUtama.setLayout(null);
        syahrul07185_MenuUtama.getContentPane().setBackground(Color.ORANGE);
        
        syahrul07185_Header = new JLabel("Menu Utama");
        syahrul07185_Header.setBounds(190, 40, 350,40);
        syahrul07185_Header.setFont(new Font("Times New Roman",Font.BOLD,40));
        syahrul07185_MenuUtama.add(syahrul07185_Header);
        
         syahrul07185_Header1 = new JLabel("Data Pengguna");
        syahrul07185_Header1.setBounds(50, 100, 200,40);
        syahrul07185_Header1.setFont(new Font("Times New Roman",Font.BOLD,25));
        syahrul07185_MenuUtama.add(syahrul07185_Header1);
        
        syahrul07185_ViewArea = new JTextArea();
         syahrul07185_ViewArea.setBounds(50, 150, 486,270);
          syahrul07185_MenuUtama.add(syahrul07185_ViewArea);
               syahrul07185_ViewArea.setText(syahrul07185_DataPengguna());
        
        syahrul07185_Hapus = new JButton("Hapus Data");
        syahrul07185_Hapus.setBounds(50, 455, 100, 40);

        syahrul07185_Hapus.setBackground(Color.WHITE);
        syahrul07185_MenuUtama.add(syahrul07185_Hapus);
        
         syahrul07185_Update = new JButton("Update");
        syahrul07185_Update.setBounds(180, 455, 100, 40);
  
        syahrul07185_Update.setBackground(Color.WHITE);
        syahrul07185_MenuUtama.add(syahrul07185_Update);
        
        Syahrul07185_Menabung = new JButton("Menabung");
        Syahrul07185_Menabung.setBounds(310, 455, 100, 40);
           Syahrul07185_Menabung.setBackground(Color.WHITE);
               syahrul07185_MenuUtama.add(Syahrul07185_Menabung);
        
         syahrul07185_Exit = new JButton("LogOut");
       syahrul07185_Exit.setBounds(440, 455, 100, 40);

      syahrul07185_Exit.setForeground(Color.WHITE);
         syahrul07185_Exit.setBackground(Color.RED);
         
         
        syahrul07185_MenuUtama.add(syahrul07185_Exit);
        
        
        syahrul07185_MenuUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        syahrul07185_MenuUtama.setVisible(true);
        syahrul07185_MenuUtama.setLocationRelativeTo(null);
        
        syahrul07185_Exit.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
             
              syahrul07185_MenuUtama.dispose();
               syahrul07185_GUI login = new syahrul07185_GUI();
            
        }
    });
          Syahrul07185_Menabung.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            syahrul07185_MenuUtama.dispose();
     syahrul07185_TabunganPintarGui tabungan = new syahrul07185_TabunganPintarGui();
     
             
                
            
        }
    });
          
           syahrul07185_Hapus.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
           
     syahrul07185_HapusGui syahrul07185_Hapus = new syahrul07185_HapusGui();
     
             
                
            
        }
    });
         
          
             syahrul07185_Update.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
           syahrul07185_UpdaateGui Gui = new syahrul07185_UpdaateGui();
                
            
        }
    });
          
    }
    String syahrul07185_DataPengguna()
    {
        for(int a=0;a< syahrul07185_Allobjctrl.user.syahrul07185_GetArrayListDataPenggunaSize();a++){
           String  syahrul07185_Teks = "Nama = "+ syahrul07185_Allobjctrl.user.syahrul07185_Costumer(a).getSyahrul07185_nama()+"\n"+"Jenis Kelamin = "+ syahrul07185_Allobjctrl.user.syahrul07185_Costumer(a).getSyahrul07185_jeniskelamin() 
                   +"\n"+"Email = "+ syahrul07185_Allobjctrl.user.syahrul07185_Costumer(a).getSyahrul07185_email();
            return syahrul07185_Teks;
        }
       return null;
    }
    
}
