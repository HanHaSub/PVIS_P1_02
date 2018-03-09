/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecha;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Programa09 {

    /**
     * 
     */
    private Integer anio;
    private Integer dia;
    private Integer mes;
    private Integer suma;
    
    public Programa09 (Integer dia, Integer mes, Integer anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.suma=suma;

    }
    public void setDia (Integer d){
         dia=d;
     }
     public Integer getDia (){
         return dia;
     } 
     
     public void setMes(Integer m){
         mes=m;
     } 
     
     public Integer getMes(){
         return mes;
     }
     
     public void setAnio(Integer a){
         anio=a;
     }
     
     public Integer getAnio(){
         return anio;
     }
     
     public void setSuma(Integer z) {
        suma = z;
    }

    public Integer getSuma() {
        return suma;
    }  
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        
        return String.format("%d/%d/%d",dia,mes,anio);
    }
   
    private Integer diasMes(){
        
        switch (this.mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 30;
            case 4:
            case 6:
            case 9:
            case 11:
                return 31;
            case 2:
                if(this.anio % 4 == 0){
                
                return 29;
                        
                }else{
                    return 28;
                }
            default: return 0;
        }
        
    }
    
    public void aumentar (){
        this.dia++;
        if(this.dia > this.diasMes()){
            this.dia = 1;
            mes++;
            if(this.mes > 12)
                this.mes=1;
                anio++;  
        }
        
     
    }
        
        
}
    
    