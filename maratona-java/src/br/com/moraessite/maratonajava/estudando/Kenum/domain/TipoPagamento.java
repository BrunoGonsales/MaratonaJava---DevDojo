package br.com.moraessite.maratonajava.estudando.Kenum.domain;

public enum TipoPagamento {
    CREDITO("Crédito") {
        @Override
        public double calcularDesconto(double valor) {
            return this.valor = valor * 0.05;
        }
    },
    DEBITO("Débito") {
        @Override
        public double calcularDesconto(double valor) {
            return this.valor = valor * 0.1;
        }
    };

    public final String nome;
    public double valor;

    TipoPagamento(String nome) {
        this.nome = nome;
    }

    public abstract double calcularDesconto(double valor);

}
