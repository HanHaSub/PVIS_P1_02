/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pentagono;

/**
 *
 * @author acer
 */
public class Lineas {
    private Puntos inicio;
    private Puntos fin;
    
    
    public Lineas (Puntos i,Puntos f){
        this.inicio=i;
        this.fin=f;
    }
   public Lineas (Integer a,Integer b,Integer c,Integer d,Integer f){
       
       this.inicio=new Puntos(a,b,c,d,f);
       this.fin=new Puntos(a,b,c,d,f);
       
   }

    @Override
   public String toString(){
       return String.format("[%d,%d,][%d,%d,][%d,%d,][%d,%d,][%d,%d,]",inicio.getA(),inicio.getB(),inicio.getC(),
                            inicio.getD(),inicio.getF(),fin.getA(),fin.getB(),fin.getC(),fin.getD(),fin.getF());
   }
   
    
    
}
