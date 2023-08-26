package pag80;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        /**
         *   Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e caso o resultado seja maior ou igual a 10,
         *   deve-se ser somado a 5 caso contrário o valor do resultado deverá ser subtraído de 7. Após a obtenção do resultado apresente essa informação para o usuário.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double soma = valor1 + valor2;

        if (soma >= 10) {
            soma += 5;
        } else {
            soma -= 7;
        }

        System.out.println("Resultado: " + soma);

        scanner.close();



    }
}
