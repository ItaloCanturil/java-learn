package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensinais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 Meses

        int[][] dias = new int[3][3];

        dias[0][0] = 3;
        dias[0][1] = 31;
        dias[0][2] = 9;

        dias[1][0] = 3;
        dias[1][1] = 31;
        dias[1][2] = 9;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("----------------------------");

        for(int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
