/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author aluno
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criando uma instância
        Criente cli1 = new Criente();
        Criente cli2 = new Criente();
        Veiculo carro1 = new Veiculo();
        
        cli1.nome = "Euracio";
        cli1.idade = 69;
        cli1.cpf = "12345";
        cli1.deMaior = false;
        cli1.verifica();
        
        System.out.println("Valor do atributo"+" deMaior: "+cli1.deMaior);
        
        cli2.nome = "Amanda";
        cli2.idade = 14;
        cli2.cpf = "67890";
        cli2.deMaior = true;
        cli2.verifica();
                System.out.println("Valor do atributo"+" deMaior: "+cli2.deMaior);

        carro1.cor = "azul";
        carro1.marca = "chevrolet";
        carro1.placa = "xdi345";
        carro1.motor = 1.0;
        
        carro1.dirigir();
        carro1.buzinar();
        carro1.parar();
        System.out.println("Cor: "+ carro1.cor);
        
    }
    
}
