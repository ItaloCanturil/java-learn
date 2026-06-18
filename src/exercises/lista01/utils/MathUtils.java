package exercises.lista01.utils;

public final class MathUtils {
    private MathUtils() {
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static double calculatePercentage(double value, double percentage) {
        return value * (percentage / 100.0);
    }

    public static double applyDiscount(double value, double percentage) {
        return value - calculatePercentage(value, percentage);
    }

    public static double applyIncrease(double value, double percentage) {
        return value + calculatePercentage(value, percentage);
    }
}
