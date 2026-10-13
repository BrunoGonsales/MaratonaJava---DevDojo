package br.com.moraessite.maratonajava.javacore.Gassociacao.test;

import br.com.moraessite.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Romario");
        Jogador j3 = new Jogador("Cafu");

        // Formas de declarar o array de jogadores
        Jogador [] jogadores1 = new Jogador[3];
        Jogador [] jogadores2 = new Jogador[]{j1,j2,j3};
        Jogador [] jogadores3 = {j1,j2,j3};

        for (Jogador jogador : jogadores3) {
            jogador.imprime();
        }

    }
}
