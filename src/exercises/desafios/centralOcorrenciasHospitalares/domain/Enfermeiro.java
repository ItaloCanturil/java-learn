package exercises.desafios.centralOcorrenciasHospitalares.domain;

import exercises.desafios.centralOcorrenciasHospitalares.enums.TipoOcorrencia;

public class Enfermeiro extends Funcionario {

    public Enfermeiro(String nome, int matricula, boolean isActive) {
        super(nome, matricula, isActive);
    }

    @Override
    public boolean podeAtender(Ocorrencia ocorrencia) {
        return ocorrencia instanceof OcorrenciaAssistencial;
    }

}
