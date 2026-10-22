package br.com.moraessite.maratonajava.estudando.Basico.test;

import br.com.moraessite.maratonajava.estudando.Basico.dominio.Jogador;
import br.com.moraessite.maratonajava.estudando.Basico.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");
        System.out.println("Antes de definir um time");
        jogador.imprime();
        System.out.println("Depois de definir um time");
        jogador.setTime(time);
        jogador.imprime();
    }
}
