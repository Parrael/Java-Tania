/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expolimorfismo;

/**
 *
 * @author aluno
 */
public class Professor extends Pessoa {
    private double salario;
    
    /**
     *
     */
    @Override
    public void mostraDados(){
        System.out.println("é professor.");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
