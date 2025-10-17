package FichaPratica02;

import java.util.Scanner;

// 3 notas (0 -20)
// media final ponderada
// + 9.5 aprovado
//Ponderacao 1:25% nota 2:35% nota 3:40%
//Media=(Nota1×0.25)+(Nota2×0.35)+(Nota3×0.40)
public class Ex08 {
    public static void main(String[] args) {

       //Scanner
        Scanner input = new Scanner(System.in);

        //Print
        System.out.println("Coloque sua nota1: ");
        double nota1 = input.nextDouble();
        System.out.println("Coloque sua nota2: ");
        double nota2 = input.nextDouble();
        System.out.println("Coloque sua nota3: ");
        double nota3 = input.nextDouble();
        double media = (nota1*0.25)+(nota2*0.35)+(nota3*0.40);

        //Logica
        if (media >= 9.5) {
            System.out.println("Congrats, Aprovado: " + media);
        } else System.out.println("Não foi dessa vez, estude mais para a próxima: " + media);
    }
}
