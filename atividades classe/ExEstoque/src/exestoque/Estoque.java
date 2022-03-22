package exestoque;


public class Estoque {
    private String name;
    private int qntdAtual;
    private int qntdMinima;
    
    //construtores
    public Estoque(){
    }
    
    public Estoque(String name, int qntdAtual, int qntdMinima){
        this.name = name;
        this.qntdAtual = qntdAtual;
        this.qntdMinima = qntdMinima;
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
    
    
}
