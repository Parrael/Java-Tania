package animais;
public class Animal {
    private String nome;
    private int idade;

    //Métodos
    public void emitirSom(){
        //som de cada animal
    }    
    
    //Getters e Setters 
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
