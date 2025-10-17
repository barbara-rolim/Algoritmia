package FichaPratica2;

import java.util.Scanner;

//determine e escreva o montante de impostos a pagar sobre um salario anual lido
//até 15000 taxa 20%
//15 a 20 inclusive taxa 30%
//20 a 25 inclusive taxa 35%
//+25 paga 40%
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Variáveis
        int salario;

        // Input
        System.out.println("Introduza o valor do seu salário anual:");
        salario = input.nextInt();

        // Lógica
        if (salario <= 15000)
            System.out.println("Paga taxa de 20% " + "valor " + (salario * 0.20));

        if (salario > 15000 && salario <= 20000)
            System.out.println("Paga taxa de 30% " + "valor " + (salario * 0.30));

        if (salario > 20000 && salario <= 25000)
            System.out.println("Paga taxa de 35% " + "valor " + (salario * 0.35));
        else
            System.out.println("Paga taxa de 40% " + "valor " + (salario * 0.40));
    }
}