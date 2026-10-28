package br.com.moraessite.maratonajava.javacore.Minterfaces.test;

import br.com.moraessite.maratonajava.javacore.Minterfaces.domain.DataLoader;
import br.com.moraessite.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import br.com.moraessite.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.chackPermission();
        databaseLoader.chackPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
