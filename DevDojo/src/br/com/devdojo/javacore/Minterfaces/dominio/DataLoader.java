package br.com.devdojo.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrievingMaxDataSize na interface");
    }
}
