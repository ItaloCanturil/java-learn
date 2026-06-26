package exercises.desafios.centralOcorrenciasHospitalares.domain;

import exercises.desafios.centralOcorrenciasHospitalares.enums.Prioridade;
import exercises.desafios.centralOcorrenciasHospitalares.enums.Status;
import exercises.desafios.centralOcorrenciasHospitalares.enums.TipoOcorrencia;

public class OcorrenciaAssistencial extends Ocorrencia {

    public OcorrenciaAssistencial() {
    }

    public OcorrenciaAssistencial(int codigo, String descricao, String data, int qtdTentativas, Status status, Prioridade prioridade, Setor setor, TipoOcorrencia tipo) {
        super(codigo, descricao, data, qtdTentativas, status, prioridade, setor, tipo);
    }

    public OcorrenciaAssistencial(int codigo, String descricao, String data, int qtdTentativas, Status status, Prioridade prioridade, TipoOcorrencia tipo, Setor setor, Funcionario responsavel) {
        super(codigo, descricao, data, qtdTentativas, status, prioridade, tipo, setor, responsavel);
    }

    @Override
    public void calcularPrioridade() {
        if (this.getTipo() == TipoOcorrencia.ENFERMAGEM) {
            this.setPrioridade(Prioridade.URGENTE);
        }
    }
}
