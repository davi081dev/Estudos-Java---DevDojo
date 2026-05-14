package br.com.devdojo.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- ADIVINHAÇÕES LOUCAS ----");

        while(true){
            System.out.println("Faça uma pergunta e respondo sim ou não.");
            String pergunta = sc.nextLine();
            if(pergunta.charAt(0) == ' '){
                System.out.println("SIM!");
            } else if(pergunta.charAt(0) == '0'){
                System.out.println("Programa Encerrado.");
                break;
            }
            else{
                System.out.println("NÃO.");
            }
        }
    }
}
