public class Main {

    public static void main(String[] args) {

        int[][] numeros = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74}
        };

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {

                System.out.print(numeros[i][j] + " ");
            }

            System.out.println();
        }
    }
}