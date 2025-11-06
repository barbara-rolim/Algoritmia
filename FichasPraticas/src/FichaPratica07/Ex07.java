package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
 * número de palavras presentes nesse ficheiro
 */

public class Ex07 {

    public static void calcularPalavrasElinhas(String caminho) throws FileNotFoundException {

        Scanner in = new Scanner(new File(caminho));

        int numLinhas = 0;
        int numPalavras = 0;

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            numLinhas++;

            String[] itensDaLinha = linha.split(" ");
            for (int i = 0; i < itensDaLinha.length; i++) {
                if (!itensDaLinha[i].isEmpty()) {
                    numPalavras++;
                }
            }
        }
        System.out.println("Soma de Linhas: " + numLinhas + " e " + "Soma de Palavras: " + numPalavras);
    }

    static void main(String[] args) throws FileNotFoundException {

        calcularPalavrasElinhas("FichasPraticas/Ficheiros/exercicio_07.txt");
    }
}