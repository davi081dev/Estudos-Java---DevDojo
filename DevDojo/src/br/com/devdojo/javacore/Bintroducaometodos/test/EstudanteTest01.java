package br.com.devdojo.javacore.Bintroducaometodos.test;
import br.com.devdojo.javacore.Bintroducaometodos.dominio.Estudante;
import br.com.devdojo.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        Estudante e2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        e1.nome = "Joao";
        e1.idade = 15;
        e1.sexo = 'M';

        e2.nome = "Melissa";
        e2.idade = 15;
        e2.sexo = 'F';

        //parametros do tipo referencia
        impressora.impressoraEstudante(e1);
        impressora.impressoraEstudante(e2);
        impressora.impressoraEstudante(e1);
        impressora.impressoraEstudante(e2);
        //verificando se os valores das variaveis foram alterados
        System.out.println("-------------------");
        System.out.println(e1.nome);
        System.out.println(e2.nome);

    }
}
