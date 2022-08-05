/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface2;

/**
 *
 * @author aluno
 */
public class ExInterface2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LojaDoJOJO lj = new LojaDoJOJO();
        lj.gerarCupom();
        System.out.println(lj.calcDesconto("Colcci",20));
        
        
        LojaSinatora ls = new LojaSinatora();
        ls.gerarCupom();
        ls.setCnpj("1234");
        
        ILoja jojo = new LojaDoJOJO();
        jojo.gerarCupom();
        
    }
    
}
