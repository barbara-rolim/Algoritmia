package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Introduza um número: ");
            int num = input.nextInt();

            if (num % 2 == 0)
                System.out.println("número é par: " + num);
            else
                System.out.println("O número é ímpar: " + num);

            input.close();
        }
    };
