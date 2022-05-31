package projetolocadora;

public class Produto {
    protected String descricao;
    protected float preco;
    protected String titulo;
    protected int faixaEtaria;
    protected String genero;
    
    //construtor

    public Produto(String descricao, float preco, String titulo, int faixaEtaria, String genero) {
        this.descricao = descricao;
        this.preco = preco;
        this.titulo = titulo;
        this.faixaEtaria = faixaEtaria;
        this.genero = genero;
    }
    
    
}
