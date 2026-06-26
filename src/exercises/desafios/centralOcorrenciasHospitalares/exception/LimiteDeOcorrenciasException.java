package exercises.desafios.centralOcorrenciasHospitalares.exception;

public class LimiteDeOcorrenciasException extends Exception {
    public LimiteDeOcorrenciasException() {
        super("Não é possivel abrir mais ocorrências");
    }
    public LimiteDeOcorrenciasException(String message) {
        super(message);
    }
}
