package exercises.desafios.centralOcorrenciasHospitalares.exception;

public class SetorNaoEncontradoException extends Exception{
    public SetorNaoEncontradoException() {
        super("Setor nao encontrado");
    }

    public SetorNaoEncontradoException(String message) {
        super(message);
    }
}
