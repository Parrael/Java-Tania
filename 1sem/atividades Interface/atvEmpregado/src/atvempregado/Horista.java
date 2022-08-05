package atvempregado;


public class Horista {
    private double precoHora;
    private double horasTrabalhadas;

    public double vencimento(){
        double salario;
        salario = precoHora*horasTrabalhadas;
        return salario;
    }
    
    //Gets e Sets 
    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
}
