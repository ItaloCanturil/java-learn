package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 55000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorPacerla = valorCarro / parcela;
            if(valorPacerla < 1000) {
                break;
            }

            System.out.println("Parcela "+ parcela + " R$ "+ valorPacerla);
        }
    }
}
