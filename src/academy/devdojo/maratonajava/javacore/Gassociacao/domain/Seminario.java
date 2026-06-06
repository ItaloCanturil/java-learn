package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime() {
        System.out.println(this.titulo);
        System.out.println("Local: " + local.getEndereco());
        if (alunos == null) return;
        System.out.println("** Alunos ** ");
        for (Aluno aluno : alunos) {
            System.out.println("ALuno: " + aluno.getNome() + " Idade:" + aluno.getIdade());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
