package br.com.moraessite.maratonajava.estudando.Kenum.test;

import br.com.moraessite.maratonajava.estudando.Kenum.domain.Cliente;
import br.com.moraessite.maratonajava.estudando.Kenum.domain.TipoCliente;
import br.com.moraessite.maratonajava.estudando.Kenum.domain.TipoPagamento;

import static br.com.moraessite.maratonajava.estudando.Kenum.domain.TipoCliente.PESSOA_FISICA;
import static br.com.moraessite.maratonajava.estudando.Kenum.domain.TipoCliente.PESSOA_JURIDICA;
import static br.com.moraessite.maratonajava.estudando.Kenum.domain.TipoPagamento.CREDITO;
import static br.com.moraessite.maratonajava.estudando.Kenum.domain.TipoPagamento.DEBITO;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Bruno", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Ricardo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Josoé", PESSOA_FISICA, CREDITO);
        Cliente cliente4 = new Cliente("Vanderson", PESSOA_JURIDICA, DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println("Desconto: " + (int)cliente1.getTipoPagamento().calcularDesconto(100) + "%");
        System.out.println("Desconto: " + (int)cliente2.getTipoPagamento().calcularDesconto(100) + "%");

        TipoCliente tipoCliente = TipoCliente.valueOf("Pessoa Física");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);


    }
}
