
package testafuncionarios;


public class Funcionario {
    private String name;
    private float wage;
    
    //CONSTRUTORES
    public Funcionario(String name, float wage){
        this.name = name;
        this.wage = wage;
    }
    
    //METODOS
    public float calculaBonificacao(){
        float bonus;
        bonus = wage/10;
        return bonus;
    }
    
    public void mostraDados(){
        System.out.println("Nome: "+ getName()+" | Salario: R$"+ getWage());
    }

    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
    
    
}
