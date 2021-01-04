package aula04;

public class Aula04 {
   
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.4f, true, "Amarelo");
        c1.status();
        
        Caneta c2 = new Caneta("BIC", 0.4f, false, "Azul");
        c2.status();
    }
    
}
