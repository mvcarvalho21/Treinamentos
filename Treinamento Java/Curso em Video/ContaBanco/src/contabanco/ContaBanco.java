package contabanco;

public class ContaBanco {

    public static void main(String[] args) {
        Conta p1 = new Conta(1111, "", "Jubileu", 0, false);
        p1.estadoAtual();
        p1.abrirConta("CP");
        p1.depositar(70f);
        p1.fecharConta();
        p1.sacar(220f);
        p1.sacar(20f);
        p1.fecharConta();
        p1.estadoAtual();
        p1.abrirConta("CC");
        p1.pagarMensal();
        p1.estadoAtual();
        
        
        
        Conta p2 = new Conta(2222, "", "Creuza", 0, false);
        p2.estadoAtual();
        p2.abrirConta("CC");
    }
    
}
