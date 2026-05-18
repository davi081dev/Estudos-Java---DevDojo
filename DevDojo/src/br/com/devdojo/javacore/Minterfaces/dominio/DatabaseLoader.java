package br.com.devdojo.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void load(){
        System.out.println("Loading Database...");
    }
    @Override
    public void remove(){
        System.out.println("Removing Database...");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checando permissões no banco de dados...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrievingMaxDataSize na classe DatabaseLoader");
    }
}

