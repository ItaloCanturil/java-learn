package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoEstudante impressora = new ImpressoEstudante();

        estudante01.nome = "Hino";
        estudante01.idade = 21;
        estudante01.sexo = 'F';

        estudante02.nome = "Sakura";
        estudante02.idade = 24;
        estudante02.sexo = 'F';

        estudante01.imprime();

        estudante02.imprime();
    }
}
