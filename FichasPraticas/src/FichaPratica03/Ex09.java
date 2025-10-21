package FichaPratica03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num=0, soma = 0, cont = 0, media;

        while (num != -1) { //enquanto o num nao for -1, continue introduzindo um numero)
            System.out.println("Introduza um número: ");
            num = input.nextDouble();

            if (num != -1){
            cont++;
            soma = soma + num;}
        }

        media = soma / cont;

            System.out.println("Média " + media);
        }
    }
