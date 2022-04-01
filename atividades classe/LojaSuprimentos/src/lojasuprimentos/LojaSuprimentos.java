package lojasuprimentos;

import java.util.Scanner;

public class LojaSuprimentos {

    public static void main(String[] args) {
        Item item1 = new Item();
        
        Scanner keyboard = new Scanner(System.in);
        
        //pegando seu cartão de credito
        System.out.println("Digite o código do poduto: ");
        item1.setCode(keyboard.nextLine());
        
        System.out.println("Digite a descrição: ");
        item1.setDesc(keyboard.nextLine());
        
        System.out.println("Digite a quantidade: ");
        item1.setQuant(keyboard.nextInt());
        
        System.out.println("Digite o preço: ");
        item1.setPrice(keyboard.nextFloat());
        
        System.out.println("o total é: "+ item1.getTotal());
        
        
        item1.setQuant(-3);
        System.out.println(""+ item1.getQuant());
    }
    
}
