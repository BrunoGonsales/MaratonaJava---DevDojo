package br.com.moraessite.maratonajava.javacore.Csobrecargametodos.test;

import br.com.moraessite.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudame Drive", "TV", 12);
        anime.init("Akudame Drive", "TV", 12, "Ação");



        anime.imprime();
    }
}
