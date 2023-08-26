package pag79;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        /**
         * PAG 79 - Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua idade e i
         * nforme se o mesmo já pode tirar carteira de motorista. O usuário somente poderá tirar a carteira de motorista se a idade for maior que 18 anos.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você já pode tirar a carteira de motorista!");
        } else {
            System.out.println("Você ainda não pode tirar a carteira de motorista.");
        }

        scanner.close();

    }
}
