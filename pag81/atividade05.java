package pag81;

import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        /**
         * Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos.
         * Os dados utilizados para a contagem dos votos obedecem a seguinte codificação:
         * a) 1, 2, 3, 4 = voto para os respectivos candidatos;
         * b) 5 = voto em branco, senão considerar voto nulo
         * Elaborar um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
         * a) total de votos para cada candidato;
         * b) total de votos nulos;
         * c) total de votos em branco.
         * Como finalizador do conjunto de votos, tem-se o valor 0.
         */

        Scanner scanner = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votosNulos = 0;
        int votosEmBranco = 0;

        int voto;

        do {
            System.out.print("Digite o código do candidato (ou 0 para sair): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votosEmBranco++;
                    break;
                default:
                    votosNulos++;
                    break;
            }
        } while (voto != 0);

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
        System.out.println("Candidato 4: " + candidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosEmBranco);

        scanner.close();

    }
}
