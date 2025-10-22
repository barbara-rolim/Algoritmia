package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        double n1, n2, resultado;
        String operacao, continuar;

        do {

            // Entrada de dados
            System.out.print("Primeiro número: ");
            n1 = input.nextDouble();

            System.out.print("Segundo número: ");
            n2 = input.nextDouble();

            System.out.print("Escolha uma operação (+, -, *, /, %): ");
            operacao = input.next();

            // Logica
            switch (operacao) {
                case "+":
                    resultado = n1 + n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = n1 - n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "*":
                    resultado = n1 * n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/":
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "%":
                    resultado = (n1 * n2) / 100;
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }

            System.out.println("Deseja continuar? (s/n): ");
            continuar=input.next();

        }while (continuar.equals("s")) ;
    }
}