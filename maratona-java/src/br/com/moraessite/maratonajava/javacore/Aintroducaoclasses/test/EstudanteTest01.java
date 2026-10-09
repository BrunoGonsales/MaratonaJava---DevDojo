package br.com.moraessite.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.moraessite.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Luffy";
        estudante.idade = 12;
        estudante.sexo = 'M' ;

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante); // estudando é uma variavel de referência, por isso imprime o local em memória
    }
}
