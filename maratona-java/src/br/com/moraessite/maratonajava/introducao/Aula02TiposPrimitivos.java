package br.com.moraessite.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        int idadeLong = (int) 10000000000L; // Força um Long ser um float, consequetimente ele quebra o número para caber no int
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        char caractere1 = 87; // ASCII TABLE
        char caractere2 = '\u0041'; // ASCII TABLE
        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(caractere2);
        System.out.println("Idade em Long = " + idadeLong);
        System.out.println("Oi meu nome é " + nome);
    }
}
