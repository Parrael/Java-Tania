package animais;

public class Animais {

    public static void main(String[] args) {
        Animal a1 = new Cachorro ();
        Animal a2 = new Cavalo ();
        Animal a3 = new Preguica ();
        
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        
        Cachorro c1 = (Cachorro) a1;
        Cavalo c2 = (Cavalo) a2;
        Preguica p1 = (Preguica) a3;
        
        c1.correr();
        c2.correr();
        p1.escalar();
    }
    
}
