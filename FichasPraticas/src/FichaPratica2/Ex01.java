package FichaPratica2;

//leia dois numeros inteiros e escreva na consola o maior deles

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        //Scan
        Scanner input = new Scanner(System.in);

        //Variaveis
        int num1, num2;

        //Print
        System.out.println(" Digite numero 1: ");
        num1 = input.nextInt();

        System.out.println(" Digite numero 2: ");
        num2 = input.nextInt();

        if(num1 > num2) {
            System.out.println("Maior " + num1);
        }else {
            System.out.println("Maiot " + num2);
        }
    }

}
