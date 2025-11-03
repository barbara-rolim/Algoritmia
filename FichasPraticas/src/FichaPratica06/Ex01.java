package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

//Implemente uma função void fazerBarulho( ) que receba um animal (String) como argumento. De seguida, de
//acordo com o animal deve fazer o barulho característico (Ex.: Cão – “Au au au” | Gato – “Miau” | Peixe - “Glub
//Glub” | Vaca – “Muuuu” | Porco – “Oinc oinc”).
//Exemplo de execução:
public class Ex01 {

    public static void fazerBarulho(String animal) {

        switch (animal) {
            case "Cão":
                System.out.println("Au au au");
                break;

            case "Gato":
                System.out.println("Au au au");
                break;

            case "Peixe":
                System.out.println("Glub Glub");
                break;

            case "Vaca":
                System.out.println("Muuuuuuuuu");
                break;

            case "Porco":
                System.out.println("Oinc Oinc");
                break;

            default:
                System.out.println("❌ Opção Inválida ❌");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animal;

        System.out.print("Introduza um animal: ");
        animal = input.next();

        fazerBarulho(animal);
    }
}






