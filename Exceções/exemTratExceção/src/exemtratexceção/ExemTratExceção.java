package exemtratexceção;

public class ExemTratExceção {
    
    public static void aumentarLetra(){
        String teste = "Tania karateka";
        try{
            System.out.println(teste.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("Desculpe! String não pode ser nula.");
        }finally{
            System.out.println("Passei por aqui!"); 
        }
    }

    public static void main(String[] args) {
        aumentarLetra();
    }
    
}
