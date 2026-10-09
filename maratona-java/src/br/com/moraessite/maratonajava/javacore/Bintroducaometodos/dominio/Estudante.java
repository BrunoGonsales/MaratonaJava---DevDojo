package br.com.moraessite.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public int idade;
    public char sexo;
    public String nome;

    public void imprime(){
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }


}
