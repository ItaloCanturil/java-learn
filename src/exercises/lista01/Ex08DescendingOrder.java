package exercises.lista01;

import exercises.lista01.utils.InputUtils;

import java.util.Arrays;
import java.util.Collections;

public class Ex08DescendingOrder {
    public static void main(String[] args) {
        int num = InputUtils.readInt("Escreva um numero:");
        int num2 = InputUtils.readInt("Escreva outro numero:");
        int num3 = InputUtils.readInt("Escreva outro numero:");

        Integer[] arr = {num, num2, num3};

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
