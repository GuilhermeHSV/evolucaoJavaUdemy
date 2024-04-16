package evolucaoJavaUdemy.secao4.exerciciosAula29;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu número de funcionário: ");
        double numFuncionario = scanner.nextDouble();
        System.out.println("Digite suas horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        System.out.println("Valor das horas trabalhadas: ");
        double valorHorasTrabalhadas = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHorasTrabalhadas;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = %.2f", salario);

        scanner.close();
    }
}
