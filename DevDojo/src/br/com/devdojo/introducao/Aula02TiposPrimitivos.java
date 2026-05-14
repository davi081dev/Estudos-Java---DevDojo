package br.com.devdojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.D;
        float salarioFloat = 2500.F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        //String não é um tipo primitivo, em java é uma classe:
        String palavra = "Hello";

        System.out.println(caractere);

        //Exemplo de casting(forçar a entrada de um valor):
        int idadeLong = (int) 100000000000L;
    }
}