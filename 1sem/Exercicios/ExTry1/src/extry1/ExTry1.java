/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extry1;

/**
 *
 * @author aluno
 */
public class ExTry1 {

    private static Object o;

    public static void testaO()
    {
        Object o = null;
        try
        {
          o.toString();
        }
        catch(NullPointerException e)
        {
            System.out.println("Objeto nulo!!!"
                    + "passe outro valor");
        }
    }
    
    
    public static void main(String[] args) {
        
        testaO();
        
    }
    
}
