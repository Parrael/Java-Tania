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
public class Aluno {
 private int ra;
 private String nome;
 private double altura;
 
 //construtor 
 public Aluno(int ra , String nome, double altura)
 {
     this.ra = ra;
     this.nome = nome;
     if (altura<0)
         altura = 0;
     else
         this.altura = altura;
 }
 
 public Aluno()
 {
    ra = 0;
    nome = "";
    altura = 0;
 }
 
 
 public int getRA()   
 {
 return ra;
}

 public void setRA(int ra)
 {
     if (ra<0)
        System.out.println("Erro");
     else
        this.ra = 0;
 }
         
public String getNome()
{
  return nome;
}

public void setNome(String nome)
{
    this.nome = nome;
}

public double getAltura()
{
    return altura;
}

public void setAltura(double altura)
{
    this.altura = altura;
}


}
