package br.com.moraessite.maratonajava.javacore.Gassociacao.test;

import br.com.moraessite.maratonajava.javacore.Gassociacao.dominio.Aluno;
import br.com.moraessite.maratonajava.javacore.Gassociacao.dominio.Local;
import br.com.moraessite.maratonajava.javacore.Gassociacao.dominio.Professor;
import br.com.moraessite.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece",local,alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }
}
