
package testefuncionarios;

public class Gerentes extends Funcionario {
    private String usuario;
    private int senha;

public Gerentes(String nome,float salario,String usuario,int senha){
super (nome, salario);
this.usuario=usuario;
this.senha=senha;
}
    @Override
    public float calculaBonificacao(){
        float bonus;
        bonus = this.getSalario()*0.15f;
        return bonus;
    }
    
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getNome()+" Salario: R$"+ getSalario());
        System.out.println("Username: "+ getUsuario()+ " Senha: "+ getSenha());
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
