package br.com.devdojo.javacore.Gassociacao.dominio;

public class Seminario {
    private String nomeTitulo;
    private Local local;
    private Aluno[] alunos;

    public void imprime(){
        System.out.println("Nome do seminario: " + nomeTitulo);
        System.out.println("Nome local: " + local);
        for(Aluno aluno : alunos){
            System.out.println("Nome aluno: " + aluno.getNome());
        }
    }

    public Seminario(String nomeTitulo, Local local) {
        this.nomeTitulo = nomeTitulo;
        this.local = local;
    }

    public Seminario(String nomeTitulo, Local local, Aluno[] alunos) {
        this.nomeTitulo = nomeTitulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }
    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
