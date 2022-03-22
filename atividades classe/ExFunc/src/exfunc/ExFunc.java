package exfunc;

import java.util.Scanner;

public class ExFunc {

    public static void main(String[] args) {
       //instancias
       Funcionario func1 = new Funcionario();
       Funcionario func2 = new Funcionario();
       
       Scanner keyboard = new Scanner (System.in);
       
       //Nomes
        System.out.println("Nome de funcionario 1: ");
        func1.setNome(keyboard.nextLine());
        
       System.out.println("Nome de funcionario 2: ");
       func2.setNome(keyboard.nextLine());
       
       //Recebendo valores
       
       System.out.println(func1.getNome()+", insira seu salario: ");
       func1.setSalario(keyboard.nextFloat());
       
       System.out.println(func2.getNome()+", insira seu salario: ");
       func2.setSalario(keyboard.nextFloat());
       
       // salario de 1 e 2
       System.out.println("O salario de "+ func1.getNome() +" é de: "+ func1.salAnual());
       System.out.println("O salario de "+ func2.getNome() +" é de: "+ func2.salAnual());
        
       // aumento de salario de 1 e 2
       System.out.println("Um aumento de 10% ocorreu!");
       System.out.printf("O novo salario de "+ func1.getNome()+ " é de: %.2f", (func1.salAnual())*1.10);    
       System.out.println("");
       System.out.printf("O novo salario de "+ func2.getNome()+ " é de: %.2f", (func2.salAnual())*1.10);    
    }
    
}
