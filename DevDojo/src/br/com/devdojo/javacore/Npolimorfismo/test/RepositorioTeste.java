package br.com.devdojo.javacore.Npolimorfismo.test;

import br.com.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import br.com.devdojo.javacore.Npolimorfismo.servico.RepositorioArquivo;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();
    }
}
