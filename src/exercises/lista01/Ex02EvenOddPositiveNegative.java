package exercises.lista01;

import exercises.lista01.utils.InputUtils;
import exercises.lista01.utils.MathUtils;

public class Ex02EvenOddPositiveNegative {
    public static void main(String[] args) {
        int num = InputUtils.readInt("Digite um número:");

        String isPositveNegative = num > 0 ? "Positivo": "Negativo";
        String evenNumber = MathUtils.isEven(num) ? "Par" : "Impar";
        System.out.println("O número é: "+ evenNumber + " e " + isPositveNegative);
    }
}
