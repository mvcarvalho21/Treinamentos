package aula12;

public class Canguru extends Mamifero{
    
    public void usarBolsa(){
        System.out.println("Usa bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
}
