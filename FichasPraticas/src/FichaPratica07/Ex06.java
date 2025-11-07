package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
 imprima o nome da pessoa mais velha na consola.*/

public class Ex06 {

    public static String lerFicheiroStringEint(String caminho) throws FileNotFoundException {

        Scanner in = new Scanner(new File(caminho));


        String nomeMaisVelho = " ";
        int maiorIdade = 0;

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            String[] itensDaLinha = linha.split(",");

            if (Integer.parseInt(itensDaLinha[1]) > maiorIdade) {
                maiorIdade = Integer.parseInt(itensDaLinha[1]);
                nomeMaisVelho = itensDaLinha[0];
            }
        }
        System.out.println("Pessoa mais velha");
        System.out.println(nomeMaisVelho + " com " + maiorIdade + " anos ");
    }

    public static void main(String[] args) throws FileNotFoundException {

        lerFicheiroStringEint("FichasPraticas/Ficheiros/exercicio_06.txt");
    }
}
