
package exabstract;


public class ExAbstract {

    public static void main(String[] args) {
       // Animal a = new Animal();
       Animal a = new Cachorro();
       a.falar();
       
       Animal a2 = new Gato();
       a2.falar();
       //a2.arranhar(); não funfa, precisa de cast 
       Gato g1 = (Gato)a2;
       g1.arranhar();
    }
    
}
