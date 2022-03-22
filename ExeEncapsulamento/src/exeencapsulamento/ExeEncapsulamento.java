package exeencapsulamento;
public class ExeEncapsulamento {

    public static void main(String[] args) {
        
        Aluno al1 = new Aluno ();
        //al1.nome = "Tania";
        //al1.idade = -1;

        al1.setNome("Tania");
        al1.setIdade(25);
        al1.setAltura(1.66);
        System.out.println("----------------------------------");
        
        System.out.println("Nome: "+ al1.getNome());
        System.out.println("Idade: "+ al1.getIdade());
        System.out.println("Altura: "+ al1.getAltura());
        
        System.out.println("----------------------------------");
        
        Disciplina disc1 = new Disciplina ();
        
        disc1.setNomeDisc("Geografia");
        disc1.setAbreDisc("GE");
        disc1.setCargaHor(180);
        
        System.out.println("Nome Disciplina: "+disc1.getNomeDisc());
        System.out.println("Sigla Disciplina: "+disc1.getAbreDisc());
        System.out.println("Carga Horária: "+disc1.getCargaHor()+" horas");
        System.out.println("----------------------------------\n");
        
        Curso c1 = new Curso ();
        c1.setNome("Desenvolvimento de Sistemas");
        c1.setCargaHor(3600);
        c1.setPreço(0);
        
        System.out.println("Curso: "+c1.getNome());
        System.out.println("Carga Horária: "+c1.getCargaHor());
        System.out.println("Valor do Curso: "+c1.getPreço());

    }
    
}