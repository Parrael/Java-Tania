/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exgetset2tds;

/**
 *
 * @author aluno
 */
public class EXGETSET2TDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Aluno pedrinho = new Aluno();
      //pedrinho.ra = 1234;
      //pedrinho.nome = "Pedro Cabral";
      
      pedrinho.setRA(-12345);
      pedrinho.setNome("Pedro Cabral");
      
       System.out.println("RA: " + pedrinho.getRA());
       System.out.println("Nome: " + pedrinho.getNome());
 
       
      // Professor barreto = new Professor();
       //barreto.setDisciplina("desenvolvimento de dispositivos moveis");
       //barreto.setIdade(34);
       //barreto.setNome("Luis Barreto");
       
        //System.out.println("Disciplina: "+barreto.getDisciplina());
       // System.out.println("Nome: "+barreto.getNome());
       // System.out.println("Idade: "+barreto.getIdade()); 
        
        Aluno a1 = new Aluno (1234 , "Tania" , 1.66);
        System.out.println("RA: "+a1.getRA());
        System.out.println("Nome: "+a1.getNome());
        System.out.println("Altura: "+a1.getAltura());
       
      
       
    }
    
    
     
      
     
      
}
