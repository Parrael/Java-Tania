
package showderock;

import java.util.ArrayList;


public class ShowDeRock {
    public static void main(String[] args) {
        double faturamento=0;

        Ingresso ic1 = new Comum();   
        Ingresso iv1 = new Vip();
        ic1.setValor(200);
        iv1.setValor(300);
        
        ArrayList <Ingresso> lista = new ArrayList();
        lista.add(ic1);
        lista.add(iv1);

        for(Ingresso i: lista){

            if(i instanceof Comum){
                Comum c = (Comum) i;
                i.imprimeValor();
                faturamento+=i.getValor();
            }
            
            if(i instanceof Vip){
                Vip v = (Vip) i;
                v.imprimeValor();
                faturamento+=i.getValor();

            }  
        }
        System.out.println("Faturamento total foi de R$"+faturamento);
    }
    
}
