package br.com.moraessite.maratonajava.estudando.Npolimorfismo.dominio;

public class Computador extends Produto{
    private static double TAXA_IMPOSTO = 0.18;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto(){
        return this.valor * TAXA_IMPOSTO;
    }
}
