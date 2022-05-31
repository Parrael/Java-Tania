package exheranca;

public class Pessoa {
    protected String nome;
    private int idade;

    //construtores
    public Pessoa (String nome, int idade){
        this.nome= nome;
        this.idade = idade;
    }
    
    //métodos
    public void mostra(){
            System.out.println("é uma pessoa");
    }
    
    //gets/sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}

