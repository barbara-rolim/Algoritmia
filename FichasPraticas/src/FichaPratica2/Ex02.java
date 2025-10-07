package FichaPratica2;

import java.util.Scanner;

//Determine e escreva o montante de impostos a pagar sobre um salario anual
// 15.000 inclusive paga taxa de 20%
// ou salario superior 15000 paga taxa de 30%
public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variaveis
        int salario, taxa;

        //print
        System.out.println("introduza o valor do seu salario anual: ");
        salario = input.nextInt();

        //logica
        if(salario >= 15000) {
            System.out.println("Paga taxa de 30% " + "valor " + salario*0.30);
        }else System.out.println("Paga taxa de 20% " + "valor " + salario*0.20);
    }
}
