package br.com.moraessite.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salario;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario != null) {
            for (double salario : salario) {
                System.out.println("Salario: " + salario);
            }
        }

    }

    public void mediaSalario() {
        if (salario == null){
            return;
        }
        for(double salario: salario){
            media += salario;
        }
        media /= salario.length;
        System.out.println("Media salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
