
package exheranca;

public class ExHeranca {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gilberto", 64);
            //p1.setNome("Gilberto"); > ja inserido como instancia em p1
            //p1.setIdade(64); > ja inserido como instancia em p1
        System.out.println("Nome: "+ p1.getNome() +" | Idade: "+ p1.getIdade());
        p1.mostra();
        
        //mesmo a classe Aluno tendo apeans 1 atributo ela está extendendo atributos da classe Pessoa 
        Aluno al1 = new Aluno("Jubiuscleusa", 17, 1234);
            //al1.setNome("Jubiuscleusa"); > ja inserido como instancia em al1
            //al1.setIdade(17); > ja inserido como instancia em al1
        System.out.println("Nome: "+ al1.getNome() +" | Idade: "+ al1.getIdade() + " | RA: "+ al1.getRa());
            //al1.setRa(1234); > ja inserido como instancia em al1
        al1.mostra();
        
        //mesmo a classe Professor estando com apenas 1 atributo ela está extendendo atributos tambem da classe Pessoa
        Professor prof1 = new Professor("Adamastor", 69, 4700);
            //prof1.setNome("Adamastor"); > ja inserido como instancia em prof1
            //prof1.setIdade(69); > ja inserido como instancia em prof1
            //prof1.setSalario(4700); > ja inserido como instancia em prof1
        System.out.println("Nome: "+ prof1.getNome() +" | Idade: "+ prof1.getIdade() + " | Salario: R$"+ prof1.getSalario());
        prof1.mostra();
        
        Bolsista bol1 = new Bolsista("Craudinho", 19, 1987, 1200);
        System.out.println("Nome: "+ bol1.getNome() +" | Idade: "+ bol1.getIdade() +" | RA: "+ bol1.getRa()+ " | Bolsa: R$"+ bol1.getBolsa());
        bol1.mostra();
        
    }
    
}
