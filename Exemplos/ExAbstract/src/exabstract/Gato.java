
package exabstract;


public class Gato extends Animal {
    
    @Override
    public void falar(){
        System.out.println("Miau");
    }
    
    public void arranhar(){
        System.out.println("Gato arranhando");
    }
}
