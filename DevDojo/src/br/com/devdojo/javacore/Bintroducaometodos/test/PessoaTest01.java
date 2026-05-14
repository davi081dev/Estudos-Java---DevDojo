package br.com.devdojo.javacore.Bintroducaometodos.test;

import br.com.devdojo.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setIdade(20);
        p1.imprime();
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
    }
}
