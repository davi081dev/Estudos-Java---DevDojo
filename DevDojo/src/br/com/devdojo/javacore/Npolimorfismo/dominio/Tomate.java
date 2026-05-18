package br.com.devdojo.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public String dataValidade;


    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
