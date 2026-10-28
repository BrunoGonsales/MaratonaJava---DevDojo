package br.com.moraessite.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DateRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void chackPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
