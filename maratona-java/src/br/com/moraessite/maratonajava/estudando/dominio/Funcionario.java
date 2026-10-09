package br.com.moraessite.maratonajava.estudando.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario;

    public void relatorio () {
        System.out.println("--------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario != null){
            for(double salario : salario) {
                System.out.println(salario);
            }
        }
    }

    public void mediaSalarial () {
        if (salario != null) {
            double media = 0.0;
            for (double num : salario) {
                media += num;
            }
            media = media / salario.length;
            System.out.println("Média Salarial: R$" + media );
        }

    }
}
