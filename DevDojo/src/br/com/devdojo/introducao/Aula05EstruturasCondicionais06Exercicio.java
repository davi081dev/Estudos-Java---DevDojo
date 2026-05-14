package br.com.devdojo.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7,imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;
        switch(dia){
            case 1:
                System.out.println("FDS");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("FDS");
                break;
            //forma de fazer a questão se aproveitando do recurso do java de encontrar o caso mas parar quando encontrar uma sáida
//            case 1:
//            case 7:
//                System.out.println("FDS");
//                break;
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Dia útil");
//                break;
//            default:
//                System.out.println("Opção Inválida");
//                break;

        }

    }
}
