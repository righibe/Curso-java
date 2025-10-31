package cursojava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public int idade;
    public String nome;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.sexo);
        System.out.println(this.idade);
    }
}
