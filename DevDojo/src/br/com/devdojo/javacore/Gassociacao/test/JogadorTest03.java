package br.com.devdojo.javacore.Gassociacao.test;

import br.com.devdojo.javacore.Gassociacao.dominio.Jogador;
import br.com.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Gerrard");
        Jogador jogador2 = new Jogador("Xabi Alonso");
        Jogador jogador3 = new Jogador("Dudek");
        Time time1 = new Time("Liverpool");
        Time time2 = new Time("Real Madrid");
        Jogador[] jogadoresTime1 = {jogador1, jogador3};
        Jogador[] jogadoresTime2 = {jogador2};

        jogador1.setTime(time1);
        jogador2.setTime(time2);
        jogador3.setTime(time1);
        time1.setJogadores(jogadoresTime1);
        time2.setJogadores(jogadoresTime2);

        System.out.println("--- Jogadores ---");
        jogador1.imprime();
        System.out.println("----------------");
        jogador2.imprime();
        System.out.println("----------------");
        jogador3.imprime();
        System.out.println(" ");
        System.out.println("--- Times ---");
        time1.imprime();
        System.out.println("----------------");
        time2.imprime();
    }
}
