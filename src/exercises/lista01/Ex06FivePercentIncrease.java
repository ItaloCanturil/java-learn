package exercises.lista01;

import exercises.lista01.utils.InputUtils;
import exercises.lista01.utils.MathUtils;

public class Ex06FivePercentIncrease {
    public static void main(String[] args) {
        double num = InputUtils.readDouble("Escreva um número qualquer");

        System.out.println(MathUtils.applyIncrease(num, 5));
    }
}
