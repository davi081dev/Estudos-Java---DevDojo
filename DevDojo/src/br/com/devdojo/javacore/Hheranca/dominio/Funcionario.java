package br.com.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    //Cosntrutores em herança
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
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
