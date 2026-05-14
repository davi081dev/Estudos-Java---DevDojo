package br.com.devdojo.javacore.Gassociacao.test;

import br.com.devdojo.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Ronaldo");
        Jogador j2 = new Jogador("Bebeto");
        Jogador j3 = new Jogador("Branco");
        Jogador[] j4 = {j1,j2,j3};
        for(Jogador jogadores : j4){
            jogadores.imprime();
        }
    }
}
