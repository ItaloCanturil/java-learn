package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jhin", 3000);
        Gerente gerente = new Gerente("Jhin", 3000);
        System.out.println(funcionario);
        System.out.println(gerente);
    }
}
