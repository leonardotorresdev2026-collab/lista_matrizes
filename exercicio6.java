import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);

        int matriz[][] = new int[5][2];
        int soma = 0;
        double media;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {

                matriz[i][j] = lt.nextInt();

                soma = soma + matriz[i][j];

            }
        }

        media = soma / 10.0;

        System.out.println(media);

    }

}