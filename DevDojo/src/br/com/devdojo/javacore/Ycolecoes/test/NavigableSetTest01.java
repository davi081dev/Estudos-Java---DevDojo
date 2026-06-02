package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Manga;
import br.com.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getValor(), o2.getValor());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smarphone = new Smartphone("1234", "Nokia");
        set.add(smarphone);
        System.out.println(set);

        System.out.println("----------------------");
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(3L,"Naruto", 15.00, 0));
        mangas.add(new Manga(1L,"Attack on titan", 12.00, 1));
        mangas.add(new Manga(5L,"Death Note", 17.50, 10));
        mangas.add(new Manga(4L,"Solo leveling", 10.00, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 20.00,3));
        mangas.add(new Manga(6L, "Aaragon", 2.00,7));
        mangas.add(new Manga(7L, "Berserk", 13.00,20));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(8L,"Yuyu Hakusho", 14, 5);

        //lower < mostra o menor objeto antes do objeto chamado 
        //floor <= objetos menores ou iguais ao objeto chamado
        //higher > mostra o maior valor dentro dos objetos dentro deu uma lista
        //ceiling >= objetos maiores ou iguais ao objeto chamado

        System.out.println("-----------------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("------------------------------");
        System.out.println(mangas.size());
        //exibe o primeiro elemento de uma lista e em seguida remove-o
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        //exibe o último elemento de uma lista e em seguida remove-o
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}