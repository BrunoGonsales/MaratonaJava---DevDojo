package br.com.moraessite.maratonajava.javacore.Npolimorfismo.servico;

import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de válidade: " + tomate.getDataValidade());
            //Outra forma
            String dataValidade  = ((Tomate) produto).getDataValidade();
            System.out.println("Data de válidade: " + dataValidade);
        }
        System.out.println("-----------------------");
    }
}
