package exercises.lista01;

import exercises.lista01.utils.InputUtils;

public class Ex04PredecessorSuccessor {
    public static void main(String[] args) {
        int num = InputUtils.readInt("Escreva um número");

        System.out.println("Antecessor do número: " + (num - 1));
        System.out.println("O número: " + num);
        System.out.println("Sucecessor do número: " + (num + 1));
    }
}
