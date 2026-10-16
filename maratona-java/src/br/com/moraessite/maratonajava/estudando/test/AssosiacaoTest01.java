package br.com.moraessite.maratonajava.estudando.test;

import br.com.moraessite.maratonajava.estudando.dominio.*;

public class AssosiacaoTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua dos Alfeneiros n°4");
        Aluno aluno1 = new Aluno("Pedro", 20);
        Aluno aluno2 = new Aluno("Gilberto", 30);
        Aluno aluno3 = new Aluno("Herique", 18);
        Professor professor1 = new Professor("Juberto", "Biologia");
        Seminario seminario1 = new Seminario("Biologia - Nível 1", local1);

        Aluno[] alunos = {aluno1,aluno2,aluno3};
        seminario1.setAluno(alunos);

        Seminario[] seminarios = {seminario1};
        professor1.setSeminario(seminarios);
        aluno1.setSeminario(seminario1);

        AssosiacaoRelatorioService.imprimeRelatorioProfessorSozinho(professor1);
        AssosiacaoRelatorioService.imprimeRelatorioProfessorIA(professor1);






    }
}
