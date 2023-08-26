package pag79;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        /**
         * PAG 79 - Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir até a sua fazenda.
         * O usuário deverá informar a distância que será percorrida e o preço do litro da gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância a ser percorrida (em quilômetros): ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoGasolina = scanner.nextDouble();

        double consumoMedio = 12.0; // km/litro
        double quantidadeGasolina = distanciaPercorrida / consumoMedio;
        double custoViagem = quantidadeGasolina * precoGasolina;

        System.out.println("Será necessário colocar " + quantidadeGasolina + " litros de gasolina.");
        System.out.println("O custo total da viagem será de R$ " + custoViagem);

        scanner.close();
    }
}
