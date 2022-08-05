
package ferran;
public class Aluno extends Pessoa {
    protected int ra;

    public Aluno (String nome,int idade,int ra)
    {
    super(nome,idade);
    this.ra=ra;
    }
   
    public void mostra(){
        super.mostra();
        System.out.println("é um aluno");  
    }
    
    public int getRa() {
        return ra;
    }
    
    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
