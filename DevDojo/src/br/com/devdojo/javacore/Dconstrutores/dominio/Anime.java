package br.com.devdojo.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;



    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    //sobrecarga de construtor com argumentos
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    //sobrecarga de construtor sem argumentos
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }


    public void imprime(){
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("Episodios: "+episodios);
        System.out.println("Genero: "+genero);
        System.out.println("Estudio: "+estudio);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTIpo(){
        return tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return episodios;
    }

    public String getTipo() {
        return tipo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}

