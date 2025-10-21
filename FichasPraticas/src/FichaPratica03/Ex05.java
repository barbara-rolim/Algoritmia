package FichaPratica03;

import java.util.Scanner;
    public class Ex05 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Introduza um numero inteiro: ");
            int num = input.nextInt();

            System.out.print("Introduza uma mensagem: ");
            input.nextLine();
            String mensagem = input.nextLine();

            int i = 0;
            while (i < num) {
                System.out.println(mensagem);
                i++;
            }
        }
    }
