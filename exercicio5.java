import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);

        int matriz[][] = new int[4][3];
        int valor;
        int achou = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                matriz[i][j] = lt.nextInt();

            }
        }

        valor = lt.nextInt();

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] == valor) {

                    achou = 1;

                }

            }
        }

        if (achou == 1) {

            System.out.println("o valor se encontra na matriz");

        } else {

            System.out.println("o valor nao se encontra na matriz");

        }

    }

}