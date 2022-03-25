
package expoupanca;


public class ExPoupanca {

    
    public static void main(String[] args) {
     Poupanca poupanca1 = new Poupanca();
     Poupanca poupanca2 = new Poupanca();
     
     poupanca1.setSaldo(2000.00f);
     poupanca2.setSaldo(3000.00f);
     
     Poupanca.modificaTaxaJuro(3);
     
     poupanca1.calcularJurosMensais();
     poupanca2.calcularJurosMensais();
     
     System.out.printf("O novo saldo da poupança 1 é: R$%.2f", poupanca1.getSaldo());
        System.out.println("");
     System.out.printf("O novo saldo da poupança 2 é: R$%.2f", poupanca2.getSaldo());
        System.out.println("");
     
    System.out.println("O saldo do próximo mês será: ");
    Poupanca.modificaTaxaJuro(4);
     
     poupanca1.calcularJurosMensais();
     poupanca2.calcularJurosMensais();
     
     System.out.printf("O novo saldo da poupança 1 é: R$%.2f", poupanca1.getSaldo());
        System.out.println("");
     System.out.printf("O novo saldo da poupança 2 é: R$%.2f ", poupanca2.getSaldo());
    }
    
}
