package aula11;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada do aluno " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista. Pagamento facilitado.");
    }
    
}
