package br.com.devdojo.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        if(this.idade < 0){
            System.out.println("Idade inválida");
            return;
        }else{
            this.idade = idade;
        }
    }
}
