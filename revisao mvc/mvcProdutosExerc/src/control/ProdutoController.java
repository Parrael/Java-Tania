
package control;

import java.util.ArrayList;
import model.Produto;

public class ProdutoController {
    protected ArrayList<Produto> listaP;
    
    public ProdutoController(){
        listaP = new ArrayList<>();
    }
    
    public void cadastrar(String codigo, String descricao, double preco){
        Produto P1 = new Produto(codigo, descricao, preco);
        listaP.add(P1);
    }
    
    public Produto busca(String codigo){
        for(Produto p: listaP){
            if(p.getCodigo().equals(codigo)){
                return p;
            }
            
        }
        return null;
    }
    
    public ArrayList mostraTodos(){
        return listaP;
    }
    
    public void excluir (String codigo){
    for(Produto a: listaP){
        if(a.getCodigo().equals(codigo)){
            listaP.remove(a);
            break;
        }
    }
}
}
