
package idades;

import java.util.Scanner;


public class Idades {
    
    public static void main(String[] args) {
     Pessoa person1 = new Pessoa();
     Pessoa person2 = new Pessoa();
     Scanner keyboard = new Scanner(System.in);
        
    //newton
        System.out.println("");
        System.out.println("Digite seu nome: ");
        person1.setName(keyboard.nextLine());
        
        System.out.println("Qual sua data de nascimento????");
        System.out.println("Primeiro o dia: ");
        person1.setDay(keyboard.nextInt());
        
        
        System.out.println("O mês: ");
        person1.setMonth(keyboard.nextInt());
        
        System.out.println("O ano: ");
        person1.setYear(keyboard.nextInt());
        
        System.out.println("A idade de "+person1.getName() +" é de: "+ person1.ageCalculator());

    //einstein
        System.out.println("");
        keyboard.nextLine(); // limpa o buffer
        
        System.out.println("Digite seu nome: ");
        person2.setName(keyboard.nextLine());
        
        System.out.println("Qual sua data de nascimento????");
        System.out.println("Primeiro o dia: ");
        person2.setDay(keyboard.nextInt());
    
        System.out.println("O mês: ");
        person2.setMonth(keyboard.nextInt());
        
        System.out.println("O ano: ");
        person2.setYear(keyboard.nextInt());
        
        System.out.println("A idade de "+person2.getName() +"é de: "+ person2.ageCalculator());
        
   
    }
    
}
