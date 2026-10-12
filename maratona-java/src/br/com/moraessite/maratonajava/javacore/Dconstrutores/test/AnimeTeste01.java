package br.com.moraessite.maratonajava.javacore.Dconstrutores.test;

import br.com.moraessite.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 500, "Ação", "Studio Pierrot");

        anime.imprime();
    }
}
