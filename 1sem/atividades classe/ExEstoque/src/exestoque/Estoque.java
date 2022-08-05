package exestoque;

    public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;

    
        public Estoque(){
        nome = "";
        qtdAtual = 0;
        qtdMinima = 0;
    }
    
    public Estoque(String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        
        if(qtdAtual>0)
            this.qtdAtual = qtdAtual;
        else 
            qtdAtual = 0;
        
        if(qtdMinima>0)
            this.qtdMinima = qtdMinima;
        else 
            qtdMinima = 0;
    }
    
    public void repor(int qtd){
        qtdAtual = qtdAtual + qtd;
    }
    
    public void darBaixa(int qtd){
        qtdAtual = qtdAtual - qtd;
    }
    
    public String mostra(){
        String x = "Nome:"+nome+"| Quantidade mínima: "+qtdMinima+"| Quantidade atual: "+qtdAtual;
        return x;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        if(qtdAtual>0)
            this.qtdAtual = qtdAtual;
        else 
            qtdAtual = 0;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        if(qtdMinima>0)
            this.qtdMinima = qtdMinima;
        else
            qtdMinima = 0;
    }
    public boolean precisaRepor(){
        boolean need;
        if(qtdAtual<=qtdMinima)
            need=true;
        else
            need=false;
        return need;

    }
    
}
