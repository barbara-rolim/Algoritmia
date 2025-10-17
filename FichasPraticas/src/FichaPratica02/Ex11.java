package FichaPratica02;

import java.util.Scanner;

//pedir o saldo da conta
//montante a creditar ou debitar
//apresente se o saldo final é positivo
public class Ex11 {
    public static void main(String[] args) {

        //Scan
        Scanner input = new Scanner(System.in);

        //Variaveis
        double saldo, montante;

        //Print
        System.out.println("Introduza o saldo: ");
        saldo = input.nextInt();

        System.out.println("Escolha o valor: ");
        montante=input.nextInt();

        if(saldo >= 0) {
            System.out.println("Saldo Atual: " + (saldo + montante));
        }else if (saldo < 0) {
            System.out.println("Saldo Atual: " + (saldo - montante));
        } else {
            System.out.println("ERRO: operacao invália");
        }
    }
}