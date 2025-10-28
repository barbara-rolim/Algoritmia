package FichaPratica05;

import java.util.Scanner;

//Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento
public class Ex04 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int menor = vetor[0];

        // Impressão do vetor
        for (int i = 0; i < vetor.length; i++) {

            if(vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Menor elemento: " + menor);
    }
}
