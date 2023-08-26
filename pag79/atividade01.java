package pag79;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        /**
         * PAG 79 - Construir um algoritmo utilizando a representação de fluxograma para que solicite ao usuário a quantidade de horas
         * trabalhadas no mês por um operário. Em seguida, calcular e informar o seu salário sabendo que ele ganha R$ 20,00 por hora.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioPorHora = 20.0;
        double salarioTotal = horasTrabalhadas * salarioPorHora;

        System.out.println("O salário do operário é: R$ " + salarioTotal);

        scanner.close();

    }
}
