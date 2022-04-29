
package showderock;


public class Ingresso {
    private double valor;
    
    //métodos
    public void imprimeValor(){
        System.out.println("O valor desse ingresso é de R$"+ valor);     
     }

    //getters e setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
