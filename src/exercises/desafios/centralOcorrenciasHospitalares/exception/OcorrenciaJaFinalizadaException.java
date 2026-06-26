package exercises.desafios.centralOcorrenciasHospitalares.exception;

public class OcorrenciaJaFinalizadaException extends Exception {
    public OcorrenciaJaFinalizadaException() {
        super("Ocorrencia ja finalizada");
    }
    public OcorrenciaJaFinalizadaException(String message) {
        super(message);
    }
}
