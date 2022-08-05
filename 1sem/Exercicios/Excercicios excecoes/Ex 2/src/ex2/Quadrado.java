package ex2;

public class Quadrado implements AreaCalculavel{
    protected double lado;

    public Quadrado(double lado) {
        if(lado<=0){
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }else{
            this.lado = lado;
        }
    }

    @Override
    public double calcularArea() {
       return lado*lado;
    }
    
    //get e set

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
