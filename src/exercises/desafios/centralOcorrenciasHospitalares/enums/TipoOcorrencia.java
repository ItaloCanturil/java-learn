package exercises.desafios.centralOcorrenciasHospitalares.enums;

public enum TipoOcorrencia {
    SUPORTE_TI(0),
    TRANSPORTE(1),
    ADM(2),
    ENFERMAGEM(3);

    private final int valor;

    TipoOcorrencia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static TipoOcorrencia porValor(int valor) {
        for(TipoOcorrencia tipo : values()) {
            if(tipo.getValor() == valor) {
                return tipo;
            }
        }
        return null;
    }
}
