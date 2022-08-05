package exeencapsulamento;

public class Curso {
    
    private String nome;
    private int cargaHor;
    private int preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHor() {
        return cargaHor;
    }

    public void setCargaHor(int cargaHor) {
        this.cargaHor = cargaHor;
    }

    public int getPreço() {
        return preco;
    }

    public void setPreço(int preco) {
        if(preco==0)
        {
            System.out.println("Curso Gratuito!");
        }
        if(preco>0)
        {
            this.preco = preco;
        }     
    }
}