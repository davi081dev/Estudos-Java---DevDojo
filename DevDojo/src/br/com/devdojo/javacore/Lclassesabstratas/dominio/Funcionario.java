package br.com.devdojo.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
        imprime();
    }

    @Override
    public void imprime(){
        System.out.println("Qualquer coisa");
    }

    public abstract double calcularBonus();

}
