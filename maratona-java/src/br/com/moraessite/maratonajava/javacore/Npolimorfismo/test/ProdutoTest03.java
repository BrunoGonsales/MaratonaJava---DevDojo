package br.com.moraessite.maratonajava.javacore.Npolimorfismo.test;

import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzer 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2026");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
