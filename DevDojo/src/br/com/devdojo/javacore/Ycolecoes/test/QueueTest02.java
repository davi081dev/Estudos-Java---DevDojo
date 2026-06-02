package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import br.com.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(3L,"Naruto", 15.00, 0));
        mangas.add(new Manga(1L,"Attack on titan", 12.00, 1));
        mangas.add(new Manga(5L,"Death Note", 17.50, 10));
        mangas.add(new Manga(4L,"Solo leveling", 10.00, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 20.00,3));
        mangas.add(new Manga(6L, "Aaragon", 2.00,7));
        mangas.add(new Manga(7L, "Berserk", 13.00,20));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
        System.out.println(mangas);
    }
}
