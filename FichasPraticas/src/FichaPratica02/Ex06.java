package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            //print
            System.out.println("Introduza um número: ");
            int num1 = input.nextInt();

            System.out.println("Introduza um número: ");
            int num2 = input.nextInt();

            //Logica
            if(num1 > num2)
            {System.out.println("Maior : " + num1 + " Menor : " + num2);
            }else {
                System.out.println("Maior : " + num2 + " Menor : " + num1);
            }
        }
    };