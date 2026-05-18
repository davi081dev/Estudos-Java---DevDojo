package br.com.devdojo.javacore.Lclassesabstratas.test;

import br.com.devdojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import br.com.devdojo.javacore.Lclassesabstratas.dominio.Funcionario;
import br.com.devdojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pablo", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Davi", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();
        gerente.imprime();

    }
}
