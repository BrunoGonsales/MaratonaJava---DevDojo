package br.com.moraessite.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
        DEBITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

        // Transformamos o metodo em "abstract" para dizer que ele vai ser sobrescrevido em outro local sendo isso obrigatório
        public abstract double calcularDesconto(double valor);
    }