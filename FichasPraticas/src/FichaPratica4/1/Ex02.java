package FichaPraticaExtra;

import java.util.Scanner;

//Escreva um programa que imprima os números de 1 a 255, múltiplos de 3
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 255; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}