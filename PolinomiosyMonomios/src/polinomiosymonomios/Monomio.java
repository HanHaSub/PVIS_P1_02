/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomiosymonomios;

/**
 *
 * @author acer
 */
public class Monomio {

    private Integer Coeficiente;
    private Integer Exponente;
    
public Monomio (Integer c, Integer e){
       this.Coeficiente= c;
       this. Exponente= e;
       
   }
    

    public Integer getCoeficiente() {
        return Coeficiente;
    }

    public void setCoeficiente(Integer Coeficiente) {
        this.Coeficiente = Coeficiente;
    }

    public Integer getExponente() {
        return Exponente;
    }

    public void setExponente(Integer Exponente) {
        this.Exponente = Exponente;
    }

    @Override
    public String toString() {
         if (Coeficiente>0){
              return String.format(+Coeficiente+"x"+"^"+Exponente+"  ");
          }else{
              return String.format(+Coeficiente+"x"+"^"+Exponente+"  ");
         }
    }
}
