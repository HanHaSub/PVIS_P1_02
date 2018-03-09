package pentagono;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Pentagono {
    
    double Lado;
    double Apotema;
    double Perimetro;
    double Area;
    
    Scanner L = new Scanner (System.in);
    
    public Pentagono(){
        Lado = 0;
        Apotema = 0;
        Perimetro = 0;
        Area = 0;
        
    }
    
    public void leerLado(){
        System.out.println("Escribe el numero de Lados");
        Lado = L.nextDouble();
        }
    
    public void LeerApotema(){
        System.out.println("Escribe los Valores del Apotema: ");
        Apotema = L.nextDouble();
    }
    
    public void Perimetro(){
        Perimetro=Lado+Lado+Lado+Lado+Lado;
    }
    
    public void Area(){
        Area = Perimetro * Apotema / 2;
    }
    
    public void Mostrar(){
        System.out.println("Valor de los Lados: " +Lado);
        System.out.println("El Perimetro del Poligono: " + Perimetro);
        System.out.println("El area del Poligono es: " + Area);
    }
    
        public static void main (String args []){
            
            Pentagono P = new Pentagono();
            P.leerLado();
            P.LeerApotema();
            P.Perimetro();
            P.Area();
            P.Mostrar();
            
        }

}
