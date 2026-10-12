package br.com.moraessite.maratonajava.estudando.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int qtdEpisodios;
    private String genero;


    public Anime(){

    }

    public void imprime(){
        if(genero != null){
            System.out.println("Nome: " + this.nome);
            System.out.println("Tipo: " +  this.tipo);
            System.out.println("Qtd. Episódios: " + this.qtdEpisodios);
            System.out.println("Gênero: " + this.genero);
        }else {
            System.out.println("Nome: " + this.nome);
            System.out.println("Tipo: " +  this.tipo);
            System.out.println("Qtd. Episódios: " + this.qtdEpisodios);
        }
        System.out.println("--------------");



    }

    public void init(String nome, String tipo, int qtdEpisodios){
        this.nome = nome;
        this.tipo = tipo;
        this.qtdEpisodios = qtdEpisodios;
    }

    public void init(String nome, String tipo, int qtdEpisodios, String genero){
        this.init(nome, tipo, qtdEpisodios);
        this.genero = genero;
    }



    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo (){
        return tipo;
    }

    public void setQtdEpisodios(int qtdEpisodios){
        this.qtdEpisodios = qtdEpisodios;
    }

    public int getQtdEpisodios (){
        return qtdEpisodios;
    }


}
