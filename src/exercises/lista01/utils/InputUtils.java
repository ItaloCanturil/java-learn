package exercises.lista01.utils;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputUtils() {
    }

    public static int readInt(String message) {
        System.out.println(message);
        while (!SCANNER.hasNextInt()) {
            System.out.println("Valor invalido. Digite um numero inteiro:");
            SCANNER.next();
        }
        int value = SCANNER.nextInt();
        SCANNER.nextLine();
        return value;
    }

    public static double readDouble(String message) {
        System.out.println(message);
        while (!SCANNER.hasNextDouble()) {
            System.out.println("Valor invalido. Digite um numero decimal:");
            SCANNER.next();
        }
        double value = SCANNER.nextDouble();
        SCANNER.nextLine();
        return value;
    }

    public static String readString(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }

    public static boolean readBoolean(String message) {
        System.out.println(message);
        while (!SCANNER.hasNextBoolean()) {
            System.out.println("Valor invalido. Digite um booleano:");
            SCANNER.next();
        }
        boolean value = SCANNER.nextBoolean();
        SCANNER.nextLine();
        return value;
    }
}
