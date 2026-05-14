package br.com.devdojo.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        //forma de armazenar uma array padrão
        int[] array = {1,2,3};
        int[][] arrayInt = new int[3][];


        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        //forma de armazenar valores a uma array multidimensional
        arrayInt[2] = new int[]{1,2,3,4,5};

        //Outra forma de adicionar valores a uma array multidimensional
        int[][] arrayInt2 = {{0,0}, {1,2,3,4,5}, {1,2,3}};

        for (int[] arrayBase : arrayInt){
            System.out.println("\n---------");
            for( int num: arrayBase){
                System.out.print(num + " ");
            }
        }
        for (int[] arrayBase : arrayInt2){
            System.out.println("\n---------");
            for( int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
