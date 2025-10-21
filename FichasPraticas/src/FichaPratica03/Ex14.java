package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade, cont = 1;
        int numAtual, numAnterior;
        boolean crescente = true;

        System.out.print("Quantos números deseja inserir: ");
        quantidade = input.nextInt();

        System.out.print("Insira um número: ");
        numAnterior = input.nextInt();

        while  (cont < quantidade) {
            System.out.println("Insira um número: ");
            numAtual = input.nextInt();

             if (numAtual <= numAnterior) {
                crescente=false;

        }

        numAnterior = numAtual;
        cont++;
        }

        if(crescente==true){
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }
    }
}