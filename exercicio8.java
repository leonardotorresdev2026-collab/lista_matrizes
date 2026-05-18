import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int invertida[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Digite um valor: ");
                matriz[i][j] = lt.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                invertida[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz invertida:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(invertida[i][j] + " ");
            }

            System.out.println();
        }
    }
}