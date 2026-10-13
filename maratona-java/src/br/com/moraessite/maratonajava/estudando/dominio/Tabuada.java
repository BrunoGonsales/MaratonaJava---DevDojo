package br.com.moraessite.maratonajava.estudando.dominio;

public class Tabuada {
    private int valor1;

    public Tabuada(int valor1) {
        this.valor1 = valor1;
    }

    public void imprimeTabuada () {
        this.valor1 = valor1;
        double resultado;
        System.out.println("-------- Tabuada do " + valor1 +  " --------");
        for (int i = 0; i <= 10; i++){
            resultado = i * valor1;
            System.out.println(valor1 + " x " + i + " = " + resultado);
        }
    }
}
