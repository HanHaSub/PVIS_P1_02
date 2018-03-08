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
public class PolinomioyMonomios {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Polinomio p= new Polinomio();   
       Monomio mono =new Monomio (3,2);
       p.add(mono);
       p.add (new Monomio (-7,2));
       p.add (new Monomio (4,3));
       p.add (new Monomio (8,2));
       p.add (new Monomio (3,4));
        System.out.println(p);
        System.out.println();
     
        
    }
    
}