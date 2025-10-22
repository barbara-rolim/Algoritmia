package FichaPratica04;

import java.util.Scanner;

//Escreva um programa que indique se um número pedido ao utilizador é primo. (Chamamos de número primo um
//número natural que só possui dois divisores: 1 e ele mesmo). (Por exemplo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, etc…
public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variavel
        int num;
        boolean primo = true;

        System.out.println("Digite um número: ");
        num = input.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo: ");
        }
    }
}