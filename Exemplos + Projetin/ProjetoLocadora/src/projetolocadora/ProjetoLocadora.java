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
        String pesquisar;

        switch(opcao){
            case 1:
                System.out.println("\n\n====Busca por Descricao iniciada:====");
                System.out.println("\n\nDigite a descrição do produto que deseja encontrar");
                pesquisar = teclado.nextLine();
                    for(Filme fil1: listaFil){
                        if (fil1.getDescricao().startsWith(pesquisar)){
                            System.out.println("==============================================================");
                            fil1.exibir();
                        }
                    }
                    for(Jogo j1: listaJ){
                        if (j1.getDescricao().startsWith(pesquisar)){
                            System.out.println("==============================================================");
                            j1.exibir();
                        }
                    }
                break;
                    
            case 2:
                System.out.println("\n\n====Busca por Preco iniciada:====");
                System.out.println("\n\nDigite o preco do produto que deseja encontrar");
                float var = teclado.nextFloat();
                    for(Filme fil1: listaFil){
                        if (fil1.getPreco() == var){
                            System.out.println("==============================================================");
                            fil1.exibir();
                        }
                    }
                    for(Jogo j1: listaJ){
                        if (j1.getPreco() == var){
                            System.out.println("==============================================================");
                            j1.exibir();
                        }
                    }
                break;
                    
            case 3:
                System.out.println("\n\n====Busca por Titulo iniciada:====");
                System.out.println("\n\nDigite o titulo do produto que deseja encontrar");
                pesquisar = teclado.nextLine();
                    for(Filme fil1: listaFil){
                        if (fil1.getTitulo().startsWith(pesquisar)){
                            System.out.println("==============================================================");
                            fil1.exibir();
                        }
                    }
                    for(Jogo j1: listaJ){
                        if (j1.getTitulo().startsWith(pesquisar)){
                            System.out.println("==============================================================");
                            j1.exibir();
                        }
                    }
                break;
                    
            case 4:
                System.out.println("\n\n====Busca por Genero iniciada:=====");
                System.out.println("\n\nDigite o genero do produto que deseja encontrar");
                pesquisar = teclado.nextLine();
                    for(Filme fil1: listaFil){
                        if (fil1.getGenero().startsWith(pesquisar)){
                            System.out.println("==============================================================");
                            fil1.exibir();
                        }
                    }
                    for(Jogo j1: listaJ){
                        if (j1.getGenero().startsWith(pesquisar)){
                            System.out.println("==============================================================");
                            j1.exibir();
                        }
                    }
                break;
                
            default:
                System.out.println("\n\n====Opcao invalida selecionada=====");
                break;    
        }}
    
    //MÉTODOS "PADRÕES" DE CLIENTE
    
    public void clienteMaiorIdade(){
        int maiorIdade=0;
        for(Cliente c1: listaC){
            if (c1.getIdade()>maiorIdade){
            maiorIdade = c1.getIdade();
            }
        }
        for(Cliente c1: listaC){
                if (c1.getIdade() == maiorIdade){
                    System.out.println("==============================================================");
                    c1.exibir();
                }
            }
    }
    
    public void clienteMenorIdade(){
        int menorIdade=999;
        for(Cliente c1: listaC){
            if (c1.getIdade()<menorIdade){
            menorIdade = c1.getIdade();
            }
        }
        for(Cliente c1: listaC){
                if (c1.getIdade() == menorIdade){
                    System.out.println("==============================================================");
                    c1.exibir();
                }
            }
    }
    
    public void clienteMaiorQue60(){
        int count = 0;
        for(Cliente c1: listaC) {
            if (c1.getIdade()>60)
                count++;
        }
        System.out.println("\n O numero de clientes que possuem mais de sessenta anos é de: " + count + " clientes");
    }
    
    public void clienteMenorQue18(){
        int count = 0;
        for(Cliente c1: listaC) {
            if (c1.getIdade()<18)
                count++;
        }
        System.out.println("\n O numero de clientes que possuem menor de dezoito anos é de: " + count + " clientes");
    }
    
    public void clienteMediaIdade(){
        float count = 0;
        float soma = 0;
        for(Cliente c1: listaC) {
            soma += c1.getIdade();
            count++;
        }
        System.out.println("\n A idade media dos clientes é de: " + soma/count + " anos");
    }
    
    
    //MÉTODOS "PADRÕES" DE CLIENTE

    public void produtoMaisCaro(){
        float maisCaro = 0;
        for(Filme fil1: listaFil){
            if (fil1.getPreco()>maisCaro){
            maisCaro = fil1.getPreco();
            }
        }
        for(Jogo j1: listaJ){
            if (j1.getPreco()>maisCaro){
            maisCaro = j1.getPreco();
            }
        }
        for(Filme fil1: listaFil){
                if (fil1.getPreco() == maisCaro){
                    System.out.println("==============================================================");
                    fil1.exibir();
                }
            }
        for(Jogo j1: listaJ){
                if (j1.getPreco() == maisCaro){
                    System.out.println("==============================================================");
                    j1.exibir();
                }
            }
    }
    
    
    public void produtoMaisBarato(){
        float maisBarato = 999;
        for(Filme fil1: listaFil){
            if (fil1.getPreco()<maisBarato){
            maisBarato = fil1.getPreco();
            }
        }
        for(Jogo j1: listaJ){
            if (j1.getPreco()<maisBarato){
            maisBarato = j1.getPreco();
            }
        }
        for(Filme fil1: listaFil){
                if (fil1.getPreco() == maisBarato){
                    System.out.println("==============================================================");
                    fil1.exibir();
                }
            }
        for(Jogo j1: listaJ){
                if (j1.getPreco() == maisBarato){
                    System.out.println("==============================================================");
                    j1.exibir();
                }
            }
    }
    
        
        public float produtoCalculaMediaPreco(){
        float count = 0;
        float soma = 0;
        for(Jogo j1: listaJ) {
            soma += j1.getPreco();
            count++;
        }
        for(Filme f1: listaFil) {
            soma += f1.getPreco();
            count++;
        }
        return soma/count;
        }
        
        public void produtoExibeMediaPreco(){
        System.out.println("\n A idade media dos clientes é de: " + produtoCalculaMediaPreco() + " anos");
    }
        public void produtoAcimaDaMediaPreco(){
            float media = produtoCalculaMediaPreco();
            int count = 0;
            for(Filme fil1: listaFil){
            if (fil1.getPreco()>media){
            count++;
            }
        }
        for(Jogo j1: listaJ){
            if (j1.getPreco()>media){
            count++;
            }
        }
            System.out.println("\nQuantidade de produtos acima da media de preco é de: " + count);
        }
        
    
        
    public static void main(String[] args) {
        
    }
    
}   
