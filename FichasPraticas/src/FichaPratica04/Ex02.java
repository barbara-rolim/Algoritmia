package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            //apresentar os valores
            System.out.println("\n******** Menu do programa ********");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            //Ler opcao
            System.out.println("Opcao: ");
            opcao= input.nextInt();

            switch (opcao) {
                case 1: //Criar
                    System.out.println("\n*** CRIAR ***");
                    System.out.println("Nome Utilizador: ");
                    System.out.println("Password: ");
                    break;

                case 2: //Atualizar
                    System.out.println("\n*** ATUALIZAR ***");
                    System.out.println("Nome Utilizador: ");
                    System.out.println("Password: ");
                    break;

                case 3: //Eliminar
                    System.out.println("\n*** ELIMINAR ***");
                    System.out.println("Nome Utilizador: ");
                    System.out.println("Password: ");
                    break;

                case 4: //Sair
                    System.out.println("\n*** SAIR ***");
                    System.out.println("A encerrar o programa... ");
                    break;

                default:
                    System.out.println("Opção Inválida: " + opcao);
            }

            // Ciclo que imprime 50 enters
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

        } while (opcao != 4);
    }
}