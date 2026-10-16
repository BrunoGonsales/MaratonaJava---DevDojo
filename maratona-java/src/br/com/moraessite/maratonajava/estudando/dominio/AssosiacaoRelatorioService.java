package br.com.moraessite.maratonajava.estudando.dominio;

import java.sql.SQLOutput;

public class AssosiacaoRelatorioService {
    public static void imprimeRelatorioProfessorSozinho(Professor professor){
        System.out.println("--- Relatório Professor ---");
        System.out.println("Prof: " + professor.getNome() + " - " + professor.getEspecialidade());
        if (professor.getSeminarios() != null) {
            System.out.println("--- Seminários ---");
            for(Seminario seminario : professor.getSeminarios()){
                System.out.println("Sem: " + seminario.getTitulo() + " - " + seminario.getEndereco().getEndereco());
                if(seminario.getAluno() != null){
                    for(Aluno aluno : seminario.getAluno()){
                        System.out.println("Aluno: " + aluno.getNome() + " - Idade: " + aluno.getIdade());
                    }
                }
            }
        }
    }

    public static void imprimeRelatorioProfessorIA(Professor professor){
        System.out.println("==================================");
        System.out.println("         RELATÓRIO PROFESSOR      ");
        System.out.println("==================================");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Especialidade: " + professor.getEspecialidade());

        if(professor.getSeminarios() == null || professor.getSeminarios().length == 0){
            System.out.println("Nenhum seminário cadastrado para este professor");
            return;
        }

        System.out.println("\n--- Seminários Ministrados ---");
        for(Seminario seminario : professor.getSeminarios()){
            System.out.println("    > Título: " + seminario.getTitulo());
            System.out.println("      Local: " + seminario.getEndereco().getEndereco());

            if(seminario.getAluno() != null && seminario.getAluno().length > 0) {
                System.out.println("    Alunos Inscritos:");
                for (Aluno alunos : seminario.getAluno()){
                    System.out.println("    - " + alunos.getNome() + " (" + alunos.getIdade()+ " anos)");
                }
            } else {
                System.out.println("    Alunos inscritos: Nenhum");
            }
            System.out.println("------------------------------------------------");
        }
    }


}
