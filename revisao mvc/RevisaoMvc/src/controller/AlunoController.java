package controller;

import java.util.ArrayList;
import model.Aluno;

public class AlunoController {
    private ArrayList <Aluno> listaA;

    public AlunoController() {
        listaA = new ArrayList<>();
    }
    
    public void cadastraAluno(int ra, String nome){
        Aluno al = new Aluno (ra, nome);
        listaA.add(al);
    }
    
    public ArrayList<Aluno> buscaTodos(){
        return listaA;
    }
    
    
}
