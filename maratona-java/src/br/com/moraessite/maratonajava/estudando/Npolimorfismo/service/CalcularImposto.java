package br.com.moraessite.maratonajava.estudando.Npolimorfismo.service;

import br.com.moraessite.maratonajava.estudando.Npolimorfismo.dominio.Computador;
import br.com.moraessite.maratonajava.estudando.Npolimorfismo.dominio.Tomate;

public class CalcularImposto {
    public static void calcularImpostoComputador(Computador computador){
        double imposto = computador.calcularImposto();
        double valorFinal = imposto + computador.getValor();
        System.out.println("**Calculando Imposto do Computador**");
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor Bruto: R$" + computador.getValor());
        System.out.println("Valor Imposto: R$" + imposto);
        System.out.println("Valor Final: R$" + valorFinal);
        System.out.println("----------------------------------------------");
    }

    public static void calcularImpostoTomate(Tomate tomate){
        double imposto = tomate.calcularImposto();
        double valorFinal = imposto + tomate.getValor();
        System.out.println("**Calculando Imposto do Tomate**");
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor Bruto: R$" + tomate.getValor());
        System.out.println("Valor Imposto: R$" + imposto);
        System.out.println("Valor Final: R$" + valorFinal);
        System.out.println("----------------------------------------------");
    }

}
