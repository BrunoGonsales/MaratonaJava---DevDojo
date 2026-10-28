package br.com.moraessite.maratonajava.estudando.Npolimorfismo.test;

import br.com.moraessite.maratonajava.estudando.Npolimorfismo.dominio.Computador;
import br.com.moraessite.maratonajava.estudando.Npolimorfismo.dominio.Tomate;
import br.com.moraessite.maratonajava.estudando.Npolimorfismo.service.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Acer", 5000);
        Tomate tomate = new Tomate("Italiano", 10);

        CalcularImposto.calcularImpostoComputador(computador);
        CalcularImposto.calcularImpostoTomate(tomate);
    }
}
