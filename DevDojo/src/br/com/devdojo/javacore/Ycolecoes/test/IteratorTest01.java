package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(3L,"Naruto", 15.00, 0));
        mangas.add(new Manga(1L,"Attack on titan", 12.00, 1));
        mangas.add(new Manga(5L,"Death Note", 17.50, 10));
        mangas.add(new Manga(4L,"Solo leveling", 10.00, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 20.00,3));

//        Iterator <Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if(mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
