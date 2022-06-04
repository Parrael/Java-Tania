package projetolocadora;

public class Funcionario extends Pessoa implements IPessoa{
    protected double salario;
    protected int cargaHoraria;
    
//construtor
    public Funcionario(double salario, int cargaHoraria, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public Funcionario(){
        nome = "";
        idade = 0;
        cpf = "";
        salario = 0;
        cargaHoraria = 0;
    }
    
    

//get e set
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            throw new IllegalArgumentException ("Campo salario não pode ser zero");
        }else{
            this.salario = salario;
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria == 0){
            throw new IllegalArgumentException ("Campo carga horaria não pode ser vazio");
        }else{
            this.cargaHoraria = cargaHoraria;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ("".equals(nome)){
            throw new IllegalArgumentException ("Campo nome não pode ser vazio");
        }else{
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade == 0){
            throw new IllegalArgumentException ("Campo idade nao pode ser zero");
        }else{
            this.idade = idade;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if ("".equals(cpf)){
            throw new IllegalArgumentException ("Campo CPF não pode ser vazio");
        }else{
            this.cpf = cpf;
        }
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nSalario: " + salario + "\nCarga horaria: " + cargaHoraria);

    }
    
    
}
