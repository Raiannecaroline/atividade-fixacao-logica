package pag79;

import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {
        /**
         * PAG 79 - Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do corpo medida com um termômetro. Caso a temperatura
         * seja maior que 37 graus o paciente está com febre, caso contrário, sua temperatura está normal. Após ler a temperatura mostre a mensagem apropriada.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura do corpo (em graus Celsius): ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 37) {
            System.out.println("O paciente está com febre.");
        } else {
            System.out.println("A temperatura está normal.");
        }

        scanner.close();
    }
}
