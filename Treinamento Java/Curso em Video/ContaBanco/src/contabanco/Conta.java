package contabanco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public void estadoAtual(){
        System.out.println("------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(getTipo())){
            this.setSaldo(50.00f);
            System.out.println("Conta Corrente aberta com sucesso!");
            System.out.println("Seu saldo atual é de " + this.getSaldo());
        } else if("CP".equals(getTipo())){
            this.setSaldo(150.00f);
            System.out.println("Conta Poupança aberta com sucesso!");
            System.out.println("Seu saldo atual é de " + this.getSaldo());
        } else {
            System.out.println("Impossível abrir conta");
        }
    }
    
    public void fecharConta(){
        if(this.isStatus() == true){
            if(this.getSaldo() == 0){
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            } else if(this.getSaldo() > 0){
                System.out.println("Saldo positivo. Impossível fechar.");
            } else if(this.getSaldo() < 0){
                System.out.println("Saldo negativo. Impossível fechar.");
            }
        } else {
            System.out.println("A conta já está fechada.");
        }
    }
    
    public void depositar(float valor){
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito de " + valor + " realizado com sucesso!");
            System.out.println("Seu saldo atual é de " + this.getSaldo());
        } else {
            System.out.println("Impossível depositar nessa conta.");
        } 
    }
    
    public void sacar(float valor){
        if(this.isStatus() == true){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque de " + valor + " realizado com sucesso!");
            System.out.println("Seu saldo atual é de " + this.getSaldo());
            } else if(this.getSaldo() < valor){
                System.out.println("Não é possível sacar esse valor dessa conta.");
            }
        } else {
            System.out.println("Essa conta não está aberta.");
        }
    }
    
    public void pagarMensal(){
        float valor;
        if(this.isStatus() == true){
            if("CC".equals(this.getTipo())){
                valor = 12f;
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade de " + valor + " paga com sucesso.");
                System.out.println("Seu saldo atual é de " + this.getSaldo());
            } else if("CP".equals(getTipo())){
                valor = 20f;
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade de " + valor + " paga com sucesso.");
                System.out.println("Seu saldo atual é de " + this.getSaldo());
            } else {
                System.out.println("Conta não definida");
            }
        } else {
            System.out.println("Conta fechada.");
        }
    }
}
