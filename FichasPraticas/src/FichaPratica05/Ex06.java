package FichaPratica05;

import java.util.Scanner;

//Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.
public class Ex06 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        boolean crescente = true;

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }


        // Impressão do vetor
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) {
                crescente = false;
            }
        }

        if(crescente){
            System.out.println("Crescente");
        }else{
            System.out.println("Não Crescente");
        }
    }
}
