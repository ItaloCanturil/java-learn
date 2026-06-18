package exercises.lista01;

import exercises.lista01.utils.InputUtils;

public class Ex01SumCompareC {
    public static void main(String[] args) {
        int a = InputUtils.readInt("Digite um valor para A");
        int b = InputUtils.readInt("Digite um valor para B");
        int c = InputUtils.readInt("Digite um valor para C");
        int sum = a + b;

        System.out.println("Soma A + B: "+sum);

        if (sum < c) {
            System.out.println("É menor do que C =" + c);
        }
    }
}
