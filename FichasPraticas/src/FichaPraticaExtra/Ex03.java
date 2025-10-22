package FichaPraticaExtra;

import java.util.Scanner;

//Escreva um programa que exiba a tabuada de multiplicação de todos os números de 1 a 10.
//Exemplo de Execução:
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        int opcao;
        do {
            //apresentar os valores
            System.out.println("\n******** Tabuada do: ********");

            //Ler opcao
            System.out.println("Escolha uma opcao (1 até 10): ");
            opcao= input.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(1 + " x " + i + " = " + 1* i);
                    }
                    break;

                case 2:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(2 + " x " + i + " = " + 2 * i);
                    }
                    break;

                case 3:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(3 + " x " + i + " = " + 3 * i);
                    }
                    break;

                case 4:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(4  + " x " + i + " = " + 4 * i);
                    }
                    break;
                case 5:
                    for (int i =1; i <= 10; i++) {
                        System.out.println(5 + " x " + i + " = " + 5 * i);
                    }
                    break;
                case 6:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(6 + " x " + i + " = " + 1* i);
                    }
                    break;

                case 7:
                    for (int i = 2; i <= 10; i++) {
                        System.out.println(7 + " x " + i + " = " + 2 * i);
                    }
                    break;

                case 8:
                    for (int i = 3; i <= 10; i++) {
                        System.out.println(8 + " x " + i + " = " + 3 * i);
                    }
                    break;

                case 9:
                    for (int i = 4; i <= 10; i++) {
                        System.out.println(9  + " x " + i + " = " + 4 * i);
                    }
                    break;
                case 10:
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(10 + " x " + i + " = " + 5 * i);
                    }
                    break;

                    default:
                    System.out.println("Opção Inválida: " + opcao);
            }
        } while (opcao != 11);
    }
}
