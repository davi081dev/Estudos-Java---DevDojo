package br.com.devdojo.javacore.Bintroducaometodos.test;

import br.com.devdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Davi");
        f1.setIdade(20);
        f1.setSalarios(new double[] {1200, 3500, 6200});
        f1.imprimirFuncionario();
    }
}
