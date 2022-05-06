/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exgetset2tds;

/**
 *
 * @author aluno
 */
public class Professor {
    private int idade;
    private String nome;
    private String disciplina;
    
    
    //construtor
    public Professor() {
        this.idade = 0;
        this.nome = "";
        this.disciplina = "";
    }
        public Professor(int idade, String nome, String disciplina) 
        this.idade = idade;
        this.nome = nome;
        this.disciplina = disciplina;
    
    public int getIdade()
    {
    return idade;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade; 
    }
    
    public String getNome()
     {
        return nome;
     }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
           
    public String getDisciplina()
    {
        return disciplina;
    }
    
    public void setDisciplina(String disciplina)
    {
        this.disciplina = disciplina;
    }
}
