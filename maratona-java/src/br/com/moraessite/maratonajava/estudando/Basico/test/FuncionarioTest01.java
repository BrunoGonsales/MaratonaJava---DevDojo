package br.com.moraessite.maratonajava.estudando.Basico.test;

import br.com.moraessite.maratonajava.estudando.Basico.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.nome = "Bruno";
        funcionario1.idade = 24;

        funcionario2.nome = "Giovanna";
        funcionario2.idade = 25;
        funcionario2.salario = new double []{1000, 4000, 6000};

        funcionario1.relatorio();
        funcionario1.mediaSalarial();
        funcionario2.relatorio();
        funcionario2.mediaSalarial();



    }
}
