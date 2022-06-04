package projetolocadora;

import java.util.Scanner;

public class Cliente extends Pessoa implements IPessoa{
    protected String endereco;
    protected String telefone;
    protected boolean aluguelAndamento;
    static Scanner teclado = new Scanner(System.in);
    
//construtor

    public Cliente(String endereco, String telefone, String nome, int idade, String cpf) {
        
        super(nome, idade, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente() {
        nome = "";
        idade = 0;
        cpf = "";
        endereco = "";
        telefone = "";
    }
    
    

//get e set

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if("".equals(endereco)){
            throw new IllegalArgumentException ("Camppo endereco não pode ser vazio");
        }else{
            this.endereco = endereco;
        }
       
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if ("".equals(telefone)){
            throw new IllegalArgumentException ("Campo telefone não pode ser vazio");
        }else{
            this.telefone = telefone;
        }
    }

    public boolean getAluguelAndamento() {
       return aluguelAndamento;
    }

    public void setAluguelAndamento(boolean aluguelAndamento) {
        this.aluguelAndamento=aluguelAndamento;
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
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nEndereco: " + endereco + "\nTelefone: " + telefone);
        if(aluguelAndamento){
            System.out.println("Já possui aluguel em andamento.");
        }else{
            System.out.println("Não possui aluguel em andamento.");
        }
        
    }

    boolean startsWith(Scanner teclado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
}
