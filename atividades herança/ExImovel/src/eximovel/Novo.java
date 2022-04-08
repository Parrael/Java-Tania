
package eximovel;


public class Novo extends Imovel{
    private float precoAdc;

    //CONSTRUTORES
    
    public Novo(int codigo, String endereco, float preco, float precoAdc){
        super(codigo, endereco, preco);
        this.precoAdc = precoAdc;
    }
    
    //GETTERS E SETTERS
    public float getPrecoAdc() {
        return precoAdc;
    }

    public void setPrecoAdc(float precoAdc) {
        this.precoAdc = precoAdc;
    }
    
    
}
