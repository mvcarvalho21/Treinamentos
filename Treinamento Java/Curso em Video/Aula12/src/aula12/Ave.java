package aula12;

public class Ave extends Animal {
    
    private String corPena;
    
    public void contruirNinho(){
        System.out.println("Construiu um ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
