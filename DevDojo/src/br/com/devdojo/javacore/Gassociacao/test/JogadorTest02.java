package br.com.devdojo.javacore.Gassociacao.test;

import br.com.devdojo.javacore.Gassociacao.dominio.Jogador;
import br.com.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        //Associação unidirecional um para muitos
        Jogador jogador1 = new Jogador("Cruyff");
        Time time = new Time("Ajax");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
