package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica07.Ex01.imprimirFicheiro;

/**Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro.*/

public class Ex03 {
    public static void saveOtherFile(String caminhoOrigem, String caminhoDestino) throws FileNotFoundException {

        File ficheiroOrigem = new File (caminhoOrigem);
        File ficheiroDestino = new File(caminhoDestino);

        Scanner sc = new Scanner(ficheiroOrigem);
        PrintWriter printWriter = new PrintWriter(ficheiroDestino);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            printWriter.println(linha);
        }
        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        saveOtherFile("FichasPraticas/Ficheiros/exercicio_01.txt", "FichasPraticas/Ficheiros/exercicio_03_NOVO.txt");
        imprimirFicheiro("FichasPraticas/Ficheiros/exercicio_03_NOVO.txt");
    }
}
