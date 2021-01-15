/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syahrul07185_Model;
import Syahrul07185_Entity.syahrul07185_DataTabunganPintarEntity;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class syahrul07185_DataTabunganPintarModel  {
      private ArrayList<syahrul07185_DataTabunganPintarEntity> syahrul07185_datatabunganpintarEntityArrayList;
   
       public syahrul07185_DataTabunganPintarModel() {
        syahrul07185_datatabunganpintarEntityArrayList= new ArrayList<syahrul07185_DataTabunganPintarEntity>();
    }
    public void syahrul07185_InsertDataTabunganPintar(syahrul07185_DataTabunganPintarEntity syahrul07185_dataTabunganPintarEntity){
        syahrul07185_datatabunganpintarEntityArrayList.add(syahrul07185_dataTabunganPintarEntity);
        
    }
    public syahrul07185_DataTabunganPintarEntity syahrul07185_TabunganPintar(int syahrul07185_index){
        return syahrul07185_datatabunganpintarEntityArrayList.get(syahrul07185_index);
    }
    
     public syahrul07185_DataTabunganPintarEntity syahrul07185_ArraylistTabungan(int syahrul07185_index){
         return syahrul07185_datatabunganpintarEntityArrayList.remove(syahrul07185_index);
     }
     
      public int syahrul07185_hapus(int syahrul07185_Target){
          int syahrul07185_Status;
      if(syahrul07185_cariTabungan(syahrul07185_Target)!=-1){
          int syahrul07185_index =syahrul07185_cariTabungan(syahrul07185_Target);
           syahrul07185_datatabunganpintarEntityArrayList.remove(syahrul07185_index);
         
            syahrul07185_Status=1;
      }else{
          syahrul07185_Status =0;
      }
      
      return syahrul07185_Status;
   }
      
     public int syahrul07185_cariTabungan(int syahrul07185_Target){
         int indeks=-1;
       
       for(int a=0;a< syahrul07185_datatabunganpintarEntityArrayList.size();a++){
        if(syahrul07185_Target==syahrul07185_datatabunganpintarEntityArrayList.get(a).getSyahrul07185_target()){
                indeks=a;
               break;
        }
       }
       return indeks;
     }
    
}
