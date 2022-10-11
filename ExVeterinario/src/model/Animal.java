package model;

public class Animal {
    protected int codigo;
    protected String nome;
    protected String raca;
    protected int idade;
    protected String nomeDono;
    protected String observacoes;
    protected double peso;
    

    //construtores
    public Animal(int codigo, String nome, String raca, int idade, String nomeDono, String observacoes, float peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.nomeDono = nomeDono;
        this.observacoes = observacoes;
        this.peso = peso;
    }

    public Animal() {
    }
    
    public int getCodigo() {    
        return codigo;
    }

    //getters e setters
    public void setCodigo(int codigo) {    
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
