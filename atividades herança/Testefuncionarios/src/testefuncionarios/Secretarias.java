
package testefuncionarios;

public class Secretarias extends Funcionario {
   private int numeroRamal;
       

    public Secretarias(String nome, float salario, int numeroRamal){
        super (nome, salario);
        this.numeroRamal = numeroRamal;
    }
   
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getNome()+" Salario: R$"+ getSalario());
        System.out.println("Ramal: "+getNumeroRamal());
    }

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }
}
   


