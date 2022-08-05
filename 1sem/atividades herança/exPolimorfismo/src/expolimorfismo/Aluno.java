package expolimorfismo;

public class Aluno extends Pessoa{
    private String ra;
    
//Métodos
    @Override
    public void mostraDados(){
        System.out.println("é um aluno.");
    }
    public double calculaMedia(double nota1, double nota2){
        return (nota1+nota2)/2;
    }
    
    
    


//Getters e Setters

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }


    }
    
    

