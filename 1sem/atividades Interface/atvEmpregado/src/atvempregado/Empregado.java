package atvempregado;

public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String cpf;

    public double vencimento(){
        double salario = 0;
        
        return salario;
    }
    //Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
