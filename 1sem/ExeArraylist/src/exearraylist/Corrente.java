
package exearraylist;

public class Corrente extends Conta{
    private double limite;

    //metodos
    @Override
    public void mostra(){
        System.out.println("é corrente");
    }
    
    //getters e setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    
}
