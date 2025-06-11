package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 3000;
        // (condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 5000" : "Ainda não tenho condições de doar, mas vou ter!";

        System.out.println(resultado);
    }
}
