package animais;
public class Cachorro extends Animal{
    
    //Metodos
    @Override
    public void emitirSom(){
        System.out.println("AuAu!");
    }
    public void correr(){
        System.out.println("O Doggo está correndo");
    }
}
