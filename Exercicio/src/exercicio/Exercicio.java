package exercicio;

import java.util.Scanner;

public class Exercicio {


    public static void main(String[] args) {
        Retangulo ret1= new Retangulo();
        
        System.out.println("CALCULO DE RETANGULINHO!!!");
        Scanner keyboard = new Scanner (System.in);
        
        
        System.out.println("Insira o valor da base: ");
        ret1.setBase(keyboard.nextFloat());
        
        System.out.println("Insira o valor da altura: ");
        ret1.setAltura(keyboard.nextFloat());
        
        System.out.println("O valor de seu perimetro é: "+ ret1.perimetro());
        
        
        System.out.println("O valor da area é: "+ ret1.area());
       
        
        
    }
    
}
