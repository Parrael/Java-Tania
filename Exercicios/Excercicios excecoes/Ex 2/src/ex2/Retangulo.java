package ex2;

public class Retangulo implements AreaCalculavel{
    protected double base;
    protected double altura;

    public Retangulo(double base, double altura) {
       if(base<=0){
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }else if(altura<=0){
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }else if(base == altura){
            throw new IllegalArgumentException("Se os valores forem iguais vira um quadrado seu animal");
        }else{
            this.base=base;
            this.altura=altura;
        }
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }
    
    
    //get e set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
