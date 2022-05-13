
package atvempregado;

import java.util.ArrayList;


public class AtvEmpregado {

   
    public static void main(String[] args) {
       Assalariado a1 = new Assalariado();
       Assalariado a2 = new Assalariado();
       Comissionado c1 = new Comissionado();
       Comissionado c2 = new Comissionado();
       Horista h1 = new Horista();
       Horista h2 = new Horista();
       
       ArrayList <Empregado> empregados = new ArrayList();
       empregados.add(a1);
       empregados.add(a2);
       empregados.add(c1);
       empregados.add(c2);
       empregados.add(h1);
       empregados.add(h2);
    }
    
}
