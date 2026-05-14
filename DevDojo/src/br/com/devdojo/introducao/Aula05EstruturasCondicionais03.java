package br.com.devdojo.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro devdojo";
        String mensagemNaoDoar = "Eu não vou doar no momento, mas irei futuramente";
        //operador ternario:(condicao) ? verdadeiro : false
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;


        System.out.println(resultado);
    }
}
