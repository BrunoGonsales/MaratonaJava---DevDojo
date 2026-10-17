package br.com.moraessite.maratonajava.javacore.Hheranca.test;

import br.com.moraessite.maratonajava.javacore.Hheranca.dominio.Endereco;
import br.com.moraessite.maratonajava.javacore.Hheranca.dominio.Funcionario;
import br.com.moraessite.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HernacaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("012345209");
        endereco.setRua("Rua 3");

        Pessoa pessoa= new Pessoa();
        pessoa.setNome("Bruno");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("0120304-102");

        pessoa.imprime();
        System.out.println("------------------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Giovanna");
        funcionario.setCpf("219i395823");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
