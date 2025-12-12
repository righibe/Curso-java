package cursojava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, int episodios, String tipo, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome, int episodios, String tipo, String genero, String estudio){
        this(nome, episodios, tipo, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
    }

}
