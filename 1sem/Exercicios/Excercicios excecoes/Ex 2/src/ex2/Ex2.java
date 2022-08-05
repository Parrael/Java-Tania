package ex2;

public class Ex2 {

    public static void main(String[] args) {
        try{
          Quadrado q1 = new Quadrado(2);
            System.out.println(q1.calcularArea());
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }finally{
            System.out.println("Construção do quadrado concluida");
        }
        
        try{
          Retangulo r1 = new Retangulo(2,2);
          System.out.println(r1.calcularArea());

        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }finally{
            System.out.println("Construção do retagulo concluida");
        }
        
        try{
          Circulo c1 = new Circulo(-27);
          System.out.println(c1.calcularArea());
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }finally{
            System.out.println("Construção do circulo concluida");
        }
    }
    
}
