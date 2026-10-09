package br.com.moraessite.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimeEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("---------------");
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
