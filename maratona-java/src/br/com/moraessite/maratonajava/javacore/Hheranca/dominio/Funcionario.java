package br.com.moraessite.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    // Não é ideal, mas da certo!
    public void relatorioPagamentoComThis(){
        System.out.println("Eu " + this.getNome() + " recebi o salario de R$" + this.salario);
    }

    // Agora sim, com as variaveis de Pessoa em PROTECTED é possível usa-las diretamente nessa classe
    public void relatorioPagamentoProtected(){
        System.out.println("Eu " + this.nome + " recebi o salario de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
