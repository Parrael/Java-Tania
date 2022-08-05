
package testafuncionarios;

public class Secretaria extends Funcionario{
    private int number;
    
    //Construtores
    public Secretaria(String name, float wage, int number){
        super (name, wage);
        this.number = number;
    }
    //metodos
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getName()+" | Salario: R$"+ getWage());
        System.out.println("Ramal: "+getNumber());
    }
    
    //getters e setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
