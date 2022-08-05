
package eximovel;


public class Imovel {
    
    private int codigo;
    private String endereco;
    private float preco;

    //CONSTRUTORES
    
    public Imovel(int codigo, String endereco, float preco){
        this.codigo = codigo;
        this.endereco = endereco;
        this.preco = preco;
    }
    
    //GETTERS E SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
