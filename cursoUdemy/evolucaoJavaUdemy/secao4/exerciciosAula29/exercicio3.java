package evolucaoJavaUdemy.secao4.exerciciosAula29;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1° valor: ");
        int A = scanner.nextInt();
        System.out.println("Digite o 2° valor: ");
        int B = scanner.nextInt();
        System.out.println("Digite o 3° valor: ");
        int C = scanner.nextInt();
        System.out.println("Digite o 4° valor: ");
        int D = scanner.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

        scanner.close();
    }

}
