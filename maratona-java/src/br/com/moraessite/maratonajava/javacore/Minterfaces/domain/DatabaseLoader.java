package br.com.moraessite.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DateRemover{

    // private -> default -> protected -> public

    @Override
    public void load() {
        System.out.println("Carregando dados do bando de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do bando de dados");
    }

    @Override
    public void chackPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na calsse DatabaseLoader");
    }
}
