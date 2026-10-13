package br.com.moraessite.maratonajava.estudando.dominio;

public class NumParesEDivisiveis {
    //Feito sozinho
    public void verficarPares(){
        for (int i = 1;i <= 50;i++){
            int resto;
            resto = i % 2;
            if(resto == 0) {
                resto = i % 4;
                if (resto == 0){
                    System.out.println(i + " - Divisivel por 4");
                } else {
                    System.out.println(i);
                }
            }
        }
    }

    // Como o objetivo é veririficar somente os PARES, para menos processamento, é possivel usar o for de 2 em 2, sem passar pelos 50 numeros contendo impares
    public void verificarParesGemini(){
        for (int i = 2;i <= 50;i += 2){
            if (i % 4 == 0){
                System.out.println(i + "Divisível por 4");
            } else {
                System.out.println(i);
            }

        }
    }
}


