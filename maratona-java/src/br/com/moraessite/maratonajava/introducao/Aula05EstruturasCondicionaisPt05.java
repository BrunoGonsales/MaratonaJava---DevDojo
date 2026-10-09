package br.com.moraessite.maratonajava.introducao;

public class Aula05EstruturasCondicionaisPt05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        // char, int, byte, short, enum, String
        switch (dia) {
            default:
                System.out.println("Opção Inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;


        }
    }
}
