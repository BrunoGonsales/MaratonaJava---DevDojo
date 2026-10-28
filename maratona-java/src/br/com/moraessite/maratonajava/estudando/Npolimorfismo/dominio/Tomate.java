package br.com.moraessite.maratonajava.estudando.Npolimorfismo.dominio;

public class Tomate extends Produto{
    private static double TAXA_IMPOSTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto(){
        return this.valor * TAXA_IMPOSTO;
    }
}
