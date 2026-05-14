package br.com.devdojo.javacore.Dconstrutores.test;

import br.com.devdojo.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime a1 = new Anime("Naruto", "TV", 20, "Shounen", "Ghibli");
        a1.imprime();
    }
}

