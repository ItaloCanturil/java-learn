package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("---------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
