package FichaPratica2;

import java.util.Scanner;

public class Ex04 {
        public static void main(String[] args) {

            //Scanner
            Scanner input = new Scanner(System.in);

            //variaveis
            int pontos;

            //print
            System.out.print("Digite a posição do piloto (1 a 8): ");
            int posicao = input.nextInt();

            //switch
            switch (posicao) {
                case 1:
                    pontos = 10;
                    break;
                case 2:
                    pontos = 8;
                    break;
                case 3:
                    pontos = 6;
                    break;
                case 4:
                    pontos = 4;
                    break;
                case 5:
                    pontos = 3;
                    break;
                case 6:
                    pontos = 2;
                    break;
                case 7:
                case 8:
                    pontos = 1;
                    break;
                default:
                    pontos = 0;
            }

            //logica
            if (pontos > 0) {
                System.out.println("O piloto ficou em " + posicao + "º lugar e ganhou " + pontos + " pontos!");
            } else {
                System.out.println("Posição inválida. Digite um número entre 1 e 8.");
            }
        }
};