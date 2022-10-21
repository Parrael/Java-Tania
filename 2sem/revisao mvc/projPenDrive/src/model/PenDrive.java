package model;

public class PenDrive {
    protected int armazenamento;
    protected String marca;
    protected double preco;
    protected int garantia;
    protected String codigo;
    
    //Construtor
    public PenDrive(int armazenamento, String marca, double preco, int garantia, String codigo) {
        this.armazenamento = armazenamento;
        this.marca = marca;
        this.preco = preco;
        this.garantia = garantia;
        this.codigo = codigo;
    }

    public PenDrive() {
    }
    
    //getters e setters
    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
