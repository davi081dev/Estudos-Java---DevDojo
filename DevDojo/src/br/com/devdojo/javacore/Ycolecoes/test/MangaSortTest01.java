package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//caso precise passar a ordem da lista de nomes para id 
class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L,"Naruto", 15.00));
        mangas.add(new Manga(1L,"Attack on titan", 12.00));
        mangas.add(new Manga(5L,"Death Note", 17.50));
        mangas.add(new Manga(4L,"Solo leveling", 10.00));
        mangas.add(new Manga(2L, "Dragon Ball Z", 20.00));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("------------------------------------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("------------------------------------------");
        Collections.sort(mangas, new MangaByIdComparator());
//        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
