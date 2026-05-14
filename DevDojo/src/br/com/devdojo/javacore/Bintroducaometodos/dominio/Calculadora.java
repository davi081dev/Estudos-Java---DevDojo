package br.com.devdojo.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    //Lembrar que os métodos com 'void' não retornam nada
    public void somarDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    //metodos void com parametros
    public void multiplicarDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    //metodos com return
    public double divideDoisNumeros(double num1, double num2) {
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    //outra forma de fazer o metodo divide numeros
    public double divideDoisNumeros02(double num1, double num2) {
        if(num2 != 0){
            return num1 / num2;
        } else {
            return 0 ;
        }
    }

    //Por ser um metodo void retorna um System.out, na hora de chama-lo na main só precisa
    // dar 'objeto.imprimeDivisaoDoisNumeros(20,0)
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if(num2 == 0){
            System.out.println("Não existe divisão por 0");
            //tem como dar um return em metodos void que é:
            //return;
        } else{
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int n1, int n2){
        n1 = 99;
        n2 = 33;

        System.out.println("Num1: " + n1);
        System.out.println("Num2: " + n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int i: numeros){
            soma += i;
        }
        System.out.println(soma);
    }

    //outra forma de chamar métodos com arrays
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int i: numeros){
            soma += i;
        }
        System.out.println(soma);
    }
}
