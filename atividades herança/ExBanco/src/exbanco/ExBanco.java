
package exbanco;

import java.util.Scanner;

public class ExBanco {

  
    public static void main(String[] args) {
     ContaBancaria conta1 = new ContaBancaria("Jorginho", 453, 1000);
     ContaPoupanca poupanca1 = new ContaPoupanca("Pedra", 534, 2000, 300);
     ContaEspecial especial1 = new ContaEspecial("Luiso", 354, 600, 700);
     
     Scanner keyboard = new Scanner(System.in);
    
        conta1.depositar(300);
        poupanca1.depositar(200);
        especial1.depositar(400);
        
        //APRESENTAÇÃO DOS SALDOS 
        System.out.println("O novo valor das contas é:");
        System.out.println("");
        System.out.printf("Conta Bancária: %.2f", conta1.getSaldo());
        System.out.println("");
        System.out.printf("Conta Poupança: %.2f", poupanca1.getSaldo());
        System.out.println("");
        System.out.printf("Conta Especial: %.2f", especial1.getSaldo());
        
        
        conta1.sacar(400);
        poupanca1.sacar(730);
        especial1.sacar(300);
        
        //APRESENTAÇÃO DOS SALDOS
        System.out.println("O novo valor das contas é:");
        System.out.println("");
        System.out.printf("Conta Bancária: %.2f", conta1.getSaldo());
        System.out.println("");
        System.out.printf("Conta Poupança: %.2f", poupanca1.getSaldo());
        System.out.println("");
        System.out.printf("Conta Especial: %.2f", especial1.getSaldo());  
        System.out.println("");
        System.out.println("");

        
        
        
        System.out.println("Insira a taxa de rendimento do seu banco: ");
        poupanca1.calcularNovoSaldo(keyboard.nextFloat());
        System.out.println("");
        
        System.out.println("O novo valor da conta poupança é:");
        System.out.println("");
        System.out.printf("Conta Poupança: %.2f", poupanca1.getSaldo());

    }
    
}