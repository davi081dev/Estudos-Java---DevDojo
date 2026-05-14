package br.com.devdojo.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxa=0;
        double valorImposto;

        if(salarioAnual > 0 && salarioAnual <= 34712){
            taxa = 9.70;
        }else if(salarioAnual >= 34713  && salarioAnual <= 68507){
            taxa = 37.35;
        } else if(salarioAnual > 68507){
            taxa = 49.50;
        }
        valorImposto = salarioAnual*(taxa/100);
        System.out.println(valorImposto);

    }
}
