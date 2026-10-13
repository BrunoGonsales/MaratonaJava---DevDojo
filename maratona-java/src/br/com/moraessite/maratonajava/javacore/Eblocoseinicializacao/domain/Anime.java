package br.com.moraessite.maratonajava.javacore.Eblocoseinicializacao.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de iniciaçização é executado quando a JVM carregar a classe
    // 0.1 - Blocos de inicialização estáticos, são executados somente 1 vez ao rodar a build, independente de quantos objetos forem declarados
    // 0.2 - Blocos de inicialização não estáticos são executados somente 1 vez porém a cada vez que o objeto for instânciado
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for inicializado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização estático - 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático - 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático - 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático - 1");
    }

    public Anime() {
        for (int episodio: Anime.episodios){
            System.out.print(episodio + "|");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
