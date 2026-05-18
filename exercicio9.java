import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);

        int matriz1[][] = new int[5][2];
        int matriz2[][] = new int[5][2];
        int matriz3[][] = new int[5][2];

        System.out.println("Digite os valores da matriz 1:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {

                matriz1[i][j] = lt.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz 2:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {

                matriz2[i][j] = lt.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz soma:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(matriz3[i][j] + " ");
            }

            System.out.println();
        }
    }
}