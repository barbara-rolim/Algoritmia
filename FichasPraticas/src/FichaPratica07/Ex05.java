package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
 * calcule a soma desses números
 */


public class Ex05 {
    public static void lerFicheiroInt(String caminho) throws FileNotFoundException {

        Scanner in = new Scanner(new File(caminho));

        String linha = in.nextLine();

        String[] itensDaLinha = linha.split(" ");

        for (int i = 0; i < itensDaLinha.length; i++) {
            System.out.print(itensDaLinha[i] + " | ");
        }
    }


    public static void somarFicheiroInt(String caminho) throws FileNotFoundException {

        Scanner in = new Scanner(new File(caminho));

        String linha = in.nextLine();

        int soma = 0;

        String[] itensDaLinha = linha.split(" ");

        for (int i = 0; i < itensDaLinha.length; i++) {
            soma += Integer.parseInt(itensDaLinha[i]);
        }
        System.out.println("Soma do Finheiro é: " + soma);
    }


    public static void main(String[] args) throws FileNotFoundException {
        String caminho = "FichasPraticas/Ficheiros/exercicio_05_31.txt";
        Ex05.lerFicheiroInt(caminho);
        somarFicheiroInt(caminho);
    }
}