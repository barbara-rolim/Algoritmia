package FichaPratica06;

import java.util.Scanner;

public class Ex07 {
    static void desenharQuadrado(String z, int linhas, int colunas) {
        int ultimaLinha = linhas - 1;
        int ultimaColuna = colunas - 1;
        for (int i = 0; i < linhas; i++) { // percorre as linhas
            for (int j = 0; j < colunas; j++) { // percorre as colunas

                if (i == 0 || i == ultimaLinha || j == 0 || j == ultimaColuna) {
                    System.out.print(z);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // muda de linha
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir os dados ao usuário
        System.out.print("Introduza um caracter: ");
        String z = input.next();

        System.out.print("Introduza número de linhas: ");
        int linhas = input.nextInt();

        System.out.print("Introduza número de colunas: ");
        int colunas = input.nextInt();

        // Chamar a função
        desenharQuadrado(z, linhas, colunas);
    }
}


