package cursojava.javacore.Dconstrutores.teste;

import cursojava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", 25, "Ninja", "Ação");
        Anime anime2 = new Anime("Naruto", 40, "GENIN", "romance");
        anime.imprime();
        anime2.imprime();


    }
}
