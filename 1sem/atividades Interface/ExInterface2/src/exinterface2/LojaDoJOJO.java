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
public class LojaDoJOJO extends Loja implements ILoja, ILangeries {
    
    

    @Override
    public double calcDesconto() {
        return 0.1;
    }

    @Override
    public void gerarCupom() {
        System.out.println("Gerando cupom JOJO10");
    }

    @Override
    public int calcEstoque(String modelo, int numero) {
        //buscando no banco
        return 10;
    }

    boolean calcDesconto(String colcci, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
    
}
