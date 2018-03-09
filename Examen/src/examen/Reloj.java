/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author acer
 */
public class Reloj {

    Date fecha;
    String fec;
    String hora;
    Calendar cal;
    int year, month, day;
    public Reloj(){
        
         this.fecha = new Date(); // your date
        
        this.cal = Calendar.getInstance();
        this.cal.setTime(this.fecha);
        this.year = this.cal.get(Calendar.YEAR);
         this.month = this.cal.get(Calendar.MONTH);
         this.day = this.cal.get(Calendar.DAY_OF_MONTH);

        this.fec =day + "/" + month + "/"+ year;
        this.hora =""+ this.fecha.getHours() +":"+ 
                this.fecha.getMinutes()+
                ":"+ this.fecha.getSeconds();
    }
    
    public Reloj(int hora, int minutos, int segundos,
                int dia, int mes, int anio){
        this.hora = hora + ":" + minutos + ":" + segundos;
        this.fecha.setDate(dia);
        this.fecha.setMonth(mes);
        this.fecha.setYear(anio);
    }
     public void incrementar(){
        int segundos = this.fecha.getSeconds();
        int minutos = this.fecha.getMinutes();
        int hora = this.fecha.getHours();
        
        System.out.println(hora + ":" + minutos+ ":" + segundos);
        
        segundos = segundos+1;
        
        if(segundos == 60){
           
            minutos= minutos + 1;
            segundos=0;
            
            if(minutos == 60){
                minutos = 0;
                hora = hora + 1;
                
                if(hora == 24){
                    hora = 0;
                    day = day +1;
                    
                    switch(this.month){
                        
                        case 2:
                            break;
                        
                        case 1:
                        case 3:
                            if(day == 32){
                                day=1;
                                month= month +1;
                                if (month ==13){
                                    year = year + 1;
                                    month = 1;
                                }
                            }
                        
                    }
                }
            }
           
        }
        
          this.hora = hora + ":" + minutos+ ":" + segundos;
           
    }
    @Override
      public String toString(){
        return "hora :" + this.hora +
                "fecha: " + this.fec;
    }
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        
        System.out.println(reloj.toString());
    }
    
}
