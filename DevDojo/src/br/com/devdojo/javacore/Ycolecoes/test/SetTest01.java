package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        //Set <Manga> mangas = new HashSet<Manga>();
        Set <Manga> mangas = new LinkedHashSet<Manga>();
        mangas.add(new Manga(3L,"Naruto", 15.00));
        mangas.add(new Manga(1L,"Attack on titan", 12.00));
        mangas.add(new Manga(5L,"Death Note", 17.50));
        mangas.add(new Manga(4L,"Solo leveling", 10.00));
        mangas.add(new Manga(2L, "Dragon Ball Z", 20.00));
        mangas.add(new Manga(2L, "Dragon Ball Z", 20.00));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
