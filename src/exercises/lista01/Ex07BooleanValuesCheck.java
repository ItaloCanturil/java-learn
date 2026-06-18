package exercises.lista01;

import exercises.lista01.utils.InputUtils;

public class Ex07BooleanValuesCheck {
    public static void main(String[] args) {
        boolean boo = InputUtils.readBoolean("Digite um valor booleano:");
        boolean boo2 = InputUtils.readBoolean("Digite outro valor booleano:");

        if (boo != boo2) {
            System.out.println("Não são iguais");
        }

        if (boo == true && boo2 == true) {
            System.out.println("Ambos são verdadeiros");
        }

        if (boo == false && boo2 == false) {
            System.out.println("Ambos são falsos");
        }
    }
}
