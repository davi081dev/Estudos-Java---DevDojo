package br.com.devdojo.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //Ordem de execução até agora em POO:
    // 0 - Bloco de inicialização estatico é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe e criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    //Bloco de inicialização estatico
    static{
        System.out.println("Dentro do bloco de inicializacao estatico 1");
        episodios = new int[100];
        for(int i=0; i<episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    static{
        System.out.println("Dentro do bloco de inicializacao estatico 2");
    }
    static{
        System.out.println("Dentro do bloco de inicializacao estatico 3");
    }

    //Bloco de inicialização de instância
    {
        System.out.println("Dentro do bloco de inicializacao de instancia");
        episodios = new int[100];
        for(int i=0; i<episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
