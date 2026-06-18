package exercises.lista01;

import exercises.lista01.utils.InputUtils;

public class Ex09ImcCalculator {
    public static void main(String[] args) {
        double peso = InputUtils.readDouble("Coloque seu peso:");
        double altura = InputUtils.readDouble("Coloque sua altura:");

        double imc = peso / (altura * altura);

        if (imc < 18.6) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.6 && imc < 24.9) {
            System.out.println("Peso ideal");
        } else if (imc > 25.0 && imc < 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc > 30.0 && imc < 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc > 35.0 && imc < 39.9) {
            System.out.println("Obesidade grau II");
        } else if (imc >= 40) {
            System.out.println("Obesidade grau III");
        }
    }
}
