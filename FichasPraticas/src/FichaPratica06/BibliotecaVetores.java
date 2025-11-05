package FichaPratica06;

public class BibliotecaVetores {

    /**
     *
     * @param vetor
     * @return
     */
    public static int maior(int[] vetor) {
        int maior = vetor[0]; //assume o maior

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int menor(int[] vetor) {
        int menor = vetor[0]; //assume o menor

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    static boolean crescente(int[] vetor) {
        int num = vetor[0];
        boolean crescente = true;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                crescente = false;
            }
        }
        if (crescente) {
            return true;
        } else {
            return false;
        }
    }
}

