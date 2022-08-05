
package showderock;

public class Vip extends Ingresso{
    
    @Override
    public void imprimeValor(){
        
        System.out.println("o valor do ingresso VIP é de: R$"+ getValor());
    }
}
