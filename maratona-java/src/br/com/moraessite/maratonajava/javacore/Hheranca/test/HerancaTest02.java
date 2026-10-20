package br.com.moraessite.maratonajava.javacore.Hheranca.test;

import br.com.moraessite.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0 - Bloco de iniciaçização estático da super classe é executado quando a JVM carregar a classe pai
        // 0.1 - Blocos de inicialização estáticos, são executados somente 1 vez ao rodar a build, independente de quantos objetos forem declarados
        // 0.2 - Blocos de inicialização não estáticos são executados somente 1 vez porém a cada vez que o objeto for instânciado
        // 2 - Bloco de iniciaçização estático da sub classe é executado quando a JVM carregar a classe filha
        // 3 - Alocado espaço em memória para o objeto da classe superclasse
        // 4 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado da classe pai
        // 5 - Bloco de inicialização da superclasse é executado na ordem em que aparece
        // 6 - Construtor da superclasse é executado
        // 7 - Alocado espaço em memória para o objeto da classe subclasse
        // 8 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado da classe filha
        // 9 - Bloco de inicialização da subclasse é executado na ordem em que aparece
        // 10 - Construtor da subclasse é executado
        Funcionario funcionario = new Funcionario();

    }
}
