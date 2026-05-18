package br.com.devdojo.javacore.Npolimorfismo.test;

import br.com.devdojo.javacore.Npolimorfismo.dominio.Computador;
import br.com.devdojo.javacore.Npolimorfismo.dominio.Televisao;
import br.com.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import br.com.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador =new Computador("Dell i5", 5000);
        Tomate tomate = new Tomate("Tomate inglês", 7.0);
        Televisao tv = new Televisao("Televisao Samsung 50\" ", 4000);

        CalculadoraImposto.calculadoraImposto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calculadoraImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calculadoraImposto(tv);
    }
}
