package pag81;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo que solicite ao usuário para digitar 50 números entre 1 e 100. Informe o menor número digitado.
         */

        Scanner scanner = new Scanner(System.in);

        int quantidadeNumerosMenores = 50;
        int menorNumero = Integer.MAX_VALUE;

        for (int i = 0; i < quantidadeNumerosMenores; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 1 e 100): ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 100) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            } else {
                System.out.println("Número inválido! Insira um número entre 1 e 100.");
                i--; // Decrementar o índice para repetir a entrada do número inválido
            }
        }

        System.out.println("O menor número digitado é: " + menorNumero);

        scanner.close();

    }
}
