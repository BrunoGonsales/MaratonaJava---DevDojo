package br.com.moraessite.maratonajava.introducao;

public class Aula08ArraysMultidimensionaisPt02 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3};
        int [][] arrayInt = new int[3][];

        // Inicializar primeira posição com um array de 2 posições, mas sem valores dentro
        arrayInt[0] = new int[2];

        // Aqui criamos uma variavel com valores, e dizemos que a variavel "array" é = a posição 2
        arrayInt[1] = array;

        // Inicializa a terceira posição com valores definidos, a quantidade de valores define o tamanho do array
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        for(int[] arrayBase: arrayInt){
            for (int num : arrayBase){
                System.out.println(num + " ");
            }
            System.out.println("----------");
        }


        // incializar um array multimensional com valores, a quantidade de valores define o tamanho
        int [][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1 ,2, 3, 4, 5, 6}};
    }
}
