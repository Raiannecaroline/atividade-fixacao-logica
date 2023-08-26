package pag81;

import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo que solicite ao usuário para digitar um valor numérico entre 0 e 5.
         * Caso o número digitado esteja entre 1 e 5 imprima em extenso o valor (Ex: “Um”, “Dois”, “Três”, Quarto”, “Cinco”) e
         * repita a operação. Caso o usuário digite 0 o programa exibe a mensagem “Saindo do Algoritmo...” e chega ao fim.
         *
         */

        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um valor entre 0 e 5 (ou 0 para sair): ");
            numero = scanner.nextInt();

            if (numero >= 1 && numero <= 5) {
                String[] numerosExtenso = {"Um", "Dois", "Três", "Quatro", "Cinco"};
                System.out.println("Número por extenso: " + numerosExtenso[numero - 1]);
            } else if (numero == 0) {
                System.out.println("Saindo do Algoritmo...");
            } else {
                System.out.println("Número fora do intervalo válido.");
            }

        } while (numero != 0);

        scanner.close();


    }
}
