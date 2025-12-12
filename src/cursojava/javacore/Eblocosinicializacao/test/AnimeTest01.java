package cursojava.javacore.Eblocosinicializacao.test;

import cursojava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.print("\n");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " da ");
        }

    }
}
