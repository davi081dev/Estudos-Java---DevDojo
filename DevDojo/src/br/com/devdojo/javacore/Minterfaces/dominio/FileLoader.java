package br.com.devdojo.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load(){
        System.out.println("Loading File...");
    }
    @Override
    public void remove(){
        System.out.println("Removing File...");
    }
    @Override
    public void checkPermission(){
        System.out.println("Checando permissões no arquivo...");
    }
}
