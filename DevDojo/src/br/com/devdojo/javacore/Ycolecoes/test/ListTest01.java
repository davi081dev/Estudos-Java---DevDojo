package br.com.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>(16);
        List <String> nomes2 = new ArrayList<>(16);
        nomes.add("Davi");
        nomes.add("Orochimaru");
        nomes2.add("Sasuke");
        nomes2.add("Naruto");
        nomes2.add("Jiraya");
        nomes.remove(1);
        nomes.addAll(nomes2);

        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("---------------");
        nomes.add("Vegeta");
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List <Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
