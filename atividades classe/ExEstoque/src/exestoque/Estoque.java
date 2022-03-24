package exestoque;


public class Estoque {
    private String name;
    private int qntdAtual;
    private int qntdMinima;
    private int qntd;
    
    //construtores
    public Estoque(){
        name = name;
        qntdAtual = qntdAtual;
        qntdMinima = qntdMinima;
        
    }
    
    public Estoque(String name, int qntdAtual, int qntdMinima){
        this.name = name;
        this.qntdAtual = qntdAtual;
        this.qntdMinima = qntdMinima;
    }

    //metodo repor
    public void repor(int qntd){
        qntdAtual += qntd;
    }
    
    //metodo dar baixa
    public void darBaixa(int qntd){
        qntdAtual -= qntd;
    }
    
    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQntdAtual() {
        return qntdAtual;
    }

    public void setQntdAtual(int qntdAtual) {
        this.qntdAtual = qntdAtual;
    }

    public int getQntdMinima() {
        return qntdMinima;
    }

    public void setQntdMinima(int qntdMinima) {
        this.qntdMinima = qntdMinima;
    }
        public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    
}
