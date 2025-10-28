package FichaPratica05;

import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[9];

        // Leitura de números para o vetor
        for (int i = 0; i < 9; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        System.out.println("\n________________________________\n");

        // Criando uma matriz 3x3
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz com valores
        int valor = vetor.length;
        for (int i = 0; i < matriz.length; i++) { // Itera pelas linhas
            for (int j = 0; j < matriz[i].length; j++) { // Itera pelas colunas
                matriz[i][j] = valor++;
            }
        }

        // Exibindo os valores da matriz
        System.out.println("Matriz 3x3:");
        for (int i = vetor.length; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }
}