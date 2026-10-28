package br.com.moraessite.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void chackPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
