package FichaPratica01;

import java.util.Scanner;

//valor 1 e valor 2 permute os valores das variaveis troca sem criari uma nova variavel
public class Ex06 {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel
        int vl1, vl2, temp;

        //Print
        System.out.println("Introduza o valor 1: ");
        vl1 = input.nextInt();

        System.out.println("Introduza o valor 2: ");
        vl2 = input.nextInt();

        System.out.println("Valor antes da troca: " + vl1 + " e " + vl2);

        temp = vl1;
        vl1 = vl2;
        vl2 = temp;

        System.out.println("Valor depois da troca: " + vl1 + " e " + vl2);



    }
}
