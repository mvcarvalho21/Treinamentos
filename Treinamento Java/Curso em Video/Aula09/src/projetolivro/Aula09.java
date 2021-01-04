package projetolivro;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 17, "Masculino");
        p[1] = new Pessoa("Maria", 20, "Feminino");
        
        l[0] = new Livro("It", "Stephen King", 300, p[0]);
        l[1] = new Livro("Aprendendo Java", "José da Silva", 150, p[1]);
        l[2] = new Livro("Teste de inerência", "Lucas da Silva", 50, p[1]);
        
        l[0].abrir();
        p[0].fazerAniver();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
    }
    
}
