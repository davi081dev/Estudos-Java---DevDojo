package br.com.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    //Cosntrutores em herança
    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + salario);
        //exemplo com o tipo protected
//        System.out.println("Nome: " + this.nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
