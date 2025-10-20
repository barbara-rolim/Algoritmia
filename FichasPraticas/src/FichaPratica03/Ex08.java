package FichaPratica03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um numero inteiro: ");
        int num = input.nextInt();

        int ant = num - 5;
        int som = num + 5;

        while (ant < num) {
            System.out.println(ant);
            ant++;
        }

        num = num+1;
        while (num <= som) {
            System.out.println(num);
            num++;
        }
    }
}