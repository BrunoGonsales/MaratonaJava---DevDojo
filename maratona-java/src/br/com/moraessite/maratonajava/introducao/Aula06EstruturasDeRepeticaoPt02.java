package br.com.moraessite.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoPt02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1.000.000
        for (int i = 0;i <= 1000000;i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }

        }

    }
}
