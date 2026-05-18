package br.com.devdojo.javacore.Npolimorfismo.test;

import br.com.devdojo.javacore.Npolimorfismo.dominio.Computador;
import br.com.devdojo.javacore.Npolimorfismo.dominio.Produto;
import br.com.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import br.com.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("ASUS i3", 2000);
        Produto produto2 = new Tomate("Britânico", 20, "20/06/2026");

        CalculadoraImposto.calculadoraImposto(produto2);
    }
}
