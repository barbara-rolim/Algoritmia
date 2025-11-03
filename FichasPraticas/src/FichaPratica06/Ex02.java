package FichaPratica06;

//Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro e positivo) e
//crie uma função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador.
//Exemplos de execução:

import java.util.Scanner;

public class Ex02 {

    public static boolean inteiroPositivo(int num) {
        if (num >= 0 && num != (double) num) {
            return true;
        } else {
            System.out.println("Número double || Negativo");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis;
        int num;

        // Ler número
        System.out.print("Insira um número para ser analisado: ");
        num = input.nextInt();

        inteiroPositivo(num);{
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
        }
    }
}
