package projetolocadora;

public class Filme extends Produto{
    protected float duracao; 

//construtor

    public Filme(float duracao, String descricao, float preco, String titulo, int faixaEtaria, String genero) {
        super(descricao, preco, titulo, faixaEtaria, genero);
        this.duracao = duracao;
    }

    public Filme() {
        super(descricao, preco, titulo, faixaEtaria, genero);
        duracao = 0;
    }
    

//get e set
    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public void exibir(){
        System.out.println("Titulo: " + titulo + "\npreco: " + preco + "\nfaixa etaria: " + faixaEtaria + "\ngenero: " + genero + "\ndescricao: " + descricao + "\nduracao: " + duracao);
    }
}
