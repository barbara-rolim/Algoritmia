package FichaPratica04;

import java.util.Scanner;

//Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100. De seguida, deverá permitir ao jogador 2 tentar
//acertar no valor inserido pelo jogador 1. A cada iteração, enquanto o valor não for descoberto, deverá informar
//se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. No final (quando o
//valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variaveis
        int num1, num2,tentativas=0;


        System.out.println("Insira um número entre 0 e 100: ");
        num1 = input.nextInt();

        System.out.println("Tente advinhar o valor inserido pelo seu oponente: ");
        num2 = input.nextInt();
        tentativas++;

        while(num1 != num2){
            if (num2 > num1){
                System.out.println("Superior ao valor do player 1 - tente outra vez: ");
            }else {
                System.out.println("Inferior ao valor do player 1 - tente outra vez: ");
            }
            num2 = input.nextInt();
            tentativas++;
        }
        System.out.println("PARABÉNS VOCÊ ACERTOU - TENTATIVAS: " + tentativas);
    }
}