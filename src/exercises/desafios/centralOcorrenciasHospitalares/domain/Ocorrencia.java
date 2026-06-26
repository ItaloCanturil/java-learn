package exercises.desafios.centralOcorrenciasHospitalares.domain;

import exercises.desafios.centralOcorrenciasHospitalares.enums.Prioridade;
import exercises.desafios.centralOcorrenciasHospitalares.enums.Status;
import exercises.desafios.centralOcorrenciasHospitalares.enums.TipoOcorrencia;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Ocorrencia {
    private int codigo;
    private String descricao;
    private String data;
    private int qtdTentativas = 0;
    private Status status = Status.ABERTA;
    private Prioridade prioridade;
    private TipoOcorrencia tipo;
    private Setor setor;
    private Funcionario responsavel;

    public static Scanner scanner = new Scanner(System.in);

    public Ocorrencia(){}

    public Ocorrencia(int codigo, String descricao, String data, int qtdTentativas, Status status, Prioridade prioridade, Setor setor, TipoOcorrencia tipo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.data = data;
        this.qtdTentativas = qtdTentativas;
        this.status = status;
        this.prioridade = prioridade;
        this.setor = setor;
        this.tipo = tipo;
    }

    public Ocorrencia(int codigo, String descricao, String data, int qtdTentativas, Status status, Prioridade prioridade, TipoOcorrencia tipo, Setor setor, Funcionario responsavel) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.data = data;
        this.qtdTentativas = qtdTentativas;
        this.status = status;
        this.prioridade = prioridade;
        this.tipo = tipo;
        this.setor = setor;
        this.responsavel = responsavel;
    }

    public abstract void calcularPrioridade();

    public void setAll(Setor[] setores) {
        System.out.println("Descreva a descricao da ocorrencia");
        String desc = scanner.nextLine();
        setDescricao(desc);

        System.out.println("A data da ocorrencia");
        String data = scanner.nextLine();
        setData(data);

        System.out.println("Qual o setor da Ocorrencia?");
        Arrays.asList(setores).forEach(System.out::println);
        int opcao = scanner.nextInt();
        setSetor(setores[opcao]);

        System.out.println("Qual o tipo da Ocorrencia?");
        System.out.println("1- SUPORTE_TI,\n" +
                "    2- TRANSPORTE,\n" +
                "    3-ADM,\n" +
                "    4-ENFERMAGEM");
        int ocorrencia = scanner.nextInt();
        setTipo(TipoOcorrencia.porValor(ocorrencia));
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQtdTentativas() {
        return qtdTentativas;
    }

    public void setQtdTentativas(int qtdTentativas) {
        this.qtdTentativas = qtdTentativas;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public TipoOcorrencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoOcorrencia tipo) {
        this.tipo = tipo;
    }
}
