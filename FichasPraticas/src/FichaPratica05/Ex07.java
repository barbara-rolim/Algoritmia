package FichaPratica05;

import java.util.Scanner;

//Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par
//inserido. Caso não exista, deverá informar o utilizador
public class Ex07 {
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

        int maiorPar = vetor[0];

        // Impressão do vetor
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maiorPar && vetor[i] % 2 == 0) {
                maiorPar = vetor[i];
            }else {
                System.out.println("Não existe");
            }
        }
        System.out.println("Maior elemento par: " + maiorPar);
    }
}
