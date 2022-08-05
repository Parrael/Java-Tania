package controller;

import java.util.ArrayList;
import model.Aluno;

public class AlunoController {
     
    private ArrayList<Aluno> lista;
    
    public AlunoController(){
        lista = new ArrayList();
    }
    
    public void mostrar(){
        for(Aluno a: lista){
            System.out.println(a.getNome() + " " + a.getIdade() + "\n");
        }
    }
    
    public void cadastrar(String nome, int idade){    
        Aluno al = new Aluno(nome, idade);
        lista.add(al);
        mostrar();
    }
}
