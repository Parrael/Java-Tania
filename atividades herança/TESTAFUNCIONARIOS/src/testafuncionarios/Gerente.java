
package testafuncionarios;

public class Gerente extends Funcionario{
    private String username;
    private int password;

    //Construtores
    
    public Gerente(String name, float wage, String username, int password){
        super(name, wage);
        this.username = username;
        this.password = password;
    }
    
    
    //METODO
    @Override
    public float calculaBonificacao(){
        float bonus;
        bonus = getWage()/5;
        return bonus;
    }
    
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getName()+" | Salario: R$"+ getWage());
        System.out.println("Username: "+ getUsername()+ " | Senha: "+ getPassword());
    }
    
    //getters e setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    
    
}
