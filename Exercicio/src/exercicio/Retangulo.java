package exercicio;

public class Retangulo {
    private float altura;
    private float base;
    
    public Retangulo() { // construtor mesmo nome da classe
    base=1;
    altura=1;
    }


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura<20 && altura>1)
            this.altura = altura;
        else 
            this.altura=1;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        if (base<20 && base>1)
            this.base = base;
        else 
            this.base=1;
    }   
    
    public float area(){
        return (base*altura);
    }
    public float perimetro(){
        return (2*base + 2*altura);
    }
}
