package projetolocadora;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoLocadora {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList <Cliente> listaC = new ArrayList();
    static ArrayList <Funcionario> listaFunc = new ArrayList();
    static ArrayList <Filme> listaFil = new ArrayList();
    static ArrayList <Jogo> listaJ = new ArrayList();
    
    
    public static void cadastraCliente(){
        Cliente c1 = new Cliente();
        
        System.out.println("\nDigite o nome do cliente: ");
        c1.setNome(teclado.nextLine());
        System.out.println("\nDigite a idade do cliente: ");
        c1.setIdade(teclado.nextInt());
        System.out.println("\nDigite o CPF do cliente: ");
        c1.setCpf(teclado.nextLine());
        System.out.println("\nDigite o endereco do cliente: ");
        c1.setEndereco(teclado.nextLine());
        System.out.println("\nDigite o telefone do cliente: ");
        c1.setTelefone(teclado.nextLine());
        
        listaC.add(c1);
    }
    
        public static void cadastraFunc(){
        Funcionario func1 = new Funcionario();
        
        System.out.println("\nDigite o nome do funcionario: ");
        func1.setNome(teclado.nextLine());
        System.out.println("\nDigite a idade do funcionario: ");
        func1.setIdade(teclado.nextInt());
        System.out.println("\nDigite o CPF do funcionario: ");
        func1.setCpf(teclado.nextLine());
        System.out.println("\nDigite o salario do funcionario: ");
        func1.setSalario(teclado.nextDouble());
        System.out.println("\nDigite a carga horaria do funcionario: ");
        func1.setCargaHoraria(teclado.nextInt());
        
        listaFunc.add(func1);
    }
        
        public static void cadastraFilme(){
        Filme fil1 = new Filme();
        
        System.out.println("\nDigite o titulo do filme: ");
        fil1.setTitulo(teclado.nextLine());
        System.out.println("\nDigite o preco do filme: ");
        fil1.setPreco(teclado.nextFloat());
        System.out.println("\nDigite a faixa etaria do filme: ");
        fil1.setFaixaEtaria(teclado.nextInt());
        System.out.println("\nDigite o genero do filme: ");
        fil1.setGenero(teclado.nextLine());
        System.out.println("\nDigite a duracao do filme: ");
        fil1.setDuracao(teclado.nextFloat());
        System.out.println("\nDigite a descricao do filme: ");
        fil1.setDescricao(teclado.nextLine());
        
        listaFil.add(fil1);
    }
        
        public static void cadastraJogo(){
        Jogo j1 = new Jogo();
        
        System.out.println("\nDigite o titulo do jogo: ");
        j1.setTitulo(teclado.nextLine());
        System.out.println("\nDigite o preco do jogo: ");
        j1.setPreco(teclado.nextFloat());
        System.out.println("\nDigite a faixa etaria do jogo: ");
        j1.setFaixaEtaria(teclado.nextInt());
        System.out.println("\nDigite o genero do jogo: ");
        j1.setGenero(teclado.nextLine());
        System.out.println("\nDigite a descricao do jogo: ");
        j1.setDescricao(teclado.nextLine());
        
        listaJ.add(j1);
    }
    
        public static void excluiCliente(){
            System.out.println("Digite o CPF do cliente que deseja excluir: ");
            String excluir = teclado.nextLine();
            
            for(Cliente c1: listaC){
                if (c1.getCpf().startsWith(excluir)){
                    System.out.println("==============================================================");
                    c1.exibir();
                    System.out.println("==============================================================");
                    System.out.println("Deseja excluir este cadastro? (s/n)");
                    String sn= teclado.nextLine();
                    if(sn.equals("s")){
                    listaC.remove(c1);
                    break;
                    }
                }else{
                    System.out.println("Esse cpf não está cadastrado");
                }
            }     
        }
        
        public static void excluiFuncionario(){
            System.out.println("Digite o CPF do funcionario que deseja excluir: ");
            String excluir = teclado.nextLine();
            
            for(Funcionario func1: listaFunc){
                if (func1.getCpf().startsWith(excluir)){
                    System.out.println("==============================================================");
                    func1.exibir();
                    System.out.println("==============================================================");
                    System.out.println("Deseja excluir este cadastro? (s/n)");
                    String sn= teclado.nextLine();
                    if(sn.equals("s")){
                    listaFunc.remove(func1);
                    break;
                    }
                }else{
                    System.out.println("Esse cpf não está cadastrado");
                }
            }        
        }
        
        public static void excluiFilme(){
            System.out.println("Digite o titulo do filme que deseja excluir: ");
            String excluir = teclado.nextLine();
            
            for(Filme fil1: listaFil){
                if (fil1.getTitulo().startsWith(excluir)){
                    System.out.println("==============================================================");
                    fil1.exibir();
                    System.out.println("==============================================================");
                    System.out.println("Deseja excluir este cadastro? (s/n)");
                    String sn= teclado.nextLine();
                    if(sn.equals("s")){
                    listaFil.remove(fil1);
                    break;
                    }
                }else{
                    System.out.println("Esse titulo não está cadastrado");
                }
            }      
        }
        
            public static void excluiJogo(){
            System.out.println("Digite o titulo do jogo que deseja excluir: ");
            String excluir = teclado.nextLine();
            
            for(Jogo j1: listaJ){
                if (j1.getTitulo().startsWith(excluir)){
                    System.out.println("==============================================================");
                    j1.exibir();
                    System.out.println("==============================================================");
                    System.out.println("Deseja excluir este cadastro? (s/n)");
                    String sn= teclado.nextLine();
                    if(sn.equals("s")){
                    listaJ.remove(j1);
                    break;
                    }
                }else{
                    System.out.println("Esse titulo não está cadastrado");
                }
            }         
        }
            
            public void pesquisaCliente(){
            System.out.println("Digite o nome do cliente que deseja pesquisar");    
            String pesquisar = teclado.nextLine();
            for(Cliente c1: listaC){
                if (c1.getNome().startsWith(pesquisar)){
                    System.out.println("==============================================================");
                    c1.exibir();
            }
            }
        }
            public void pesquisaFuncionario(){
            System.out.println("Digite o nome do funcionario que deseja pesquisar");    
            String pesquisar = teclado.nextLine();
            for(Funcionario func1: listaFunc){
                if (func1.getNome().startsWith(pesquisar)){
                    System.out.println("==============================================================");
                    func1.exibir();
            }
            }
        }
        
            public void pesquisaProduto(){
                System.out.println("Selecione uma opcao de busca:\n1- Descricao\n2- Preco \n3- Titulo \n4- Genero");
                int opcao = teclado.nextInt();
                switch(opcao){
                    case '1':
                        System.out.println("\n\nBusca por Descricao iniciada:");
                    break;
                    
                    case '2':
                        System.out.println("\n\nBusca por Preco iniciada:");
                    break;
                    
                    case '3':
                        System.out.println("\n\nBusca por Titulo iniciada:");
                    break;
                    
                    case '4':
                        System.out.println("\n\nBusca por Genero iniciada:");
                    break;
                    
                }
            }
    public static void main(String[] args) {
       
    }
    
}
