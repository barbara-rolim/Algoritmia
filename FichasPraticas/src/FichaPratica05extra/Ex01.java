package FichaPratica05extra;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[14];

        //
        for(int i = 0; i < vetor.length; i++){
        System.out.print("Insira no vetor[" + i + "]: ");
        vetor[i] = input.nextInt();
    }
        System.out.println("\n________________________________\n");

    // Impressão do vetor
        for (int i = 0; i < vetor.length; i++) {
        System.out.println(vetor[i]);
    }
    }
    }