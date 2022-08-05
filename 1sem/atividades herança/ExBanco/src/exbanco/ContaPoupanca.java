
package exbanco;


public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    //CONSTRUTORES
    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento){
       super(cliente, numConta, saldo);
       this.diaRendimento = diaRendimento;
    }
    
    //METODOS
    public void calcularNovoSaldo(float taxa){
        double x = this.getSaldo();
        x += x*taxa;
        this.setSaldo(x);
    }
    
    //getters e setters
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    
}