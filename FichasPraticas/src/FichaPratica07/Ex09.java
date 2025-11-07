package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {
    public static String[][] lerFicheiroMatriz(String caminho) throws FileNotFoundException {

        int linhaAtual = 0;

        int contadorMusica = contarLinhasFicheiro(caminho) - 1;
        String[][] matrizCompleta = new String[contadorMusica][4];

        File ficheiroMusica = new File(caminho);
        Scanner in = new Scanner(ficheiroMusica);

        String linha = in.nextLine();

        while (in.hasNextLine()) {
            linha = in.nextLine();
            String[] linhaSeparada = linha.split(",");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[linhaAtual][coluna] = linhaSeparada[coluna];
            }
            linhaAtual++;
        }
        return matrizCompleta;

        }