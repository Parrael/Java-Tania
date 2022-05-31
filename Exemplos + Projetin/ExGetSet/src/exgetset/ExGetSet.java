/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exgetset;

/**
 *
 * @author aluno
 */
public class ExGetSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
           
        
        Professor prof1 = new Professor();
        prof1.setNome("Jefferson");
        prof1.setIdade(38);
        prof1.setSalario(3500.69f);
        
        System.out.println("O professsor " + prof1.getNome()+" de "+prof1.getIdade()+" anos, recebe um salário de R$"+prof1.getSalario());

        
    }
    
    
    
}
