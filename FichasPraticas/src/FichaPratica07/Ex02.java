package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static FichaPratica07.Ex01.imprimirFicheiro;
///Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.
public class Ex02 {

    public static void createFile(String caminho, String mensagem) throws FileNotFoundException {


        File file = new File(caminho);
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(mensagem);

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String caminho = "FichasPraticas/Ficheiros/ex02.txt";
        String mensagem = "Ao Infinito e além!!!";

        createFile(caminho, mensagem);
        imprimirFicheiro(caminho);
    }
}