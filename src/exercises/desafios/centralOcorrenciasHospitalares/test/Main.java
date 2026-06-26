package exercises.desafios.centralOcorrenciasHospitalares.test;

import exercises.desafios.centralOcorrenciasHospitalares.domain.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Boolean active = true;
    public static Scanner scanner = new Scanner(System.in);
    public static Setor[] setores = new Setor[10];
    public static Funcionario[] funcionarios = new Funcionario[20];
    public static Ocorrencia[] ocorrencias = new Ocorrencia[50];

    public static void main(String[] args) {


        while (active) {
            System.out.println("=== Central de Ocorrências Hospitalares ===\n" +
                    "\n" +
                    "1 - Cadastrar setor\n" +
                    "2 - Cadastrar funcionário\n" +
                    "3 - Abrir ocorrência\n" +
                    "4 - Encaminhar ocorrência\n" +
                    "5 - Iniciar atendimento\n" +
                    "6 - Finalizar ocorrência\n" +
                    "7 - Cancelar ocorrência\n" +
                    "8 - Listar ocorrências\n" +
                    "9 - Relatório por prioridade\n" +
                    "10 - Sair");

            int valor = scanner.nextInt();

            System.out.println(valor);

            action(valor);
        }

    }

    public static void action (int num) {
        switch (num) {
            case 1:
                for(int i = 0; i < setores.length; i++) {
                    if (setores[i] == null) {
                        setores[i] = Setor.createSetor();
                        break;
                    }
                }
            case 2:
                createFuncionario();
                break;
            case 3:
                createOcorrencia();
                break;
            case 10:
                System.out.println("===Saindo===");
                active = false;
                break;
        }
    }

    public static void createFuncionario() {
        System.out.println("=== Criação de Funcionário ===");

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                System.out.println("Nome do funcionario:");
                String nome = scanner.nextLine();
                System.out.println("Qual setor?");
                System.out.println("1 - Técnico de TI");
                System.out.println("2 - Administração");
                System.out.println("3 - Enfermagem");
                System.out.println("4 - Motorista");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        funcionarios[i] = new TecnicoTI(nome, 101, true);
                        break;
                    case 2:
                        funcionarios[i] = new Administrador(nome, 102, true);
                    case 3:
                        funcionarios[i] = new Motorista(nome, 103, true);
                    case 4:
                        funcionarios[i] = new Enfermeiro(nome, 105, true);
                }
            }
        }
    }

    public static void createOcorrencia() {
        System.out.println("=== Criação de Ocorrencia ===");

        for (int i = 0; i < ocorrencias.length; i++) {
            if (ocorrencias[i] == null) {
                System.out.println("Qual ocorrencia voce quer abrir?");
                System.out.println("1 - Técnica");
                System.out.println("2 - Assistencial");
                System.out.println("3 - Administrativa");
                System.out.println("4 - Transporte");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        ocorrencias[i] = new OcorrenciaTecnica();
                        ocorrencias[i].setCodigo(i);
                        ocorrencias[i].setAll(setores);
                        break;
                    case 2:
                        ocorrencias[i] = new OcorrenciaAssistencial();
                        ocorrencias[i].setCodigo(i);
                        ocorrencias[i].setAll(setores);
                        break;
                    case 3:
                        ocorrencias[i] = new OcorrenciaAdministrativa();
                        ocorrencias[i].setCodigo(i);
                        ocorrencias[i].setAll(setores);
                        break;
                    case 4:
                        ocorrencias[i] = new OcorrenciaTransporte();
                        ocorrencias[i].setCodigo(i);
                        ocorrencias[i].setAll(setores);
                        break;
                }
            }
        }
    }

    public static void encaminhaOcorrencia() {
        System.out.println("Qual ocorrencia voce quer enviar?");
        Arrays.asList(ocorrencias).forEach(System.out::println);
        int opcao = scanner.nextInt();

        System.out.println("Para qual funcionario?");
        Arrays.asList(funcionarios).forEach(System.out::println);
        int func = scanner.nextInt();


    }
}
