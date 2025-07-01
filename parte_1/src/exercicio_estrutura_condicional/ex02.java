package exercicio_estrutura_condicional;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num %2 == 0) {
            System.out.println("O numero " + num + " é par");
        } else {
            System.out.println("O numero " + num + " é impar.");
        }
    }
}
