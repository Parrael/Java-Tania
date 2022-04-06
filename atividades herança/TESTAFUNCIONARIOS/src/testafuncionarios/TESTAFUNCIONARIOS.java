
package testafuncionarios;

public class TESTAFUNCIONARIOS {

    public static void main(String[] args) {
      
        Gerente ger1 = new Gerente(String name, float wage, String username, String Password);
        Telefonista tel1 = new Telefonista(String name, float wage, int code);
        Secretaria sec1 = new Secretaria(String name, float wage, int number);
        
        ger1.setWage(1000f);
        ger1.setName("Alejandre");
        ger1.setUsername("Xandrão");
        ger1.setPassword(69420);
        
        
        tel1.setWage(500f);
        tel1.setName("Predo");
        tel1.setCode(566);
        
        sec1.setWage(450f);
        sec1.setName("Donna");
        sec1.setNumber(027);
        
        System.out.println("Gerente: "+ger1.getName()+" | R$"+ ger1.getWage() +" | Username: "+ ger1.getUsername() +" | Por motivos de segurança, senha não serão apresentada.");
        System.out.println("Telefonista: "+tel1.getName()+" | R$"+ tel1.getWage() +" | Código: "+ tel1.getCode());
        System.out.println("Secretária: "+sec1.getName()+" | R$"+ sec1.getWage() +" | Ramal: "+ sec1.getNumber());
        
        System.out.println("=========== A bonificação foi aplicada ===========");
        System.out.println("O salario de "+ ger1.getName()+" será agora de: R$"+ (ger1.getWage()+ ger1.calculaBonificacao()));
        System.out.println("O salario de "+ tel1.getName() +" será agora de: R$"+ (tel1.getWage()+ tel1.calculaBonificacao()));
        System.out.println("O salario de "+ sec1.getName() +" será agora de: R$"+ (sec1.getWage()+ sec1.calculaBonificacao()));
        
        ger1.mostraDados();
        tel1.mostraDados();
        sec1.mostraDados();
    }
    
}
