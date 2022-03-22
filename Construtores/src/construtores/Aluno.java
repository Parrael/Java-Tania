
package construtores;

public class Aluno {
    private int ra;
    private String nome; 
    
    public Aluno(){ // Para definir como padrão (default)
        ra = 0;
        nome = "";
    }
    
    public Aluno (int ra, String nome){ // construtor com 2 argumentos
        this.ra = ra;
        this.nome = nome;
    }
    
    public Aluno (int ra){ //construtor com 1 argumento
        this.ra = ra;
        this.nome = "";
    }
    
    public Aluno (String nome){
        this.ra = 0;
        this.nome = nome;
    }

    
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void verifica (int ra){
        if (ra<0)
        System.out.println("Erro");
        else
            this.ra = ra;
    }
    
    public void verifica (String nome){
        if (nome.equals(""))
            System.out.println("Erro");
        else
            this.nome = nome;
    }
    
}
