
package exearraylist;

public class Corrente extends Conta{
    private double limite;


    @Override
    public void print(){
        System.out.println("corrente");
    }
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    
}
