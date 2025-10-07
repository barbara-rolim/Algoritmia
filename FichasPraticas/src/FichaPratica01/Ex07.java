package FichaPratica01;

import java.sql.SQLOutput;
import java.util.Scanner;

//escreva um programa que requisite ao utilizador o preco de 3 produtos adquiridos
//apresente o valor a pagar, considerando que devera tem um desconto de 10% sobre o total dos produtos
public class Ex07 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double prod1, prod2, prod3, soma;

        //Print
        System.out.println("Valor produto 1: ");
        prod1 = input.nextDouble();

        System.out.println("Valor produto 2: ");
        prod2 = input.nextDouble();

        System.out.println("Valor produto 3: ");
        prod3 = input.nextDouble();

        soma = (prod1 + prod2 + prod3 * 0.9);

        System.out.println("Valor total com 10% de desconto: " + soma);
    }
}