package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro não-negativo
        System.out.print("Digite um número inteiro não-negativo: ");
        int n = scanner.nextInt();

        // Verifica se o número é válido
        if (n < 0) {
            System.out.println("Número inválido. O número deve ser não-negativo.");
        } else {
            int resultado = 1;  // inicializa o resultado
            int contador = n;   // começa com o número n

            // Calcula o fatorial usando while
            while (contador > 1) {
                resultado = resultado * contador;
                contador--;
            }

            System.out.println("Fatorial de " + n + " é: " + resultado);
        }
    }
}