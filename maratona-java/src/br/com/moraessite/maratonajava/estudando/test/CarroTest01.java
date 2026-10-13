package br.com.moraessite.maratonajava.estudando.test;

import br.com.moraessite.maratonajava.estudando.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Civic", 160);
        Carro c2 = new Carro("Audi", 260);
        Carro c3 = new Carro("Corvette", 290);

        Carro.setVelocidadeLimite(210);

        c1.imprimeVelocidadeLimiteAtualizado();
        c2.imprimeVelocidadeLimiteAtualizado();
        c3.imprimeVelocidadeLimiteAtualizado();
    }
}
