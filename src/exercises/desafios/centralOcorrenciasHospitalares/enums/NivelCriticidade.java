package exercises.desafios.centralOcorrenciasHospitalares.enums;

public enum NivelCriticidade {
    BAIXA(0),
    MEDIA(1),
    ALTA(2),
    CRITICA(3);

    private final int nivel;

    NivelCriticidade(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public static NivelCriticidade porValor(int valor) {
        for (NivelCriticidade nivel : values()) {
            if (nivel.getNivel() == valor) {
                return nivel;
            }
        }
        return null;
    }
}
