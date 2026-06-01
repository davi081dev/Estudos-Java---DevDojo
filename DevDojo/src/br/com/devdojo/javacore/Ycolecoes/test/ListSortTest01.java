package br.com.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Naruto");
        mangas.add("Attack on titan");
        mangas.add("Death Note");
        mangas.add("Solo leveling");
        mangas.add("Dragon Ball Z");

        System.out.println("Mangas: " + mangas);
        Collections.sort(mangas);
        for(String manga : mangas){
            System.out.println(manga);
        }

        List <Double> dinheiros = new ArrayList<>();
        dinheiros.add(20.0);
        dinheiros.add(30.0);
        dinheiros.add(18.0);
        dinheiros.add(28.0);

        System.out.println("Dinheiros: " + dinheiros);
        Collections.sort(dinheiros);
        System.out.println("Dinheiros: " + dinheiros);
    }
}
