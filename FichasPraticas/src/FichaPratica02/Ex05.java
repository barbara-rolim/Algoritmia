package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //print
        System.out.println("Introduza um número: ");
        int num1 = input.nextInt();

        System.out.println("Introduza um número: ");
        int num2 = input.nextInt();

        //Logica
        if(num1 < num2)
        {System.out.println("Primeiro número menor: " + num1);
        }else {
                System.out.println("Segundo número menor: " + num2);
            }
        }
    };
