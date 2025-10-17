package FichaPratica02;

import java.util.Scanner;

//Menor de 3 numeros inteiros
public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Número 1: ");
        n1 = input.nextInt();
        System.out.println("Número 2: ");
        n2 = input.nextInt();
        System.out.println("Número 3: ");
        n3 = input.nextInt();

        if(n1 < n2) {
            System.out.println("Menor: " + n1);
        }else if (n2 < n1) {
            System.out.println("Menor: " + n2);
        }else if (n1 < n3){
            System.out.println("Menor: " + n1);
        } else if (n3 < n1) {
            System.out.println("Menor: " + n3);
        }else if (n2 < n3) {
            System.out.println("Menor: " + n2);
        }else if (n3 < n2){
            System.out.println("Menor: " + n3);
        }
    }
}
