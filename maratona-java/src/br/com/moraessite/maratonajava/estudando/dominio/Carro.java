package br.com.moraessite.maratonajava.estudando.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite;

    static {
        System.out.println("Dentro do bloco de inicialização estático");
        velocidadeLimite = 180;
        System.out.println("Velociadade Limite: " + velocidadeLimite);
    }

    {
        System.out.println("---------------");
        System.out.println("Dentro do bloco de inicialização não estático");
        nome = "Carro";
        velocidadeMaxima = 300;
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(this.velocidadeLimite);

    }

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimeVelocidadeLimiteAtualizado(){
        System.out.println(this.nome + " - " + "VL: " + Carro.getVelocidadeLimite());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
