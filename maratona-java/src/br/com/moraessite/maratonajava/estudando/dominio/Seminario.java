package br.com.moraessite.maratonajava.estudando.dominio;

public class Seminario {
    private String titulo;
    private Local endereco;
    private Aluno[] aluno;

    public Seminario() {
    }

    public Seminario(String titulo, Local endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public Seminario (String titulo, Local endereco, Aluno[] aluno){
        this(titulo, endereco);
        this.aluno = aluno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getEndereco() {
        return endereco;
    }

    public void setEndereco(Local endereco){
        this.endereco = endereco;
    }

    public Aluno[] getAluno (){
        return aluno;
    }

    public void setAluno(Aluno[] aluno){
        this.aluno = aluno;
    }
}
