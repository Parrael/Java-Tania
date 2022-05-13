
package exeinterface;


public class Circulo implements IForma{

    private double raio;
    
    @Override
    public double calcArea() {
        return Math.PI*(raio*raio);
    }

    @Override
    public double calcPerimetro() {
       return 2*Math.PI*(raio*raio);
    }

    @Override
    public void mostrar() {
        System.out.println("é um circulo");
    }
    
    
}
