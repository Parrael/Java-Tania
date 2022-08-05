
package testefuncionarios;

public class Funcionario {
private String nome;
private float salario;

public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario=salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


public float calculaBonificacao(){
    float bonus;
    bonus=salario*0.10f;
    return bonus;
}
public void mostraDados(){
        System.out.println("Nome: "+ getNome()+" | Salario: R$"+ getSalario());
    }
}
