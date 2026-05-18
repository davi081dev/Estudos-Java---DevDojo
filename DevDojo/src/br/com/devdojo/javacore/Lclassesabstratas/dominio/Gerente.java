package br.com.devdojo.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return salario = salario + salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
