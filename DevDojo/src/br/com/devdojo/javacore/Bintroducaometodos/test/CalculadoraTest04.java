package br.com.devdojo.javacore.Bintroducaometodos.test;

import br.com.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        System.out.println("Dentro do metódo alteraDoisNumeros");
        c1.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
