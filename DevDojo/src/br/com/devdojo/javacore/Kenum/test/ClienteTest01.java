package br.com.devdojo.javacore.Kenum.test;

import br.com.devdojo.javacore.Kenum.dominio.Cliente;
import br.com.devdojo.javacore.Kenum.dominio.TipoCliente;
import br.com.devdojo.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Davi", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
    Cliente cliente2 = new Cliente("Hellen", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

    System.out.println(cliente1);
    System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(200));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(200));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
