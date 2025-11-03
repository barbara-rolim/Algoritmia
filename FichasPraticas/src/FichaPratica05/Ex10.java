package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Criando uma matriz 3x3
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz com valores
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.println("____________________________");

        // Exibindo os valores da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] +"\t|\t");
            }
            System.out.println();
        }

        System.out.print("\nInsira o numero para pesquisar: ");
        int num = input.nextInt(), cont=0;

        for (int linha = 0; linha < matriz.length ; linha++) {
            for (int coluna = 0; coluna < matriz[0].length ; coluna++) {

                if(matriz[linha][coluna] == num) {
                    cont++;
                }
            }
        }
            System.out.println("Número " + num + " aparece " + cont + " vezes na matriz");
    }
}