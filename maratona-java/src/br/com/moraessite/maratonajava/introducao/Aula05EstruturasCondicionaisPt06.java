package br.com.moraessite.maratonajava.introducao;

public class Aula05EstruturasCondicionaisPt06 {
    public static void main(String[] args) {
        // Utilizando swtich e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        char dia = 3;
        String tipoDia;

        switch (dia) {
            case 1:
            case 7:
                tipoDia = "Fim de semana";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                tipoDia = "Dia Útil";
                break;
            default:
                tipoDia = "inválido";
                break;
        }
        System.out.println("Tipo do Dia: " + tipoDia);
    }
}
