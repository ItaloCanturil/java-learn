package exercises.lista01;

import exercises.lista01.utils.InputUtils;

public class Ex05MinimumSalaryCalculator {
    public static void main(String[] args) {
        double salarioMinimo = 1293.20;
        double salario = InputUtils.readDouble("Escreva seu salario:");

        System.out.println("Quantos salarios minimos voce ganha? R: " + (salario/salarioMinimo));
    }
}
