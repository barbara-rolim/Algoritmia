package FichaPratica03;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int i, salto, limite;

        i = 0;

        System.out.println("Introduza um limite: ");
        limite = input.nextInt();

        System.out.println("Introduza um salto: ");
        salto = input.nextInt();

        System.out.println(" ");
        while (i <= limite){
            System.out.println(i);
            i=i+salto;
        }

    }
}
