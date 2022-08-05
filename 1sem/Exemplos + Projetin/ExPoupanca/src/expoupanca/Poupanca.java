
package expoupanca;

public class Poupanca {
    
    private static float taxaJurosAnual; 
    private float saldo; 
    
    //métodos
    public void calcularJurosMensais(){
        saldo += saldo * taxaJurosAnual / 12;
    }
    
    public static void modificaTaxaJuro(float taxa){
        taxaJurosAnual = taxa/100;
    } 
    
    //getters e setters
    public static float getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static void setTaxaJurosAnual(float aTaxaJurosAnual) {
        taxaJurosAnual = aTaxaJurosAnual;
    }


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
       
    } 

