package exheranca;


public class Aluno extends Pessoa{ // extende atributos e métodos de Pessoa
    private int ra;

    public Aluno(String nome, int idade, int ra){
        
        super (nome, idade); // super ele puxa os CONSTRUTORES da superclasse
        this.ra = ra; // ra é um atributo da classe Aluno, logo n precisa ser puxada da superclasse
    }
    
    //métodos
    
    @Override
    public void mostra(){
        super.mostra(); //chama o método da classe superior / superclasse
        System.out.println("é um aluno");
    }
    
    // gets e sets
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
