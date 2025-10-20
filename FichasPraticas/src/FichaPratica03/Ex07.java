package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        int num = 1;
        while (num <= 100) {
            System.out.println(num);
            num++;
        }
        int n = 1;
        int temp = 0;
        while (n <= 100) temp += n++;
        System.out.println(temp);
    }
}
