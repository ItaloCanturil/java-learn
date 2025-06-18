package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Civic";
        carro1.modelo = "G10";
        carro1.ano = 2025;

        System.out.println("Carro: " + carro1.nome + " modelo: " + carro1.modelo + " ano: " + carro1.ano);

        Carro carro2 = new Carro();
        carro2.nome = "Fusca";
        carro2.modelo = "velho";
        carro2.ano = 1960;

        System.out.println("Carro: " + carro2.nome + " modelo: " + carro2.modelo + " ano: " + carro2.ano);
    }
}
