
package showderock;


public class Comum extends Ingresso {
    
    @Override
    public void imprimeValor(){
        System.out.println("O valor do ingresso comum é de R$"+ getValor());
    }
}

