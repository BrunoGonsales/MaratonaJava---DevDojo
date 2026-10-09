package br.com.moraessite.maratonajava.introducao;

public class Aula05EstruturasCondicionaisPt01 {
    public static void main(String[] args) {
        if(false) {
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");

        int idade = 20;
        if(idade >= 18) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        // Mesma situação acima
        idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if(isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        // Usando o operador de negação "!"
        if(!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar beibda alcólica");
        }




    }
}
