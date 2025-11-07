package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
 * número de palavras presentes nesse ficheiro
 */

public class Ex07 {

    public static int calcularLinhas(String caminho) throws FileNotFoundException {

        Scanner in = new Scanner(new File(caminho));

        int contadorLinhas = 0;


        while (in.hasNextLine()) {
            in.nextLine();
            contadorLinhas++;
        }

        return contadorLinhas;
    }

    public static int calcularPalavras(String caminho) throws FileNotFoundException {
        Scanner in = new Scanner(new File(caminho));

        int contadorPalavras = 0;


        while (in.hasNext()) {
            in.next();
            contadorPalavras++;
        }

        return contadorPalavras;
    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Linhas: "+calcularLinhas("FichasPraticas/Ficheiros/exercicio_07.txt"));;
        System.out.println("Colunas: "+calcularPalavras("FichasPraticas/Ficheiros/exercicio_07.txt"));
    }
}