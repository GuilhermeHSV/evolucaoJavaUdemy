package evolucaoJavaUdemy.secao4.exerciciosAula29;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de peças 1: ");
        int numPecas1 = scanner.nextInt();

        System.out.println("Digite o valor unitário de cada peça 1: ");
        double valorPeca1 = scanner.nextDouble();

        System.out.println("Digite o número de peças 2: ");
        int numPecas2 = scanner.nextInt();

        System.out.println("Digite o valor unitário de cada peça 2: ");
        double valorPeca2 = scanner.nextDouble();

        double valorPagar1 = numPecas1 * valorPeca1;
        double valorPagar2 = numPecas2 * valorPeca2;

        double valorTotal = valorPagar1 + valorPagar2;
        System.out.println("VALOR A PAGAR:  R$" + valorTotal);

        scanner.close();
    }
}
