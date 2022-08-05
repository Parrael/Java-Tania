package exheranca;


public class Bolsista extends Aluno{
    private double bolsa;
    
    public Bolsista (String nome, int idade, int ra, double bolsa)
    {
        super(nome, idade, ra); // aqui puxamos os atributos da superclasse da classe Bolsista, que seria Aluno, que está puxando nome e idade de Pessoa
         this.bolsa = bolsa;
        
        this.nome = nome; //nome está protected e classe Bolsista é classe filha, logo, nome tem acesso direto
        // this.idade = idade; > idade está privado, e por mais que esteja herdado por herança, não há como acessa-lo diretamente
    }
    
    //métodos
    @Override
    public void mostra(){
        super.mostra();
        System.out.println("é um bolsista");
    } 
    
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
}
