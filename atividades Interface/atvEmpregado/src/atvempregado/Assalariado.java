package atvempregado;

public class Assalariado extends Empregado{
    private double salario;

    @Override
    public double vencimento(){
        this.salario = 0;
        return salario;
    }
    
    //get e set
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
