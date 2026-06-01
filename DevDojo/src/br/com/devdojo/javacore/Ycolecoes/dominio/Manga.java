package br.com.devdojo.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String nome;
    private double valor;
    private int quantidade;

    public Manga(Long id, String nome, double valor) {
        //determina que os atributos não podem ser nulos
        Objects.requireNonNull(id, "ID não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Manga(Long id, String nome, double valor, int quantidade) {
        this(id, nome, valor);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga outroManga) {
        //  negativo se o this < outroManga
        //  se this == outroManga, return 0
        //  positivo se this > outroManga
//        if(this.id < outroManga.getId()){
//            return -1;
//        } else if(this.id.equals(outroManga.getId())){
//            return 0;
//        } else{
//            return 1;
//        }
        //return this.id.compareTo(outroManga.id);

        // se eu quiser organizar os mangas pelo preco
        //return Double.valueOf(valor).compareTo(outroManga.getValor());
        //Ou:
        //return Double.compare(valor, outroManga.getValor());

        // se eu quiser organizar os mangas pelo nome
        return this.nome.compareTo(outroManga.getNome());
    }
}
