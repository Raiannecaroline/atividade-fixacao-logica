package pag80;

import java.util.Scanner;

public class atividade09 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido de um professor. Para elaborar o programa, é necessário solicitar do usuário alguns dados, tais como valor da hora aula, número de horas trabalhadas no mês,
         * percentual de desconto do INSS. Em primeiro, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor do salário líquido.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora/aula: ");
        double valorHoraAula = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o percentual de desconto do INSS (%): ");
        double percentualDescontoINSS = scanner.nextDouble();

        double salarioBruto = valorHoraAula * horasTrabalhadas;
        double descontoINSS = (percentualDescontoINSS / 100) * salarioBruto;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + descontoINSS);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();


    }
}
