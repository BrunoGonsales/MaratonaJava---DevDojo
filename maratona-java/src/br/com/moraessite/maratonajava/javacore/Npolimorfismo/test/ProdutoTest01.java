package br.com.moraessite.maratonajava.javacore.Npolimorfismo.test;

import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Sansung 50\" ", 5000);

        // Só é possível usar o metodo da classe "CalcularImposto" diretamente, sem instânciar, por conta do modificar "static" no proprio metodo
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------------");
        CalculadoraImposto.calcularImposto(tv);


    }
}
