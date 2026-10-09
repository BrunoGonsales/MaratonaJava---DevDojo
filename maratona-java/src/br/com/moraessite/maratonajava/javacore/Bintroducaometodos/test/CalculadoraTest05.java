package br.com.moraessite.maratonajava.javacore.Bintroducaometodos.test;

import br.com.moraessite.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        // Podemos declarar um array diretamente no parâmetro
        calculadora.somaArray(new int []{1,2,3,4,5});


        // VarArgs, pode passar números diretamente que o java irá transformar os números em um array
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
