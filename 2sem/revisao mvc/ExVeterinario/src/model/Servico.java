package model;

public class Servico {
    protected int codigo;
    protected double preco;
    protected String tipo;
    protected String descricao;
    protected double duracao;

    //construtor
    public Servico(int codigo, double preco, String tipo, String descricao, double duracao) {
        this.codigo = codigo;
        this.preco = preco;
        this.tipo = tipo;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public Servico() {
    }
    
    //getters e setters   
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    
}
