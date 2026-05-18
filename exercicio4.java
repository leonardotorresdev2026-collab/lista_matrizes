import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int somaimpares = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("digite um valor: ");
                matriz[i][j] = lt.nextInt();

                if (matriz[i][j] % 2 != 0) {

                    somaimpares = somaimpares + matriz[i][j];
                }
            }
        }

        System.out.println("soma dos impares: " + somaimpares);

        for (int j = 0; j < 5; j++) {

            int somacoluna = 0;

            for (int i = 0; i < 5; i++) {

                somacoluna = somacoluna + matriz[i][j];
            }

            System.out.println("soma da coluna " + (j + 1) + ": " + somacoluna);
        }

        for (int i = 0; i < 5; i++) {

            int somalinha = 0;

            for (int j = 0; j < 5; j++) {

                somalinha = somalinha + matriz[i][j];
            }

            System.out.println("soma da linha " + (i + 1) + ": " + somalinha);
        }

        lt.close();
    }
}