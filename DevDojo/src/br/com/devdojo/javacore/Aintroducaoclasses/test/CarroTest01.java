package br.com.devdojo.javacore.Aintroducaoclasses.test;
import br.com.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.nome = "Fiat";
        c1.modelo = "Pulse";
        c1.ano = 2025;

        c2.nome = "Wolkswagem";
        c2.modelo = "Fox";
        c2.ano = 2013;

        //Referência de objetos:
        //c1 = c2;

        System.out.println(c1.nome + " " + c1.modelo + " " + c1.ano);
        System.out.println(c2.nome + " " + c2.modelo + " " + c2.ano);
    }
}
