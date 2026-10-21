package br.com.moraessite.maratonajava.javacore.Kenum.test;

import br.com.moraessite.maratonajava.javacore.Kenum.dominio.Cliente;
import br.com.moraessite.maratonajava.javacore.Kenum.dominio.TipoCliente;
import br.com.moraessite.maratonajava.javacore.Kenum.dominio.TipoPagamento;

import static br.com.moraessite.maratonajava.javacore.Kenum.dominio.TipoPagamento.CREDITO;
import static br.com.moraessite.maratonajava.javacore.Kenum.dominio.TipoPagamento.DEBITO;
import static br.com.moraessite.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_FISICA;
import static br.com.moraessite.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_JURIDICA;

public class ClienteTest01 {
    public static void main(String[] args) {
        // Sem import
        Cliente cliente1 = new Cliente("Bruno", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Bruno", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        // Com import
        Cliente cliente3 = new Cliente("Bruno", PESSOA_FISICA, DEBITO);
        Cliente cliente4 = new Cliente("Bruno", PESSOA_JURIDICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println("Desconto: " + (int)TipoPagamento.DEBITO.calcularDesconto(100) + "%");

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
