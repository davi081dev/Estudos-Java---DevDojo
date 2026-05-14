package br.com.devdojo.javacore.Hheranca.test;

import br.com.devdojo.javacore.Hheranca.dominio.Endereco;
import br.com.devdojo.javacore.Hheranca.dominio.Funcionario;
import br.com.devdojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Davi");
        endereco.setRua("Rua dos cafés");
        endereco.setCep("002345-123");
        pessoa.setCpf("543.765.212-90");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Bebeto");
        System.out.println("-----------------");
        funcionario.setCpf("809-323-432-90");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(30000);
        funcionario.imprime();
    }
}
