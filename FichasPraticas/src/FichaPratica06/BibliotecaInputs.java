package FichaPratica06;

import java.util.Scanner;

public class BibliotecaInputs {


    public static int lerInteiroPositivo() {

        Scanner input = new Scanner(System.in);

        int numero;

        do {

            System.out.print("Insira um número inteiro e positivo: ");
            numero = input.nextInt();

        } while (numero < 0);

        return numero;
    }

    public static int lerInteiroNegativo() {

        Scanner input = new Scanner(System.in);

        int numero;

        do {

            System.out.print("Insira um número inteiro e negativo: ");
            numero = input.nextInt();

        } while (numero >= 0);

        return numero;
    }

}
