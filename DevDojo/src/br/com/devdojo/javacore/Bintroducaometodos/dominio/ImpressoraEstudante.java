package br.com.devdojo.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void impressoraEstudante(Estudante estudante){
        System.out.println("--------------------");
        //ao passar um valor no metodo, em variaveis do tipo reference,
        // o valor do atributo é alterado, pois variaveis do tipo reference
        //passam o seu endereço de memória:
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Davi";
    }
}
