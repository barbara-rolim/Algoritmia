package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static FichaPratica07.Ex01.imprimirFicheiro;

public class Ex04 {
    public static void createFileCSV(String caminho) throws FileNotFoundException {

        String fileContent = "Seja você mesmo… a menos que você possa ser um dragão.";

        File file = new File(caminho);
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(fileContent);
        printWriter.println("Sherek");

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String caminho = "FichasPraticas/Ficheiros/ex04.csv";
        createFileCSV(caminho);
        imprimirFicheiro(caminho);
    }
}
