package br.com.moraessite.maratonajava.introducao;

public class Aula05EstruturasCondicionaisPt04Ex {
    public static void main(String[] args) {
        Double salarioAnul = 0.00;
        Double taxa1 = 0.097;
        Double taxa2 = 0.3737;
        Double taxa3 = 0.4950;
        Double resultado;
        String mensagem;

        salarioAnul = 32000.00;

        if (salarioAnul<=34712) {
            resultado = salarioAnul * taxa1;
            mensagem = "Seu salario se encontra na Taxa 1, sendo nessesário pagar = R$" + resultado ;
        } else if (salarioAnul>=34713 && salarioAnul<=68507) {
            resultado = salarioAnul * taxa2;
            mensagem = "Seu salario se encontra na Taxa 2, sendo nessesário pagar = R$" + resultado ;
        } else {
            resultado = salarioAnul * taxa3;
            mensagem = "Seu salario se encontra na Taxa 3, sendo nessesário pagar = R$" + resultado ;
        }
        System.out.println(mensagem);


        // Em operador ternário

    }
}
