package br.com.moraessite.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int qtdEpisodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int qtdEpisodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.qtdEpisodios = qtdEpisodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int qtdEpisodios, String genero, String estudio) {
        this(nome, tipo, qtdEpisodios, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.qtdEpisodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setQtdEpisodios (int qtdEpisodios) {
        this.qtdEpisodios = qtdEpisodios;
    }

    public int getQtdEpisodios (){
        return qtdEpisodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
