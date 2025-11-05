package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex02.lerInteiroPositivo;
import static FichaPratica06.Ex05.*;


public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis;
        int opcao, tamanho;

        // Ler número
        System.out.println("Qual o tamanho do vetor? ");
        tamanho = lerInteiroPositivo();

        int[] vetor = new int[tamanho];

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }


        do {

            System.out.println("\n********** Programa de Análise de um Vetor **********");
            System.out.println("7. Maior Elemento");
            System.out.println("8. Menor Elemento");
            System.out.println("9. Crescente ou Não Crescente");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {
                case 7:
                    System.out.println("Maior: " + maior(vetor));
                    break;

                case 8:

                    System.out.println("Menor: " + menor(vetor));
                    break;

                case 9:

                    break;

                case 0: // Sair
                    System.out.println("Obrigado e até à próxima \uD83C\uDFC3\uD83D\uDEAA");
                    break;

                default:
                    System.out.println("❌ Opção Inválida ❌");
                    break;
            }

        } while (opcao != 0);
    }
}