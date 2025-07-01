package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println("-----------");
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }
    }

    public void media() {
        if (salarios != null) {
            return;
        }
        double media = 0;
        for (double salario : this.salarios) {
            media += salario;
        }

        media /= this.salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }
}
