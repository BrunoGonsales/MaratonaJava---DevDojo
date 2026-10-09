package br.com.moraessite.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int qtdEpisodios;
    private String genero;

    public void init (String nome, String tipo, int qtdEpisodios){
        this.nome = nome;
        this.tipo = tipo;
        this.qtdEpisodios = qtdEpisodios;
    }

    public void init(String nome, String tipo, int qtdEpisodios, String genero){
        this.init(nome,tipo, qtdEpisodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.qtdEpisodios);
        System.out.println(this.genero);
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
