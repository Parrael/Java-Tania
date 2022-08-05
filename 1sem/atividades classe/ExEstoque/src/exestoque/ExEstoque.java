package exestoque;


public class ExEstoque {

    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Impressora",13,6);
        Estoque estoque2 = new Estoque("Monitor",11, 13);
        Estoque estoque3 = new Estoque("Mouse",6,2);
        
        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);

        if(estoque1.precisaRepor()==true)
            System.out.println("Estoque 1: precisa repor");
        else
            System.out.println("Estoque 1: não precisa repor");

        if(estoque2.precisaRepor()==true)
            System.out.println("Estoque 2: precisa repor");
        else
            System.out.println("Estoque 2: não precisa repor");

        if(estoque3.precisaRepor()==true)
            System.out.println("Estoque 3: precisa repor");
        else
            System.out.println("Estoque 3: não precisa repor");
        
        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());

    }
    
}
