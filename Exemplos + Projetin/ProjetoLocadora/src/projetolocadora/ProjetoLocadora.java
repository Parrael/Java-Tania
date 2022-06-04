package projetolocadora;

import java.util.ArrayList;
import java.util.Scanner;

    public class ProjetoLocadora {
        static Scanner teclado = new Scanner(System.in);
        static ArrayList <Cliente> listaC = new ArrayList();
        static ArrayList <Funcionario> listaFunc = new ArrayList();
        static ArrayList <Filme> listaFil = new ArrayList();
        static ArrayList <Jogo> listaJ = new ArrayList();
    
        
    //MÉTODOS PARA CADASTRO
    public static void cadastraCliente(){
        Cliente c1 = new Cliente();
        
        try{
            System.out.println("\nDigite o nome do cliente: ");
            c1.setNome(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
       try{
        System.out.println("\nDigite o CPF do cliente: ");
        c1.setCpf(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{
            System.out.println("\nDigite a idade do cliente: ");
            c1.setIdade(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
       try{
            System.out.println("\nDigite o endereco do cliente: ");
            c1.setEndereco(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
       try{
            System.out.println("\nDigite o telefone do cliente: ");
            c1.setTelefone(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        listaC.add(c1);
    }
    
    public static void cadastraFuncionario(){
        Funcionario func1 = new Funcionario();
        try{
            System.out.println("\nDigite o nome do funcionario: ");
            func1.setNome(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{
            System.out.println("\nDigite a idade do funcionario: ");
            func1.setIdade(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{
            System.out.println("\nDigite o CPF do funcionario: ");
            func1.setCpf(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{
            System.out.println("\nDigite o salario do funcionario: ");
            func1.setSalario(teclado.nextDouble());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite a carga horaria do funcionario: ");
            func1.setCargaHoraria(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
              
        listaFunc.add(func1);
    }
        
    public static void cadastraFilme(){
        Filme fil1 = new Filme();
        
        try{    
            System.out.println("\nDigite o titulo do filme: ");
            fil1.setTitulo(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
       try{    
            System.out.println("\nDigite o preco do filme: ");
            fil1.setPreco(teclado.nextFloat());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite a faixa etaria do filme: ");
            fil1.setFaixaEtaria(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite o genero do filme: ");
            fil1.setGenero(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite a duracao do filme: ");
            fil1.setDuracao(teclado.nextFloat());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite a descricao do filme: ");
            fil1.setDescricao(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        
        listaFil.add(fil1);
    }
        
    public static void cadastraJogo(){
        Jogo j1 = new Jogo();
        try{    
            System.out.println("\nDigite o titulo do jogo: ");
            j1.setTitulo(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite o preco do jogo: ");
        j1.setPreco(teclado.nextFloat());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite a faixa etaria do jogo: ");
            j1.setFaixaEtaria(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite o genero do jogo: ");
            j1.setGenero(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        try{    
            System.out.println("\nDigite a descricao do jogo: ");
            j1.setDescricao(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
       }
        
        listaJ.add(j1);
    }
    
    //MÉTODOS PARA EXCLUIR
    public static void excluiCliente(){
        System.out.println("Digite o CPF do cliente que deseja excluir: ");
        String excluir = teclado.nextLine();
            if(excluir.contains(".") || "".equals(excluir)){
                System.out.println("Digite um valor e não insira pontos ou traços");
            }else{
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
        }
        
    public static void excluiFuncionario(){
        System.out.println("Digite o CPF do funcionario que deseja excluir: ");
        String excluir = teclado.nextLine();
            if(excluir.contains(".") || "".equals(excluir)){
                System.out.println("Digite um valor e não insira pontos ou traços");
            }else{
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
           
    //MÉTODDOS PARA PESQUISA - TERMINAR 
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
