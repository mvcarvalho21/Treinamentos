package ultraemojicombat;

import java.util.Random;

public class Luta {
    
    //Atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Públicos
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0,1,2
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatar();
                    this.desafiante.empatar();
                    break;
                case 1: // Desafiado vence
                    System.out.println("Venceu " + this.desafiado.getNome());
                    this.desafiado.ganhar();
                    this.desafiante.perder();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Venceu " + this.desafiante.getNome());
                    this.desafiado.perder();
                    this.desafiante.ganhar();                    
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
