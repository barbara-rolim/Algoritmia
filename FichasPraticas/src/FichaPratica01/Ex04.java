package FichaPratica01;//escreva um programa para calcular a area da circunferencia,
// dimensoes devem ser requisitadas ao utilizador

import java.util.Scanner;

//A área da circunferência (círculo) pode ser calculada usando a fórmula:
//A = π * r²,
//onde A é a área e r é o raio do círculo. Para calcular a área, você deve multiplicar
// o quadrado do valor do raio por π (pi). Essa fórmula representa o número de unidades de superfície dentro da circunferência.
public class Ex04 {
    public static void main(String[] args) {

        //Ler utilizador
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double area, raio, pi=3.14;

        //ler raio
        System.out.println("Introduza o raio: ");
        raio = input.nextDouble();

        area = pi * raio * raio;
        System.out.println("Area: " + area     );

    }
}
