package FichaPratica02;

import java.util.Scanner;

//ler dois numeros
//perguntar qual operacao arirmetica
//apresentar resultado
//apresentar else ERRO
public class Ex10 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

                // Variáveis
                double n1, n2, resultado;
                String operacao;

                // Entrada de dados
                System.out.print("Primeiro número: ");
                n1 = input.nextDouble();

                System.out.print("Segundo número: ");
                n2 = input.nextDouble();

                System.out.print("Escolha uma operação (+, -, *, /, %): ");
                operacao = input.next();

                // Logica
                switch (operacao) {
                    case "+":
                        resultado = n1 + n2;
                        break;
                    case "-":
                        resultado = n1 - n2;
                        break;
                    case "*":
                        resultado = n1 * n2;
                        break;
                    case "/":
                            resultado = n1 / n2;
                            break;
                    case "%":
                        resultado = (n1 * n2) / 100;
                        break;
                    default:
                        System.out.println("Operação inválida!");
                        return;
                }

                // Saída
                System.out.println("Resultado: " + resultado);
            }
        }