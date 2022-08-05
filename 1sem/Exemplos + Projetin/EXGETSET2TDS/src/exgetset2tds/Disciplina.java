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
public class Disciplina {
     
    private int codigo;
    private String descricao;
    private int cargahoraria;
    
    //construtor
    public Disciplina(int codigo, String descricao, int cargahoraria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargahoraria = cargahoraria;
    }
    
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    
    
}
