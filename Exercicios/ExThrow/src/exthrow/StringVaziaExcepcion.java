package exthrow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class StringVaziaExcepcion extends RuntimeException {
    
    @Override
    public String getMessage()
    {
        return "String não pode ser vazia";     
    }
    
}