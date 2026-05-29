package br.com.devdojo.javacore.Oexception.exception.test;

import br.com.devdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01{
    public static void main(String[] args) {
        try{
            logar();
        }catch(LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException{
        Scanner sc =  new Scanner(System.in);

        String usuarioDB = "Potter";
        String senhaDB = "leviosa";

        System.out.println("Nome de usuario: ");
        String usuarioDigitado = sc.nextLine();
        System.out.println("Senha de usuario: ");
        String senhaDigitada = sc.nextLine();

        if(!usuarioDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha inválidos!");
        }

        System.out.println("Login efetuado com sucesso!");
    }
}
