package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import br.com.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Davi");
        Consumidor consumidor2 = new Consumidor("João");

        System.out.println(consumidor1);
        System.out.println(consumidor2);

        Manga manga1 = new Manga(3L,"Naruto", 15.00);
        Manga manga2 = new Manga(1L,"Attack on titan", 12.00);
        Manga manga3 = new Manga(5L,"Death Note", 17.50);
        Manga manga4 = new Manga(4L,"Solo leveling", 10.00);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 20.00);
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga2);

        System.out.println("--------------------------");
        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

    }
}
