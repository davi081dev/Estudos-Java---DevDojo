package br.com.devdojo.javacore.Npolimorfismo.test;

import br.com.devdojo.javacore.Npolimorfismo.dominio.Computador;
import br.com.devdojo.javacore.Npolimorfismo.dominio.Produto;
import br.com.devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("ASUS i3", 2000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------");


        Produto produto2 = new Tomate("Britânico", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
