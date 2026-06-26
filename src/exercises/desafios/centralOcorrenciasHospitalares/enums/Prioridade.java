package exercises.desafios.centralOcorrenciasHospitalares.enums;

public enum Prioridade {
    BAIXA(0),
    MEDIA(1),
    ALTA(2),
    URGENTE(3);

    private final int nivel;

    Prioridade(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
