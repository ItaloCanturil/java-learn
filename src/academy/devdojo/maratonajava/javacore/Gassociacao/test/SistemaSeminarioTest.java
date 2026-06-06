package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class SistemaSeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Fonte termal");
        Aluno aluno = new Aluno("Naruto", 18);
        Aluno[] alunos = {aluno};

        Seminario seminario = new Seminario("Como fazer rasengan", alunos, local);
        Seminario[] seminarios = {seminario};

        Professor professor = new Professor("Jiraya", "Tarado", seminarios);

        professor.imprime();
    }
}
