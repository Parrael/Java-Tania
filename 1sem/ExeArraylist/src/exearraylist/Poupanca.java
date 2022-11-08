
package exearraylist;


public class Poupanca extends Conta {
    private double taxa;

    @Override
    public void print(){
        System.out.println("é poupança");
    }
    
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
}
