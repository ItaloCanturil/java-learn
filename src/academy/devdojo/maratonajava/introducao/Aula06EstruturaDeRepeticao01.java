package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 10) {
            System.out.println(count);
            count++;
        }
        // vai executar pelo menos uma vez mesmo se a condição for falsa;
        count = 0;
        do {
            System.out.println("dentro do do-while"+ ++count);
        } while (count < 10);

        for(int i = 0;  i < 10; i++){
            System.out.println("For"+ i);
        }
    }
}
