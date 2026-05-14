package br.com.devdojo.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        }else if( idade > 15 && idade < 18){
            categoria = "Categoria juvenil";
        }else{
            categoria = "Adulto";
        }

        //Com operador ternario, mas não é aconselhavel utilizar, só para saber que dá
        //categoria = idade < 15 ? "Categoria Infantil" : idade > 15 && idade < 18 ? "Categoria juvenil" : "Adulto";
        System.out.println(categoria);
    }
}
