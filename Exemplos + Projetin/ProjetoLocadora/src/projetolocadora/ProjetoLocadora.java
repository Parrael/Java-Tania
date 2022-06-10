package projetolocadora;

import java.util.ArrayList;
import java.util.HashSet;
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
        
        do{
            try{
            System.out.println("\nDigite o nome do cliente: ");
            teclado.nextLine();
            c1.setNome(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(c1.getNome().isEmpty());
        
       do{
        try{
        System.out.println("\nDigite o CPF do cliente: ");
        System.out.println("(Digite um valor e não insira pontos ou traços)");
        c1.setCpf(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
       }while(c1.getCpf().isEmpty());
       
        do{
            try{
            System.out.println("\nDigite a idade do cliente: ");
            c1.setIdade(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(c1.getIdade()==0);
        
       do{
           try{
            System.out.println("\nDigite o endereco do cliente: ");
            teclado.nextLine();
            c1.setEndereco(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
       }while(c1.getEndereco().isEmpty());
       
       do{
        try{
            System.out.println("\nDigite o telefone do cliente: ");
            c1.setTelefone(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
       }while(c1.getTelefone().isEmpty());
        listaC.add(c1);
    }
    
    public static void cadastraFuncionario(){
        Funcionario func1 = new Funcionario();
        do{
        try{
            System.out.println("\nDigite o nome do funcionario: ");
            teclado.nextLine();
            func1.setNome(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }    
        }while(func1.getNome().isEmpty());
        
        
        do{
            try{
            System.out.println("\nDigite a idade do funcionario: ");
            func1.setIdade(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        }    while(func1.getIdade()==0);
            
        do{
        try{
            System.out.println("\nDigite o CPF do funcionario: ");
            System.out.println("(Digite um valor e não insira pontos ou traços)");
            teclado.nextLine();
            func1.setCpf(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(func1.getCpf().isEmpty());
        
        
        do{
        try{
            System.out.println("\nDigite o salario mensal do funcionario: ");
            func1.setSalario(teclado.nextDouble());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(func1.getSalario()==0);
       
        do{
            try{    
            System.out.println("\nDigite a carga horaria semanal do funcionario: ");
            func1.setCargaHoraria(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(func1.getCargaHoraria()==0);
              
        listaFunc.add(func1);
    }
        
    public static void cadastraFilme(){
        Filme fil1 = new Filme();
        
        do{
        try{    
            System.out.println("\nDigite o titulo do filme: ");
            teclado.nextLine();
            fil1.setTitulo(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(fil1.getTitulo().isEmpty());
        
       do{
           try{   
            System.out.println("\nDigite o preco do filme: ");
            fil1.setPreco(teclado.nextFloat());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }}while(fil1.getPreco()==0);
       
        do{
            try{    
            System.out.println("\nDigite a faixa etaria do filme: ");
            System.out.println("(Considere 1 para faixas etárias livres.)");
            fil1.setFaixaEtaria(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(fil1.getFaixaEtaria()==0);
        
        do{
            try{    
            System.out.println("\nDigite o genero do filme: ");
            teclado.nextLine();
            fil1.setGenero(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(fil1.getGenero().isEmpty());
        
        do{
            try{    
            System.out.println("\nDigite a duracao do filme: ");
            fil1.setDuracao(teclado.nextFloat());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(fil1.getDuracao()==0);
        
        do{
            try{    
            System.out.println("\nDigite a descricao do filme: ");
            teclado.nextLine();
            fil1.setDescricao(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(fil1.getDescricao().isEmpty());
        
        listaFil.add(fil1);
    }
        
    public static void cadastraJogo(){
        Jogo j1 = new Jogo();
        do{
            try{    
            System.out.println("\nDigite o titulo do jogo: ");
            teclado.nextLine();
            j1.setTitulo(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(j1.getTitulo().isEmpty());
        
        do{
            try{    
            System.out.println("\nDigite o preco do jogo: ");
        j1.setPreco(teclado.nextFloat());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(j1.getPreco()==0);
        
        do{
            try{    
                System.out.println("\nDigite a faixa etaria do jogo: ");
                System.out.println("(Considere 1 para faixas etárias livres.)");
            j1.setFaixaEtaria(teclado.nextInt());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(j1.getFaixaEtaria()==0);
        
        do{
            try{    
            System.out.println("\nDigite o genero do jogo: ");
            teclado.nextLine();
            j1.setGenero(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(j1.getGenero().isEmpty());
        
        do{
            try{    
            System.out.println("\nDigite a descricao do jogo: ");
            teclado.nextLine();
            j1.setDescricao(teclado.nextLine());
       }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       }
        }while(j1.getDescricao().isEmpty());
        
        listaJ.add(j1);
    }
    
    //MÉTODOS PARA EXCLUIR
    public static void excluiCliente(){
        String excluir;
        String sn;
        do{
            System.out.println("  Digite o CPF do cliente que deseja excluir: ");
            System.out.println("(Digite um valor e não insira pontos ou traços)");
            excluir=teclado.next();
            teclado.nextLine();
            }while(excluir.isEmpty() || excluir.contains("."));
        for(Cliente c1: listaC){
            if (c1.getCpf().startsWith(excluir)){
                System.out.println("==============================================================");
                c1.exibir();
                System.out.println("==============================================================");
                System.out.println("Deseja excluir este cadastro? (s/n)");
                sn= teclado.nextLine();
                do{
                    if(sn.equals("s")){
                    listaC.remove(c1);
                    System.out.println("\n Exclusao concluida com sucesso!");
                    break;
                }else if (sn.equals("n")){
                    System.out.println("\n Exclusao cancelada");
                    break;
                }
                }while(!sn.equals("s")||!sn.equals("n"));
            }else{
                System.out.println("Esse cpf não está cadastrado");
                }
            }
            }
        
    public static void excluiFuncionario(){
        String excluir;
        String sn;
        do{
            System.out.println("Digite o CPF do funcionário que deseja excluir: ");
            System.out.println("(Digite um valor e não insira pontos ou traços)");
            teclado.nextLine();
            excluir = teclado.nextLine();
            }while(excluir.isEmpty() || excluir.contains("."));
        for(Funcionario func1: listaFunc){
            if (func1.getCpf().startsWith(excluir)){
                System.out.println("==============================================================");
                func1.exibir();
                System.out.println("==============================================================");
                System.out.println("Deseja excluir este cadastro? (s/n)");
                teclado.nextLine();
                sn= teclado.nextLine();
                do{
                    if(sn.equals("s")){
                    listaFunc.remove(func1);
                    System.out.println("\n Exclusao concluida com sucesso!");
                    break;
                }else if (sn.equals("n")){
                    System.out.println("\n Exclusao cancelada");
                }
                }while(!sn.equals("s")||!sn.equals("n"));
            }else{
                System.out.println("Esse cpf não está cadastrado");
                }
            }
            }
        
    public static void excluiFilme(){
        String excluir;
        String sn;
        do{
            System.out.println("Digite o titulo do filme que deseja excluir: ");
            teclado.nextLine();
            excluir = teclado.nextLine();
            }while(excluir.isEmpty());
        for(Filme fil1: listaFil){
            if (fil1.getTitulo().startsWith(excluir)){
                System.out.println("==============================================================");
                fil1.exibir();
                System.out.println("==============================================================");
                System.out.println("Deseja excluir este cadastro? (s/n)");
                teclado.nextLine();
                sn = teclado.next();
                do{
                    if(sn.equals("s")){
                    listaFil.remove(fil1);
                    System.out.println("\n Exclusao concluida com sucesso!");
                    break;
                }else if (sn.equals("n"))
                    System.out.println("\n Exclusao cancelada");
                    break;
                }while(sn.equals("s")||!sn.equals("n"));
            }else{
                System.out.println("Esse titulo não está cadastrado");
                }
            }
            }
        
    public static void excluiJogo(){
        String excluir;
        String sn;
        do{
            System.out.println("Digite o titulo do jogo que deseja excluir: ");
            teclado.nextLine();
            excluir = teclado.nextLine();
            }while(excluir.isEmpty());
        for(Jogo j1: listaJ){
            if (j1.getTitulo().startsWith(excluir)){
                System.out.println("==============================================================");
                j1.exibir();
                System.out.println("==============================================================");
                System.out.println("Deseja excluir este cadastro? (s/n)");
                teclado.nextLine();
                sn = teclado.nextLine();
                do{
                    if(sn.equals("s")){
                    listaJ.remove(j1);
                    System.out.println("\n Exclusao concluida com sucesso!");
                    break;
                }else if (sn.equals("n")){
                    System.out.println("\n Exclusao cancelada");
                }
                }while(!sn.equals("s")||!sn.equals("n"));
            }else{
                System.out.println("Esse titulo não está cadastrado");
                }
            }
            }
           
    //MÉTODOS PARA PESQUISA 
    public static void pesquisaCliente(){
        String pesquisar;
        do{
        System.out.println("Digite o nome do cliente que deseja pesquisar");
        teclado.nextLine();
        pesquisar = teclado.nextLine();
        if(pesquisar.isEmpty())
                System.out.println("Digite um valor valido");
        }while(pesquisar.isEmpty());
            for(Cliente c1: listaC){
                if (c1.getNome().startsWith(pesquisar)){
                    System.out.println("\n==============================================================");
                    c1.exibir();
                    
                }
            }
            System.out.println("==============================================================\n\n");

    }
            
    
    public static void pesquisaFuncionario(){
        String pesquisar;
        do{
        System.out.println("Digite o nome do funcionario que deseja pesquisar");
        teclado.nextLine();
        pesquisar = teclado.nextLine();
        if(pesquisar.isEmpty())
                System.out.println("Digite um valor valido");
        }while(pesquisar.isEmpty());
            for(Funcionario func1: listaFunc){
                if (func1.getNome().startsWith(pesquisar)){
                    System.out.println("==============================================================");
                    func1.exibir();
                }
            }
            System.out.println("==============================================================\n\n");
    }
        
            
    public static void pesquisaProduto(){
        System.out.println("Selecione uma opcao de busca:\n\t ◉ 1- Descricao\n\t ◉ 2- Preco \n\t ◉ 3- Titulo \n\t ◉ 4- Genero");
        int opcao = teclado.nextInt();
        String pesquisar;

        switch(opcao){
            case 1:
                System.out.println("\n\n====Busca por Descricao iniciada:====");
                System.out.println("\n\nDigite a descrição do produto que deseja encontrar");
                teclado.nextLine();
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
                teclado.nextLine();
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
                System.out.println("\n\n Digite o genero do produto que deseja encontrar\n\n");
                teclado.nextLine();
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
    
    public static void clienteMaiorIdade(){
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
    
    public static void clienteMenorIdade(){
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
    
    public static void clienteMaiorQue60(){
        int count = 0;
        for(Cliente c1: listaC) {
            if (c1.getIdade()>60)
                count++;
        }
        System.out.println("\n O numero de clientes que possuem mais de sessenta anos é de: " + count + " clientes");
    }
    
    public static void clienteMenorQue18(){
        int count = 0;
        for(Cliente c1: listaC) {
            if (c1.getIdade()<18)
                count++;
        }
        System.out.println("\n O numero de clientes que possuem menor de dezoito anos é de: " + count + " clientes");
    }
    
    public static void clienteMediaIdade(){
        float count = 0;
        float soma = 0;
        for(Cliente c1: listaC) {
            soma += c1.getIdade();
            count++;
        }
        System.out.println("\n A idade media dos clientes é de: " + soma/count + " anos");
    }
    
    
    //MÉTODOS "PADRÕES" DE CLIENTE

    public static void produtoMaisCaro(){
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
    
    
    public static void produtoMaisBarato(){
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
    
        
        public static float produtoCalculaMediaPreco(){
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
        
        public static void produtoExibeMediaPreco(){
        System.out.println("\n A media de precos dos produtos é de: R$" + produtoCalculaMediaPreco());
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
            System.out.println("\nQuantidade de produtos acima da media de preco é de: R$" + count);
        }
        
        //Métodos de atribuições padrões:
        public static void atribuiCliPadrao(){
            Cliente c1 = new Cliente();
            c1.setEndereco("RuaBomDia");
            c1.setNome("Yudi");
            c1.setCpf("07293354205");
            c1.setIdade(29);
            c1.setTelefone("70028922");
            listaC.add(c1);
        }
        
        public static void atribuiFuncPadrao(){
            Funcionario func1 = new Funcionario();
            func1.setNome("Joao");
            func1.setIdade(19);
            func1.setCpf("07165289604");
            func1.setSalario(2499.99);
            func1.setCargaHoraria(30);
            listaFunc.add(func1);
        }
        
        public static void atribuiFilPadrao(){
            Filme fil1 = new Filme();
            fil1.setTitulo("Jogos Vorazes");
            fil1.setPreco(50);
            fil1.setFaixaEtaria(14);
            fil1.setGenero("acao");
            fil1.setDuracao(2);
            fil1.setDescricao("Filme sobre adolescentes que lutam ate a morte");
            listaFil.add(fil1);
        }
        
        public static void atribuiJpadrao(){
            Jogo j1 = new Jogo();
            j1.setDescricao("Jogo de tiro em primeira pessoa, possui multiplayer e modo história");
            j1.setFaixaEtaria(14);
            j1.setGenero("acao");
            j1.setPreco(120);
            j1.setTitulo("Halo Reach");
            listaJ.add(j1);
        }
        
    public static void main(String[] args) {
        System.out.println("\n======================== Inicio da Execucao ========================");
        int opcao;
        atribuiCliPadrao();
        atribuiFuncPadrao();
        atribuiFilPadrao();
        atribuiJpadrao();
        
        do{
        System.out.println("\n\n Selecione a opcao que deseja utilizar: \n\t ◉ 1- Cadastrar \n\t ◉ 2- Buscar \n\t ◉ 3- Excluir \n\t ◉ 4- Outros \n\t ◉ 0- Finalizar Programa");
        opcao = teclado.nextInt();
        switch(opcao){
            case 1 /*cadastro*/:
                System.out.println("\n\n Selecione a opcao que deseja cadastrar: \n\t ◉ 1- Cliente \n\t ◉ 2- Funcionario \n\t ◉ 3- Filme  \n\t ◉ 4- Jogo \n\t ◉ 0- Finalizar Programa");
                opcao = teclado.nextInt();
                switch(opcao){
                    case 1 /*cliente*/:
                        cadastraCliente();
                    break;
                    case 2 /*funcionario*/:
                        cadastraFuncionario();
                    break;
                    case 3/*filme*/:
                        cadastraFilme();
                    break;
                    case 4/*jogo*/:
                        cadastraJogo();
                    break;
                    
                    case 0 /*finalizar*/:
                    break;
            
                    default:
                        System.out.println("\n\n Opcao invalida selecionado, por favor, tente novamente.");
                    break;
                }
            break;
            case 2 /*buscar*/:
                System.out.println("\n\n Selecione a opcao que deseja buscar: \n\t ◉ 1- Cliente \n\t ◉ 2- Funcionario \n\t ◉ 3- Produto \n\t ◉ 0- Finalizar Programa");
                opcao = teclado.nextInt();
                switch(opcao){
                    case 1 /*cliente*/:
                        pesquisaCliente();
                    break;
                    case 2 /*funcionario*/:
                        pesquisaFuncionario();
                    break;
                    case 3/*produto*/:
                        pesquisaProduto();
                    break;
                    
                    case 0 /*finalizar*/:
                    break;
            
                    default:
                        System.out.println("\n\n Opcao invalida selecionado, por favor, tente novamente.");
                    break;
                }
            break;
            case 3/*excluir*/:
                System.out.println("\n\n Selecione a opcao que deseja excluir: \n\t ◉ 1- Cliente \n\t ◉ 2- Funcionario \n\t ◉ 3- Filme \n\t ◉ 4- Jogo \n\t ◉ 0- Finalizar Programa");
                opcao = teclado.nextInt();
                switch(opcao){
                    case 1 /*cliente*/:
                        excluiCliente();
                    break;
                    case 2 /*funcionario*/:
                        excluiFuncionario();
                    break;
                    case 3/*filme*/:
                        excluiFilme();
                    break;
                    case 4/*jogo*/:
                        excluiJogo();
                    break;
                    
                    case 0 /*finalizar*/:
                    break;
            
                    default:
                        System.out.println("\n\n Opcao invalida selecionado, por favor, tente novamente.");
                    break;
                } 
            break;
            case 4:
                System.out.println("n\n Selecione a opcao que deseja: \n\t ◉ 1- Quantidade de clientes com mais de 60 anos \n\t ◉ 2- Quantidade de clientes com menos de 18 anos \n\t ◉ 3- Cliente "
                        + "mais jovem \n\t ◉ 4- Cliente mais velho \n\t ◉ 5- Calcular media de idades \n\t ◉ 6- Consultar produto mais caro \n\t ◉ 7- Conslutar produto mais barato \n\t ◉ 8- Calcular media de precos");
                opcao = teclado.nextInt();
                switch(opcao){
                    case 1:
                        clienteMaiorQue60();
                        break;
                    case 2:
                        clienteMenorQue18();
                        break;
                    case 3:
                        clienteMenorIdade();
                        break;
                    case 4:
                        clienteMaiorIdade();
                        break;
                    case 5:
                        clienteMediaIdade();
                        break;
                    case 6:
                        produtoMaisCaro();
                        break;
                    case 7:
                        produtoMaisBarato();
                        break;
                    case 8:
                        produtoExibeMediaPreco();
                }
                break;
            case 0 /*finalizar*/:
            break;
            
            default:
                System.out.println("\n\n Opcao invalida selecionado, por favor, tente novamente.");
            break;
            }
        } while (opcao != 0);
    }
    
}   
