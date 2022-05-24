package ex2;

public class Circulo implements AreaCalculavel{
    protected double raio;

    public Circulo(double raio) {
        if(raio<=0){
            throw new IllegalArgumentException("Valor inesperado, valor deve ser maior que 0(zero)");
        }else{
        this.raio = raio;
        }
    }
    
    @Override
    public double calcularArea() {
        return raio*raio*3.14;
    }
    
    
    //get e set

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
