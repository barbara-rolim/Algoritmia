package FichaPraticaExtra;

import java.util.Scanner;

//1. Escreva um programa que imprima os números de 1 a 500 usando o ciclo for.
public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 500; i++) {
            System.out.println(i);
        }
    }
}
