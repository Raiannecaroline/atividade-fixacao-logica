package pag81;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo que solicite ao usuário para digitar 50 números entre 1 e 100. Informe o maior número digitado.
         */

        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 50;
        int maiorNumero = Integer.MIN_VALUE;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 1 e 100): ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 100) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            } else {
                System.out.println("Número inválido! Insira um número entre 1 e 100.");
                i--; // Decrementar o índice para repetir a entrada do número inválido
            }
        }

        System.out.println("O maior número digitado é: " + maiorNumero);

        scanner.close();

    }
}
