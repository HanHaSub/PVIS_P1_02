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
public class Puntos {

    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer f;
    private Integer Lados;
    private Integer Apotema;
    private Integer Area;
    private Integer Perimetro;
 
 public Puntos(Integer a,Integer b,Integer c,Integer d,Integer f){
     this.a=a;
     this.b=b;
     this.c=c;
     this.d=d;
     this.f=f;
     this.Lados=Lados;
     this.Apotema=Apotema;
     this.Area=Area;
     this.Perimetro=Perimetro;
 }

    public Integer getLados() {
        return Lados;
    }

    public void setLados(Integer Lados) {
        this.Lados = Lados;
    }

    public Integer getApotema() {
        return Apotema;
    }

    public void setApotema(Integer Apotema) {
        this.Apotema = Apotema;
    }

    public Integer getArea() {
        return Area;
    }

    public void setArea(Integer Area) {
        this.Area = Area;
    }

    public Integer getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(Integer Perimetro) {
        this.Perimetro = Perimetro;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
