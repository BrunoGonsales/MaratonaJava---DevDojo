package br.com.moraessite.maratonajava.estudando.Basico.test;

import br.com.moraessite.maratonajava.estudando.Basico.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        System.out.println("Geters'n Seters");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println("-------");
        System.out.println("Imprime");
        pessoa.imprime();


    }
}
