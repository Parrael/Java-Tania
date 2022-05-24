package exthrow;

public class Aluno {
    
    private int ra;
    private String nome;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra<0)
        {
            throw new IllegalArgumentException("o ra é negativo, troque!");
        }
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        if(nome.equals(""))
        {
            throw new StringVaziaExcepcion();
        }
        else
        {
        this.nome = nome;
        }
    }
}