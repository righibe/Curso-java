package cursojava.javacore.Dconstrutores.teste;

import cursojava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("NARUTO", 30, "NINJA");
        anime.init("NARUTO", 30, "NINJA", "AÇÃO");
        anime.imprime();


    }
}
