package projetolocadora;

public class Cliente extends Pessoa implements IPessoa{
    protected String endereco;
    protected String telefone;
    protected boolean aluguelAndamento;
    
//construtor

    public Cliente(String endereco, String telefone, String nome, int idade, String cpf) {
        
        super(nome,idade,cpf);
        this.endereco = endereco;
        this.telefone = telefone;
    }
    

//get e set

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAluguelAndamento() {
        return aluguelAndamento;
    }

    public void setAluguelAndamento(boolean aluguelAndamento) {
        this.aluguelAndamento = aluguelAndamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nEndereco: " + endereco + "\nTelefone: " + telefone);
        if(aluguelAndamento){
            System.out.println("Já possui aluguel em andamento.");
        }else{
            System.out.println("Não possui aluguel em andamento.");
        }
        
    }
    
        
}
