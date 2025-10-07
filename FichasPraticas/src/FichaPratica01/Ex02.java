package FichaPratica01;

//Dois valores, soma, subtracao, multiplicacao e divisao.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        //importar o Scanner:
        Scanner input = new Scanner(System.in);

        //declarar as variaveis:
        int num1, num2, soma, sub, mult, div;

        //Ler num1
        System.out.println(" Introduza um numero: ");
        num1 = input.nextInt();

        //Ler num2
        System.out.println(" Introduza um numero: ");
        num2 = input.nextInt();

        //Calcular soma
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        //Apresentar resultado:
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + mult);
        System.out.println("Divisao: " + div);

    }
}
