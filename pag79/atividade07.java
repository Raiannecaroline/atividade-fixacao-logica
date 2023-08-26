package pag79;

import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do usuário e informa se o mesmo está obeso.
         * Lembre que para saber se uma pessoa está obesa deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado do imc seja maior que 30 o usuário está obeso.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc > 30.0) {
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Você não está obeso.");
        }

        scanner.close();


    }
}
