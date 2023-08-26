package pag80;

import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma circunferência e apresente a medida da área calculada. Sabe-se que para realizar o
         * cálculo da área de uma circunferência é necessário utilizar a seguinte a seguinte fórmula: A = Pi*r² . O valor do Raio será informado pelo usuário.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double pi = 3.14159; // Valor aproximado de Pi
        double area = pi * raio * raio;

        System.out.println("A área da circunferência é: " + area);

        scanner.close();


    }
}
