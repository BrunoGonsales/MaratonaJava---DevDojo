package br.com.moraessite.maratonajava.estudando.test;

import br.com.moraessite.maratonajava.estudando.dominio.Tabuada;

public class TabuadaTest01 {
    public static void main(String[] args) {
        Tabuada tabuada1 = new Tabuada(7);
        Tabuada tabuada2 = new Tabuada(3);

        tabuada1.imprimeTabuada();
        tabuada2.imprimeTabuada();
    }
}
