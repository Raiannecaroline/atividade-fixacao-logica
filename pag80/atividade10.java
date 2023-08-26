package pag80;

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois valores numéricos.
         * Em seguida o algoritmo deverá efetuar a soma dos dois valores e apresentar o resultado caso seja maior que 10.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double soma = valor1 + valor2;

        if (soma > 10) {
            System.out.println("A soma dos valores é maior que 10: " + soma);
        } else {
            System.out.println("A soma dos valores não é maior que 10.");
        }

        scanner.close();

    }
}
