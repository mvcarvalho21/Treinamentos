package garrafa;

public class Garrafa {
    boolean cheia;
    boolean tampada;
    String cor;
    float tamanho;
    
    void encher(){
        cheia = true;
        if(tampada == true){
            System.out.println("Impossível encher!");
        } else {
            System.out.println("Agora a garrada está cheia.");
        }
    }
    
    void esvaziar(){
        cheia = false;
        if(tampada == true){
            System.out.println("Impossível esvaziar!");
        } else {
            System.out.println("Agora a garrada está vazia.");
        }
    }
    
    void tampar(){
        tampada = true;
        System.out.println("Garrafa fechada.");
    }
    
    void destampar(){
        tampada = false;
        System.out.println("Garrafa aberta.");
    }
}
