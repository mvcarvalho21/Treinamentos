package garrafa;

public class ProjetoGarrafa {

    public static void main(String[] args) {
        Garrafa G1 = new Garrafa();
        G1.cor = "Azul";
        G1.tamanho = 1.5f;
        G1.destampar();
        G1.esvaziar();
        
        
        Garrafa G2 = new Garrafa();
        G2.cor = "Azul";
        G2.tamanho = 1.5f;
        G2.destampar();
        G2.encher();
        
        
    }
    
}
