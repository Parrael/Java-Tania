package expolimorfismo;

public class Pessoa {
    private String nome;
    
    //Métodos
    public void mostraDados (){
        System.out.println("é uma pessoa.");
    }
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
