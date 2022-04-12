package expolimorfismo;


public class ExPolimorfismo {


    public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Aluno a1 = new Aluno();
    
    Pessoa p2 = new Aluno();
    p2.mostraDados();
        System.out.println(a1.calculaMedia(10, 8));
    
    
    Pessoa p3 = new Aluno();
    Aluno a3 = (Aluno) p3; // linha importante
    System.out.println(a3.calculaMedia(2, 5));
    
    if (p3 instanceof Aluno)
            System.out.println("é instancia");
    else
            System.out.println("não é instancia");
    
    
    if (p1 instanceof Aluno)
            System.out.println("é instancia");
    else
            System.out.println("não é instancia");
    
    
    
    if (a1 instanceof Pessoa)
            System.out.println("é instancia");
    else
            System.out.println("não é instancia");
    
    if (a3 instanceof Aluno)
            System.out.println("é instancia");
    else
            System.out.println("não é instancia");
    }
    }

    
    

