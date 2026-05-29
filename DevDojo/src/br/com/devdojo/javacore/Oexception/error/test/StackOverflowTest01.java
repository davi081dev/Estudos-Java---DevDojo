package br.com.devdojo.javacore.Oexception.error.test;

public class StackOverflowTest01  {
    public static void main(String[] args) {
        //erros em java do tipo stackoverflow são problemas não resolucionaveis, exemplo:
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}

