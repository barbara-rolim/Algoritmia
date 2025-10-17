package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String opcao;

        System.out.println("Escolha uma opção: 1.Criar 2.Atualizar 3.Eliminar 4.Sair ");
        opcao = input.next();

        switch (opcao) {
            case "1":
                System.out.println("Criar");;
                break;
            case "2":
                System.out.println("Atualizar");
                break;
            case "3":
                System.out.println("Eliminar");
                break;
            default:
                System.out.println(" ");
                return;
        }
    }
}
