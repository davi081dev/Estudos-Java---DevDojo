package br.com.devdojo.javacore.Bintroducaometodos.test;

import br.com.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        c1.somaArray(numeros);
        c1.somaVarArgs(1,2,3,4,5);

    }
}
