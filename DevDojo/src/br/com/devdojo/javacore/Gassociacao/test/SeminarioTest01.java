package br.com.devdojo.javacore.Gassociacao.test;

import br.com.devdojo.javacore.Gassociacao.dominio.Aluno;
import br.com.devdojo.javacore.Gassociacao.dominio.Local;
import br.com.devdojo.javacore.Gassociacao.dominio.Professor;
import br.com.devdojo.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua do hospicio");
        Aluno aluno = new Aluno("Roberto", 15);
        Aluno aluno2 = new Aluno("Joana", 16);
        Aluno[] alunos = {aluno};
        Aluno[] alunos2 = {aluno2};
        Professor professor = new Professor("Maria da Silva", "Saúde");
        Professor professor2 = new Professor("Amanda Souza", "Administração Escolar");
        Seminario seminario = new Seminario("IA na medicina", local, alunos);
        Seminario seminario2 = new Seminario("Educação especial: como lidar", local, alunos2);
        Seminario[] seminarios = {seminario};
        Seminario[] seminarios2 = {seminario2};

        professor.setSeminarios(seminarios);
        professor2.setSeminarios(seminarios2);


        professor.imprime();
        professor2.imprime();
    }
}
