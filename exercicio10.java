import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Digite um valor: ");
                matriz[i][j] = lt.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {

            soma = soma + matriz[i][i];
        }

        System.out.println("Soma da diagonal principal: " + soma);
    }
}