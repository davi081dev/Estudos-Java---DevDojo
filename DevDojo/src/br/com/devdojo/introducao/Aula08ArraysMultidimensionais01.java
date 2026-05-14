package br.com.devdojo.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31, 28, 31, 30 dias
        int[][] dias = new int[3][4];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 20;
        dias[1][1] = 21;
        dias[1][2] = 22;

        dias[2][2] = 22;
        dias[2][2] = 22;
        dias[2][2] = 22;

//        for(int i = 0; i < dias.length; i++){
//            for(int j = 0; j < dias[i].length; j++){
//                System.out.println(dias[i][i]);
//            }
//        }

        // Forma de imprimir a array com foreach
        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
