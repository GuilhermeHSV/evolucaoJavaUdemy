package evolucaoJavaUdemy.secao4.exerciciosAula29;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = scanner.nextFloat();

        double pi = 3.14159;
        double area = pi * (raio * raio);

        System.out.printf("A = %.4f", area);
        scanner.close();
    }
}
