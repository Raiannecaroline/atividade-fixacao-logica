package pag81;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo que solicite ao usuário para digitar um número. Informe quais os divisores deste número.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.print("Divisores de " + numero + ": ");
        for (int divisor = 1; divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }

        scanner.close();
    }
}

