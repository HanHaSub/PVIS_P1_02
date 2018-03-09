/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restadias;

/**
 *
 * @author acer
 */
public class Restadias {

    private Integer dias;
        private Integer mes;
        private Integer año;
 
    

      public String  fecha(){ 
        // TODO code application logic here
        return +dias+"/"+mes+"/"+año;
      } 
      public void setdias (Integer d){
          
          dias=d;
          
      }
      public void setmes (Integer m){
          mes=m;
      }
      public void setaño (Integer a){
          año=a;
      }
      public  Integer getdias(){
          return dias;
      }
      public  Integer getmes(){
          return mes;
      }
      public  Integer getaño(){
          return año;
      }
   
    
   //To change body of generated methods, choose Tools | Templates.

    void getaño(Integer a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
