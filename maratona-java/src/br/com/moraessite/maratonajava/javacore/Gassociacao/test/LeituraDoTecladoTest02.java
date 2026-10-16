package br.com.moraessite.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua perguntae eu responderei sim ou não");
        String pergunta1 = input.nextLine();
        if(pergunta1.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÂO");
        }

    }
}
