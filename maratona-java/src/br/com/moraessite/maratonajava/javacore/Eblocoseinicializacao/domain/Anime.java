package br.com.moraessite.maratonajava.javacore.Eblocoseinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime() {
        System.out.println(episodios);
        for (int episodio: this.episodios){
            System.out.println(episodio + "|");
        }
    }
}
