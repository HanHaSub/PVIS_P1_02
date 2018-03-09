/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restadias;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Principal {
    
     public static void main (String arg[]){
       fecha f= new  fecha();
       System.out.println("ingresa el dia");
       Scanner teclado = new Scanner(System.in);
       Integer n = teclado.nextInt(); 
        System.out.println("intoducca el aumento que quiera ");
        Integer s = teclado.nextInt(); 
       Integer e= n+s;
        
           System.out.println("ingresa el mes");
       Integer m = teclado.nextInt();
         
         
       if(m==1 && e>31){
          m= m+1;
           Integer k = e-31;
         f.setmes(m);
         f.setdias(k);
          }
       else if(m==2 && e>28){
          m= m+1;  
          Integer k = e-28;
          f.setmes(m);
          f.setdias(k);
          }
       else if(m==3 && e>31){
          m= m+1;
          Integer k = e-31;
          f.setmes(m);
          f.setdias(k);
          
          }
       else if(m==4 && e>30){
          m= m+1;
          Integer k = e-30;
          f.setmes(m);
          f.setdias(k);
          
          }
       else if(m==5 && e>31){
          m= m+1;
          Integer k = e-31;
          f.setmes(m);
          f.setdias(k);
          
          }
       else if(m==6 && e>30){
         m= m+1;
         Integer k = e-30;
          f.setmes(m);
          f.setdias(k);
          
          }
       else if(m==7 && e>31){
          m= m+1;
          Integer k = e-31;
          f.setmes(m);
          f.setdias(k);
          
          }
       else if(m==8 && e>31){
         m= m+1;
         Integer k = e-31;
          f.setmes(m);
          f.setdias(k);
          
          }
       else if(m==9 && e>30){
          m= m+1;
          Integer k = e-30;
          f.setmes(m);
          f.setdias(k);
          
          }
       else if(m==10 && e>31){
          m= m+1;
          Integer k = e-31;
          f.setmes(m);
          f.setdias(k);
          }
       else if(m==11 && e>30){
          m= m+1;
          Integer k = e-30;
          f.setmes(m);
          f.setdias(k);
          
          }
       else if(m==12 && e>31){
          m= m+1;
          Integer k = e-31;
          f.setmes(m);
          f.setdias(k);
          
          }
       else{
        f.setmes(m);
       f. setdias(e);}
         
  
       System.out.println(f.getmes());
         System.out.println("ingresa el año");
       Integer a = teclado.nextInt();
        f.setaño(a);
         System.out.println(f.getaño());
                 
         System.out.println("la fecha es:"+f.getdias() +"/"+f.getmes()+"/"+f.getaño());
    } 
}
