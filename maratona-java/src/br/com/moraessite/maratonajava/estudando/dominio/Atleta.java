package br.com.moraessite.maratonajava.estudando.dominio;

public class Atleta {
    private String nome;
    private String esporte;
    private String categoria;
    private int idade;


    public Atleta(String nome, String esporte,int idade) {
        this.nome = nome;
        this.esporte = esporte;
        this.idade = idade;
    }

    public void imprimeAtleta(){
        System.out.println("-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Esporte: " + this.esporte);
        System.out.println("Idade: " + this.idade);
    }

    public void imprimeCategoria(Atleta atleta){
        if (atleta.idade < 5 ){
            categoria = "Fora da faixa etária permitida";
            System.out.println("Categoria: " +  categoria);
        } else if (atleta.idade >= 5 && atleta.idade <= 7) {
            categoria = "Infantil";
            System.out.println("Categoria: " +  categoria);

        } else if (atleta.idade >= 8 && atleta.idade <= 15) {
            categoria = "Juvenil";
            System.out.println("Categoria: " +  categoria);

        } else if (atleta.idade >= 16 && atleta.idade <= 30) {
            categoria = "Adulto";
            System.out.println("Categoria: " +  categoria);

        } else {
            categoria = "Senior";
            System.out.println("Categoria: " +  categoria);
        }
    }
}
