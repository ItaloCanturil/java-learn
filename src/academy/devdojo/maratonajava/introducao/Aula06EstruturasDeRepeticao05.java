package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorCarro = 55000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorPacerla = valorCarro / parcela;
            if(valorPacerla < 1000) {
                continue;
            }

            System.out.println("Parcela "+ parcela + " R$ "+ valorPacerla);
        }
    }
}
