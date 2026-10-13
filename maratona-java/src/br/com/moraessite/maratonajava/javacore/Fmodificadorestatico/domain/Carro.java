package br.com.moraessite.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    // Aqui usamos uma variavel static, para definir que todas as instâncias (carro 1, carro 2...) tenham ou futuramente sejam alterados, uma velocidade definida somente uma única vez.
    private String nome;
    private double velociadeMaxima;
    private static double velocidaeLimite = 250;

    public Carro(String nome, double velociadeMaxima) {
        this.nome = nome;
        this.velociadeMaxima = velociadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velociadde Maxima: " + this.velociadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidaeLimite);
    }

    public static void setVelocidaeLimite(double velocidadeLimite) {
        Carro.velocidaeLimite = velocidadeLimite;
    }

    public static double getVelocidaeLimite(){
        return Carro.velocidaeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelociadeMaxima() {
        return velociadeMaxima;
    }

    public void setVelociadeMaxima(double velociadeMaxima) {
        this.velociadeMaxima = velociadeMaxima;
    }

}
