package br.com.moraessite.maratonajava.introducao;

public class Aula07ArraysPt02 {
    public static void main(String[] args) {
        // Inicialização padrão dos objetos, tipos primitivos não ssão inicializados automaticamente
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ' '
        // boobean = false
        // String = null

        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurisaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0;i < nomes.length;i ++){
            System.out.println(nomes[i]);
        }

    }
}
