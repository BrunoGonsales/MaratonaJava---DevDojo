package br.com.moraessite.maratonajava.estudando.Basico.test;

import br.com.moraessite.maratonajava.estudando.Basico.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();

        anime1.init("Naruto", "show", 500);
        anime2.init("Sete Pecados Capitais", "TV", 200, "Ação");


        anime1.imprime();
        anime2.imprime();
    }

}
