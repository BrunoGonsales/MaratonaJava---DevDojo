package br.com.moraessite.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;
    private String categoria;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public Anime() {
    }

    public Anime(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
