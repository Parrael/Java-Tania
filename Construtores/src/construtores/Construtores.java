package construtores;

public class Construtores {

    public static void main(String[] args) {
        //Aluno a1 = new Aluno();
        //System.out.println("RA: " + a1.getRa() + " Nome: " + a1.getNome());
       
        Aluno a2 = new Aluno(1234, "Anderson");
        System.out.println("RA: " + a2.getRa() + " Nome: " + a2.getNome());
        
        Aluno a3 = new Aluno();
        System.out.println("RA: " + a3.getRa() + " Nome: " + a3.getNome());

        Aluno a4 = new Aluno(55667);
        System.out.println("RA: " + a4.getRa() + " Nome: " + a4.getNome());
        
        Aluno a5 = new Aluno("Pablito");
        System.out.println("RA: " + a5.getRa() + " Nome: " + a5.getNome());
        a5.verifica(a5.getRa());
        a5.verifica(a5.getNome());
        
    }
  
}