package projetolocadora;

public class Jogo extends Produto{
    
//construtor
        public Jogo(String descricao, float preco, String titulo, int faixaEtaria, String genero) {
        super(descricao, preco, titulo, faixaEtaria, genero);
    }

    public Jogo() {
        descricao = "";
        preco = 0;
        titulo = "";
        faixaEtaria = 0;
        genero = "";
    }
        
//get e set

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if ("".equals(descricao)){
            throw new IllegalArgumentException ("Campo descricao não pode ser vazio");
        }else{
            this.descricao = descricao;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco <= 0){
            throw new IllegalArgumentException ("Campo preco não pode ser zero ou negativo");
        }else{
            this.preco = preco;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if ("".equals(titulo)){
            throw new IllegalArgumentException ("Campo titulo não pode ser vazio");
        }else{
            this.titulo = titulo;
        }
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        if (faixaEtaria == 0){
            throw new IllegalArgumentException ("Campo faixa etaria não pode ser zero");
        }else{
            this.faixaEtaria = faixaEtaria;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if ("".equals(genero)){
            throw new IllegalArgumentException ("Campo genero não pode ser vazio");
        }else{
            this.genero = genero;
        }
    }
    
        @Override
    public void exibir(){
        System.out.println("Titulo: " + titulo + "\npreco: " + preco + "\nfaixa etaria: " + faixaEtaria + "\ngenero: " + genero + "\ndescricao: " + descricao);
    }
        
}
