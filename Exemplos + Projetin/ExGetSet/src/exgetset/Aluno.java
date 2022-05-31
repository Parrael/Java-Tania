/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExGetSet;

/**
 *
 * @author aluno
 */
public class Aluno {
    private String nome;
    private int idade;
    private int ra;
    
     public String getNome (){  
         return nome; //get sempre retorna
     }
     
     public void setNome(String nome){
         this.nome = nome;
     }
     
     public int getIdade (){
         if (idade<0){
             System.out.println("Erro, idade iinválida.");
         }
         return idade;
     }
     
     public void setIdade(int idade){
         this.idade = idade;
     }
     
     public int getRa (){
         return ra;
     }
     
     public void setRa (int ra){
         this.ra = ra;
     }
}
