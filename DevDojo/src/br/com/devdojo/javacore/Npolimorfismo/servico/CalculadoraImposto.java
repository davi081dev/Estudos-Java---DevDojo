package br.com.devdojo.javacore.Npolimorfismo.servico;

import br.com.devdojo.javacore.Npolimorfismo.dominio.Produto;
import br.com.devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculadoraImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto do produto: " + imposto);

        if(produto instanceof Tomate){
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
