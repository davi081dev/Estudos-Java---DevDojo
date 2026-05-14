package br.com.devdojo.javacore.Bintroducaometodos.test;

import br.com.devdojo.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        Estudante e2 = new Estudante();

        e1.nome = "Joao";
        e1.idade = 15;
        e1.sexo = 'M';

        e2.nome = "Melissa";
        e2.idade = 15;
        e2.sexo = 'F';

        e1.imprime();
        e2.imprime();
    }
}
