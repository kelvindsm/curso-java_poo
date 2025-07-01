package exercicio_estrutura_for;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            double a = sc.nextInt();
            double b = sc.nextInt();
            if (b == 0){
                System.out.println("Divisão impossível");
            } else {
                double div = (a / b);
                System.out.println(div);
            }
        }
        sc.close();
    }
}
