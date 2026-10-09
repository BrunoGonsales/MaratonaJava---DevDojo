package br.com.moraessite.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando  no endereço <endereço>,
condirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Bruno";
        String endereco = "Rua Ariovaldo Pinto";
        double  salario = 4500.54;
        String dataRecebimentoSalario = "20/08/2026";
        String relatorio = "Eu " + nome + ", morando no endereço: " + endereco + ", confirmo que recebi o salário de R$" + salario + ", nada data " + dataRecebimentoSalario;


        System.out.println(relatorio);
    }

}
