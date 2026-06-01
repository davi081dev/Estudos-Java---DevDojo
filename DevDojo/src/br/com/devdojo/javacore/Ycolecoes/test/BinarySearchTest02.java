package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.add(new Manga(3L,"Naruto", 15.00));
        mangas.add(new Manga(1L,"Attack on titan", 12.00));
        mangas.add(new Manga(5L,"Death Note", 17.50));
        mangas.add(new Manga(4L,"Solo leveling", 10.00));
        mangas.add(new Manga(2L, "Dragon Ball Z", 20.00));
        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga( 5L, "Death Note", 17.50);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));


    }
}
