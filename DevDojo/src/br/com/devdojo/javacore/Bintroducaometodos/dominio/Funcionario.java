package br.com.devdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalarios;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalarios() {
        return mediaSalarios;
    }

    public void imprimirFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salarios: ");

        if( salarios == null){
            return;
        }
        for(double salario: this.salarios){
            System.out.println(salario);
        }
        mediaFuncionarios();
    }

    public void mediaFuncionarios(){
        if (salarios == null){
            return;
        }
        for(double salario: this.salarios){
            mediaSalarios = salario;
        }
        mediaSalarios /= salarios.length;
        System.out.println("Média de salários foi: " + mediaSalarios);
    }
}


