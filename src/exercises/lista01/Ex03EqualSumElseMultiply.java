package exercises.lista01;

import exercises.lista01.utils.InputUtils;

public class Ex03EqualSumElseMultiply {
    public static void main(String[] args) {
        int a = InputUtils.readInt("Escreva um número:");
        int b = InputUtils.readInt("Escreva outro número:");;
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println(c);
    }
}
