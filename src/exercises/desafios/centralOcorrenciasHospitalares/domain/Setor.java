package exercises.desafios.centralOcorrenciasHospitalares.domain;

import exercises.desafios.centralOcorrenciasHospitalares.enums.NivelCriticidade;

import java.util.Scanner;

public class Setor {
    private String nome;
    private int codigo;
    private NivelCriticidade nivelCriticidade;
    private Funcionario funcionario;
    public static Scanner scanner = new Scanner(System.in);

    public Setor() {
    }

    public Setor(String nome, int codigo, NivelCriticidade nivelCriticidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.nivelCriticidade = nivelCriticidade;
    }

    public static Setor createSetor() {
        Setor novoSetor = new Setor();
        System.out.println("Qual o nome do setor?");
        String nome = scanner.nextLine();
        novoSetor.setNome(nome);
        System.out.println("Qual o codigo?");
        int cod = scanner.nextInt();
        novoSetor.setCodigo(cod);
        System.out.println("Escolha o nível de criticidade:");
        System.out.println("0 - Baixa");
        System.out.println("1 - Media");
        System.out.println("2 - Alta");
        System.out.println("3 - Critica");
        int crit = scanner.nextInt();
        novoSetor.setNivelCriticidade(NivelCriticidade.porValor(crit));
        return novoSetor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public NivelCriticidade getNivelCriticidade() {
        return nivelCriticidade;
    }

    public void setNivelCriticidade(NivelCriticidade nivelCriticidade) {
        this.nivelCriticidade = nivelCriticidade;
    }
}
