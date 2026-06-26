package exercises.desafios.centralOcorrenciasHospitalares.domain;

import exercises.desafios.centralOcorrenciasHospitalares.enums.NivelCriticidade;
import exercises.desafios.centralOcorrenciasHospitalares.enums.Prioridade;
import exercises.desafios.centralOcorrenciasHospitalares.enums.Status;
import exercises.desafios.centralOcorrenciasHospitalares.enums.TipoOcorrencia;

public class OcorrenciaAdministrativa extends Ocorrencia {

    public OcorrenciaAdministrativa() {
    }

    public OcorrenciaAdministrativa(int codigo, String descricao, String data, int qtdTentativas, Status status, Setor setor, TipoOcorrencia tipo) {
        super(codigo, descricao, data, qtdTentativas, status, Prioridade.BAIXA, setor, tipo);
    }

    public OcorrenciaAdministrativa(int codigo, String descricao, String data, int qtdTentativas, Status status, TipoOcorrencia tipo, Setor setor, Funcionario responsavel) {
        super(codigo, descricao, data, qtdTentativas, status, Prioridade.BAIXA, tipo, setor, responsavel);
    }

    @Override
    public void calcularPrioridade() {
        if (this.getSetor().getNivelCriticidade() == NivelCriticidade.ALTA) {
            this.setPrioridade(Prioridade.ALTA);
        }
    }
}
