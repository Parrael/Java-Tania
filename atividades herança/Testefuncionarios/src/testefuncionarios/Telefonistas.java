
package testefuncionarios;

public class Telefonistas extends Funcionario {
  
private int codigoEstTrab;

    public Telefonistas (String nome, float salario, int codigo){
        super(nome, salario);
        this.codigoEstTrab = codigo;
    }

    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getNome()+" Salario: R$"+ getSalario());
        System.out.println("Código: "+ getCodigoEstTrab());
    }

    public int getCodigoEstTrab() {
        return codigoEstTrab;
    }

    public void setCodigoEstTrab(int codigoEstTrab) {
        this.codigoEstTrab = codigoEstTrab;
    }
}
