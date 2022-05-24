/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exthrow;

/**
 *
 * @author aluno
 */
public class ExThrow {
    
    public static void main(String[] args) {     
        Aluno a1 = new Aluno();
        try
        {
        a1.setNome("");
        }
        
        catch(StringVaziaExcepcion e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
