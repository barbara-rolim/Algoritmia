package FichaPratica01;

import java.awt.*;
import java.util.Scanner;

//escreva um programa que calcule a duracao hh:mm:ss
//5 cancoes
//duracao lida em minutos e segundos
public class Ex08 {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Variaveis
        int horas, min, seg, min1, seg1, min2, seg2, min3, seg3, min4, seg4, min5, seg5, totalSeg, resto;

        //Print
        System.out.println("Introduza minutos da musica 1: ");
        min1 = input.nextInt();

        System.out.println("Introduza segundos da musica 1: ");
        seg1 = input.nextInt();

        System.out.println("Introduza minutos da musica 2: ");
        min2 = input.nextInt();

        System.out.println("Introduza segundos da musica 2: ");
        seg2 = input.nextInt();

        System.out.println("Introduza minutos da musica 3: ");
        min3 = input.nextInt();

        System.out.println("Introduza segundos da musica 3: ");
        seg3 = input.nextInt();

        System.out.println("Introduza minutos da musica 4: ");
        min4 = input.nextInt();

        System.out.println("Introduza segundos da musica 4: ");
        seg4 = input.nextInt();

        System.out.println("Introduza minutos da musica 5: ");
        min5 = input.nextInt();

        System.out.println("Introduza segundos da musica 5: ");
        seg5 = input.nextInt();


        //transformei horas em total de segundos
        totalSeg = (min1 * 60 + seg1) + (min2 * 60 + seg2) + (min3 * 60 + seg3) + (min4 * 60 + seg4) +
        (min5 * 60 + seg5);
        resto = totalSeg % 3600;
        horas = totalSeg / 3600;
        min = resto / 60;
        seg = resto & 60;

        System.out.println("Total Horas: " + "Horas " + horas + "Minutos " + min + "Segundos " + seg );
    }
}
