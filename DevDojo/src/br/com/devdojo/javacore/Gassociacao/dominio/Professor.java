package br.com.devdojo.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println("------ Seminarios ------");
        System.out.println("Nome professor: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if(seminarios == null){return;}
        for(Seminario seminario : seminarios){
            System.out.println("Seminario ministrado: " + seminario.getNomeTitulo());
            System.out.println("Local seminario ministrado: " + seminario.getLocal().getNomeEndereco());
            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) {continue;}
            for(Aluno aluno : seminario.getAlunos()){
                System.out.println("Nome aluno: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
            }
        }
        System.out.println("-------------------");
    }

    public Professor(String nome) {
        this.nome = nome;
    }
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
