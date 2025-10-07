package FichaPratica01;

import java.util.Scanner;

//Escreva um programa que calcule e apresente a area e o perimetro de um retangulo.
// As dimensoes devem ser requisitadas ao utilizador
public class Ex03 {
    public static void main(String[] args) {

        //Importar Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int base, alt, area, per;

        //ler base
        System.out.println("Introduza a base: ");
        base = input.nextInt();

        //ler altura
        System.out.println("Introduza a alt: ");
        alt = input.nextInt();

        area = base * alt;

        per = 2 * (base * alt);

        //Área: A = base x altura.
        //Perímetro: P = 2 x (base + altura).

        //Ler area
        System.out.println("Area: " + area + " e Perimetro: " + per);
        area = input.nextInt();
        per = input.nextInt();
    }
}