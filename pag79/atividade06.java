package pag79;

import java.util.Scanner;

public class atividade06 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as notas de 2 provas e um trabalho e que seja capaz de
         * calcular a média aritmética. Caso a média final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario, imprimir a mensagem reprovado”.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3.0;

        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();

    }
}
