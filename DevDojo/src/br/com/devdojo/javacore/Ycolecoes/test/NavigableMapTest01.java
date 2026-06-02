package br.com.devdojo.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap();
        map.put("A", "A");
        map.put("B", "B");
        map.put("C", "C");
        map.put("D", "D");
        map.put("E", "E");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //lower < mostra o menor objeto antes do objeto chamado
        //floor <= objetos menores ou iguais ao objeto chamado
        //higher > mostra o maior valor dentro dos objetos dentro deu uma lista
        //ceiling >= objetos maiores ou iguais ao objeto chamado
        System.out.println(map.headMap("A", true));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
    }
}
