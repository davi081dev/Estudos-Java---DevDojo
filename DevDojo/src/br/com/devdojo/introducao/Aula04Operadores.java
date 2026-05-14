package br.com.devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;

        //Exceção na soma de variaveis no println:
        //System.out.println(numero02+numero01 + " <-valor somado,valor concatenado-> " + numero02+numero01);

        double resultado = numero01 + numero02;
        //double resultado = numero01 * numero02;
        //double resultado = numero01 / numero02;
        System.out.println(resultado);

        //%
        int resto = 20 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);
        System.out.println("isDezDiferenteDeDez: "+isDezDiferenteDeDez);

        // &&(AND) ||(OR) !(NOT)
        int idade = 35;
        double salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQUeTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQUeTrinta: "+isDentroDaLeiMenorQUeTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus: "+bonus);

        //
        int contador = 0;
        contador += 1;
        contador ++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(contador);
        System.out.println(contador2++);
        System.out.println(++contador2);
    }
}
