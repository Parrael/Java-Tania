
package testafuncionarios;


public class Telefonista extends Funcionario {
    private int code;

    //Construtores
    public Telefonista (String name, float wage, int code){
        super(name, wage);
        this.code = code;
    }
    //métodos
    
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getName()+" | Salario: R$"+ getWage());
        System.out.println("Código: "+ getCode());
    }
    //getters e setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
}
