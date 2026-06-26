package exercises.desafios.centralOcorrenciasHospitalares.domain;

import exercises.desafios.centralOcorrenciasHospitalares.enums.TipoOcorrencia;

public class Motorista extends Funcionario {

    public Motorista(String nome, int matricula, boolean isActive) {
        super(nome, matricula, isActive);
    }

    @Override
    public boolean podeAtender(Ocorrencia ocorrencia) {
        return ocorrencia.getTipo() == TipoOcorrencia.TRANSPORTE;
    }


}
