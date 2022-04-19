
package exearraylist;


public class Poupanca extends Conta {
    private double taxa;

    //metodos
    @Override
    public void mostra(){
        System.out.println("é poupança");
    }
    
    //getters e setters
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
}
