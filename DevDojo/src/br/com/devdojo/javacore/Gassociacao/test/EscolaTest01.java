package br.com.devdojo.javacore.Gassociacao.test;

import br.com.devdojo.javacore.Gassociacao.dominio.Escola;
import br.com.devdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        //Associação unidirecional muitos para um
        Professor professor1 = new Professor("Batista");
        Professor professor2 = new Professor("Leonardo");
        Professor[] professores = {professor1, professor2};
        Escola escola1 = new Escola("João Alfredo", professores);

        escola1.imprime();

    }
}
