package exethrow;

public class ExeThrow {

    
    public static void main(String[] args) {
        Aluno a1 = new Aluno(-2154, "CLAUDIO");
        try{
            a1.setNome("");     //colocando String vazia para dar erro 
        } catch (StringVaziaException a){
            
            System.out.println(a.getMessage());
        } catch (RuntimeException a){
            System.out.println(a.getMessage());
        }
            //System.out.println(" ====" + a1.getNome());
        
            
        try{
        a1.setRa(-32);          //declarando RA como negativo para dar erro
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } 
            //System.out.println(a1.getRa());
        System.out.println("Término do Programa");
    }
    
}
