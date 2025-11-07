package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
 * quantidade vendida, valor unitario) e calcule o valor total das vendas.
 */
public class Ex08 {
    public static int calcularFicheiroCSV(String caminho) throws FileNotFoundException {

        Scanner in = new Scanner(new File(caminho));

        String linha = in.nextLine();

        double quantidade, preco, valorTotal = 0;

        while (in.hasNextLine()) {
            linha = in.nextLine();
            String[] itensDaLinha = linha.split(",");
            valorTotal += Double.parseDouble(itensDaLinha[2]) * Double.parseDouble(itensDaLinha[3]);
        }
        System.out.println("Total: " + valorTotal);
        in.close();
    }
    static void main(String[] args) throws FileNotFoundException {

        calcularFicheiroCSV("FichasPraticas/Ficheiros/exercicio_08.csv");
    }
}
