
package eximovel;


public class Usado extends Imovel{
    private float descPreco;

    //CONSTRUTORES
    public Usado(int codigo, String endereco, float preco, float descPreco){
        super(codigo, endereco, preco);
        this.descPreco = descPreco;
    }
    
    //GETTERS E SETTERS
    public float getDescPreco() {
        return descPreco;
    }

    public void setDescPreco(float descPreco) {
        this.descPreco = descPreco;
    }
    
    
}
