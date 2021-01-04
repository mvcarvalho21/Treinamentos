package ultraemojicombat;
public class Lutador {
    
    //Atributos
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;
    
    //Métodos Especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int em, int de) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.empates = em;
        this.derrotas = de;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public final void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria() {
        if(this.getPeso()<52.5){
            this.categoria = "Inválido";
        } else if(this.getPeso()<=70.3){
            this.categoria = "Leve";
        } else if(this.getPeso()<=83.9){
            this.categoria = "Médio";
        } else if(this.getPeso()<=120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    //Métodos Públicos
    
    
    public void apresentar() {
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade()+ " anos e " + this.getAltura() + " m de altura,");
        System.out.println("Pesando " + this.getPeso() + "Kgs");
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Empatou " + this.getEmpates());
        System.out.println("E perdeu " + this.getDerrotas());
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes,");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes,");
        System.out.println("E empatou " + this.getEmpates() + " vezes.");
    }

    public void ganhar() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perder() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatar() {
        this.setEmpates(this.getEmpates() + 1);
    }    
}
