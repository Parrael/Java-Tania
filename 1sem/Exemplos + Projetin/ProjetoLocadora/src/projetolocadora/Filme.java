package projetolocadora;

public class Filme extends Produto{
    protected float duracao; 

//construtor

    public Filme(String titulo, float preco, int faixaEtaria, float duracao, String genero, String descricao){
        super(descricao, preco, titulo, faixaEtaria, genero);
        this.duracao = duracao;
    }

    public Filme() {
        descricao = "";
        preco = 0;
        titulo = "";
        faixaEtaria = 0;
        genero = "";
        duracao = 0;
    }
    

//get e set
    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        if (duracao <= 0){
            throw new IllegalArgumentException ("Campo duracao não pode ser zero ou negativo");
        }else{
            this.duracao = duracao;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if ("".equals(descricao)){
            throw new IllegalArgumentException ("Campo descricao não pode ser vazio");
        }else{
            this.descricao = descricao;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco <= 0){
            throw new IllegalArgumentException ("Campo preco não pode ser zero ou negativo");
        }else{
            this.preco = preco;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if ("".equals(titulo)){
            throw new IllegalArgumentException ("Campo titulo não pode ser vazio");
        }else{
            this.titulo = titulo;
        }
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        if ("".equals(faixaEtaria)){
            throw new IllegalArgumentException ("Campo faixa etaria não pode ser zero");
        }else{
            this.faixaEtaria = faixaEtaria;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if ("".equals(genero)){
            throw new IllegalArgumentException ("Campo genero não pode ser vazio");
        }else{
            this.genero = genero;
        }
    }
    
    @Override
    public void exibir(){
        System.out.println("Titulo: " + titulo + "\npreco: " + preco + "\nfaixa etaria: " + faixaEtaria + "\ngenero: " + genero + "\ndescricao: " + descricao + "\nduracao: " + duracao);
    }
}
