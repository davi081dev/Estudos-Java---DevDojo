package br.com.devdojo.javacore.Eblocosinicializacao.test;

import br.com.devdojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime a1 = new Anime("One Piece");
        for (int episodio : a1.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
