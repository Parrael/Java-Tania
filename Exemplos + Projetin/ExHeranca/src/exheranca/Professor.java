package exheranca;

public class Professor extends Pessoa{ // extende classes e métodos de Pessoa
    private double salario;

    public Professor(String nome, int idade, double salario ){
        super(nome, idade); // super ele puxa os CONSTRUTORES da superclasse
        this.salario = salario; // salario é um atributo da classe Professor, logo n precisa ser puxada da superclasse
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
