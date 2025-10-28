package FichaPratica05;

import java.util.Scanner;

//Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos
public class Ex05 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[10];
        double somaValor = 0;
        double media = 0;

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            somaValor += vetor[i];
        }

        media=somaValor/vetor.length;

        System.out.println(media);
    }
}

