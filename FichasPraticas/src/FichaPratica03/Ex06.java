package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um número de início: ");
        int n1 = input.nextInt();

        System.out.println("Introduza um outro número de início: ");
        int n2 = input.nextInt();


        while (n1 <= n2) {
            System.out.println(n1);
            n1++;
        }
    }
}
