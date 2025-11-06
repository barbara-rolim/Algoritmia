package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
 quantidade vendida, valor unitario) e calcule o valor total das vendas.*/
public class Ex08 {
    public static void calcularFicheiroCSV(String caminho) throws FileNotFoundException {

        Scanner in = new Scanner(new File(caminho));

        String linha = in.nextLine();

        String tipo_produto;
        String produto;
        double quantidade, valor, total=0;

        while(in.hasNextLine()) {
            tipo_produto=in.next();
            produto=in.next();
            quantidade=in.nextDouble();
            valor=in.nextDouble();

            total+=valor;
        }
        System.out.println("Total: " + total);
        in.close();
    }

    static void main(String[] args) throws FileNotFoundException {

        calcularFicheiroCSV("FichasPraticas/Ficheiros/exercicio_08.txt");
    }
}
