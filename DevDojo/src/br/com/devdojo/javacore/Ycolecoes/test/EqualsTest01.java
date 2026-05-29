package br.com.devdojo.javacore.Ycolecoes.test;

import br.com.devdojo.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("AXL1", "Samsung");
        Smartphone s2 = new Smartphone("AXL1", "Samsung");
        System.out.println(s1.equals(s2));
        s2 = s1;
        System.out.println(s1.equals(s2));
    }
}
