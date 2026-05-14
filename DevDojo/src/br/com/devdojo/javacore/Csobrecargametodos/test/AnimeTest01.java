package br.com.devdojo.javacore.Csobrecargametodos.test;

import br.com.devdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime a1 = new Anime();
        a1.init("Naruto", "TV", 20);
        a1.init("Naruto", "TV", 20, "Shounen");
        a1.imprime();
    }
}
