
package Syahrul07185_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;
import java.text.SimpleDateFormat;

public class syahrul07185_TabunganPintarGui {
   
   SimpleDateFormat syahrul07185_sdf= new SimpleDateFormat("dd-MM-yyyy");
    JTextArea syahrul07185_areaMulai,syahrul07185_areaTerkumpul;
    int syahrul07185_Cek;
    JFrame syahrul07185_TabunganPintar = new JFrame();
    JRadioButton syahrul07185_RadioHari, syahrul07185_RadioBulan;
    JLabel syahrul07185_Header,syahrul07185_TargetMenabung, syahrul07185_NominalMenabung,syahrul07185_MulaiMenabung,syahrul07185_TabunganTerkumpul;
    JTextField syahrul07185_TextTargetMenabung, syahrul07185_TextNominalMenabung;
    JButton syahrul07185_Checkout, syahrul07185_Back,syahrul07185_Reset,syahrul07185_Checkout1;
     private Calendar syahrul07185_tgl = Calendar.getInstance();
     int syahrul07185_menabung, syahrul07185_target,syahrul07185_jangkawaktuterkumpul1;


    public syahrul07185_TabunganPintarGui() {
        syahrul07185_TabunganPintar.setSize(600, 700);
        syahrul07185_TabunganPintar.setLayout(null);
        syahrul07185_TabunganPintar.getContentPane().setBackground(Color.ORANGE);
        
         syahrul07185_Header = new JLabel("Menabung");
        syahrul07185_Header.setBounds(190, 40, 350,45);
      syahrul07185_Header.setFont(new Font("Times New Roman",Font.BOLD,40));
        syahrul07185_TabunganPintar.add(syahrul07185_Header);
        
         
        
          syahrul07185_TargetMenabung = new JLabel("Target Menabung");
        syahrul07185_TargetMenabung.setBounds(170, 115, 190, 60);
        syahrul07185_TargetMenabung.setFont(new Font("Times New Roman",Font.BOLD,20));
        syahrul07185_TabunganPintar.add(syahrul07185_TargetMenabung);
        
          syahrul07185_TextTargetMenabung = new JTextField();
           syahrul07185_TextTargetMenabung.setBounds(170, 160, 220, 30);
        syahrul07185_TabunganPintar.add(syahrul07185_TextTargetMenabung);
        
         syahrul07185_NominalMenabung = new JLabel("Nominal Menabung");
     syahrul07185_NominalMenabung.setBounds(170, 180, 190, 60);
     syahrul07185_NominalMenabung.setFont(new Font("Times New Roman",Font.BOLD,20));
        syahrul07185_TabunganPintar.add(syahrul07185_NominalMenabung);
        
        syahrul07185_TextNominalMenabung = new JTextField();
         syahrul07185_TextNominalMenabung.setBounds(170, 225, 220, 30);
        syahrul07185_TabunganPintar.add(syahrul07185_TextNominalMenabung);
        
        syahrul07185_RadioHari = new JRadioButton("Perhari");
        syahrul07185_RadioHari.setBounds(170, 270, 90, 35);
        syahrul07185_RadioHari.setBackground(Color.PINK);
         syahrul07185_TabunganPintar.add(syahrul07185_RadioHari);
         
              syahrul07185_RadioBulan = new JRadioButton("Perbulan");
        syahrul07185_RadioBulan.setBounds(300, 270, 90, 35);
       syahrul07185_RadioBulan.setBackground(Color.PINK);
        syahrul07185_TabunganPintar.add(  syahrul07185_RadioBulan);
        
        syahrul07185_MulaiMenabung = new JLabel("Mulai Menabung");
        syahrul07185_MulaiMenabung.setBounds(170, 300, 190, 60);
        syahrul07185_MulaiMenabung.setFont(new Font("Times New Roman",Font.BOLD,20));
        syahrul07185_TabunganPintar.add( syahrul07185_MulaiMenabung);
        
        syahrul07185_areaMulai = new JTextArea();
        syahrul07185_areaMulai.setBounds(170, 345, 220, 30);
         syahrul07185_TabunganPintar.add(syahrul07185_areaMulai);
         
         syahrul07185_TabunganTerkumpul = new JLabel("Tabungan Terkumpul");
        syahrul07185_TabunganTerkumpul.setBounds(170, 365, 190, 60);
        syahrul07185_TabunganTerkumpul.setFont(new Font("Times New Roman",Font.BOLD,20));
        syahrul07185_TabunganPintar.add(syahrul07185_TabunganTerkumpul);
        
       syahrul07185_areaTerkumpul = new JTextArea();
       syahrul07185_areaTerkumpul.setBounds(170, 410, 220, 30);
         syahrul07185_TabunganPintar.add(syahrul07185_areaTerkumpul);
        
           syahrul07185_Checkout1= new JButton("Checkout");
        syahrul07185_Checkout1.setBounds(170, 480, 220, 43);
    syahrul07185_Checkout1.setFont(new Font("Times New Roman",Font.BOLD,20));
    syahrul07185_Checkout1.setBackground(Color.BLACK);
     syahrul07185_Checkout1.setForeground(Color.WHITE);
          syahrul07185_TabunganPintar.add(syahrul07185_Checkout1);
          
              syahrul07185_Reset = new JButton("Reset");
         syahrul07185_Reset.setBounds(170, 540, 220, 43);
       syahrul07185_Reset.setFont(new Font("Times New Roman",Font.BOLD,20));
     syahrul07185_Reset.setBackground(Color.WHITE);
          syahrul07185_TabunganPintar.add(syahrul07185_Reset);
          
             syahrul07185_Back = new JButton("Kembali");
          syahrul07185_Back.setBounds(170, 600, 220, 43);
       syahrul07185_Back.setFont(new Font("Times New Roman",Font.BOLD,20));
     syahrul07185_Back.setBackground(Color.WHITE);
          syahrul07185_TabunganPintar.add( syahrul07185_Back);
        
        syahrul07185_TabunganPintar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        syahrul07185_TabunganPintar.setVisible(true);
        syahrul07185_TabunganPintar.setLocationRelativeTo(null);
        
        syahrul07185_Back.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae){
                 
                 if(syahrul07185_Cek ==1){
                         syahrul07185_TabunganPintar.dispose();
                  syahrul07185_MenuUtama syahrul07185_menu = new syahrul07185_MenuUtama();
                 }else{
                     syahrul07185_TabunganPintar.dispose();
               syahrul07185_GUI syahrul07185_login = new syahrul07185_GUI();
                 }
                   
             }
         });
        
           syahrul07185_RadioBulan.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
                 if(syahrul07185_RadioBulan.isSelected()){
                    syahrul07185_jangkawaktuterkumpul1=0;
                   syahrul07185_RadioHari.setSelected(false);
                   try{
                      
                  syahrul07185_target = Integer.parseInt( syahrul07185_TextTargetMenabung.getText());
                   syahrul07185_menabung = Integer.parseInt( syahrul07185_TextNominalMenabung.getText());
                   syahrul07185_jangkawaktuterkumpul1= syahrul07185_target/syahrul07185_menabung;
                 
                   if(syahrul07185_target==syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung){
                          syahrul07185_areaMulai.setText(syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                             syahrul07185_tgl.add(Calendar.DATE, syahrul07185_jangkawaktuterkumpul1*30);
                                 syahrul07185_areaTerkumpul.setText(syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                                 syahrul07185_Allobjctrl.user.syahrul07185_InsertDataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_target, syahrul07185_menabung, syahrul07185_menabung, syahrul07185_tgl);
                                       syahrul07185_kosong();
                                        syahrul07185_Cek = 1;
                   }else{
                          syahrul07185_areaMulai.setText(syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                             syahrul07185_tgl.add(Calendar.DATE, syahrul07185_jangkawaktuterkumpul1*30);
                                 syahrul07185_areaTerkumpul.setText(syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                                 syahrul07185_Allobjctrl.user.syahrul07185_InsertDataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_target, syahrul07185_menabung, syahrul07185_menabung, syahrul07185_tgl);
                                        syahrul07185_kosong();
                                        syahrul07185_Cek = 1;
                   }
                   }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Gagal Menabung, Harap Login Ulang  ","information", JOptionPane.INFORMATION_MESSAGE); 
                    syahrul07185_Allobjctrl.user.syahrul07185_hapusTabungan(syahrul07185_target);
                        syahrul07185_Cek =0;
                   }
                 }
            
        }
    });
           
              syahrul07185_RadioHari.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            
                 if(syahrul07185_RadioHari.isSelected()){
                     syahrul07185_jangkawaktuterkumpul1=0;
                   syahrul07185_RadioBulan.setSelected(false);
                   try{
        
                  syahrul07185_target = Integer.parseInt( syahrul07185_TextTargetMenabung.getText());
                   syahrul07185_menabung = Integer.parseInt( syahrul07185_TextNominalMenabung.getText());
                   syahrul07185_jangkawaktuterkumpul1= syahrul07185_target/syahrul07185_menabung;
                   
                     
                    if(syahrul07185_target==syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung){
                            syahrul07185_areaMulai.setText(syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                             syahrul07185_tgl.add(Calendar.DATE, syahrul07185_jangkawaktuterkumpul1);
                                 syahrul07185_areaTerkumpul.setText(syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                                 syahrul07185_Allobjctrl.user.syahrul07185_InsertDataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_target, syahrul07185_menabung, syahrul07185_menabung, syahrul07185_tgl);
                                       syahrul07185_kosong();
                                        syahrul07185_Cek =1;
                    }else{
                            syahrul07185_areaMulai.setText(syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                             syahrul07185_tgl.add(Calendar.DATE, syahrul07185_jangkawaktuterkumpul1);
                                 syahrul07185_areaTerkumpul.setText(syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                                 syahrul07185_Allobjctrl.user.syahrul07185_InsertDataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_target, syahrul07185_menabung, syahrul07185_menabung, syahrul07185_tgl);
                                       syahrul07185_kosong();
                                        syahrul07185_Cek =1;
                    }
                   }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Gagal Menabung, Harap Login Ulang","information", JOptionPane.INFORMATION_MESSAGE); 
                        syahrul07185_Allobjctrl.user.syahrul07185_hapusTabungan(syahrul07185_target);
                        syahrul07185_Cek =0;
                   }
                    
                  
                 }
            
        }
    });
                syahrul07185_Checkout1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            
                    syahrul07185_target = Integer.parseInt( syahrul07185_TextTargetMenabung.getText());
                   syahrul07185_menabung = Integer.parseInt( syahrul07185_TextNominalMenabung.getText());
               
                       if(syahrul07185_target<=500000&&syahrul07185_menabung<500000){
                   JOptionPane.showMessageDialog(null, "Anda disarankan menabung perhari ","information", JOptionPane.INFORMATION_MESSAGE);  
                }else if(syahrul07185_target>500000&&syahrul07185_menabung<500000){
                       JOptionPane.showMessageDialog(null, "Anda disarankan menabung perhari ","information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                       JOptionPane.showMessageDialog(null, "Anda disarankan menabung perbulan ","information", JOptionPane.INFORMATION_MESSAGE); 
                }
                         
                     
      }
            
        
    });
                
            
                 
                    syahrul07185_Reset.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
               
                     syahrul07185_kosongNilai();
                         
                     
      
            
        }
    });
           
           
    }
    void syahrul07185_kosong(){
        syahrul07185_TextTargetMenabung.setText(null);
        syahrul07185_TextNominalMenabung .setText(null);
        
    }
    void syahrul07185_kosongNilai(){
           syahrul07185_areaTerkumpul.setText(null);
                syahrul07185_areaMulai.setText(null);
    }
    
    
}
