package br.com.devdojo.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return salario = salario + salario * 0.05;
    }


    public String toString(){
        return "Desenvolvedor{Nome= '" + nome+
                "', salario= " + salario +
                "}";
    }
}
