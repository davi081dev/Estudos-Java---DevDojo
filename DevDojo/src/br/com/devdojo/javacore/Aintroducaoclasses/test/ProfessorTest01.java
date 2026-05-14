package br.com.devdojo.javacore.Aintroducaoclasses.test;
import br.com.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        //Lembre-se de manter alta coesão em OO
        Professor professor = new Professor();
        professor.nome = "Pedro";
        professor.idade = 23;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
