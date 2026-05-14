package br.com.devdojo.javacore.Fmodificadorestatico.test;

import br.com.devdojo.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Ferrari", 270);

        Carro.setVelocidadeLimite(150);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }

}
