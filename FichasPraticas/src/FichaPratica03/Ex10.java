package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 2; //declarar numero inteiro
        int num = 0; // num

        System.out.println("introduza um número: ");
        num = input.nextInt();

        while (i <= num) { //enquanto o inteiro for menor ou igual ao numero
            System.out.println(i);
            i = i + 2; //imprima de dois em dois por ser par
        }
    }
}
