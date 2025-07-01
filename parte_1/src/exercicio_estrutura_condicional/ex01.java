package exercicio_estrutura_condicional;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("O numero " + num + " é não negativo.");
        } else {
            System.out.println("O numero " + num + " é negativo.");
        }
    }
}