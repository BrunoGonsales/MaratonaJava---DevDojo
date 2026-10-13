package br.com.moraessite.maratonajava.javacore.Gassociacao.test;

import br.com.moraessite.maratonajava.javacore.Gassociacao.dominio.Jogador;
import br.com.moraessite.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador []jogadores =  {jogador, jogador2};
        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador1 ---");
        jogador.imprime();
        System.out.println("--- Jogador2 ---");
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
