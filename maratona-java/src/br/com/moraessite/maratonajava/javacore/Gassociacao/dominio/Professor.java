package br.com.moraessite.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;



    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome,especialidade);
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("--- Relatório ---");
        System.out.println("Professor: " + this.nome);
        if(this.seminarios == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) continue;
            System.out.println("## Alunos ##");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + "Idade: " + aluno.getNome());
            }

        }

    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
