package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int i, fim;

        System.out.println("Qual o inicio: ");
        i = input.nextInt();

        System.out.println("Qual o fim: ");
        fim = input.nextInt();

        while (i <= fim){
           if (i % 5 == 0){
                System.out.println(i);
            }
            i++;
        }
        }
}
