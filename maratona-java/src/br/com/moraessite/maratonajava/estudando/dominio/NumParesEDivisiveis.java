package br.com.moraessite.maratonajava.estudando.dominio;

public class NumParesEDivisiveis {
    {
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
}


