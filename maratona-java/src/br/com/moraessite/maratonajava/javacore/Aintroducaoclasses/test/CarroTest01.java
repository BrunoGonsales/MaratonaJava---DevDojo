package br.com.moraessite.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.moraessite.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome= "Fusca Bala";
        carro1.ano= 1969;
        carro1.modelo="Sport";

        carro2.nome= "Civic";
        carro2.ano= 2006;
        carro2.modelo="EX";

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("----------");

        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("----------");

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("----------");

        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("----------");
    }


}
