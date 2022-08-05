
package ferran;

public class Ferran {
    
    
    public static void main(String[] args) {
  Pessoa p1;
        p1 = new Pessoa("Ryan",22);
  //p1.setNome("Ryan");
  //p1.setIdade(22);
        System.out.println("nome: " + p1.getNome());
        System.out.println("idade: " + p1.getIdade());
        p1.mostra();
        
        
        Aluno a1 = new Aluno("Joel",16,888);
       // a1.setNome("Joel");
       // a1.setIdade(16);
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
       // a1.setRa(1234);
        System.out.println("Ra: " + a1.getRa());
        a1.mostra();
        
        Professor prof1 = new Professor("tania",24,1000);
        Bolsista b1 = new Bolsista("Cleber",16,777,100);
        //b1.setRa(7777);
        //b1.setNome("Cleber");
        //b1.setBolsa(100);
        System.out.println("Nome: " + b1.getNome());
        System.out.println("Ra: " + b1.getRa());
        System.out.println("Bolsa: " + b1.getBolsa());
        b1.mostra();
    }
    
}
