package br.com.moraessite.maratonajava.introducao;

public class Aula05EstruturasCondicionaisPt03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNãoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;
        //(condicao) ? verdadeiro : falso
        String resultadoTernário = salario > 5000 ? mensagemDoar : mensagemNãoDoar;

        //Método 1 para sabe se irá doar ou não
        if (salario > 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNãoDoar;
        }
        System.out.println("Resultado If, else: " + resultado);

        //Método com operador ternátio
        System.out.println("Resultado Operador Ternátio: " + resultadoTernário);

        //Usando mais condições dentro do operado ternário
        int idade = 18;
        String categoria;
        //Metodo de if & else
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        //Método com operador ternário - Não recomendado
        categoria = idade < 15 ? "Cadegotia Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);

    }
}
