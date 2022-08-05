package exfunc;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salario;
    
    
   public Funcionario(){ // construtor
       nome = "";
       sobrenome = "";
       salario = 0;
   }
   public Funcionario (float salario){ // contrutor
       this.salario=salario;
   }

   public Funcionario (String nome, String sobrenome){
       this.nome=nome;
       this.sobrenome=sobrenome;
   }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        if (salario<0)
                salario=0;
        else    
                this.salario=salario;
            
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float salAnual(){
        return salario*12;
    }
}
