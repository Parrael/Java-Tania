package exeencapsulamento;

public class Disciplina {
    
    private String nomeDisc;
    private String abreDisc;
    private int cargaHor;
    
    public String getNomeDisc ()
    {
        return nomeDisc;
    }
    
    public void setNomeDisc(String nomeDisc)
    {
        this.nomeDisc = nomeDisc;
    }
     
    public String getAbreDisc ()
    {
        return abreDisc;
    }
    
    public void setAbreDisc(String abreDisc)
    {
        this.abreDisc = abreDisc;
    }
    
    public int getCargaHor ()
    {
        return cargaHor;
    }
    
    public void setCargaHor (int cargaHor)
    {
        this.cargaHor = cargaHor;
    }
    
}
