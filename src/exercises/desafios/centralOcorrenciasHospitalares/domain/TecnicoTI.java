package exercises.desafios.centralOcorrenciasHospitalares.domain;

import exercises.desafios.centralOcorrenciasHospitalares.enums.TipoOcorrencia;
import exercises.desafios.centralOcorrenciasHospitalares.exception.FuncionarioIncompativelException;

public class TecnicoTI extends Funcionario {

    public TecnicoTI(String nome, int matricula, boolean isActive) {
        super(nome, matricula, isActive);
    }

    @Override
    public boolean podeAtender(Ocorrencia ocorrencia) {
        return ocorrencia.getTipo() == TipoOcorrencia.SUPORTE_TI;
    }


}
