package br.com.moraessite.maratonajava.javacore.Npolimorfismo.test;

import br.com.moraessite.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import br.com.moraessite.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
