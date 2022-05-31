
package exeinterface;


public class Quadrado extends FormaGeometrica implements IForma, IBidimensional {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcArea() {
        setArea(lado*lado);
        return getArea();
    }

    @Override
    public double calcPerimetro() {
        return lado*4;
    }

    @Override
    public void mostrar() {
        System.out.println("é um quadrado");
    }

    @Override
    public void ehBidimensional() {
        System.out.println("Bidimensional");
    }
    
    
}
