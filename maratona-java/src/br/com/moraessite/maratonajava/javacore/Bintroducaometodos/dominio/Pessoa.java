package br.com.moraessite.maratonajava.javacore.Bintroducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Pessoa {
    private String nome;
    private int idade;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    // Este metodo age exatamente como o de cima, somente explicando a ausência do "this" quando o nome da variavel é diferente
    public void setNome1 (String x){
        nome = x;
    }

    public void setIdade (int idade) {
        if(idade < 0 ){
            System.out.println("Idade invalida");
        } else {
            this.idade = idade;
        }

    }

    public String getNome () {
        return this.nome;
    }
    public int getIdade (){
        return this.idade;
    }
}
