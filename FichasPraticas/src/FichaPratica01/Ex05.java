package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double vl1, vl2, vl3, ma, mp;

        //ler valores
        System.out.println("Valor 1: ");
        vl1 = input.nextDouble();
        System.out.println("Valor 2: ");
        vl2 = input.nextDouble();
        System.out.println("Valor 3: ");
        vl3 = input.nextDouble();

        ma = (vl1 + vl2 + vl3) / 3;
        mp = (vl1 * 0.2) + (vl2 * 0.3) + (vl3 *0.5);

        System.out.println("Media Aritmetica: " + ma);
        System.out.println("Media Ponderada: " + mp);
    }
}
