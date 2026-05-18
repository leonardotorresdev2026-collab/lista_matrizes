import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);

        
        String[][] clientes = new String[3][4];

        for (int i = 0; i < 3; i++) {

            System.out.println("Cliente " + (i + 1));

            System.out.print("Nome: ");
            clientes[i][0] = lt.nextLine();

            System.out.print("Endereço: ");
            clientes[i][1] = lt.nextLine();

            System.out.print("CPF: ");
            clientes[i][2] = lt.nextLine();

            System.out.print("Telefone: ");
            clientes[i][3] = lt.nextLine();

            System.out.println();
        }

        // Impressão dos dados
        System.out.println("=== dados ===");

        for (int i = 0; i < 3; i++) {

            System.out.println("Nome: " + clientes[i][0]);
            System.out.println("Endereço: " + clientes[i][1]);
            System.out.println("CPF: " + clientes[i][2]);
            System.out.println("Telefone: " + clientes[i][3]);

            System.out.println();
        }

        lt.close();
    }
}