
package exeinterface;


public class ExeInterface {

    public static void main(String[] args) {
        Quadrado q = new Quadrado(2);
        //q.setLado(2);
        System.out.println(q.calcArea());
        q.mostrar();
        
        IForma intF = new Quadrado(2);
        //intF.setLado(); não funciona pois apenas a classe filha tem gets e sets
        System.out.println(intF.calcPerimetro());
    }
    
}
