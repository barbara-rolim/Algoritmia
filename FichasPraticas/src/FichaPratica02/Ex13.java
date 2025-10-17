package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hs, min;

        System.out.println("Introduza horas: ");
        hs= input.nextInt();

        System.out.println("Introduza os munitos: ");
        min=input.nextInt();

        if(hs <= 12){
            System.out.println(hs + ":" + min + " am");
        }else
            hs=hs-12;
            System.out.println(hs + ":" + min + " pm");
    }
}
