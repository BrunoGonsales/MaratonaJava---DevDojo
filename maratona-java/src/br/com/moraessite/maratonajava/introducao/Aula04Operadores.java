package br.com.moraessite.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +, -, /, *
        int numero01 = 10;
        int numero02 = 20;
        double numero03 = 30;
        double numero04 = 40;
        int soma = numero01 + numero02;
        int subtracao = numero01 - numero02;
        double multiplicacao = numero04 * numero03;
        double divisao = numero04 / numero03;

        // Soma
        System.out.println(numero02 + numero01);

        // Concatenação
        System.out.println("Valor " + numero02 + numero01);

        // Soma das variáveis + concatenação
        System.out.println(numero02 + numero01 + "Valor " + numero02 + numero01);

        // Outros operadores aritiméticos
        System.out.println("Subtração: " + subtracao + " / " + "Multiplicação: " + multiplicacao + " / " + "Divisão: " + divisao);

        // Resto %
        int resto = 20 % 2;
        int resto2 = 15 % 7;
        System.out.println(resto);
        System.out.println(resto2);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10.0;
        boolean isDezDiferenteQueDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte: " + isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez: " + isDezIgualQueDez);
        System.out.println("isDezDiferenteQueDez: " + isDezDiferenteQueDez);

        // && (AND) , || (OR) , !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;

        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        //bonus = bonus + 1000; é igual a operção abaixo
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println("bonus: " + bonus);

        //
        int contador = 0;
        contador += 1; //contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println("contador: " + contador);
        // Se colocar o ++ depois de contador, ele primeiro imprime o contador2 (0) e depois adiciona +1
        System.out.println("contador2, 1° = " + contador2++);
        // Nessa segunda linha o +1 foi incrementado e agora é 2
        System.out.println("contador2, 2° = " + contador2);
        // Para incrementar antes de imprimir é necessario adicionar o ++ antes da variavel
        System.out.println(("contador2, 3° = " + ++contador2));

    }

}
