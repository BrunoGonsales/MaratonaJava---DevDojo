package br.com.moraessite.maratonajava.javacore.Jmodificadorfinal.test;

import br.com.moraessite.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import br.com.moraessite.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import br.com.moraessite.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);

        Comprador comprador2 = new Comprador();
        //Acontece erro, pois tentamos atribuir um novo comprador para o carro
        //carro.COMPRADOR = comprador2;
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.imprime();

    }
}
