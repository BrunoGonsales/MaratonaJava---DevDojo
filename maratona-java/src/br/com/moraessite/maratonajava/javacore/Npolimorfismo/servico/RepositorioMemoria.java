package br.com.moraessite.maratonajava.javacore.Npolimorfismo.servico;

import br.com.moraessite.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
