package exercises.desafios.centralOcorrenciasHospitalares.exception;

public class FuncionarioIncompativelException extends Exception{
    public FuncionarioIncompativelException() {
        super("Funcionario incompativel com a ocorrencia");
    }

    public FuncionarioIncompativelException(String message) {
        super(message);
    }
}
