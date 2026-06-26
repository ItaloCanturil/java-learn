package exercises.desafios.centralOcorrenciasHospitalares.domain;

import exercises.desafios.centralOcorrenciasHospitalares.exception.FuncionarioIncompativelException;

public abstract class Funcionario {
    private String nome;
    private String setor;
    private int matricula;
    private boolean isActive;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, int matricula, boolean isActive) {
        this.nome = nome;
        this.matricula = matricula;
        this.isActive = isActive;
    }

    public abstract boolean podeAtender(Ocorrencia ocorrencia);

    public void atender(Ocorrencia ocorrencia) throws FuncionarioIncompativelException {
        if(podeAtender(ocorrencia)) {
            System.out.println(this.nome + " irá atender a ocorrencia");
        }

        throw new FuncionarioIncompativelException();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
