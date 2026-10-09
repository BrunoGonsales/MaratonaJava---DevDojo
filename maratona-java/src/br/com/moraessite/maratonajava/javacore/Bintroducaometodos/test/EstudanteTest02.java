package br.com.moraessite.maratonajava.javacore.Bintroducaometodos.test;

import br.com.moraessite.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import br.com.moraessite.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midroia";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();




    }
}
