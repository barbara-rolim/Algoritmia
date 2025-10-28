package FichaPratica05;

import java.util.Scanner;

//1. Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
//de inserção. Exemplo de execução
public class Ex01 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Leitura de números para o vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        System.out.println("\n________________________________\n");

        // Impressão do vetor
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }

    }
}