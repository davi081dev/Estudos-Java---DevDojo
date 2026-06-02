package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import br.com.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Davi");
        Consumidor consumidor2 = new Consumidor("João");


        Manga manga1 = new Manga(3L,"Naruto", 15.00);
        Manga manga2 = new Manga(1L,"Attack on titan", 12.00);
        Manga manga3 = new Manga(5L,"Death Note", 17.50);
        Manga manga4 = new Manga(4L,"Solo leveling", 10.00);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 20.00);

        List<Manga> mangasList1 = List.of(manga1,manga2,manga3);
        List<Manga> mangasList2 = List.of(manga4,manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangasList1);
        consumidorMangaMap.put(consumidor2, mangasList2);
        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()) {
            System.out.println("Consumidor: " + entry.getKey().getNome());
            System.out.println("Mangas: ");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
            System.out.println("--------------------------");
        }


    }
}
