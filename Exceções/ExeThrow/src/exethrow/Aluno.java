package exethrow;

public class Aluno {
    protected int ra;
    protected String nome;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra <0){
        throw new IllegalArgumentException ("RA deve ser positivo");
        } else {
            this.ra = ra;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.equals("")){
            throw new StringVaziaException();
        } else {
            this.nome = nome;
        }
    }

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
    
    
}
