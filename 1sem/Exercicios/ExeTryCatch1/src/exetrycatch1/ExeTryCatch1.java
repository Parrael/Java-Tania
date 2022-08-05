/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exetrycatch1;

/**
 *
 * @author aluno
 */
public class ExeTryCatch1 {

    
    public static void aumentarLetra()
    {
        String palavra = "teste";
        try
        {
        //System.out.println(palavra.toUpperCase());
            System.out.println(palavra.charAt(10));
        }
        catch(NullPointerException e)
        {
            System.out.println("String nula, favor inicializa-la");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Palavra nao tem caracteres suficiente");
        }
        finally
        {
            System.out.println("Passei por aqui! (finally)");
        }
    }
    
    
    public static void main(String[] args) {
        
        aumentarLetra();
        
    }
    
}
